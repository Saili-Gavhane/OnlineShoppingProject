package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Retailer;
@Repository("retailerRepository")
public class RetailerRepositoryImpl implements RetailerRepository {

	@PersistenceContext(type = PersistenceContextType.EXTENDED)
    EntityManager em;
	
	@Transactional
	public Retailer addRetailer(Retailer r) {
		r = em.merge(r);
		em.persist(r);
		return r;
	}

	@Transactional
	public Retailer updateRetailer(Retailer r) {
		String status = r.getApproval_status();
		if(status.equals("Active"))
			 r.setApproval_status("Deactive");
			 else
				 r.setApproval_status("Active");
			 r = em.merge(r);	 
			 em.persist(r);
			 return r;
	}

	@Override
	public Retailer findById(int id) {
		Retailer r = em.find(Retailer.class, id);
		return r;
	}

	@Transactional
	public List<Retailer> findAllRetailers() {
		List<Retailer> listRetailer=em.createQuery("SELECT r FROM Retailer r").getResultList();
		return listRetailer;
	}
	@Transactional                                          
	public Retailer findByEmail(String email) {
		String q="Select r from Retailer r where r.retailer_email =?1";
		TypedQuery<Retailer> query = em.createQuery(q,Retailer.class);
		query.setParameter(1,email);
		//query.setParameter(2,nbOfPage);
	
		Retailer u= query.getSingleResult();
		return u;		
	}

}
