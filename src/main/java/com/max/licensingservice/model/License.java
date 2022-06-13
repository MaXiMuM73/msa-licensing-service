package com.max.licensingservice.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.hateoas.RepresentationModel;

@Schema(description = "Лицензия")
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class License extends RepresentationModel<License> {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY,
            description = "Идентификатор", example = "1")
    private Integer id;
    @Schema(description = "Идентификатор лицензии", example = "1")
    private Integer licenseId;
    @Schema(description = "Описание", example = "Лицензия на 1 год")
    private String description;
    @Schema(description = "Идентификатор организации", example = "1")
    private Integer organizationId;
    @Schema(description = "Наименование продукта", example = "Хранилище данных")
    private String productName;
    @Schema(description = "Тип лицензии", example = "Постоянная")
    private String licenseType;
}
