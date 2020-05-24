package com.pankin.the_bull_cow.data;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "GAMES")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGame;

    @Column
    private ArrayList<Integer> numbersGame;

    @Column
    private boolean isGameOver;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idUser", nullable = false)
    private User user;

    @Column
    private Integer score;

    public Game() {
    }

    public Game(Long idGame, ArrayList<Integer> numbersGame, boolean isGameOver, User user, Integer score) {
        this.idGame = idGame;
        this.numbersGame = numbersGame;
        this.isGameOver = isGameOver;
        this.user = user;
        this.score = score;
    }

    public Long getIdGame() {
        return idGame;
    }

    public void setIdGame(Long idGame) {
        this.idGame = idGame;
    }

    public ArrayList<Integer> getNumbersGame() {
        return numbersGame;
    }

    public void setNumbersGame(ArrayList<Integer> numbersGame) {
        this.numbersGame = numbersGame;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public void setGameOver(boolean gameOver) {
        isGameOver = gameOver;
    }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }

    public Integer getScore() { return score; }

    public void setScore(Integer score) { this.score = score; }
}
