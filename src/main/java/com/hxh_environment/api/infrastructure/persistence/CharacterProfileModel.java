package com.hxh_environment.api.infrastructure.persistence;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

import com.hxh_environment.api.domain.entity.Profile;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "character_profiles")
public class CharacterProfileModel implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(nullable = false, unique = true, length = 12)
  private String nickname;

  @Column(nullable = false, length = 32)
  private String fullname;

  @Column(length = 1000)
  private String description;

  @Column(length = 64)
  private String briefDescription;

  @Column(nullable = false)
  private LocalDate birthday;

  public CharacterProfileModel(Profile profile) {
    this.nickname = profile.getNickname();
    this.fullname = profile.getFullname();
    this.birthday = profile.getBirthday();
    this.description = profile.getDescription();
    this.briefDescription = profile.getBriefDescription();
  }
}
