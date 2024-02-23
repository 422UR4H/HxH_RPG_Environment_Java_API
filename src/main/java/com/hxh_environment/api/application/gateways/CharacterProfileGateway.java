package com.hxh_environment.api.application.gateways;

import com.hxh_environment.api.domain.entity.Profile;

public interface CharacterProfileGateway {
  Profile createProfile(Profile profile);
}
