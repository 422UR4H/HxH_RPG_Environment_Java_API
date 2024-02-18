package com.hxh_environment.api.domain.attributes;

import java.util.ArrayList;

import com.hxh_environment.api.domain.entity.Experience;
import com.hxh_environment.api.domain.enums.AttributeName;
import com.hxh_environment.api.domain.pubsub.IObserver;

import lombok.NonNull;

public class GeneratedAttribute extends Attribute implements IObserver {

  private ArrayList<PrimaryAttribute> primaryAttributes = new ArrayList<>();

  private final int getPrimaryAttrAvg() {
    int avg = 0;
    for (PrimaryAttribute attr : this.primaryAttributes) {
      avg += attr.getExp().getPoints();
    }
    return (int) Math.floor(avg / this.primaryAttributes.size());
  }

  public GeneratedAttribute(AttributeName name, @NonNull ArrayList<PrimaryAttribute> primaryAttributes) {
    super(new Experience(), name);
    this.primaryAttributes = primaryAttributes;

    primaryAttributes.forEach((attr) -> {
      attr.subscribe(this);
    });
    this.update();
  }

  @Override
  public void update() {
    setExp(new Experience(getPrimaryAttrAvg()));
  }

}
