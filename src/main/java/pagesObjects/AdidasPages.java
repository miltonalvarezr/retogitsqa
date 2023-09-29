package pagesObjects;

import org.openqa.selenium.By;

public class AdidasPages {

    private static By btnHome = By.xpath("//a[@class='logo-black___30Qp_ big___2Azet']");

    private static By btnIvyComprar = By.xpath("//a[@class='link-wrapper___1mXsE' and @manual_cm_sp='SLOT-11.2-_-HOME_?_?_HOME_SUSTAIN-HP-TC-IVYPARK-DROP-5.5-SS22-_-HP-SHOP-NOW-CTA-IVYPARK-PELOTON-FW21-_-843030']");
    private static By btnProducto1 = By.xpath("//a/div[@class='glass-product-card__details']/p[text()='Tenis Ultraboost OG']");
    private static By lblDescripcionProd1 = By.xpath("//span[@class='maskable-content___3AqN4']");

    private static By btnNinos = By.xpath("//a[@manual_cm_sp='header-_-niños']");
    private static By btnProducto2 = By.xpath("//a/div/p[contains(text(), 'Camiseta Essentials Tee')]");
    private static By lblDescripcionProd2 = By.xpath("//span[contains(text(), 'Camiseta Essentials Tee')]");

    private static By navBarraBusq = By.xpath("//input[@name='q']");
    private static By btnProducto3 = By.xpath("//a[@class='glass-product-card__assets-link']/img[@title='Tenis Bravada The Simpsons'][1]");
    private static By lblNomProd = By.xpath("//div[@class='product-description___2cJO2 mobile___1u0KK']/h1[@class='gl-heading gl-heading--regular gl-heading--italic name___1EbZs']/span");


    public static By getBtnProducto3() { return btnProducto3; }

    public static By getLblNomProd() { return lblNomProd; }

    public static By getNavBarraBusq() { return navBarraBusq; }

    public static By getBtnIvyComprar() { return btnIvyComprar; }

    public static By getBtnProducto1() { return btnProducto1; }

    public static By getLblDescripcionProd1() { return lblDescripcionProd1; }

    public static By getBtnNinos() { return btnNinos; }

    public static By getBtnProducto2() { return btnProducto2; }

    public static By getBtnHome() { return btnHome; }

    public static By getLblDescripcionProd2() { return lblDescripcionProd2; }
}
