package com.project.pathfinder.model;


import com.project.pathfinder.model.enums.UserRolesEnum;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private UserRolesEnum name;

    public Role(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserRolesEnum getName() {
        return name;
    }

    public void setName(UserRolesEnum name) {
        this.name = name;
    }
}
