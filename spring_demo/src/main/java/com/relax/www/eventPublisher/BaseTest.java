package com.relax.www.eventPublisher;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ActiveProfiles("dev")
public class BaseTest {
    @Test
    public void test1(){
        System.out.println(">>>>>>>>>>");
    }
}