package co.com.codesa.dto;

import java.io.Serializable;

public class RequestDetalleVenta implements Serializable{

	private static final long serialVersionUID = 1L;
	private String serial;
	private String login;
	private String serieEmpresa;
	private String numSerieEmpresa;
	
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSerieEmpresa() {
		return serieEmpresa;
	}
	public void setSerieEmpresa(String serieEmpresa) {
		this.serieEmpresa = serieEmpresa;
	}
	public String getNumSerieEmpresa() {
		return numSerieEmpresa;
	}
	public void setNumSerieEmpresa(String numSerieEmpresa) {
		this.numSerieEmpresa = numSerieEmpresa;
	}
	
}
