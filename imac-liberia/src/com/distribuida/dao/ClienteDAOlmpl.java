package com.distribuida.dao;

import java.util.List;

import javax.persistence.Query;
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
		return  session.createQuery(" Selct au From Cliente au",Cliente.class).getResultList();
	}
	@Override
	@Transactional
	public Cliente findOne(int id) {
		// TODO Auto-generated method stub
		 Session session = sessionFactory.getCurrentSession();
		 Query query = session.createQuery("SELECT c FROM Cliente c WHERE c.id = :keyIdCliente");
		 query.setParameter("keyIdCliente", id);
		 return (Cliente) query.getSingleResult();
	}

	

	@Override
	public void add(Cliente cliente) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(cliente);

	}

	@Override
	@Transactional
	public void up(Cliente cliente) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("UPDATE Categoria au set au.cedula =: Keycedula"
				                                                +",au.nombre =: keyNombre"
				                                                +",au.apellido =:keyapellido"
				                                                +",au.direccion =:keydireccion"
				                                                +",au.telefono =:keytelefono"
				                                                +",au.correo =:keycorreo"
				                                                +",au.idcliente =: keyidcliente");
		query.setParameter("keyidcliente",cliente.getIdCliente());
		query.setParameter("keyidcliente",cliente.getCedula());
		query.setParameter("keyidcliente",cliente.getnombre());
		query.setParameter("keyidcliente",cliente.getApellido());
		query.setParameter("keyidcliente",cliente.getDireccion());
		query.setParameter("keyidcliente",cliente.getTelefomo());
		query.setParameter("keyidcliente",cliente.getCorreo());
		
		
		

	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query=session.createQuery("DELETE FROM AUTOR AU where au.idCategoria :");
		query.setParameter("keyIdCategoria",id);
		query.executeUpdate();
	}



	

}
