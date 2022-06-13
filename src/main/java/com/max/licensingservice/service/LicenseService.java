package com.max.licensingservice.service;

import com.max.licensingservice.model.License;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class LicenseService {

    public License getLicense(Integer licenseId, Integer organizationId) {
        return new License()
                .setId(new Random().nextInt(1000))
                .setLicenseId(licenseId)
                .setOrganizationId(organizationId)
                .setDescription("Software product")
                .setProductName("Ostock")
                .setLicenseType("full");
    }

    public String createLicense(License license, Integer organizationId) {
        String responseMessage = null;
        if (license != null) {
            license.setOrganizationId(organizationId);
            responseMessage = String.format(
                    "This is the post and the object is: %s",
                    license);
        }
        return responseMessage;
    }

    public String updateLicense(License license, Integer organizationId) {
        String responseMessage = null;
        if (license != null) {
            license.setOrganizationId(organizationId);
            responseMessage = String.format(
                    "This is the put and the object is: %s", license);
        }
        return responseMessage;
    }

    public String deleteLicense(String licenseId, String organizationId) {
        return String.format(
                "Deleting license with id %s for the organization %s",
                licenseId, organizationId);
    }
}
