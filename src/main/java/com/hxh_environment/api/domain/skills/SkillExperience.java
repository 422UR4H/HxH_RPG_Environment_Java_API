package com.hxh_environment.api.domain.skills;

import java.util.ArrayList;

import com.hxh_environment.api.domain.experience.Experience;
import com.hxh_environment.api.domain.pubsub.IObserver;

import lombok.Data;

@Data
public class SkillExperience implements IObserver {

  private final ArrayList<PrimarySkill> primarySkills = new ArrayList<>();
  private Experience exp;

  private final int getPrimaryAttrSum() {
    int sum = 0;
    for (PrimarySkill attr : this.primarySkills) {
      sum += attr.getExp().getPoints();
    }
    return sum;
  }

  @Override
  public void update() {
    setExp(new Experience(getPrimaryAttrSum()));
  }

  public void update(int points) {
    this.exp.increasePoints(points);
  }

  public void addPrimarySkill(PrimarySkill skill) {
    primarySkills.add(skill);
  }

  public void removePrimarySkill(PrimarySkill skill) {
    primarySkills.remove(skill);
  }

}
