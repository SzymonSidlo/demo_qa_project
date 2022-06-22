package model.elements.textbox;

import java.util.Objects;

public class Content {

    private String fullName;
    private String email;
    private String currentAddress;
    private String premanentAddress;

    public Content() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getPremanentAddress() {
        return premanentAddress;
    }

    public void setPremanentAddress(String premanentAddress) {
        this.premanentAddress = premanentAddress;
    }

    @Override
    public String toString() {
        return "Content{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", currentAddress='" + currentAddress + '\'' +
                ", premanentAddress='" + premanentAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Content content = (Content) o;
        return Objects.equals(fullName, content.fullName) && Objects.equals(email, content.email) && Objects.equals(currentAddress, content.currentAddress) && Objects.equals(premanentAddress, content.premanentAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, email, currentAddress, premanentAddress);
    }
}
