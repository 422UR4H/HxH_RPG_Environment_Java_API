package com.hxh_environment.api.domain.attributes;

import com.hxh_environment.api.domain.enums.AttributeName;
import com.hxh_environment.api.domain.experience.Experience;

public class NenCategory extends Attribute {

  public NenCategory(Experience exp, AttributeName name) {
    super(exp, name);
  }

  public NenCategory(AttributeName name) {
    super(new Experience(), name);
  }

}
