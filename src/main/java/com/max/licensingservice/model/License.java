package com.max.licensingservice.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class License {
    private Integer id;
    private Integer licenseId;
    private String description;
    private Integer organizationId;
    private String productName;
    private String licenseType;
}
