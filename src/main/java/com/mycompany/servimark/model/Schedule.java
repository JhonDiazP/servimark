/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servimark.model;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author User
 */
public class Schedule {
    
    private int id;
    private Date day;
    private LocalTime startTime;
    private LocalTime timeEnd;

    public Schedule(int id, Date day, LocalTime startTime, LocalTime timeEnd) {
        this.id = id;
        this.day = day;
        this.startTime = startTime;
        this.timeEnd = timeEnd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(LocalTime timeEnd) {
        this.timeEnd = timeEnd;
    }
    
}
