package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;

@Entity
public class Client {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private long clientId;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Advisor advisor;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false )
    private String lastname;

    @Column(nullable = false )
    private String email;

    protected Client(){

    }
    public Client(Advisor advisor, String firstName,String lastname, String email){
        this.advisor = advisor;
        this.firstName=firstName;
        this.lastname = lastname;
        this.email = email;
    }
    public long getClientId(){
        return clientId;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }
    public String setFirstName(String firstname){
        this.firstName= firstname;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
