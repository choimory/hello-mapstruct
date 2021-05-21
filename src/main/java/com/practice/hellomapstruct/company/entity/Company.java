package com.practice.hellomapstruct.company.entity;

import com.practice.hellomapstruct.company.type.BusinessType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Lob
    private String description;
    @Enumerated(EnumType.STRING)
    private BusinessType businessType;
    @Column
    private String address;
    @Column
    private LocalDateTime foundationDateTime;
}
