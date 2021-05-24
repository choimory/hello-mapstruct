package com.practice.hellomapstruct.common.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum GenterType {
    MALE("남성")
    , FEMALE("여성");

    private String value;
}
