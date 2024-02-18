package com.hxh_environment.api.domain.pubsub;

public interface ISubject {
  void subscribe(IObserver observer);
  void unsubscribe(IObserver observer);
  void unsubscribeAll();
  void notify(IObserver observer);
  void notifyAllObservers();
}
