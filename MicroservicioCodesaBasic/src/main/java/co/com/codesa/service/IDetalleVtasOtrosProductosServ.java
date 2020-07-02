package co.com.codesa.service;

import co.com.codesa.entity.DetalleVtasOtrosProductos;

public interface IDetalleVtasOtrosProductosServ {

	public DetalleVtasOtrosProductos getBySerialAndFechaVenta(String serial, String fecha) throws Exception;

}
