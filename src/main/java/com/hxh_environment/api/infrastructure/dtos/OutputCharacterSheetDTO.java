package com.hxh_environment.api.infrastructure.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OutputCharacterSheetDTO {
  private String description;
  private String characterClass;
}
