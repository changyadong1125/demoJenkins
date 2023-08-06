package com.atguigu.demojenkins;

import com.atguigu.demojenkins.controller.HelloController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoJenkinsApplicationTests {

        @Autowired
        private HelloController helloController;

        @Test
        void test(){
            Assertions.assertNotNull(helloController);
        }
}
