package com.bankaya.challenge.pokemon.entity.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AbilityInDto {

    private NameUrlInDto ability;
    private Boolean is_hidden;
    private Integer slot;
    
}
