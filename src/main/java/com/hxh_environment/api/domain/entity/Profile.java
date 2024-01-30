package com.hxh_environment.api.domain.entity;

import java.time.LocalDate;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

@Data
@AllArgsConstructor
public class Profile {
  private String nickname;
  private String fullname;
  private String briefDescription;

  @Setter(AccessLevel.NONE)
  private LocalDate birthday;

}
