package co.com.codesa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "NEGOCIOS")
public class Negocio implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "NIT")
	private String nit;	
	
	@Column(name = "TRTRIO_TPOTRT_CODIGPERTENECE_A")
	private Integer trtrioTpotrtCodigperteneceA;	
	
	@Column(name = "UBCPOTRTRIO_CODIGO_PERTENECE_A")
	private Integer ubcpotrtrioCodigoPerteneceA;
	
	@Column(name = "UBCPOL_TRTRIO_CODIGO")
	private Integer ubcpolTrtrioCodigo;	
	
	@Column(name = "UBCPOL_TRTRIO_TPOTRT_CODIGO")
	private Integer ubcpolTrtrioTpotrtCodigo;
	
	@Column(name = "DIRECCION")
	private String direccion;	
	
	@Column(name = "NOMBRE")
	private String nombre;	
	
	@Column(name = "TELEFONO")
	private String telefono;
	
	@Column(name = "DIASCADUCIDADPREMIO")
	private Integer diascaducidadpremio;
	
	@Column(name = "DIASPAGOPREMIO")
	private Integer diaspagopremio;
	
	@Column(name = "MAXVALORFRMSIST")
	private Integer maxvalorfrmsist;
	
	@Column(name = "MAXVALORFRMMAN")
	private Integer maxvalorfrmman;
	
	@Column(name = "VALORTALONARIO")
	private Integer valortalonario;
	
	@Column(name = "VALORFORMULARIO")
	private Integer valorformulario;
	
	@Column(name = "IMPUESTO")
	private Integer impuesto;
	
	@Column(name = "MINUTOSPARAANULAR")
	private Integer minutosparaanular;
	
	@Column(name = "LINEAFORMULARIO")
	private String lineaformulario;
	
	@Column(name = "TOTPAGADOBASE")
	private Integer totpagadobase;
	
	@Column(name = "ACUMBASE")
	private Integer acumbase;
	
	@Column(name = "PROMOPUNTOS")
	private String promopuntos;
	
	@Column(name = "NUMDIASRESULTADOS")
	private Integer numdiasresultados;
	
	@Column(name = "MONTOCONGELARPREMIO")
	private Integer montocongelarpremio;
	
	@Column(name = "MONTOCONGELARPREMIOSIS")
	private Integer montocongelarpremiosis;
	
	@Column(name = "CTRLPREMIOPASADO")
	private String ctrlpremiopasado;
	
	@Column(name = "NITALTERNO")
	private String nitalterno;
	
	@Column(name = "VERSION")
	private Integer version;
	
	@Column(name = "ACUMLIQUIDACION")
	private String acumliquidacion;
	
	@Column(name = "NIVACUMLIQUIDACION")
	private String nivacumliquidacion;

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public Integer getTrtrioTpotrtCodigperteneceA() {
		return trtrioTpotrtCodigperteneceA;
	}

	public void setTrtrioTpotrtCodigperteneceA(Integer trtrioTpotrtCodigperteneceA) {
		this.trtrioTpotrtCodigperteneceA = trtrioTpotrtCodigperteneceA;
	}

	public Integer getUbcpotrtrioCodigoPerteneceA() {
		return ubcpotrtrioCodigoPerteneceA;
	}

	public void setUbcpotrtrioCodigoPerteneceA(Integer ubcpotrtrioCodigoPerteneceA) {
		this.ubcpotrtrioCodigoPerteneceA = ubcpotrtrioCodigoPerteneceA;
	}

	public Integer getUbcpolTrtrioCodigo() {
		return ubcpolTrtrioCodigo;
	}

	public void setUbcpolTrtrioCodigo(Integer ubcpolTrtrioCodigo) {
		this.ubcpolTrtrioCodigo = ubcpolTrtrioCodigo;
	}

	public Integer getUbcpolTrtrioTpotrtCodigo() {
		return ubcpolTrtrioTpotrtCodigo;
	}

	public void setUbcpolTrtrioTpotrtCodigo(Integer ubcpolTrtrioTpotrtCodigo) {
		this.ubcpolTrtrioTpotrtCodigo = ubcpolTrtrioTpotrtCodigo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Integer getDiascaducidadpremio() {
		return diascaducidadpremio;
	}

	public void setDiascaducidadpremio(Integer diascaducidadpremio) {
		this.diascaducidadpremio = diascaducidadpremio;
	}

	public Integer getDiaspagopremio() {
		return diaspagopremio;
	}

	public void setDiaspagopremio(Integer diaspagopremio) {
		this.diaspagopremio = diaspagopremio;
	}

	public Integer getMaxvalorfrmsist() {
		return maxvalorfrmsist;
	}

	public void setMaxvalorfrmsist(Integer maxvalorfrmsist) {
		this.maxvalorfrmsist = maxvalorfrmsist;
	}

	public Integer getMaxvalorfrmman() {
		return maxvalorfrmman;
	}

	public void setMaxvalorfrmman(Integer maxvalorfrmman) {
		this.maxvalorfrmman = maxvalorfrmman;
	}

	public Integer getValortalonario() {
		return valortalonario;
	}

	public void setValortalonario(Integer valortalonario) {
		this.valortalonario = valortalonario;
	}

	public Integer getValorformulario() {
		return valorformulario;
	}

	public void setValorformulario(Integer valorformulario) {
		this.valorformulario = valorformulario;
	}

	public Integer getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(Integer impuesto) {
		this.impuesto = impuesto;
	}

	public Integer getMinutosparaanular() {
		return minutosparaanular;
	}

	public void setMinutosparaanular(Integer minutosparaanular) {
		this.minutosparaanular = minutosparaanular;
	}

	public String getLineaformulario() {
		return lineaformulario;
	}

	public void setLineaformulario(String lineaformulario) {
		this.lineaformulario = lineaformulario;
	}

	public Integer getTotpagadobase() {
		return totpagadobase;
	}

	public void setTotpagadobase(Integer totpagadobase) {
		this.totpagadobase = totpagadobase;
	}

	public Integer getAcumbase() {
		return acumbase;
	}

	public void setAcumbase(Integer acumbase) {
		this.acumbase = acumbase;
	}

	public String getPromopuntos() {
		return promopuntos;
	}

	public void setPromopuntos(String promopuntos) {
		this.promopuntos = promopuntos;
	}

	public Integer getNumdiasresultados() {
		return numdiasresultados;
	}

	public void setNumdiasresultados(Integer numdiasresultados) {
		this.numdiasresultados = numdiasresultados;
	}

	public Integer getMontocongelarpremio() {
		return montocongelarpremio;
	}

	public void setMontocongelarpremio(Integer montocongelarpremio) {
		this.montocongelarpremio = montocongelarpremio;
	}

	public Integer getMontocongelarpremiosis() {
		return montocongelarpremiosis;
	}

	public void setMontocongelarpremiosis(Integer montocongelarpremiosis) {
		this.montocongelarpremiosis = montocongelarpremiosis;
	}

	public String getCtrlpremiopasado() {
		return ctrlpremiopasado;
	}

	public void setCtrlpremiopasado(String ctrlpremiopasado) {
		this.ctrlpremiopasado = ctrlpremiopasado;
	}

	public String getNitalterno() {
		return nitalterno;
	}

	public void setNitalterno(String nitalterno) {
		this.nitalterno = nitalterno;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getAcumliquidacion() {
		return acumliquidacion;
	}

	public void setAcumliquidacion(String acumliquidacion) {
		this.acumliquidacion = acumliquidacion;
	}

	public String getNivacumliquidacion() {
		return nivacumliquidacion;
	}

	public void setNivacumliquidacion(String nivacumliquidacion) {
		this.nivacumliquidacion = nivacumliquidacion;
	}
}
