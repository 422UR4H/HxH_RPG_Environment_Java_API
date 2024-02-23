package com.hxh_environment.api.infrastructure.dtos;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CreateCharacterProfileDTO {
  @NotBlank(message = "Field nickname is mandatory")
  @Size(max = 12, message = "Maximum length of nickname is 12")
  private String nickname;

  @NotBlank(message = "Field fullname is mandatory")
  @Size(max = 32, message = "Maximum length of fullname is 32")
  private String fullname;

  @Size(max = 1000, message = "Maximum length of description is 1000")
  private String description;

  @Size(max = 64, message = "Maximum length of briefDescription is 64")
  private String briefDescription;

  // @NotBlank(message = "Field birthday is mandatory")
  private LocalDate birthday;

  // @NotBlank
  // @Size(max = 16, message = "Maximum length of a characterClass is 16")
  // private String characterClass;
}
