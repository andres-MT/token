package com.distribuida.dao;

import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Cliente;


@Repository
public class ClienteDAOlmpl implements ClienteDAO {
@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Cliente> findALL() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		return  session.createQuery("from Cliente",Cliente.class).getResultList();
	}
	@Transactional
	@Override
	public Cliente findOne(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		return session.get(Cliente.class, id) ;
		
	}

	

	@Override
	public void add(Cliente cliente) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(cliente);

	}

	@Override
	public void up(Cliente cliente) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(cliente);

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));

	}



	

}
