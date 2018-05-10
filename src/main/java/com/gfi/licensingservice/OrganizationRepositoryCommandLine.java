package com.gfi.licensingservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.gfi.licensingservice.model.Organization;
import com.gfi.licensingservice.services.OrganizationRepository;
import java.util.ArrayList;

@Component
public class OrganizationRepositoryCommandLine
  implements CommandLineRunner {

    private static final Logger log = 
			LoggerFactory
			.getLogger(OrganizationRepositoryCommandLine.class);

   @Autowired
   private OrganizationRepository orgRepository;
   
   @Override
   public void run(String... arg0) throws Exception {
        ArrayList<Organization> datos =
          new ArrayList<Organization>();
	    
	    datos.add(new 
	       Organization("1","Finanzas","juan",
	            "juan@gfi","55667788") );
	    datos.add(new 
	       Organization("2","Recursos Humanos","gaby",
	            "gaby@gfi","55667799") );
	     datos.add(new 
	       Organization("3","TI","jose",
	            "jose@gfi","55447788") );        
	    orgRepository.saveAll(datos);
	    log.info("Datos de prueba creados : " + datos);
   }      
      
}