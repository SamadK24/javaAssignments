package com.swabhav.BankingApp.model;

import java.sql.Timestamp;

public class BankTransaction {
    private int transactionId;
    private int linkedAccountId;
    private String transactionType;
    private double transactionAmount;
    private Timestamp transactionTime;

    public BankTransaction(int transactionId, int linkedAccountId, String transactionType, double transactionAmount, Timestamp transactionTime) {
        this.transactionId = transactionId;
        this.linkedAccountId = linkedAccountId;
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
        this.transactionTime = transactionTime;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getLinkedAccountId() {
        return linkedAccountId;
    }

    public void setLinkedAccountId(int linkedAccountId) {
        this.linkedAccountId = linkedAccountId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public Timestamp getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Timestamp transactionTime) {
        this.transactionTime = transactionTime;
    }

    @Override
    public String toString() {
        return String.format("Txn ID: %d | Type: %s | Amount: %.2f | Time: %s",
                transactionId, transactionType, transactionAmount, transactionTime.toString());
    }
}
