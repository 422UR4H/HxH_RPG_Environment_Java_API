package com.hxh_environment.api.domain.entity;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HunterLicense {
  private UUID id;
  private String huntername;
  private String accesscode;
}
