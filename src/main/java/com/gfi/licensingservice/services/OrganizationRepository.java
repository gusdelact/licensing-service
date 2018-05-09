package com.gfi.licensingservice.services;

 import org.springframework.data.jpa.repository.JpaRepository;

import com.gfi.licensingservice.model.Organization;


public interface OrganizationRepository
 extends JpaRepository<Organization, String> {


}