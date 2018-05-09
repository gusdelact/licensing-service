package com.gfi.licensingservice.controllers;

import com.gfi.licensingservice.model.Organization;
import com.gfi.licensingservice.services.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(value="v1")
public class OrganizationServiceController {
    @Autowired
    private OrganizationRepository orgRepository;

      private static final Logger log = 
			LoggerFactory
			.getLogger(OrganizationServiceController.class);
			
    @RequestMapping(value="/organizations/{id}", method=RequestMethod.GET)
    public Organization getOrganization(
        @PathVariable("id") String id) {
        log.info("Buscando por id :"+id);
        Organization resultado= orgRepository.findById(id).get();
        log.info("Resultado  :"+resultado);
        return resultado;
    }
    @RequestMapping(value="/organizations", method=RequestMethod.GET
    )
    public List<Organization> organizations() {
       return  orgRepository.findAll();
    }
}