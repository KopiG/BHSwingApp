package com.braininghub.swing.entity;

import java.time.LocalDate;

public class Donor {
    private String firstName;
    private String lastName;
    private Integer allDonations;
    private LocalDate lastDonation;

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

    public LocalDate getLastDonation() {
        return lastDonation;
    }

    public void setLastDonation(LocalDate lastDonation) {
        this.lastDonation = lastDonation;
    }

    public Donor(String firstName, String lastName, Integer allDonations, LocalDate lastDonation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.allDonations = allDonations;
        this.lastDonation = lastDonation;
    }
}