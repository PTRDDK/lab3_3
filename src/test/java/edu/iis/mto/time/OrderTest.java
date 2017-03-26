package edu.iis.mto.time;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Piotrek on 26.03.2017.
 */
public class OrderTest {

    public Order order;

    @Before
    public void setUp(){
        Order order = new Order();
        order.submit();
    }

    @Test
    public void orderTestNotExpiredYet() throws Exception{
        AlternativeTimeProvider.timeToAdd = 24 * 60 * 60 * 1000;

        order.confirm();
    }

    @Test(expected = OrderExpiredException.class)
    public void orderTestExpiredAlready() throws Exception{
        AlternativeTimeProvider.timeToAdd = 25 * 60 * 60 * 1000;

        order.confirm();
    }
}