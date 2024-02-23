package com.hxh_environment.api.application.usecases;

import com.hxh_environment.api.application.gateways.CharacterProfileGateway;
import com.hxh_environment.api.domain.entity.Profile;

public class CreateCharacterProfileInteractor {
  private CharacterProfileGateway gateway;

  public CreateCharacterProfileInteractor(CharacterProfileGateway gateway) {
    this.gateway = gateway;
  }

  public Profile createProfile(Profile profile) {
    return gateway.createProfile(profile);
  }
}
