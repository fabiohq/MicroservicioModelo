package co.com.codesa.vo;

import java.util.Date;

public class DetalleVtasOtrosProductosVo {

	private int prsDocumento;

	private int grpvtasCodigo;
	
	private int zona;
	
	private int tipoZona;	
	
	private int ccosto;
	 
	private int tipoCCosto;
	
	private Date fechaInicio; 
		
	private int sucursal;
	
	private int tipoSucursal;
	
	private String nit;
	 
	private int servicioCodigo;
	
	private int otrosProductoCodigo;
	
	private String serial;
	
	private Date fechaVenta;
	 
	private String horaVenta;
	
	private String clave;

	private int valor;
	
	private Date fechaCompra;
	
	private Date fechaCaducidad;
	
	private String serie;
	
	private String numero;
	
	private int sucursalEmp;
	
	private String serial2;
		
	private int version;
	
	private String identificador;
	
	private String vendedor;
	
	private int docCliente;
	
	public DetalleVtasOtrosProductosVo() {}

	public DetalleVtasOtrosProductosVo(int prsDocumento, int grpvtasCodigo, int zona, int tipoZona, int ccosto,
			int tipoCCosto, Date fechaInicio, int sucursal, int tipoSucursal, String nit, int servicioCodigo,
			int otrosProductoCodigo, String serial, Date fechaVenta, String horaVenta, String clave, int valor,
			Date fechaCompra, Date fechaCaducidad, String serie, String numero, int sucursalEmp, String serial2,
			int version, String identificador, String vendedor, int docCliente) {
		super();
		this.prsDocumento = prsDocumento;
		this.grpvtasCodigo = grpvtasCodigo;
		this.zona = zona;
		this.tipoZona = tipoZona;
		this.ccosto = ccosto;
		this.tipoCCosto = tipoCCosto;
		this.fechaInicio = fechaInicio;
		this.sucursal = sucursal;
		this.tipoSucursal = tipoSucursal;
		this.nit = nit;
		this.servicioCodigo = servicioCodigo;
		this.otrosProductoCodigo = otrosProductoCodigo;
		this.serial = serial;
		this.fechaVenta = fechaVenta;
		this.horaVenta = horaVenta;
		this.clave = clave;
		this.valor = valor;
		this.fechaCompra = fechaCompra;
		this.fechaCaducidad = fechaCaducidad;
		this.serie = serie;
		this.numero = numero;
		this.sucursalEmp = sucursalEmp;
		this.serial2 = serial2;
		this.version = version;
		this.identificador = identificador;
		this.vendedor = vendedor;
		this.docCliente = docCliente;
	}

	public int getPrsDocumento() {
		return prsDocumento;
	}

	public void setPrsDocumento(int prsDocumento) {
		this.prsDocumento = prsDocumento;
	}

	public int getGrpvtasCodigo() {
		return grpvtasCodigo;
	}

	public void setGrpvtasCodigo(int grpvtasCodigo) {
		this.grpvtasCodigo = grpvtasCodigo;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}

	public int getTipoZona() {
		return tipoZona;
	}

	public void setTipoZona(int tipoZona) {
		this.tipoZona = tipoZona;
	}

	public int getCcosto() {
		return ccosto;
	}

	public void setCcosto(int ccosto) {
		this.ccosto = ccosto;
	}

	public int getTipoCCosto() {
		return tipoCCosto;
	}

	public void setTipoCCosto(int tipoCCosto) {
		this.tipoCCosto = tipoCCosto;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public int getSucursal() {
		return sucursal;
	}

	public void setSucursal(int sucursal) {
		this.sucursal = sucursal;
	}

	public int getTipoSucursal() {
		return tipoSucursal;
	}

	public void setTipoSucursal(int tipoSucursal) {
		this.tipoSucursal = tipoSucursal;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public int getServicioCodigo() {
		return servicioCodigo;
	}

	public void setServicioCodigo(int servicioCodigo) {
		this.servicioCodigo = servicioCodigo;
	}

	public int getOtrosProductoCodigo() {
		return otrosProductoCodigo;
	}

	public void setOtrosProductoCodigo(int otrosProductoCodigo) {
		this.otrosProductoCodigo = otrosProductoCodigo;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public String getHoraVenta() {
		return horaVenta;
	}

	public void setHoraVenta(String horaVenta) {
		this.horaVenta = horaVenta;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getSucursalEmp() {
		return sucursalEmp;
	}

	public void setSucursalEmp(int sucursalEmp) {
		this.sucursalEmp = sucursalEmp;
	}

	public String getSerial2() {
		return serial2;
	}

	public void setSerial2(String serial2) {
		this.serial2 = serial2;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public int getDocCliente() {
		return docCliente;
	}

	public void setDocCliente(int docCliente) {
		this.docCliente = docCliente;
	}
	
}