package com.example.filimonov_maxim_task_2_3.Entity;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "clientId")
    private long clientId;

    //@Column(name = "firstName")
    private String firstName;

    //@Column(name = "secondName")
    private String secondName;

    //@Column(name = "passportData")
    private String passportData;

    //@Column(name = "telephoneNumber")
    private String telephoneNumber;


    public ClientEntity() {

    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPassportData() {
        return passportData;
    }

    public void setPassportData(String passportData) {
        this.passportData = passportData;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientEntity clientEntity = (ClientEntity) o;

        if (clientId != clientEntity.clientId) return false;
        if (firstName != null ? !firstName.equals(clientEntity.firstName) : clientEntity.firstName != null) return false;
        if (secondName != null ? !secondName.equals(clientEntity.secondName) : clientEntity.secondName != null) return false;
        if (passportData != null ? !passportData.equals(clientEntity.passportData) : clientEntity.passportData != null)
            return false;
        return telephoneNumber != null ? telephoneNumber.equals(clientEntity.telephoneNumber) : clientEntity.telephoneNumber == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (clientId ^ (clientId >>> 32));
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (passportData != null ? passportData.hashCode() : 0);
        result = 31 * result + (telephoneNumber != null ? telephoneNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", passportData='" + passportData + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }
}