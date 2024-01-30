package com.hxh_environment.api.domain.tools;

import java.util.ArrayList;

import com.hxh_environment.api.domain.enums.EDice;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Tool {
  private ArrayList<EDice> dices = new ArrayList<>();
  private String name;
}
