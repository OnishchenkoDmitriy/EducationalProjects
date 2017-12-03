package org.courses.model.enteties.human;

/**
 * The class describes single human
 */
public class Human implements HumanToTaxpayer {

    public enum Gender { MALE , FEMALE }

    private String name;
    private String birthDate;
    private Gender gender;

    @Override
    public String name() {
        return name;
    }
    @Override
    public String birthDate() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                '}';
    }
}
