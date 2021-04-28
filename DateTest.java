package com.uregina.app;
import static org.junit.Assert.assertTrue;
import com.uregina.exceptions.InvalidTimeException;

import org.junit.Test;

public class DateTest {
    
    private static final boolean Time12 = false;

    @Test
    public void is_lessThan() throws InvalidTimeException{
    Time12 totime24 = new Time12(0, 0, null);
    boolean difference = totime24.difference("true");
    assertTrue(Time12);
    }

    @Test
    public void is_GreaterThan() throws InvalidTimeException{
    Time12 totime24 = new Time12(0, 0, null);
    boolean difference = totime24.difference("false");
    assertTrue(Time12);
    }
}
