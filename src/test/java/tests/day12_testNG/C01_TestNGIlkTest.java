package tests.day12_testNG;

import org.testng.annotations.Test;
import utilities.Driver;
import utilities.Reusable_Methods;

public class C01_TestNGIlkTest {
    @Test
    public void test01(){
        Driver.getDriver().get("https://www.amazon.com");
        Reusable_Methods.bekle(5);
        Driver.closeDriver();
    }
    @Test
    public void test02(){
        // youtube anasayfaya gidin
        Driver.getDriver().get("https://www.youtube.com");
        Reusable_Methods.bekle(3);
        //  url yi yazdırın
        System.out.println(Driver.getDriver().getCurrentUrl());
        Reusable_Methods.bekle(3);

        // sayfayı kaptın
        Driver.closeDriver();
    }
}
