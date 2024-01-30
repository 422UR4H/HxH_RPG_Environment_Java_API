package com.hxh_environment.api.domain.sheet;

import com.hxh_environment.api.domain.classes.CharacterClass;
import com.hxh_environment.api.domain.entity.Experience;
import com.hxh_environment.api.domain.entity.Profile;

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
  private CharacterClass characterClass;

  @Getter
  @Setter
  private Profile profile;

  @Getter
  @Setter
  private Experience exp;
}
