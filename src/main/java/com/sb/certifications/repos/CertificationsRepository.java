package com.sb.certifications.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.certifications.model.Certifications;

public interface CertificationsRepository extends JpaRepository<Certifications, String> {

}
