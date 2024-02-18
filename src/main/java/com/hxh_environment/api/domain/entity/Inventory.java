package com.hxh_environment.api.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Inventory {
  private int size;
  private int capacity;
  private HunterLicense hunterLicense;

  // TODO: slots
  // key: item.getName();
  // private Map<String, InventorySlot> slots = LinkedHashMap<>();

  // TODO: returns the sum of all InventoryItems oz's
  public int getOz() {
    return capacity;
  }


}
