package com.hxh_environment.api.domain.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Profile {
  private String nickname;
  private String fullname;
  private String briefDescription;
  private LocalDate birthday;

}
