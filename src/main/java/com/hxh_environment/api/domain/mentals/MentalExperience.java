package com.hxh_environment.api.domain.mentals;

import com.hxh_environment.api.domain.experience.CharacterExperience;
import com.hxh_environment.api.domain.experience.TypeExperience;

import lombok.Getter;

public class MentalExperience extends TypeExperience {

  @Getter
  private static final double COEFFICIENT = 15.0;

  public MentalExperience(CharacterExperience characterExp, int exp) {
    super(characterExp, exp, COEFFICIENT);
  }

  public MentalExperience(CharacterExperience characterExp) {
    super(characterExp, COEFFICIENT);
  }

}
