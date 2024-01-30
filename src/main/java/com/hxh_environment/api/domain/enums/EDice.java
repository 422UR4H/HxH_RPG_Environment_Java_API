package com.hxh_environment.api.domain.enums;

public enum EDice {
  D4(4),
  D6(6),
  D8(8),
  D10(10),
  D12(12),
  D20(20),
  D30(30),
  D100(100);

  private final int size;

  EDice(int size) {
    this.size = size;
  }

  public int getSize() {
    return size;
  }
}
