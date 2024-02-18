package com.hxh_environment.api.domain.attributes;

import com.hxh_environment.api.domain.entity.Experience;
import com.hxh_environment.api.domain.enums.AttributeName;

public class SpiritualAttribute extends PrimaryAttribute {

  public SpiritualAttribute(Experience exp, AttributeName name) {
    super(exp, name);
  }

  public SpiritualAttribute(AttributeName name) {
    super(name);
  }

}
