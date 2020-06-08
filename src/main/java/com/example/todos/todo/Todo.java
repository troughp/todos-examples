package com.example.todos.todo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private boolean complete;
    private String title;

    public Todo(String description, boolean complete, String title){
        this.description = description;
        this.complete = complete;
        this.title = title;
    }

}
