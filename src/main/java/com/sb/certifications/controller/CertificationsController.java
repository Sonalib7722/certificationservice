package com.sb.certifications.controller;
   
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sb.certifications.model.Certifications;
import com.sb.certifications.repos.CertificationsRepository;

@RestController
@RequestMapping(value="/certificationsapi")
public class CertificationsController {
	
	@Autowired
	CertificationsRepository repository;
	
	@RequestMapping(value="/getcertifications",method=RequestMethod.GET)
	public List<Certifications> getCertificationsList() {
		return repository.findAll();
	}

	@RequestMapping(value="/addcertifications",method=RequestMethod.POST)
	public Certifications saveCertifications(@RequestBody Certifications certifications) {
		return repository.save(certifications);
	}
	
	@RequestMapping(value="/getcertificationdetails/{id}",method=RequestMethod.GET)
	public Certifications getCertificationdetails(@PathVariable String certificationcode) {
		return repository.findById(certificationcode).get();
	}
}
