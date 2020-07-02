package co.com.codesa.service;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.google.gson.Gson;
import co.com.codesa.dto.RequestDetalleVenta;
import co.com.codesa.entity.DetalleVtasOtrosProductos;
import co.com.codesa.utilidades.Util;

@Service
public class ConsultaDetalleVentaServImpl implements IConsultaDetalleVentaServ{

	Logger logger = LogManager.getLogger(ConsultaDetalleVentaServImpl.class);
	private String consolidado ="|=";
	private String ivaServicio="0";
	private String fechaCaducidad ="*";
	private String doctoCliente="*";
	private String tipoRegla="*";
	private String mensajeRegla="*";
	private String cadenaPromocion="*";
	private String puntos="*";
	private String codigoLoteria="*";
	private String codigoProducto="*";
	private String numeroApostado="*";
	private String valorApostado="*";
	private String estadoChanceGratis="I_RC";//A_RC = Activo Regla Chance o I_RC= Inactivo Regla Chance
	private String infoDian ="*";
	
	@Autowired
	private IDetalleVtasOtrosProductosServ detalleVta;
	
	@Autowired
	INegocioServ negocio;
	
	@Autowired
	private Util util;
	
	@Override
	public String getBySerialAndFechaVentas(String jSon) throws Exception {
				
		RequestDetalleVenta request = new Gson().fromJson(jSon, RequestDetalleVenta.class);
		String nitCodesa = null;
		StringBuilder sb = util.getStringBuilder();
		String strFecha =  util.getFechaActual();
		
		logger.info("==> Id[" + Thread.currentThread().getId() + "] ANTES DE CONSULTAR DETALLE CON NUMERO SERIAL "+request.getSerial()+" FECHA "+strFecha);
		DetalleVtasOtrosProductos entity = detalleVta.getBySerialAndFechaVenta(request.getSerial(), strFecha);
		if(entity!=null) {
			logger.info("==> Id[" + Thread.currentThread().getId() + "] ANTES DE CONSULTAR NEGOCIO ");
			nitCodesa = negocio.getByNit();
			logger.info("==> Id[" + Thread.currentThread().getId() + "] DESPUES DE CONSULTAR NEGOCIO "+nitCodesa);
			sb.append("idTrama");
			sb.append(",");
			sb.append(util.getCodOk());
			sb.append(",");
			sb.append(request.getLogin());
			sb.append(",");
			sb.append(entity.getValor());
			sb.append(",");
			sb.append(entity.getFechaVenta());
			sb.append(",");
			sb.append(entity.getHoraVenta());
			sb.append(",");
			sb.append(entity.getSerial());
			sb.append(",");
			sb.append(entity.getClave());
			sb.append(",");
			//sb.append(FRMID);
			sb.append(",");
			sb.append(ivaServicio);
			sb.append(",");
			sb.append(consolidado);
			sb.append(",");
			sb.append(fechaCaducidad);
			sb.append(",");
			sb.append(entity.getSerie());
			sb.append(",");
			sb.append(entity.getNumero());
			sb.append(",");
			sb.append(util.getNuevoNumSerie(entity.getNumero()));
			sb.append(",");		
			sb.append(request.getSerieEmpresa());
			sb.append(",");
			sb.append(request.getNumSerieEmpresa());
			sb.append(",");
			sb.append(doctoCliente);
			sb.append(",");
			sb.append(tipoRegla);
			sb.append(",");
			sb.append(mensajeRegla);
			sb.append(",");
			sb.append(cadenaPromocion);
			sb.append(",");
			sb.append(puntos);
			sb.append(",");
			sb.append(codigoLoteria);
			sb.append(",");
			sb.append(codigoProducto);
			sb.append(",");
			sb.append(numeroApostado);
			sb.append(",");
			sb.append(valorApostado);
			sb.append(",");		
			sb.append(nitCodesa);
			sb.append(",");
			sb.append(estadoChanceGratis);
			sb.append(",");
			sb.append(infoDian);
			
		}else {
			sb.append("idTrama");
			sb.append(",");
			sb.append(util.getCodError());
			sb.append(",");
			sb.append(request.getLogin());
			sb.append(",");
			sb.append("La transaccion no fue exitosa ");			
		}	
		logger.info("==> Id[" + Thread.currentThread().getId() + "] DESPUES DE CONSULTAR DETALLE CON NUMERO SERIAL "+request.getSerial()+" FECHA "+strFecha+" RESPONSE "+sb.toString());
		return sb.toString();
	}

}
