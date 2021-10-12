package com.company;

import java.io.FileOutputStream;

import static java.lang.String.format;

public class Main {

    public static void main(String[] args) {
        Double salarioBruto = 1100.00;
//        var Inss = calcularInss(salarioBruto);


        Double computedDiscount = computeDiscount(salarioBruto, 0.0, 1100.0,0.075);

        Double computedDiscount2 = computeDiscount(salarioBruto, 0.0, 1100.0,0.075);



        String value = "";
    }

    public static Double calcularInss(Double salarioBruto) {
        Double discountValue = 0.0;
        Double actualValue = salarioBruto;
        Double f1 = 0.0;
        Double f2 = 0.0;
        Double f3 = 0.0;
        Double f4 = 0.0;

        Double ff1In = 0.0;
        Double ff1Out = 1100.0;
        Double percentF1 = 0.075;
        if (salarioBruto > ff1Out) {
            f1 = (ff1Out * percentF1);
            discountValue += (ff1Out * percentF1);
        } else {
            f1 = (ff1Out - salarioBruto) * percentF1;
            discountValue += (ff1Out - salarioBruto) * percentF1;
        }
        System.out.println(format("Imposto Faixa de Salario 1 - {  %s }", f1));


        Double ff2In = 1100.00;
        Double ff2Out = 2203.48;
        Double percentF2 = 0.09;
        if (salarioBruto > ff2Out && salarioBruto > ff2In) {
            f2 = ((ff2Out - ff2In) * percentF2);
            discountValue += ((ff2Out - ff2In) * percentF2);
        } else {
            f2 = (ff2Out - salarioBruto) * percentF2;
            discountValue += (ff2Out - salarioBruto) * percentF2;
        }


        Double ff3In = 2203.48;
        Double ff3Out = 3305.22;
        Double percentF3 = 0.12;
        if (salarioBruto > ff3Out) {
            f3 = ((ff3Out - ff3In) * percentF3);
            discountValue += ((ff3Out - ff3In) * percentF3);
        } else {
            f3 = (ff3Out - salarioBruto) * percentF3;
            discountValue += (ff3Out - salarioBruto) * percentF3;
        }

        Double ff4In = 3305.22;
        Double ff4Out = 6433.57;
        Double percentF4 = 0.14;
        if (salarioBruto > ff4Out) {
            f4 = ((ff4Out - ff4In) * percentF4);
            discountValue += ((ff4Out - ff4In) * percentF4);
        } else {
            f4 = (ff4In - salarioBruto) * percentF4;
            discountValue += (ff4Out - salarioBruto) * percentF4;
        }


        System.out.println(format("Imposto Faixa de Salario 2 - {  %s }", f2));


//        f1 = salarioBruto > 1100 ? (1100 * 0.075) : (1100 - salarioBruto) * 0.075;
//        discountValue += salarioBruto > 1100 ? (1100 * 0.075) : (1100 - salarioBruto) * 0.075;
//
//        System.out.println(format("Imposto Faixa de Salario 1 - {  %s }", f1));
//
//        var f2 = salarioBruto > 2203.48 ? ((2203.48 - 1100) * 0.09) : (1100 + 2203.48 - salarioBruto) * 0.09;
//        discountValue += salarioBruto > 2203.48 ? ((2203.48 - 1100) * 0.09) : (1100 + 2203.48 - salarioBruto) * 0.09;
//
//        System.out.println(format("Imposto Faixa de Salario 2 - {  %s }", f2));
//
//        var f3 = salarioBruto > 3305.22 ? ((3305.22 - 2203.48) * 0.12) : (3305.22 + 2203.48 - salarioBruto) * 0.12;
//        discountValue += salarioBruto > 3305.22 ? ((3305.22 - 2203.48) * 0.12) : (3305.22 + 2203.48 - salarioBruto) * 0.12;
//
//        System.out.println(format("Imposto Faixa de Salario 3 - {  %s }", f3));
//
//        var f4 = salarioBruto > 6433.57 ? ((6433.57 - 3305.22) * 0.14) : (6433.57 + 3305.22 - salarioBruto) * 0.14;
//        discountValue += salarioBruto > 6433.57 ? ((6433.57 - 3305.22) * 0.14) : (6433.57 + 3305.22 - salarioBruto) * 0.14;
//
//        System.out.println(format("Imposto Faixa de Salario 3 - {  %s }", f4));


        return discountValue;
    }

    public static Double computeDiscount(Double salarioBruto, Double fIn, Double fOut, Double percentTax) {
        Double f = 0.0;
        Double discountValue = 0.0;
        if(fIn == 0){
            return salarioBruto * percentTax;
        }

        if (salarioBruto > fOut) {
            f = ((fOut - fIn) * percentTax);
            discountValue += ((fOut - fIn) * percentTax);
        } else {
            f = (fOut - salarioBruto) * percentTax;
            discountValue += (fOut - salarioBruto) * percentTax;
        }
        return discountValue;

    }
}
