package com.termometrohipico.THSpringBackend.Domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Race {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recordId;
    private Date date;
    private String location;
    private Integer accuracy;
    private Long raceId;
    private String racename;
    private String horsename;
    private Integer Score;

    public Race() {
    }

    public Race(Long recordId, Date date, String location, Integer accuracy, Long raceId, String racename, String horsename, Integer score) {
        this.recordId = recordId;
        this.date = date;
        this.location = location;
        this.accuracy = accuracy;
        this.raceId = raceId;
        this.racename = racename;
        this.horsename = horsename;
        this.Score = score;
    }

    public Long getRecordId() {
        return recordId;
    }

    public Date getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public Integer getAccuracy() {
        return accuracy;
    }

    public Long getRaceId() {
        return raceId;
    }

    public String getRacename() {
        return racename;
    }

    public String getHorsename() {
        return horsename;
    }

    public Integer getScore() {
        return Score;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    public void setRaceId(Long raceId) {
        this.raceId = raceId;
    }

    public void setRacename(String racename) {
        this.racename = racename;
    }

    public void setHorsename(String horsename) {
        this.horsename = horsename;
    }

    public void setScore(Integer score) {
        Score = score;
    }

    @Override
    public String toString() {
        return "Race{" +
                "recordId=" + recordId +
                ", date=" + date +
                ", location='" + location + '\'' +
                ", accuracy=" + accuracy +
                ", raceId=" + raceId +
                ", racename='" + racename + '\'' +
                ", horsename='" + horsename + '\'' +
                ", Score=" + Score +
                '}';
    }
}
