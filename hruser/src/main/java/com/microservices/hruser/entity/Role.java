package com.microservices.hruser.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity (name = "tb_role")
public class Role implements Serializable {

    private static final long serialVersionUID = -8201001104776470969L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roleName;
    @ManyToMany (mappedBy = "userRoles")
    private List<User> userList = new ArrayList<>();


    public List<User> getUserList() {
        return userList;
    }

    public Role() {
    }


    public Long getId() {
        return id;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }




    public String getRoleName() {
        return roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(id, role.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
