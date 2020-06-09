package com.github.Mitictonylor.Files.fileManagement.modules;

import javax.persistence.*;

@Entity
@Table(name = "folders")
public class folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    private User user;

    public folder(String title, User user) {
        this.title = title;
        this.user = user;
    }

    public folder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
