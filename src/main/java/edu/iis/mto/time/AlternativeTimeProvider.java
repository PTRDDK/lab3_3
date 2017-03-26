package edu.iis.mto.time;

/**
 * Created by Piotrek on 26.03.2017.
 */
public class AlternativeTimeProvider implements ITime {

    @Override
    public long currentTimeMillis() {
        return System.currentTimeMillis() + (24 * 60 * 60 * 1000); //with one extra day
    }
}
