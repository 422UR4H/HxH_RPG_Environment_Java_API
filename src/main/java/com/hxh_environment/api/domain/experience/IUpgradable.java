package com.hxh_environment.api.domain.experience;

import java.util.ArrayList;

public interface IUpgradable {
  // TODO: Implement exp table in constructors

  // public static int getExpByLvl(int lvl) {

  // }

  public static int MAX_LVL = 100;

  public static double A_PARAM = 3.7;

  public static double B_PARAM = 2.8;

  public double getCoefficient();

  public default boolean initExpTable() {
    ArrayList<Integer> expTable = getExpTable();

    // TODO: refactor to throw exception
    if (expTable.size() > 0) {
      return false;
    }
    expTable.add(0);

    for (int i = 1; i < MAX_LVL; i++) {

      expTable.add((int) (getCoefficient() * (
          (1700.0 / (1.0 + Math.pow(Math.E, (A_PARAM / 10.0) * (12.0 - i)))) +
          (1800.0 / (1.0 + Math.pow(Math.E, (A_PARAM / 10.0) * (38.0 - i)))) +
          (2000.0 / (1.0 + Math.pow(Math.E, (B_PARAM / 10.0) * (74.0 - i)))))));

    }
    return true;
  }

  public default boolean init(int exp) {
    if (!initExpTable()) {
      return false;
    }
    increaseExp(exp);
    return true;
  }

  public int getExp();

  public ArrayList<Integer> getExpTable();

  // TODO: throws exception if expTable is not initialized
  public default int getExpTable(int lvl) {
    return getExpTable().get(lvl);
  }

  public int getLvl();

  public default int calculateLvl() {
    int exp = getExp();
    int i;

    for (i = 0; i < MAX_LVL && exp > 0; i++) {
      exp -= getExpTable(i);
    }
    return i - 1;
  }

  public default int getCurrentExp() {
    int lvl = getLvl();
    int exp = getExp();
    int i;

    for (i = 1; i <= lvl; i++) {
      exp -= getExpTable(i);
    }
    return exp;
  }

  public default int getExpToEvolve() {
    int lvl = getLvl();
    int exp = getExp();
    int i;

    for (i = 1; i <= lvl + 1; i++) {
      exp -= getExpTable(i);
    }
    return -exp;
  }

  public boolean increaseExp(int exp);

  public boolean upgrade();
}
