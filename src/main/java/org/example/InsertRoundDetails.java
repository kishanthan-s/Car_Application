package org.example;

public class InsertRoundDetails {

    private int round_num;
    private String car_number;
    private String model;
    private String winning_place;

    public InsertRoundDetails() {


    }

    public int getRound_num() {
        return round_num;
    }

    public String getCar_number() {
        return car_number;
    }

    public String getModel() {
        return model;
    }

    public String getWinning_place() {
        return winning_place;
    }

    public void setRound_num(int round_num) {
        this.round_num = round_num;
    }

    public void setCar_number(String car_number) {
        this.car_number = car_number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWinning_place(String winning_place) {
        this.winning_place = winning_place;
    }
}
