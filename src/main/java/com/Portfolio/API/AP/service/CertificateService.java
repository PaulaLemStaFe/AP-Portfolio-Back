package com.Portfolio.API.AP.service;

import com.Portfolio.API.AP.model.Certificate;
import com.Portfolio.API.AP.repository.CertificateRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CertificateService {
    
    private final CertificateRepository certificateRepo;
    
    @Autowired
    public CertificateService(CertificateRepository certificateRepo) {
        this.certificateRepo = certificateRepo;
    }
    
    public Certificate addCertificate(Certificate certificate) {
        return certificateRepo.save(certificate);
    }
    
    public List<Certificate> findCertificates(){
        return certificateRepo.findAll();
    }
    
    public Optional<Certificate> getIdCertificate(Long idCertificate) {
        return certificateRepo.findById(idCertificate);
    }
    
    public Certificate editCertificate(Certificate certificat){
        return certificateRepo.save(certificat);
    }
    
    public void deleteCertificate(Long idCertificate){
        certificateRepo.deleteById(idCertificate);
    }
    
}
