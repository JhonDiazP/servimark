/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servimark.model;

import java.time.LocalTime;

/**
 *
 * @author User
 */
public class WorkingDay {
    
    private int id;
    private String name;
    private LocalTime startTime;
    private LocalTime timeEnd;

    public WorkingDay(int id, String name, LocalTime startTime, LocalTime timeEnd) {
        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.timeEnd = timeEnd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
