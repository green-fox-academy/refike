package com.greenfoxacademy.exercisetwo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Boolean urgent = false;
    private Boolean done = false;
    private Date mydate = new Date();


    public Todo() {
    }

    public Todo( String title, Boolean urgent, Boolean done) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrgent(Boolean urgent) {
        this.urgent = urgent;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Date getMydate() {
        return mydate;
    }



    public Todo(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getUrgent() {
        return urgent;
    }

    public Boolean getDone() {
        return done;
    }
}
