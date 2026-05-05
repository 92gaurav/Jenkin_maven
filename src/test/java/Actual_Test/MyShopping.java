package Actual_Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Reusable_Code.Browser;

public class MyShopping extends Browser {

    @BeforeMethod
    public void launch_bro() {
        setup();
    }

    @Test
    public void startshop() {
        System.out.println("Test Starts");
        driver.get("https://www.myntra.com");
    }
}