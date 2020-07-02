package co.com.codesa.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.com.codesa.entity.DetalleVtasOtrosProductos;
import co.com.codesa.repository.IDetalleVtasOtrosProductosRepo;
import co.com.codesa.utilidades.Util;

@Service
public class DetalleVtasOtrosProductosServImpl implements IDetalleVtasOtrosProductosServ {

	@Autowired
	private IDetalleVtasOtrosProductosRepo detalleVtasOtrosProductosRepo;
	
	@Autowired
	private Util util;
	
	Logger logger = LogManager.getLogger(DetalleVtasOtrosProductosServImpl.class);
	
	@Override
	public DetalleVtasOtrosProductos getBySerialAndFechaVenta(String serial, String fecha) throws Exception {

		SimpleDateFormat formato = util.getSimpleDateFormat(); 
		Date fechaVenta = formato.parse(fecha);
		
		return detalleVtasOtrosProductosRepo.getBySerialAndFechaVenta(serial, fechaVenta);
	}
}