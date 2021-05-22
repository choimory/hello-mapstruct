package com.practice.hellomapstruct.company.type;

import lombok.*;


@Getter
@AllArgsConstructor
public enum BusinessType {
    IT("IT")
    , SERVICE("서비스업")
    , CONSTRUCT("공업")
    , FINANCE("금융업");

    private String value;

}

