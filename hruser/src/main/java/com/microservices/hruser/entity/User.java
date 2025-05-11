package com.microservices.hruser.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity (name = "tb_user")
public class User implements Serializable {

    private static final long serialVersionUID = -6100828160816727203L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column (unique = true)
    private String username;
    private String password;
    @ManyToMany (fetch = FetchType.EAGER)
    @JoinTable (name = "tb_user_role", joinColumns = @JoinColumn (name = "user_id"), inverseJoinColumns = @JoinColumn (name = "role_id"))
    private Set<Role> userRoles = new HashSet<>();
    
    

    public User() {
    }


    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Set<Role> getUserRoles() {
        return userRoles;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username);
    }
}
