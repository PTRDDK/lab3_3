package edu.iis.mto.time;

/**
 * Created by Piotrek on 26.03.2017.
 */
public class AlternativeTimeProvider implements ITime {

    private static final long ADD_TWO_DAYS = 2 * 24 * 60 * 60 * 1000;

    @Override
    public long currentTimeMillis() {
        return System.currentTimeMillis() + ADD_TWO_DAYS; //with how much extra time to add
    }
}
