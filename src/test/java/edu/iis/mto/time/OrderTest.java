package edu.iis.mto.time;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Piotrek on 26.03.2017.
 */
public class OrderTest {

    @Test
    public void orderTestNotExpiredYet() throws Exception{
        AlternativeTimeProvider.timeToAdd = 24 * 60 * 60 * 1000;
        Order order = new Order();
        order.submit();
        order.confirm();
    }
}