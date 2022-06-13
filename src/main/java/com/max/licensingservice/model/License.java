package com.max.licensingservice.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

@Schema(description = "Лицензия")
@Data
@Accessors(chain = true)
public class License {
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
