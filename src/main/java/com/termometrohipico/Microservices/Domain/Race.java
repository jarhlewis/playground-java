package com.termometrohipico.Microservices.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Race implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Date date;
    private Integer raceNum;
    private String horseName;
    private String location;
    private Integer accuracy;
    private Integer score;



    public Race() {
    }

    public Race(Long id, Date date, Integer raceNum, String horseName, String location, Integer accuracy, Integer score) {
        Id = id;
        this.date = date;
        this.raceNum = raceNum;
        this.horseName = horseName;
        this.location = location;
        this.accuracy = accuracy;
        this.score = score;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getRaceNum() {
        return raceNum;
    }

    public void setRaceNum(Integer raceNum) {
        this.raceNum = raceNum;
    }

    public String getHorseName() {
        return horseName;
    }

    public void setHorseName(String horseName) {
        this.horseName = horseName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public String toString() {
        return "Race{" +
                "Id=" + Id +
                ", date=" + date +
                ", raceNum=" + raceNum +
                ", horseName='" + horseName + '\'' +
                ", location='" + location + '\'' +
                ", accuracy=" + accuracy +
                ", accuracy=" + score +
                '}';
    }
}
