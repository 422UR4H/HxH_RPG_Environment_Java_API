package com.hxh_environment.api.domain.physicals;

import com.hxh_environment.api.domain.experience.CharacterExperience;
import com.hxh_environment.api.domain.experience.TypeExperience;

public class PhysicalExperience extends TypeExperience {

  public PhysicalExperience(CharacterExperience characterExp, int exp) {
    super(characterExp, exp);
  }

  public PhysicalExperience(CharacterExperience characterExp) {
    super(characterExp);
  }

  // TODO: Override initExpTable

}
