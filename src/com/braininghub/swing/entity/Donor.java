package com.braininghub.swing.entity;

import java.util.Date;

public class Donor {
    private String firstName;
    private String lastName;
    private Integer allDonations;
    private Date lastDonation;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAllDonations() {
        return allDonations;
    }

    public void setAllDonations(Integer allDonations) {
        this.allDonations = allDonations;
    }

    public Date getLastDonation() {
        return lastDonation;
    }

    public void setLastDonation(Date lastDonation) {
        this.lastDonation = lastDonation;
    }

    public Donor(String firstName, String lastName, Integer allDonations, Date lastDonation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.allDonations = allDonations;
        this.lastDonation = lastDonation;
    }
}