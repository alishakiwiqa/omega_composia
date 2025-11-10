package org.testing.testscripts;

import org.testing.base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGoogle extends Base {

	@Test
	
    public void openGoogle() {
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        Assert.assertTrue(title.contains("Google"), "Title should contain 'Google'");
    }
}
