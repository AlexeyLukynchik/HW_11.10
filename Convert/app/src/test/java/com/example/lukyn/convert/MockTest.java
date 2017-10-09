package com.example.lukyn.convert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static junit.framework.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

/**
 * Created by Алексей on 09.10.2017.
 */

public class MockTest {
    @InjectMocks
    private MainActivity mActivity;
    private MyConvert myConvert;
    @Mock
    private MyConvert objConv;

    @Before
    public void create(){
        objConv = mock(MyConvert.class);
        myConvert = spy(MyConvert.class);

        when(MyConvert.Conv(1)).thenReturn(3.281);
        when(MyConvert.Conv(45)).thenReturn(147.638);

}
    @Test(expected = ArithmeticException.class)
    public void test(){
        assertSame(3.281,MyConvert.Conv(1));
        assertSame(147.638,MyConvert.Conv(45));

    }


}
