package com.distribuida.dao;

import java.util.List;

import javax.persistence.Query;
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
    	 Query query = session.createQuery("SELECT au FROM Factura_detalle au WHERE au.idfacturadetalle = :keyidfacturadetalle");
    	query.setParameter("keyidfacturadetalle",id);
		return (Factura_detalle) query.getSingleResult();
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
      Session session =sessionFactory.getCurrentSession();
      Query query =session.createQuery("UPDATE Factura_detalle au SET au.cantidad=:keycantidad"
    		                                                       +",au.subtotal=:keysubtotal"
    		                                                       +",au.idfacturadetalle=:keyidfacturadetalle");
      query.setParameter("keyidfacturadetalle",factura_detalle.getId_factura_detalle());
      query.setParameter("keyidfacturadetalle",factura_detalle.getCantidad());
      query.setParameter("keyidfacturadetalle",factura_detalle.getSubtotal());
    }

    @Override
    @Transactional
    public void del (int id) {
        Session session = sessionFactory.getCurrentSession();
        Query query=session.createQuery("DELE FROM AUTOR AU where au.idcategoria =: keyidfacturadetalle");
        query.setParameter("keyidfacturadetalle", id);
        query.executeUpdate();
       
        }
    

	@Override
	public void delete(Factura_detalle factura_detalle) {
		// TODO Auto-generated method stub
		
	}
}