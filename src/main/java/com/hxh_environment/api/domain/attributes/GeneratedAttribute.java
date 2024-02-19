package com.hxh_environment.api.domain.attributes;

import java.util.ArrayList;

import com.hxh_environment.api.domain.pubsub.IObserver;

import lombok.Getter;
import lombok.NonNull;

public class GeneratedAttribute implements IAttribute, IObserver {

  private ArrayList<PrimaryAttribute> primaryAttributes = new ArrayList<>();

  @Getter
  private int exp;

  private final int getPrimaryAttrAvg() {
    int avg = 0;
    for (PrimaryAttribute attr : this.primaryAttributes) {
      avg += attr.getExp();
    }
    return (int) Math.floor(avg / this.primaryAttributes.size());
  }

  public GeneratedAttribute(@NonNull ArrayList<PrimaryAttribute> primaryAttributes) {
    this.primaryAttributes = primaryAttributes;
    this.exp = 0;

    this.primaryAttributes.forEach((attr) -> {
      attr.subscribe(this);
    });
    this.update();
  }

  @Override
  public void update() {
    this.exp = getPrimaryAttrAvg();
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
