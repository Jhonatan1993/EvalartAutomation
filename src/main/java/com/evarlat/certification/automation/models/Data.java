package com.evarlat.certification.automation.models;

public class Data {
    private TestData date;
    public Data(TestData date) {
        this.date = date;
    }
    public TestData getDate() {
        return date;
    }

    public void setDate(TestData date) {
        this.date = date;
    }
}
