package com.practice.hellomapstruct.employee.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.practice.hellomapstruct.common.type.GenterType;
import com.practice.hellomapstruct.company.entity.Company;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Enumerated(EnumType.STRING)
    private GenterType genderType;
    @Column
    private LocalDateTime birthDateTime;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_ID")
    @JsonManagedReference
    private Company company;
}
