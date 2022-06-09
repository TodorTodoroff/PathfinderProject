package com.project.pathfinder.model;


import com.project.pathfinder.model.enums.CategoryTypeEnum;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private CategoryTypeEnum name;

    @Column(columnDefinition = "TEXT")
    private String description;



    public Category(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CategoryTypeEnum getName() {
        return name;
    }

    public void setName(CategoryTypeEnum name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
