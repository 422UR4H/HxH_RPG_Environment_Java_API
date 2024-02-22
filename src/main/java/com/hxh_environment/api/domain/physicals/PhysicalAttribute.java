package com.hxh_environment.api.domain.physicals;

import java.util.ArrayList;

import com.hxh_environment.api.domain.attributes.Attribute;
import com.hxh_environment.api.domain.experience.IUpgradable;

import lombok.Getter;

public class PhysicalAttribute extends Attribute {

  @Getter
  private static final double COEFFICIENT = 5.0;

  public PhysicalAttribute(ArrayList<IUpgradable> upgradables) {
    super(upgradables, COEFFICIENT);
  }

  public PhysicalAttribute(IUpgradable upgradable) {
    super(upgradable, COEFFICIENT);
  }
  
}
