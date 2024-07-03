package com.distribuida.dao;

import java.util.List;
import com.distribuida.entities.Factura_detalle;

public interface Factura_detalleDAO {
    List<Factura_detalle> findAll();
    Factura_detalle findOne(int id);
    void add(Factura_detalle factura_detalle);
    void update(Factura_detalle factura_detalle);
    void delete(Factura_detalle factura_detalle);
	void delete(int id);
}

