package gcumsa.common;

import gcumsa.InhelloApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { InhelloApplication.class })
public class CucumberSpingConfiguration {}
