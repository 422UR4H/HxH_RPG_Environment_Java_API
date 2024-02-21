package com.hxh_environment.api.domain.skills;

import com.hxh_environment.api.domain.experience.IUpgradable;

import lombok.Getter;

public abstract class TypeSkills implements IUpgradable {

  @Getter
  private int lvl;

  @Override
  public final boolean upgrade() {
    int newLvl = calculateLvl();

    if (this.lvl != newLvl) {
      this.lvl = newLvl;
      return true;
    }
    return false;
  }

}
