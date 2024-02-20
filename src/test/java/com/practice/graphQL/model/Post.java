package com.practice.graphQL.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//convert this record into a class and add the necessary annotations
//to make it a JPA entity


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    private @Id String id;
    private String title;
    private String category;
    private String authorId;

}
