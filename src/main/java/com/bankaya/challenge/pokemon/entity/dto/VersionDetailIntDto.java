package com.bankaya.challenge.pokemon.entity.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VersionDetailIntDto {

    private Integer rarity;
    private NameUrlInDto version;
}
