package com.bankaya.challenge.pokemon.entity.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TypeInDto {

    private Integer slot;
    private NameUrlInDto type;
}
