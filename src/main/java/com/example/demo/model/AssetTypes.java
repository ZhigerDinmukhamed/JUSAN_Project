package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "asset_types")
@Data
public class AssetTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "address", length = 255)
    private String Address;
    @Column(name = "bin", length = 255)
    private String Bin;
    @Column(name = "cadastral_number", length = 255)
    private String cadastralNumber;
    @Column(name = "ceo_name", length = 255)
    private String ceoName;
    @Column(name = "company_name", length = 255)
    private String companyName;
    @Column(name = "document_name", length = 255)
    private String documentName;
    @Column(name = "certificate_issue_date")
    private Date certificateIssueDate;
    @Column(name = "issuing_authority", length = 255)
    private String issuingAuthority;
    @Column(name = "main_contract_date")
    private Date mainContractDate;
    @Column(name = "main_contract_number", length = 255)
    private String mainContractNumber;
    @Column(name = "name", length = 255)
    private String Name;
    @Column(name = "notes", length = 255)
    private String Notes;
    @Column(name = "ownership_percentage")
    private double ownershipPercentage;
    @Column(name = "purpose", length = 255)
    private String purpose;
    @Column(name = "quantity")
    private double quantity;
    @Column(name = "registration_certificate", length = 255)
    private String registrationCertificate;
    @Column(name = "unit_of_measurement", length = 255)
    private String unitOfMeasurement;
    @Column(name = "usage_right_number", length = 255)
    private String usageRightNumber;
    @Column(name = "valid_until")
    private Date validUntil;
}
