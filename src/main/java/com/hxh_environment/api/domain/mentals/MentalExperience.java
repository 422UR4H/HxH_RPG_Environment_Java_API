package com.hxh_environment.api.domain.mentals;

import com.hxh_environment.api.domain.experience.CharacterExperience;
import com.hxh_environment.api.domain.experience.TypeExperience;

public class MentalExperience extends TypeExperience {

  public MentalExperience(CharacterExperience characterExp, int exp) {
    super(characterExp, exp);
  }

  public MentalExperience(CharacterExperience characterExp) {
    super(characterExp);
  }

  // TODO: Override initExpTable

}
