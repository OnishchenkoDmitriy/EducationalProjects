package org.courses.model;

public class StudentNote {

    private String name;
    private String surName;
    private String telephone;
    private String birthDate;
    private String address;

    public void setName(String name) {
        this.name = name.trim();
    }
    public void setSurName(String surName) {
        this.surName = surName.trim();
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone.trim();
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate.trim();
    }
    public void setAddress(String address) {
        this.address = address.trim();
    }

    @Override
    public String toString() {
        return (String.format("%20s", name + " " + surName) + String.format("%20s", "tel: " + telephone)
                + String.format("%25s","birth date: " + birthDate));
    }
}
