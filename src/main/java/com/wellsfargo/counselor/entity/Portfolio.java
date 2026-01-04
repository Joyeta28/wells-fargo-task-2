package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue
    private long portfolioID;

    @OneToOne
    @JoinColumn(nullable = false)
    private Client client;

    protected Portfolio(){

    }

    public Portfolio(Client client){
        this.client = client;
    }
    public long getPortfolioID(){
        return portfolioID;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setPortfolioID(long portfolioID) {
        this.portfolioID = portfolioID;
    }
}