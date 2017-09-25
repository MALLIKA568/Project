package com.niit.OnlineBackend.daoimpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.OnlineBackend.dao.categoryDAo;

import com.niit.OnlineBackend.model.category;

@Repository("categoryDAO")
@Transactional
public class categoryDAOImpl implements categoryDAo
{
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<category> list() 
	{
	    String selectActiveCategory="FROM Category WHERE active=:active";
	    Query query=sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
	    query.setParameter("active", true);
		return query.getResultList();
	}

	@Override
	public boolean add(category category) 
	{
	   try
	   {
		   sessionFactory.getCurrentSession().persist(category);
		   return true;
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
		   return false;
	   }
		   
	}
	@Override
	public boolean Update(category category) 
	{
	   try
	   {
		   sessionFactory.getCurrentSession().persist(category);
		   return true;
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
		   return false;
	   }
		   
	}
	@Override
	public boolean delete(category category) 
	{
	   try
	   {
		   sessionFactory.getCurrentSession().persist(category);
		   return true;
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
		   return false;
	   }
		   
	}

}