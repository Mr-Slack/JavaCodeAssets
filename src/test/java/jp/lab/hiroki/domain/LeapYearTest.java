package jp.lab.hiroki.domain;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class LeapYearTest {

    @Test
    public void 西暦が４の倍数でない場合falseが返ること() throws Exception {
        // Exercise
        boolean actual = LeapYear.isLeapYear(new Year(1999));
        boolean expected = false;
        // Verify
        assertThat(actual, is(expected));
    }

    @Test
    public void 西暦が４の倍数でかつ１００の倍数でかつ４００の倍数でない場合falseが返ること() throws Exception {
        // Exercise
        boolean actual = LeapYear.isLeapYear(new Year(2100));
        boolean expected = false;
        // Verify
        assertThat(actual, is(expected));
    }

    @Test
    public void 西暦が４の倍数でかつ１００の倍数でかつ４００の倍数の場合trueが返ること() throws Exception {
        // Exercise
        boolean actual = LeapYear.isLeapYear(new Year(2400));
        boolean expected = true;
        // Verify
        assertThat(actual, is(expected));
    }

    @Test
    public void 西暦が４の倍数でかつ１００の倍数でない場合trueが返ること() throws Exception {
        // Exercise
        boolean actual = LeapYear.isLeapYear(new Year(2004));
        boolean expected = true;
        // Verify
        assertThat(actual, is(expected));
    }
}
