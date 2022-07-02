package model.forms.practiceform;

import java.util.Objects;

public class Content {

    private String firstName;
    private String lastName;
    private String email;
    private int mobile;
    private String currentAddress;

    public Content() {
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobile() {
        return mobile;
    }


    public void setMobile(int mobile) {
        if (Integer.toString(mobile).length() == 10) {
            this.mobile = mobile;
        } else {
            throw new IllegalStateException("Mobile must contain 10 digits");
        }
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    @Override
    public String toString() {
        return "Content{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", currentAddress='" + currentAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Content content = (Content) o;
        return Objects.equals(firstName, content.firstName) && Objects.equals(lastName, content.lastName) && Objects.equals(email, content.email) && Objects.equals(mobile, content.mobile) && Objects.equals(currentAddress, content.currentAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, mobile, currentAddress);
    }

}
