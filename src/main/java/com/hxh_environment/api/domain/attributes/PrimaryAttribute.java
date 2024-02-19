package com.hxh_environment.api.domain.attributes;

import java.util.ArrayList;

import com.hxh_environment.api.domain.pubsub.IObserver;
import com.hxh_environment.api.domain.pubsub.ISubject;

import lombok.Getter;

public class PrimaryAttribute implements IAttribute, ISubject {

  @Getter
  private int exp;
  private final ArrayList<IObserver> observers = new ArrayList<>();

  public PrimaryAttribute(int exp) {
    this.exp = exp;
  }

  public PrimaryAttribute() {
    this.exp = 0;
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
