package com.company;

public class ComputeInss {

    public static Double computeDiscount(Double salarioBruto, Double fIn, Double fOut, Double percentTax) {

        if (fIn.compareTo(0.0) == 0 && salarioBruto.compareTo(fOut) >= 0) {
            return fOut * percentTax;
        } else if(fIn.compareTo(0.0) == 0 && salarioBruto.compareTo(fOut) < 0) {
            return salarioBruto * percentTax;
        }

        if (salarioBruto.compareTo(fIn) > 0 && salarioBruto.compareTo(fOut) <= 0) {
            return (salarioBruto - fIn) * percentTax;
        }

        if (salarioBruto.compareTo(fOut) >= 0) {
            return (fOut - fIn) * percentTax;
        }

        return 0.0;
    }
}
