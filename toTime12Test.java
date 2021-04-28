package com.uregina.app;
import static org.junit.Assert.assertTrue;
import com.uregina.exceptions.InvalidTimeException;

import org.junit.Test;

public class toTime12Test {
    private static final boolean Time12 = false;

    @Test
    public void isNo_difference() throws InvalidTimeException{
    Time12 totime24 = new Time12(0, 0, null);
    boolean difference = totime24.difference("00:00");
    assertTrue(Time12);
    }

    @Test
    public void isNeg_difference() throws InvalidTimeException{
    Time12 totime24 = new Time12(0, 0, null);
    boolean difference = totime24.difference("-12:00");
    assertTrue(Time12);
    }

    @Test
    public void isPos_difference() throws InvalidTimeException{
    Time12 totime24 = new Time12(0, 0, null);
    boolean difference = totime24.difference("12:00");
    assertTrue(Time12);
    }

    @Test
    public void is_invalid() throws InvalidTimeException{
    Time12 totime24 = new Time12(0, 0, null);
    boolean difference = totime24.difference("Aa:00");
    assertTrue(Time12);
    }
   
}
