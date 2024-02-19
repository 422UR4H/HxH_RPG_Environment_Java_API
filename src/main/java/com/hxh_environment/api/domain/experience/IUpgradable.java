package com.hxh_environment.api.domain.experience;

public interface IUpgradable {
  // @Getter
  // private int points;

  // TODO: Implement exp table in constructors
  // public IUpgradable(int points) {
  // this.points = points;
  // }

  // public IUpgradable() {
  // this.points = 0;
  // }

  // public int getExpByLvl(int lvl);
  public int getLvl();

  public int getExp();

  public int getCurrentExp();

  public int getExpToEvolve();

  public int increasePoints(int exp);

  public void upgreade();
}
