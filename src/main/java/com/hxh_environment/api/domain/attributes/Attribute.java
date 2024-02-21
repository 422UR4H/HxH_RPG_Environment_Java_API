package com.hxh_environment.api.domain.attributes;

import com.hxh_environment.api.domain.experience.Level;

public abstract class Attribute extends Level {

  public Attribute() {
    super(0);
  }

  // public int test(int lvl) {
  // return Dice.attributeTest() + (int) Math.floor((lvl + getExp().getLvl() - 10)
  // / 2);
  // }
}
