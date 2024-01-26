package com.hxh_environment.api.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class CharacterSheet {
  @Getter
  @Setter
  private String description;

  @Getter
  @Setter
  private String characterClass;
}
