package com.bankaya.challenge.pokemon.entity.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VersionGroupDetailInDto {

    private Integer level_learned_at;
    private NameUrlInDto move_learn_method;
    private NameUrlInDto version_group;

}
