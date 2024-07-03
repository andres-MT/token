package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Factura_detalle;

@Repository
public class Factura_detalleDAOlmpl implements Factura_detalleDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Factura_detalle> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Factura_detalle", Factura_detalle.class).getResultList();
    }

    @Override
    @Transactional
    public Factura_detalle findOne(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Factura_detalle.class, id);
    }

    @Override
    @Transactional
    public void add(Factura_detalle factura_detalle) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(factura_detalle);
    }

    @Override
    @Transactional
    public void update(Factura_detalle factura_detalle) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(factura_detalle);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Factura_detalle factura_detalle = findOne(id);
        if (factura_detalle != null) {
            session.delete(factura_detalle);
        }
    }

	@Override
	public void delete(Factura_detalle factura_detalle) {
		// TODO Auto-generated method stub
		
	}
}