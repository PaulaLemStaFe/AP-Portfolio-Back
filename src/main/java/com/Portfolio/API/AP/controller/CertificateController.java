package com.Portfolio.API.AP.controller;

import com.Portfolio.API.AP.dto.CertificateDto;
import com.Portfolio.API.AP.model.Certificate;
import com.Portfolio.API.AP.service.CertificateService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/certificate")
@CrossOrigin(origins = "http://localhost:4200")
public class CertificateController {
    
    private final CertificateService certificateService;
    
    @Autowired
    public CertificateController(CertificateService certificateService){
        this.certificateService = certificateService;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Certificate>> getCertificates() {
        List<Certificate> certificates = certificateService.findCertificates();
        return new ResponseEntity(certificates, HttpStatus.OK);
    }
    
    @GetMapping("/getbyid/{idCertificate}")
    public ResponseEntity<Certificate> getCertificateById(@PathVariable("idCertificate") Long idCertificate) {
        Certificate certificate = certificateService.getIdCertificate(idCertificate).orElse(null);
        return new ResponseEntity(certificate, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<?> createCertificate(@RequestBody Certificate certificateDto){
        Certificate certificate = new Certificate (certificateDto.getUrlImgCertificate(), certificateDto.getTitleCertificate(), certificateDto.getObtainedCertificate());
        certificateService.addCertificate(certificate);
        return new ResponseEntity(certificate, HttpStatus.OK);
    }
    
    @PutMapping("/edit")
    public ResponseEntity<Certificate> editCertificate(@RequestBody Certificate certificate) {
        
        Certificate editCertificate = certificateService.editCertificate(certificate);
        return new ResponseEntity<>(editCertificate, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{idCertificate}")
    public ResponseEntity<?> deleteCertificate(@PathVariable("idCertificate") Long idCertificate){
        certificateService.deleteCertificate(idCertificate);
        return new ResponseEntity(HttpStatus.OK);
    }
    
}
