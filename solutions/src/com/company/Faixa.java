package com.company;

public class Faixa {

    private final Double fIn;
    private final Double fOut;
    private final Double percentTax;

    public Faixa(Double fIn, Double fOut, Double percentTax) {
        this.fIn = fIn;
        this.fOut = fOut;
        this.percentTax = percentTax;
    }

    public Double getfIn() {
        return fIn;
    }

    public Double getfOut() {
        return fOut;
    }

    public Double getPercentTax() {
        return percentTax;
    }
}

