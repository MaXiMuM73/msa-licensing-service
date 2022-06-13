package com.max.licensingservice.service;

import com.max.licensingservice.controller.LicenseController;
import com.max.licensingservice.model.License;
import org.springframework.stereotype.Service;

import java.util.Random;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Service
public class LicenseService {

    public License find(Integer licenseId, Integer organizationId) {
        License license = new License()
                .setId(new Random().nextInt(1000))
                .setLicenseId(licenseId)
                .setOrganizationId(organizationId)
                .setDescription("Software product")
                .setProductName("Ostock")
                .setLicenseType("full");

        license.add(linkTo(methodOn(LicenseController.class)
                        .find(organizationId, license.getLicenseId()))
                        .withSelfRel(),
                linkTo(methodOn(LicenseController.class)
                        .create(organizationId, license))
                        .withRel("createLicense"),
                linkTo(methodOn(LicenseController.class)
                        .update(organizationId, license))
                        .withRel("updateLicense"),
                linkTo(methodOn(LicenseController.class)
                        .delete(organizationId, license.getLicenseId()))
                        .withRel("deleteLicense"));

        return license;
    }

    public String create(License license, Integer organizationId) {
        String responseMessage = null;
        if (license != null) {
            license.setOrganizationId(organizationId);
            responseMessage = String.format(
                    "This is the post and the object is: %s",
                    license);
        }
        return responseMessage;
    }

    public String update(License license, Integer organizationId) {
        String responseMessage = null;
        if (license != null) {
            license.setOrganizationId(organizationId);
            responseMessage = String.format(
                    "This is the put and the object is: %s", license);
        }
        return responseMessage;
    }

    public String delete(Integer licenseId, Integer organizationId) {
        return String.format(
                "Deleting license with id %s for the organization %s",
                licenseId, organizationId);
    }
}
