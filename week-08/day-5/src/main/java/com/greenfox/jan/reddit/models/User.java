package com.greenfox.jan.reddit.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    private String userName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "user")
    private List<RedditPost> postsOfUser;

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<RedditPost> getPostsOfUser() {
        return postsOfUser;
    }

    public void setPostsOfUser(List<RedditPost> postsOfUser) {
        this.postsOfUser = postsOfUser;
    }
}
