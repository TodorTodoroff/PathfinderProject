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
    private UserRolesEnum role;

    public Role(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserRolesEnum getName() {
        return role;
    }

    public void setName(UserRolesEnum name) {
        this.role = name;
    }
}
