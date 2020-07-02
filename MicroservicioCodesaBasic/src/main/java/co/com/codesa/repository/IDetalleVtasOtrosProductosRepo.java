package co.com.codesa.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.codesa.entity.DetalleVtasOtrosProductos;
import co.com.codesa.entity.DetalleVtasOtrosProductosPk;

public interface IDetalleVtasOtrosProductosRepo extends JpaRepository<DetalleVtasOtrosProductos, DetalleVtasOtrosProductosPk>{

    public DetalleVtasOtrosProductos getBySerialAndFechaVenta(String serial, Date fechaventa);
		
}
