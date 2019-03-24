package com.codexmo.codexauto;

import codexauto.config.EnvironmentConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {EnvironmentConfig.class})
public class CodexautoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
