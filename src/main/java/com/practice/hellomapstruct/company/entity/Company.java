package com.practice.hellomapstruct.company.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.practice.hellomapstruct.company.type.BusinessType;
import com.practice.hellomapstruct.employee.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

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
    @OneToMany(mappedBy = "company")
    @JsonBackReference
    private List<Employee> employees;
}
