package com.gfi.licensingservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.gfi.licensingservice.model.License;
import com.gfi.licensingservice.repository.LicenseRepository;
import java.util.ArrayList;

@Component
public class LicenseRepositoryCommandLine
  implements CommandLineRunner {

    private static final Logger log = 
			LoggerFactory
			.getLogger(LicenseRepositoryCommandLine.class);

   @Autowired
   private LicenseRepository licRepository;
   
   @Override
   public void run(String... arg0) throws Exception {
        ArrayList<License> datos =
          new ArrayList<License>();
	    
	    datos.add(new 
	       License()
	       .withId("1")
	       .withLicenseMax(10)
	       .withLicenseAllocated(0)
	       .withLicenseType("CPU Bounded")
	       .withProductName("Oracle WebLogic Server 12c")
	       .withOrganizationId("1")
	     );
	     
	     	    datos.add(new 
	       License()
	       .withId("2")
	       .withLicenseMax(20)
	       .withLicenseAllocated(0)
	       .withLicenseType("CPU Bounded")
	       .withProductName("Oracle RDBMS 12c")
	        .withOrganizationId("2")
	     );
	         
	    datos.add(new 
	       License()
	       .withId("3")
	       .withLicenseMax(100)
	       .withLicenseAllocated(0)
	       .withLicenseType("CPU Bounded")
	       .withProductName("Oracle Enterpise Linux")
	        .withOrganizationId("3")
	     );
	    licRepository.saveAll(datos);
	    log.info("Datos de prueba creados : " + datos);
   }      
      
}