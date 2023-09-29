package stepDefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import pagesObjects.AdidasPages;
import steps.AdidasStep;

import java.awt.*;

public class AdidasBusqProdStepDefinitions {

    @Steps
    AdidasStep step = new AdidasStep();

    @Dado("^que me encuentro en la pagina de Adidas$")
    public void queMeEncuentroEnLaPaginaDeAdidas() {
        SeleniumWebDriver.chromeDrive("https://www.adidas.co/");
    }

    @Cuando("^realizo la busqueda de un producto$")
    public void realizoLaBusquedaDeUnProducto() throws AWTException {
        step.buscarXCategoria();
        step.buscarDesdeExcel();
        step.buscarSeleccionarProducto();
    }

    @Entonces("^lo selecciono y visualizo\\.$")
    public void loSeleccionoYVisualizo() {
        step.validar(AdidasPages.getLblNomProd(), "Tenis Bravada The Simpsons");
    }

}
