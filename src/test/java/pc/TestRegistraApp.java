package pc;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestRegistraApp {
    @Test
    public void TestProfesor() {
        Profesor profesor1 = new Profesor("Juan");
        Profesor profesor2 = new Profesor("Pedro");
        Profesor profesor3 = new Profesor("Maria");
        Assert.assertFalse(profesor1.getLogged());
        Assert.assertFalse(profesor2.getLogged());
        Assert.assertFalse(profesor3.getLogged());
        profesor1.login("Juan");
        profesor2.login("Pedro");
        profesor3.login("Falso");
        Assert.assertTrue(profesor1.getLogged());
        Assert.assertTrue(profesor2.getLogged());
        Assert.assertFalse(profesor3.getLogged());

    }

    @Test
    public void testRegistraApp(){

    }
}
