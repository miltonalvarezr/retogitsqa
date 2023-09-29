package steps;

import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pagesObjects.AdidasPages;
import utils.ProcesarExcel;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class AdidasStep {

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String,String>>();

    public void darClick(By elemento) { SeleniumWebDriver.driver.findElement(elemento).click(); }

    private String obtenerTexto(By elemento){
        return SeleniumWebDriver.driver.findElement(elemento).getText();
    }

    public void validar(By elemento, String texto){
        assertEquals(obtenerTexto(elemento), texto);
    }

    public void escribirYDarEnter(By elemento, String texto){ SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto, Keys.ENTER); }

    public void cerrarModal() throws AWTException {
        Actions actions = new Actions(SeleniumWebDriver.driver);
        Robot r = new Robot();
        //r.keyPress(KeyEvent.VK_ESCAPE);
        //r.keyRelease(KeyEvent.VK_ESCAPE);
        r.mouseMove(100,100);
        actions.click().build().perform();

    }

    @Step
    public void buscarXCategoria(){
        darClick(AdidasPages.getBtnIvyComprar());
        darClick(AdidasPages.getBtnProducto1());
        validar(AdidasPages.getLblDescripcionProd1(), "***UNISEX, HORMA GRANDE | NO APLICA NINGÚN DESCUENTO***");
    }

    @Step
    public void buscarSeleccionarProducto() throws AWTException {
        darClick(AdidasPages.getBtnHome());
        darClick(AdidasPages.getBtnNinos());
        cerrarModal();
        darClick(AdidasPages.getBtnProducto2());
        validar(AdidasPages.getLblDescripcionProd2(), "¿QUÉ ES BOOST? | NO APLICA NINGÚN DESCUENTO");
        validar(AdidasPages.getLblDescripcionProd2(), "¿QUÉ ES BOOST? | NO APLICA NINGÚN DESCUENTO");
    }

    @Step
    public void buscarDesdeExcel() throws AWTException {
        try {
            leerExcel = ProcesarExcel.leerXlsx("reto1.xlsx", "Hoja1");
        }catch(IOException e){
            e.printStackTrace();
        }
        for(int i = 0; i < leerExcel.size(); i++){
            escribirYDarEnter(AdidasPages.getNavBarraBusq(),leerExcel.get(i).get("Busqueda"));
        }
        darClick(AdidasPages.getBtnProducto3());
        cerrarModal();
    }
}
