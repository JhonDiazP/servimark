/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servimark.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author User
 */
public class Enrool {
    
    private int id;
    private Date dateInscription;
    private String status;
    private Student student;
    private List<Group> group;

    public Enrool(int id, Date dateInscription, String status, Student student, List<Group> group) {
        this.id = id;
        this.dateInscription = dateInscription;
        this.status = status;
        this.student = student;
        this.group = group;
    }
    
    public List<Group> getGroup() {
        return group;
    }

    public void setGroup(List<Group> group) {
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    
}
