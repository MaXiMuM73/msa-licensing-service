package com.max.licensingservice.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.Data;

/**
 * Модель для создания лицензии.
 */
@Data
public class LicenseCreateDTO {

    @Schema(description = "Описание", example = "Лицензия на 1 год")
    private String description;

    @Schema(description = "Идентификатор организации", example = "1")
    private Long organizationId;

    @Schema(description = "Наименование продукта", example = "Хранилище данных")
    private String productName;

    @Schema(description = "Тип лицензии", example = "Постоянная")
    private String licenseType;
}
