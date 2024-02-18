package com.hxh_environment.api.domain.attributes;

import java.util.ArrayList;

import com.hxh_environment.api.domain.entity.Experience;
import com.hxh_environment.api.domain.enums.AttributeName;
import com.hxh_environment.api.domain.pubsub.IObserver;
import com.hxh_environment.api.domain.pubsub.ISubject;

public abstract class PrimaryAttribute extends Attribute implements ISubject {

  private final ArrayList<IObserver> observers = new ArrayList<>();

  public PrimaryAttribute(Experience exp, AttributeName name) {
    super(exp, name);
  }

  public PrimaryAttribute(AttributeName name) {
    super(new Experience(), name);
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

}
