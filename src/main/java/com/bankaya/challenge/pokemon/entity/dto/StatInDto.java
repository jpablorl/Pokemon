package com.bankaya.challenge.pokemon.entity.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StatInDto {

    private Integer base_stat;
    private Integer effort;
    private NameUrlInDto stat;

}
