package com.conygre.training.tradesimulator.model;

public enum TradeState {
    CREATED("CREATED"),
    PROCESSING("PROCESSSING"),
    FILLED("FILLED"),
    REJECTED("REJECTED");

    private String state;

    private TradeState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    } 
}
