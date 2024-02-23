package com.hxh_environment.api.infrastructure.dtos;

public class CharacterSheetDTOMapper {
  // public CharacterSheet toDomainObj(CreateCharacterSheetDTO dto) {
  //   return new CharacterSheet(dto.getProfile());
  //   // return new CharacterSheet(dto.getProfile(), dto.getCharacterClass());
  // }

  public OutputCharacterSheetDTO toOutput(OutputCharacterProfileDTO profileDTO) {
    return new OutputCharacterSheetDTO(profileDTO);
    // return new OutputCharacterSheetDTO(domainObj.getProfile(), domainObj.getCharacterClass());
  }
}
