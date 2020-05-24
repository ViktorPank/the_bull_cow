package com.pankin.the_bull_cow.data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "USER")
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    @Column
    private String username;

    @Column
    private String password;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "UsersRoles",
            joinColumns = @JoinColumn(name = "idUser"),
            inverseJoinColumns = @JoinColumn(name = "idRole")
    )
    private List<Role> rolesUser;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Game> gamesUser;

    public User() {
    }

    public User(Long idUser, String username, String password, List<Role> rolesUser, List<Game> gamesUser) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.rolesUser = rolesUser;
         this.gamesUser = gamesUser;
    }

    public Long getId_user() {
        return idUser;
    }

    public void setId_user(Long id_user) {
        this.idUser = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRolesUser() {
        return rolesUser;
    }

    public void setRolesUser(List<Role> rolesUser) {
        this.rolesUser = rolesUser;
    }

    public List<Game> getGamesUser() {
        return gamesUser;
    }

    public void setGamesUser(List<Game> gamesUser) {
        this.gamesUser = gamesUser;
    }
}
