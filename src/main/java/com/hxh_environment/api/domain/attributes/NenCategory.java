package com.hxh_environment.api.domain.attributes;

import com.hxh_environment.api.domain.entity.Experience;
import com.hxh_environment.api.domain.enums.AttributeName;

public class NenCategory extends Attribute {

  public NenCategory(Experience exp, AttributeName name) {
    super(exp, name);
  }

  public NenCategory(AttributeName name) {
    super(new Experience(), name);
  }

}
