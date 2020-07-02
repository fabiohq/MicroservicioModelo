package co.com.codesa.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//@Embeddable
public class DetalleVtasOtrosProductosPk implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		//"PRS_DOCUMENTO" NUMBER(12,0) NOT NULL ENABLE,
		//@Column (name = "PRS_DOCUMENTO")
		private Integer prsDocumento;
			
		//"GRPVTAS_CODIGO" NUMBER(3,0) NOT NULL ENABLE, 
		//@Column(name = "GRPVTAS_CODIGO")
		private int grpvtasCodigo;
		
		//"ZONA" NUMBER(7,0) NOT NULL ENABLE, 
		//@Column (name = "ZONA")
		private int zona;
		
		//"TIPOZONA" NUMBER(2,0) NOT NULL ENABLE,
		//@Column (name = "TIPOZONA")
		private int tipoZona;	
		
		//"CCOSTO" NUMBER(7,0) NOT NULL ENABLE,
		//@Column (name = "CCOSTO")
		private int ccosto;
		 
		//"TIPOCCOSTO" NUMBER(2,0) NOT NULL ENABLE, 
		//@Column (name = "TIPOCCOSTO")
		private int tipoCCosto;
		
		//"FECHAINICIO" DATE NOT NULL ENABLE,
		//@Column (name = "FECHAINICIO")
		private Date fechaInicio; 
			
		//"SUCURSAL" NUMBER(7,0) NOT NULL ENABLE, 
		//@Column (name = "SUCURSAL")
		private int sucursal;
		
		//"TIPOSUCURSAL" NUMBER(2,0) NOT NULL ENABLE,
		//@Column(name = "TIPOSUCURSAL")
		private int tipoSucursal;
		
		//"NIT" VARCHAR2(13 BYTE) NOT NULL ENABLE,
		//@Column (name = "NIT")
		private String nit;
		 
		//"SERVICIO_CODIGO" NUMBER(4,0) NOT NULL ENABLE,
		//@Column(name ="SERVICIO_CODIGO")
		private int servicioCodigo;
		
		//"OTROPRODUCTO_CODIGO" NUMBER(4,0) NOT NULL ENABLE,
		//@Column (name="OTROPRODUCTO_CODIGO")
		private int otrosProductoCodigo;
		
		// "SERIAL" VARCHAR2(60 BYTE) NOT NULL ENABLE, 
		//@Column (name = "SERIAL")
		private String serial;
		
		// "FECHAVENTA" DATE NOT NULL ENABLE, 
		//@Column(name = "FECHAVENTA")
		private Date fechaVenta;
		 
		// "HORAVENTA" VARCHAR2(8 BYTE) NOT NULL ENABLE, 
		//@Column(name = "HORAVENTA")
		private String horaVenta;		
		
		//"SERIE" VARCHAR2(4 BYTE) NOT NULL ENABLE, 
		//@Column( name = "SERIE")
		private String serie;
		
		//"NUMERO" VARCHAR2(10 BYTE) NOT NULL ENABLE, 
		//@Column(name="NUMERO")
		private String numero;
		/*
		 * public int getPrsDocumento() { return prsDocumento; }
		 * 
		 * public void setPrsDocumento(int prsDocumento) { this.prsDocumento =
		 * prsDocumento; }
		 * 
		 * public int getGrpvtasCodigo() { return grpvtasCodigo; }
		 * 
		 * public void setGrpvtasCodigo(int grpvtasCodigo) { this.grpvtasCodigo =
		 * grpvtasCodigo; }
		 * 
		 * public int getZona() { return zona; }
		 * 
		 * public void setZona(int zona) { this.zona = zona; }
		 * 
		 * public int getTipoZona() { return tipoZona; }
		 * 
		 * public void setTipoZona(int tipoZona) { this.tipoZona = tipoZona; }
		 * 
		 * public int getCcosto() { return ccosto; }
		 * 
		 * public void setCcosto(int ccosto) { this.ccosto = ccosto; }
		 * 
		 * public int getTipoCCosto() { return tipoCCosto; }
		 * 
		 * public void setTipoCCosto(int tipoCCosto) { this.tipoCCosto = tipoCCosto; }
		 * 
		 * public Date getFechaInicio() { return fechaInicio; }
		 * 
		 * public void setFechaInicio(Date fechaInicio) { this.fechaInicio =
		 * fechaInicio; }
		 * 
		 * public int getSucursal() { return sucursal; }
		 * 
		 * public void setSucursal(int sucursal) { this.sucursal = sucursal; }
		 * 
		 * public int getTipoSucursal() { return tipoSucursal; }
		 * 
		 * public void setTipoSucursal(int tipoSucursal) { this.tipoSucursal =
		 * tipoSucursal; }
		 * 
		 * public String getNit() { return nit; }
		 * 
		 * public void setNit(String nit) { this.nit = nit; }
		 * 
		 * public int getServicioCodigo() { return servicioCodigo; }
		 * 
		 * public void setServicioCodigo(int servicioCodigo) { this.servicioCodigo =
		 * servicioCodigo; }
		 * 
		 * public int getOtrosProductoCodigo() { return otrosProductoCodigo; }
		 * 
		 * public void setOtrosProductoCodigo(int otrosProductoCodigo) {
		 * this.otrosProductoCodigo = otrosProductoCodigo; }
		 * 
		 * public String getSerial() { return serial; }
		 * 
		 * public void setSerial(String serial) { this.serial = serial; }
		 * 
		 * public Date getFechaVenta() { return fechaVenta; }
		 * 
		 * public void setFechaVenta(Date fechaVenta) { this.fechaVenta = fechaVenta; }
		 * 
		 * public String getHoraVenta() { return horaVenta; }
		 * 
		 * public void setHoraVenta(String horaVenta) { this.horaVenta = horaVenta; }
		 * 
		 * public String getSerie() { return serie; }
		 * 
		 * public void setSerie(String serie) { this.serie = serie; }
		 * 
		 * public String getNumero() { return numero; }
		 * 
		 * public void setNumero(String numero) { this.numero = numero; }
		 */
		
}
