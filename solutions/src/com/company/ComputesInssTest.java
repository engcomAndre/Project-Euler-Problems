package com.company;

import org.junit.Assert;
import org.junit.Test;

import static com.company.ComputeInss.computeDiscount;

public class ComputesInssTest {

    Faixas faixas = new Faixas();

    @Test
    public void whenSalary550ShouldBeReturns41p25() {
        Double computedDiscount = 0.0;
        Double salary = 550.0;
        for(Faixa faixa : faixas.getFaixas()){
            computedDiscount += computeDiscount(salary, faixa.getfIn(), faixa.getfOut(), faixa.getPercentTax());
        }
        Assert.assertEquals( String.valueOf(41.25),String.valueOf(computedDiscount));
    }

    @Test
    public void whenSalary1100ShouldBeReturns82p5() {
        Double computedDiscount = 0.0;
        Double salary = 1100.0;
        for(Faixa faixa : faixas.getFaixas()){
            computedDiscount += computeDiscount(salary, faixa.getfIn(), faixa.getfOut(), faixa.getPercentTax());
        }
        Assert.assertEquals( String.valueOf(82.5),String.valueOf(computedDiscount));
    }

    @Test
    public void whenSalary1100p01ShouldBeReturns82p5() {
        Double computedDiscount = 0.0;
        Double salary = 1100.01;
        for(Faixa faixa : faixas.getFaixas()){
            computedDiscount += computeDiscount(salary, faixa.getfIn(), faixa.getfOut(), faixa.getPercentTax());
        }
        Assert.assertEquals( String.valueOf(82.5),String.valueOf(computedDiscount));
    }

    @Test
    public void whenSalary2203p47ShouldBeReturns82p5() {
        Double computedDiscount = 0.0;
        Double salary = 2203.47;
        for(Faixa faixa : faixas.getFaixas()){
            computedDiscount += computeDiscount(salary, faixa.getfIn(), faixa.getfOut(), faixa.getPercentTax());
        }
        Assert.assertTrue(computedDiscount.compareTo(181.0) > 0);
        Assert.assertTrue(computedDiscount.compareTo(182.0) < 0);
    }

    @Test
    public void whenSalary2203p48ShouldBeReturns82p5() {
        Double computedDiscount = 0.0;
        Double salary = 2203.48;
        for(Faixa faixa : faixas.getFaixas()){
            computedDiscount += computeDiscount(salary, faixa.getfIn(), faixa.getfOut(), faixa.getPercentTax());
        }
        Assert.assertTrue(computedDiscount.compareTo(181.0) > 0);
        Assert.assertTrue(computedDiscount.compareTo(182.0) < 0);
    }

    @Test
    public void whenSalary1500ShouldBeReturns118p50() {
        Double computedDiscount = 0.0;
        Double salary = 1500.0;
        for(Faixa faixa : faixas.getFaixas()){
            computedDiscount += computeDiscount(salary, faixa.getfIn(), faixa.getfOut(), faixa.getPercentTax());
        }
        Assert.assertTrue(computedDiscount.compareTo(118.0) > 0);
        Assert.assertTrue(computedDiscount.compareTo(119.0) < 0);
    }

    @Test
    public void whenSalary3305p22ShouldBeReturns314p5() {
        Double computedDiscount = 0.0;
        Double salary = 3305.22;
        for(Faixa faixa : faixas.getFaixas()){
            computedDiscount += computeDiscount(salary, faixa.getfIn(), faixa.getfOut(), faixa.getPercentTax());
        }
        Assert.assertTrue(computedDiscount.compareTo(314.00 ) > 0);
        Assert.assertTrue(computedDiscount.compareTo(315.0) < 0);
    }

    @Test
    public void whenSalary6433p57ShouldBeReturns751p0() {
        Double computedDiscount = 0.0;
        Double salary = 6433.57;
        for(Faixa faixa : faixas.getFaixas()){
            computedDiscount += computeDiscount(salary, faixa.getfIn(), faixa.getfOut(), faixa.getPercentTax());
        }
        Assert.assertTrue(computedDiscount.compareTo(751.0) > 0);
        Assert.assertTrue(computedDiscount.compareTo(752.0) < 0);
    }

    @Test
    public void whenSalary2000p48ShouldBeReturns118p50() {
        Double computedDiscount = 0.0;
        Double salary = 2200.0;
        for(Faixa faixa : faixas.getFaixas()){
            computedDiscount += computeDiscount(salary, faixa.getfIn(), faixa.getfOut(), faixa.getPercentTax());
        }
        Assert.assertTrue(computedDiscount.compareTo(181.0) > 0);
        Assert.assertTrue(computedDiscount.compareTo(182.0) < 0);
    }

    @Test
    public void whenSalary6000p00ShouldBeReturns691() {
        Double computedDiscount = 0.0;
        Double salary = 6000.0;
        for(Faixa faixa : faixas.getFaixas()){
            computedDiscount += computeDiscount(salary, faixa.getfIn(), faixa.getfOut(), faixa.getPercentTax());
        }
        Assert.assertTrue(computedDiscount.compareTo(691.0 ) > 0);
        Assert.assertTrue(computedDiscount.compareTo(692.0) < 0);
    }

    @Test
    public void whenSalary1000p48ShouldBeReturns118p50() {
        Double computedDiscount = 0.0;
        Double salary = 6000.0;
        for(Faixa faixa : faixas.getFaixas()){
            computedDiscount += computeDiscount(salary, faixa.getfIn(), faixa.getfOut(), faixa.getPercentTax());
        }
        Assert.assertTrue(computedDiscount.compareTo(691.0 ) > 0);
        Assert.assertTrue(computedDiscount.compareTo(692.0) < 0);
    }

    @Test
    public void whenSalary10000p48ShouldBeReturns118p50() {
        Double computedDiscount = 0.0;
        Double salary = 10000.0;
        for(Faixa faixa : faixas.getFaixas()){
                computedDiscount += computeDiscount(salary, faixa.getfIn(), faixa.getfOut(), faixa.getPercentTax());
        }
        Assert.assertTrue(computedDiscount.compareTo(751.00) > 0);
        Assert.assertTrue(computedDiscount.compareTo(752.0) < 0);
    }

}
