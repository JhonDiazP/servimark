/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servimark.model;

import java.util.List;

/**
 *
 * @author User
 */
public class Group {
    
    private int id;
    private int code;
    private String name;
    private List<ScheduleGroup> scheduleGroup;
    private Course course;
    private WorkingDay workingDay;


    public Group(int id, int code, String name, List<ScheduleGroup> scheduleGroup, Course course, WorkingDay workingDay) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.scheduleGroup = scheduleGroup;
        this.course = course;
        this.workingDay = workingDay;
    }

    public WorkingDay getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(WorkingDay workingDay) {
        this.workingDay = workingDay;
    }
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<ScheduleGroup> getScheduleGroup() {
        return scheduleGroup;
    }

    public void setScheduleGroup(List<ScheduleGroup> scheduleGroup) {
        this.scheduleGroup = scheduleGroup;
    }

    public Group(List<ScheduleGroup> scheduleGroup) {
        this.scheduleGroup = scheduleGroup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
