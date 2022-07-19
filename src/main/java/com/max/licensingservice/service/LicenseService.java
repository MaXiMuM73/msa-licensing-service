package com.max.licensingservice.service;

import com.max.licensingservice.model.License;
import com.max.licensingservice.model.dto.LicenseCreateDTO;
import com.max.licensingservice.repository.LicenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class LicenseService {

    private final LicenseRepository licenseRepository;

    @Transactional
    public License find(Long licenseId, Long organizationId) {
        return findById(licenseId);
    }

    public String create(LicenseCreateDTO licenseCreateDTO, Long organizationId) {
        var licenseSave = new License()
                .setLicenseType(licenseCreateDTO.getLicenseType())
                .setOrganizationId(licenseCreateDTO.getOrganizationId())
                .setDescription(licenseCreateDTO.getDescription())
                .setProductName(licenseCreateDTO.getProductName());

        licenseRepository.save(licenseSave);

        return String.format("Лицензия добавлена: \n %s", licenseSave);
    }

    public String update(License license, Integer organizationId) {
        return "Обновлено";
    }

    public String delete(Integer licenseId, Integer organizationId) {
        return String.format(
                "Deleting license with id %s for the organization %s",
                licenseId, organizationId);
    }

    private License findById(Long id) {
        return licenseRepository.findById(id)
                .orElse(new License());
    }
}
