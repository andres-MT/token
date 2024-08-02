package com.distribuida.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Categoria;

@Repository
public class CategoriaDAOlmpl implements CategoriaDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Categoria> findALL() {
		// TODO Auto-generated method stub
		Session Session=sessionFactory.getCurrentSession();
		return Session.createQuery("Select au FROM Categoria au",Categoria.class).getResultList();
	}

	@Override
	@Transactional
	public Categoria findOne(int id) {
		// TODO Auto-generated method stuba
		Session Session=sessionFactory.getCurrentSession();
		Query query = Session.createQuery("Select au FROM Categoria au where au.idcatgoria =: keyIdCategoria");
		query.setParameter("KeyIdCategoria",id);
		return (Categoria) query.getSingleResult();
	}

	@Override
	@Transactional
	public void add(Categoria categoria) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(categoria);
		
	}

	@Override
	@Transactional
	public void up(Categoria categoria) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("UPDATE Categoria au SET au.categoria =: keyCategoria"
				                                       +",au.descripcion     =: keyDescripcion"
				                                       +"WHERE au.Id_categoria =: keyIdCategoria");
		query.setParameter("keyidcategoria",categoria.getId_categoria());
		query.setParameter("keyidcategoria",categoria.getCategoria());
		query.setParameter("keyidcategoria",categoria.getDescripcion());
		
		query.executeUpdate();
				                                      
		
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		Query query=session.createQuery("DELETE FROM AUTOR AU where au.idCategoria =: keyIdCategoria");
		query.setParameter("keyIdCategoria", id);
		query.executeUpdate();
		
	}

}
