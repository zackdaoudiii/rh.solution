package com.msoftsolution.myrh.aspects.permissions.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.msoftsolution.myrh.domains.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "Permission")
@Entity
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String action;

    @Column(length = 40)
    private String entity;

    @Column
    private Boolean constrained;

    @ManyToOne
    @JoinColumn(name="role_id")
    @JsonIgnore
    private Role role;

    public Boolean isConstrained() {
        return constrained;
    }

    public void setIsConstrained(Boolean isConstrained){
        constrained = isConstrained;
    }
}
