package com.hxh_environment.api.domain.entity;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HunterLicense {
  private final UUID id;
  private final String huntername;
  private String accesscode;
}
