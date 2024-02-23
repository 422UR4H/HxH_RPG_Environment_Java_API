package com.hxh_environment.api.infrastructure.persistence;

import java.io.Serializable;
import java.util.UUID;

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
@Table(name = "charactersheets")
public class CharacterSheetModel implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  
  private CharacterProfileModel profile;

  public CharacterSheetModel(CharacterProfileModel profile) {
    this.profile = profile;
  }
}
