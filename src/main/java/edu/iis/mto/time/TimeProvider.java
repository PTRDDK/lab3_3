package edu.iis.mto.time;

/**
 * Created by Piotrek on 26.03.2017.
 */
public class TimeProvider implements ITime{

    @Override
    public long currentTimeMillis(){
        return System.currentTimeMillis();
    }
}
