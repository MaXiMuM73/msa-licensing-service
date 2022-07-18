package com.max.licensingservice.model;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * Сущность Лицензия.
 */
@Data
@Entity
@Schema(description = "Лицензия")
@Accessors(chain = true)
@ToString
public class License {

    @Schema(accessMode = Schema.AccessMode.READ_ONLY,
            description = "Идентификатор", example = "1")
    @Id
    @SequenceGenerator(name = "license_seq_gen", sequenceName = "license_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "license_seq_gen")
    private Long id;

    @Schema(description = "Описание", example = "Лицензия на 1 год")
    private String description;

    @Schema(description = "Идентификатор организации", example = "1")
    private Long organizationId;

    @Schema(description = "Наименование продукта", example = "Хранилище данных")
    private String productName;

    @Schema(description = "Тип лицензии", example = "Постоянная")
    private String licenseType;
}
