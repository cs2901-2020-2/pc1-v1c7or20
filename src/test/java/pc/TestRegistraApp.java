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

    @Test(invocationCount = 500, threadPoolSize = 500)
    public void testRegistraApp(){
        Profesor profesor1 = new Profesor("Juan");
        Profesor profesor2 = new Profesor("Pedro");
        Profesor profesor3 = new Profesor("Maria");
        RegistraApp registraApp = RegistraApp.getInstance();
        profesor1.login("Juan");
        profesor2.login("Pedro");
        profesor3.login("Maria");
        profesor1.addRegister(registraApp,"2020-II CS2901 ES Ingeniería de Software I, 1, Semana05, Jesus Bellido,10/08 08:00-10:00 Laboratorio.");
        profesor2.addRegister(registraApp,"2020-II CS2901 ES Ingeniería de Software I, 1, Semana05, Jesus Bellido,10/08 08:00-10:00 Laboratorio.");
        profesor3.addRegister(registraApp,"2020-II CS2901 ES Ingeniería de Software I, 1, Semana05, Jesus Bellido,10/08 08:00-10:00 Laboratorio.");
    }
}
