package com.msoftsolution.myrh.domains;

import com.msoftsolution.myrh.Enums.ERole;
import com.msoftsolution.myrh.aspects.permissions.domain.Permission;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private Set<Permission> privileges = new java.util.LinkedHashSet<>();

    public Set<Permission> getPrivileges() {
        return privileges;
    }

    public Role() {}

    public Role(ERole name) {
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public ERole getName() {
        return name;
    }
    public void setName(ERole name) {
        this.name = name;
    }


}
