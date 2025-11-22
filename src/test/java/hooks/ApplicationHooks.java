package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks {
    @Before
    public void setup() {
        System.out.println("Setup before Scenario");
    }

    @After
    public void tearDown() {
        System.out.println("Clean up Scenario");
    }
}
