package edu.iis.mto.time;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Piotrek on 26.03.2017.
 */
public class OrderTest {

    @Test
    public void orderTestNotExpiredYet() throws Exception{
        Order order = new Order(new TimeProvider());
        order.submit();
        order.confirm();
    }

    @Test(expected = OrderExpiredException.class)
    public void orderTestExpiredAlready() throws Exception{
        Order order = new Order(new AlternativeTimeProvider());
        order.submit();
        order.confirm();
    }
}