package com.uregina.app;
import static org.junit.Assert.assertTrue;
import com.uregina.exceptions.InvalidTimeException;

import org.junit.Test;

public class DateTimeTest {
    
    private static final boolean Time12 = false;

    @Test
    public void is_consecutive() throws InvalidTimeException{
    Time12 totime24 = new Time12(0, 0, null);
    boolean difference = totime24.difference("true");
    assertTrue(Time12);
    }

    @Test
    public void is_Notconsecutive() throws InvalidTimeException{
    Time12 totime24 = new Time12(0, 0, null);
    boolean difference = totime24.difference("false");
    assertTrue(Time12);
    }
}
