package co.com.codesa.utilidades;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.stereotype.Component;

import co.com.codesa.entity.DetalleVtasOtrosProductos;
import co.com.codesa.vo.DetalleVtasOtrosProductosVo;

@Component
public class Util {

	private StringBuilder sb = new StringBuilder();
	private String codOk ="0";
	private String codError ="0";
	
	public String getCodOk() {
		return codOk;
	}
	public String getCodError() {
		return codError;
	}
	public StringBuilder getStringBuilder() {
		sb.setLength(0);
		return sb;
	}
	public String getFechaActual() {
		Calendar fecha = new GregorianCalendar();
		int anio = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
		return  dia + "/" + (mes+1) + "/" + anio;
	}
	public SimpleDateFormat getSimpleDateFormat() {
		return new SimpleDateFormat("dd/MM/yyyy");
	}
	
	public String getNuevoNumSerie(String numSerie) {
		int intNumSerie = Integer.parseInt(numSerie);
		intNumSerie+=1;
		numSerie=intNumSerie+"";
		while(numSerie.trim().length()<10) {
			numSerie=0+numSerie;
		}
		return numSerie;	
	}
	
	public DetalleVtasOtrosProductosVo getDetalleVtasVO(DetalleVtasOtrosProductos entity) {
		
		DetalleVtasOtrosProductosVo detalleVtasOtrosProductosVo = new DetalleVtasOtrosProductosVo();				
		detalleVtasOtrosProductosVo.setPrsDocumento(entity.getPrsDocumento());
		detalleVtasOtrosProductosVo.setGrpvtasCodigo(entity.getGrpvtasCodigo());
		detalleVtasOtrosProductosVo.setZona(entity.getZona());
		detalleVtasOtrosProductosVo.setTipoZona(entity.getTipoZona());
		detalleVtasOtrosProductosVo.setCcosto(entity.getCcosto());
		detalleVtasOtrosProductosVo.setTipoCCosto(entity.getTipoCCosto());
		detalleVtasOtrosProductosVo.setFechaInicio(entity.getFechaInicio());
		detalleVtasOtrosProductosVo.setSucursal(entity.getSucursal());
		detalleVtasOtrosProductosVo.setTipoSucursal(entity.getTipoSucursal());
		detalleVtasOtrosProductosVo.setNit(entity.getNit());
		detalleVtasOtrosProductosVo.setServicioCodigo(entity.getServicioCodigo());
		detalleVtasOtrosProductosVo.setOtrosProductoCodigo(entity.getOtrosProductoCodigo());
		detalleVtasOtrosProductosVo.setSerial(entity.getSerial());
		detalleVtasOtrosProductosVo.setFechaVenta(entity.getFechaVenta());
		detalleVtasOtrosProductosVo.setHoraVenta(entity.getHoraVenta());
		detalleVtasOtrosProductosVo.setClave(entity.getClave());
		detalleVtasOtrosProductosVo.setValor(entity.getValor());
		detalleVtasOtrosProductosVo.setFechaCompra(entity.getFechaCompra());
		detalleVtasOtrosProductosVo.setFechaCaducidad(entity.getFechaCaducidad());
		detalleVtasOtrosProductosVo.setSerie(entity.getSerie());
		detalleVtasOtrosProductosVo.setNumero(entity.getNumero());
		detalleVtasOtrosProductosVo.setSucursalEmp(entity.getSucursalEmp());
		detalleVtasOtrosProductosVo.setSerial2(entity.getSerial2());
		detalleVtasOtrosProductosVo.setVersion(entity.getVersion());
		detalleVtasOtrosProductosVo.setIdentificador(entity.getIdentificador());
		detalleVtasOtrosProductosVo.setVendedor(entity.getVendedor());
		detalleVtasOtrosProductosVo.setDocCliente(entity.getDocCliente());
		
		return detalleVtasOtrosProductosVo;
	}
}
