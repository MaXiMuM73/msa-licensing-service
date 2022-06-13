package com.max.licensingservice.model;

import lombok.Data;

@Data
public class License {
    private Long id;
    private String licenseId;
    private String description;
    private String organizationId;
    private String productName;
    private String licenseType;
}
