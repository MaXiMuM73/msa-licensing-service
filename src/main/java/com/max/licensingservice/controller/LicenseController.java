package com.max.licensingservice.controller;

import com.max.licensingservice.controller.constants.Urls;
import com.max.licensingservice.model.License;
import com.max.licensingservice.service.LicenseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Лицензии", description = "Управление лицензиями")
@RequiredArgsConstructor
@RestController
public class LicenseController {

    private final LicenseService licenseService;

    @Operation(summary = "Создание лицензии",
            description = "Создать лицензию")
    @PostMapping(Urls.Organization.OrganizationId.License.FULL)
    public ResponseEntity<String> create(@PathVariable Integer organizationId,
                                         @RequestBody License license) {
        return ResponseEntity.ok(licenseService.create(license, organizationId));
    }

    @Operation(summary = "Получение лицензии",
            description = "Получить лицензию")
    @GetMapping(Urls.Organization.OrganizationId.License.LicenseId.FULL)
    public ResponseEntity<License> find(@PathVariable Integer organizationId,
                                        @PathVariable Integer licenseId) {
        return ResponseEntity.ok(licenseService.find(organizationId, licenseId));
    }

    @Operation(summary = "Обновление лицензии",
            description = "Обновить лицензию")
    @PutMapping(Urls.Organization.OrganizationId.License.FULL)
    public ResponseEntity<String> update(@PathVariable Integer organizationId,
                                         @RequestBody License license) {
        return ResponseEntity.ok(licenseService.update(license, organizationId));
    }
}
