package labshopmonolithskn.common;

import io.cucumber.spring.CucumberContextConfiguration;
import labshopmonolithskn.MonolithApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MonolithApplication.class })
public class CucumberSpingConfiguration {}
