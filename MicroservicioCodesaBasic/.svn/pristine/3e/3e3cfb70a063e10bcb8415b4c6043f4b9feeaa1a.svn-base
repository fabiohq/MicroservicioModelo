package co.com.codesa.configurations;

import java.util.ResourceBundle;

import org.apache.log4j.PatternLayout;

public class MyPatternLayout extends PatternLayout {
	
	@Override
	public String getHeader() {
		ResourceBundle bundle = ResourceBundle.getBundle("idiomas.seguridad_es");
		StringBuilder version = new StringBuilder();
		String separator = System.getProperty("line.separator");
		
		version.append(separator);
		version.append("----------------Version MicroservicioCodesaBasic: ");
		version.append(bundle.getString("seguridad_login_version"));
		version.append(separator);
		version.append(separator);
		
        return version.toString();
    }
	
}
