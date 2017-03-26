package edu.iis.mto.time;

/**
 * Created by Piotrek on 26.03.2017.
 */
public class AlternativeTimeProvider implements ITime {

    public static long timeToAdd = 0;

    @Override
    public long currentTimeMillis() {
        return System.currentTimeMillis() + timeToAdd; //with how much extra time to add
    }
}
