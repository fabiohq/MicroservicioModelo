package co.com.codesa.service;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.codesa.entity.Negocio;
import co.com.codesa.repository.INegocioRepo;

@Service
public class NegocioServImpl implements INegocioServ {

	Logger logger = LogManager.getLogger(NegocioServImpl.class);
	
	@Autowired 
	private INegocioRepo negocioRepo;
	
	@Override
	public String getByNit() throws Exception {
		List<Negocio> negocios = negocioRepo.findAll(); 	 
		return negocios.get(0).getNit(); 
	}

}