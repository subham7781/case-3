package com.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.entity.Registration;
import com.webapp.repository.RegistrationRepository;

@Service
public class registrationService {
	@Autowired
	private RegistrationRepository repo;

	public void saveRegistration(Registration reg) {
		repo.save(reg);
	}
}
