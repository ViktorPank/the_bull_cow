package com.pankin.the_bull_cow.data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ROLES")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRole;

    @Column
    private String nameRole;

    @ManyToMany(mappedBy = "rolesUser")
    private List<User> users;

    public Role() {
    }

    public Role(Long idRole, String nameRole, List<User> users) {
        this.idRole = idRole;
        this.nameRole = nameRole;
        this.users = users;
    }

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
