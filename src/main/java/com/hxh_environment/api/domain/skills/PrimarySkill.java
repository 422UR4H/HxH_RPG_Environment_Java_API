package com.hxh_environment.api.domain.skills;

import java.util.ArrayList;

import com.hxh_environment.api.domain.attributes.PrimaryAttribute;
import com.hxh_environment.api.domain.entity.Dice;
import com.hxh_environment.api.domain.enums.SkillName;
import com.hxh_environment.api.domain.pubsub.IObserver;
import com.hxh_environment.api.domain.pubsub.ISubject;

public class PrimarySkill extends Skill implements ISubject {

  private final PrimaryAttribute attribute;
  private final ArrayList<IObserver> observers = new ArrayList<>();

  public PrimarySkill(SkillName name, PrimaryAttribute attribute, int exp) {
    super(exp, name);
    this.attribute = attribute;
  }

  public PrimarySkill(SkillName name, PrimaryAttribute attribute) {
    super(name);
    this.attribute = attribute;
  }

  public int test(int lvl) {
    return Dice.attributeTest() + attribute.getLvl() + (int) Math.floor(lvl / 2);
  }

  @Override
  public void subscribe(IObserver observer) {
    observers.add(observer);
  }

  @Override
  public void unsubscribe(IObserver observer) {
    observers.remove(observer);
  }

  @Override
  public void unsubscribeAll() {
    observers.clear();
  }

  @Override
  public void notify(IObserver observer) {
    observer.update();
  }

  @Override
  public void notifyAllObservers() {
    observers.forEach(o -> o.update());
  }

  @Override
  public int getLvl() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getLvl'");
  }

  @Override
  public int getCurrentExp() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getCurrentExp'");
  }

  @Override
  public int getExpToEvolve() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getExpToEvolve'");
  }

  @Override
  public int increasePoints(int exp) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'increasePoints'");
  }

  @Override
  public void upgreade() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'upgreade'");
  }

}
