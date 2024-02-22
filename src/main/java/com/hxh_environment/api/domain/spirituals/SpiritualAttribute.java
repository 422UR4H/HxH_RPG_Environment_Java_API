package com.hxh_environment.api.domain.spirituals;

import java.util.ArrayList;

import com.hxh_environment.api.domain.attributes.Attribute;
import com.hxh_environment.api.domain.experience.IUpgradable;

import lombok.Getter;

public class SpiritualAttribute extends Attribute {

  @Getter
  private static final double COEFFICIENT = 1.0;

  public SpiritualAttribute(ArrayList<IUpgradable> upgradables) {
    super(upgradables, COEFFICIENT);
  }

  public SpiritualAttribute(IUpgradable upgradable) {
    super(upgradable, COEFFICIENT);
  }
  
}
