package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue
    private long PortfolioId;
    @ManyToOne
    private Client client;

    @Column(nullable = false)
    private String creationDate;

    protected Portfolio() {

    }

    public Portfolio(Client client,String creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    public void setCreationDate(String creationDate) { this.creationDate = creationDate; }

    public void setClient(Client client) { this.client = client; }

    public long getPortfolioId() { return PortfolioId; }

    public Client getClient() { return client; }

    public String getCreationDate() { return creationDate; }

}
