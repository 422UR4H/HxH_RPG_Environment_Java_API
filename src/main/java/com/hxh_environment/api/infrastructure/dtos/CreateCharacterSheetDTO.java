package com.hxh_environment.api.infrastructure.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CreateCharacterSheetDTO {
  private String description;

  @NotBlank
  @Size(max = 16, message = "Maximum length of a characterClass is 16")
  private String characterClass;
}
