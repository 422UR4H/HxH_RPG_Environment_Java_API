package com.hxh_environment.api.infrastructure.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OutputCharacterProfileDTO {
  private String nickname;
  private String fullname;
  private String description;
  private String briefDescription;
  private LocalDate birthday;
}
