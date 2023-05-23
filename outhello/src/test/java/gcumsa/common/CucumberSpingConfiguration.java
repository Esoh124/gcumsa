package gcumsa.common;

import gcumsa.OuthelloApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { OuthelloApplication.class })
public class CucumberSpingConfiguration {}
