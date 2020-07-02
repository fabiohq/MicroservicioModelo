package co.com.codesa.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import co.com.codesa.entity.Negocio;

public interface INegocioRepo extends JpaRepository<Negocio, String>{

}
