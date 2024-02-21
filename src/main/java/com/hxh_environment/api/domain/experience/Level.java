package com.hxh_environment.api.domain.experience;

import lombok.Getter;

public abstract class Level implements IUpgradable {

  @Getter
  private int lvl;

  public Level(int lvl) {
    this.lvl = lvl;
  }

  // TODO: refactor to upgrade event
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
