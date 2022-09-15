package com.wonderrobot.sfhanbaizaikokanrishisutemu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Wfc
 * 
 * @description Unit test base class，Unit test class needs to inherit
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class BaseTest {

    @Test
    public void contextLoads() {
    }
}