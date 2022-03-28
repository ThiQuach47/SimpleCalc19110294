package com.example.simplecalc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(JUnit4.class)

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private Calculator mCalculator;
    @Before
    public void setUp(){
        mCalculator= new Calculator();

    }
    @After
    public  void  tearDown(){

    }
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void subTwoNumbers() {
        double resultSub = mCalculator.sub(1d, 1d);
        assertThat(resultSub, is(equalTo(0d)));
    }
    @Test
    public void subWorksWithNegativeResult() {
        double resultSub = mCalculator.sub(1d, 17d);
        assertThat(resultSub, is(equalTo(-16d)));
    }
    @Test
    public void subsoam() {
        double resultSub = mCalculator.sub(1d,-1d);
        assertThat(resultSub, is(equalTo(2d)));
    }
    @Test
    public void subeasy() {
        double resultSub = mCalculator.sub(100d,100d);
        assertThat(resultSub, is(equalTo(0d)));
    }
    @Test
    public void subpro() {
        double resultSub = mCalculator.sub(100d,200d);
        assertThat(resultSub, is(equalTo(-100d)));
    }
    /*
   test mul
    */
    @Test
    public void mulTwoNumbers() {
        double resultMul = mCalculator.mul(32d, 2d);
        assertThat(resultMul, is(equalTo(64d)));
    }
    @Test

    public void mulzero() {
        double resultMul = mCalculator.mul(0d,0d);
        assertThat(resultMul, is(equalTo(0d)));
    }
    @Test
    public void mulzeros1() {
        double resultMul = mCalculator.mul(0d,100d);
        assertThat(resultMul, is(equalTo(0d)));
    }
    @Test
    public void mulamam() {
        double resultMul = mCalculator.mul(-1d,-100d);
        assertThat(resultMul, is(equalTo(100d)));
    }
    @Test
    public void mulamduong() {
        double resultMul = mCalculator.mul(-1d,2d);
        assertThat(resultMul, is(equalTo(-2d)));
    }
    /*
       test pow
        */
    @Test
    public void powamduong() {
        double resultPow = mCalculator.pow(2d,-1d);
        assertThat(resultPow, is(equalTo(1/2d)));
    }
    @Test
    public void powamduong1() {
        double resultPow = mCalculator.pow(-2d,1d);
        assertThat(resultPow, is(equalTo(-2d)));
    }
    @Test
    public void powamduong2() {
        double resultPow = mCalculator.pow(-2d,-1d);
        assertThat(resultPow, is(equalTo(-1/2d)));
    }
    @Test
    public void powzero() {
        double resultPow = mCalculator.pow(2d,0d);
        assertThat(resultPow, is(equalTo(1d)));
    }
    @Test
    public void powzero1() {
        double resultPow = mCalculator.pow(1d,-1d);
        assertThat(resultPow, is(equalTo(1d)));
    }
    /*
   test GIAITHUA
    */
    @Test
    public void fact1() {
        double resultFact = mCalculator.giaithua1(0d);
        assertThat(resultFact, is(equalTo(1d)));
    }
    @Test
    public void fact2() {
        double resultFact = mCalculator.giaithua1(1d);
        assertThat(resultFact, is(equalTo(1d)));
    }
    @Test
    public void fact3() {
        double resultFact = mCalculator.giaithua1(2d);
        assertThat(resultFact, is(equalTo(2d)));
    }
    @Test
    public void fact4() {
        double resultFact = mCalculator.giaithua1(3d);
        assertThat(resultFact, is(equalTo(6d)));
    }
    @Test
    public void fact5() {
        double resultFact = mCalculator.giaithua1(4d);
        assertThat(resultFact, is(equalTo(24d)));
    }
    /*
       test Log
        */
    @Test
    public void log1() {
        double resultLog = mCalculator.logarit(8,2);
        assertEquals(resultLog, 1/3d,0.001);
    }
    @Test
    public void log2() {
        double resultLog = mCalculator.logarit(2,4);
        assertThat(resultLog, is(equalTo(2d)));
    }
    @Test
    public void log3() {
        double resultLog = mCalculator.logarit(2,2);
        assertThat(resultLog, is(equalTo(1d)));
    }
    @Test
    public void log4() {
        double resultLog = mCalculator.logarit(2,1);
        assertThat(resultLog, is(equalTo(0d)));

    }
    @Test
    public void log5() {
        double resultLog = mCalculator.logarit(27,9);
        assertEquals(resultLog, 2/3d,0.001);


    }
}