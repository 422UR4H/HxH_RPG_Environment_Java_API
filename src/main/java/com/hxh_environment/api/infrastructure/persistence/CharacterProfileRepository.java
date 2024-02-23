package com.hxh_environment.api.infrastructure.persistence;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterProfileRepository extends JpaRepository<CharacterProfileModel, UUID> {
  
}
