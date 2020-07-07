package co.com.codesa.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.ws.rs.core.MediaType;

import co.com.codesa.service.IConsultaDetalleVentaServ;

@RestController
@RequestMapping("/consultar")
public class ConsultaDetalleVentaCtrl {

	Logger logger = LogManager.getLogger(ConsultaDetalleVentaCtrl.class);
	@Autowired
	IConsultaDetalleVentaServ consultaDetalle;

	//@GetMapping("/detalleVentaPorSerial/")
	//@CrossOrigin
	@RequestMapping(value = "/detalleVentaPorSerial/", method = {RequestMethod.GET, RequestMethod.POST}, produces = MediaType.TEXT_PLAIN)
	@CrossOrigin
	public String getBySerialAndFechaVentas(@RequestBody String jSon) throws Exception {
		logger.info("==> Id[" + Thread.currentThread().getId() + "] SE RECIBE PETICION\n "+jSon);
		String trama= consultaDetalle.getBySerialAndFechaVentas(jSon);
		logger.info("==> Id[" + Thread.currentThread().getId() + "] RESPUESTA\n "+trama);
		return 	trama;
	}
}
