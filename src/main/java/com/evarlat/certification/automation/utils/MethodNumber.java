package com.evarlat.certification.automation.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public final class MethodNumber {
    private MethodNumber() {
    }

    public static long performMathOperation(Actor actor, Target path) {
        WebElement element = BrowseTheWeb.as(actor).find(path);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();

        // Extraer el texto que contiene la operación matemática
        String operation = element.getText().replace("=?", "");  // Asumiendo que la operación termina con "=?"

        // Utilizar Javascript para evaluar la operación matemática
        String script = "return eval('" + operation + "')";
        Number result = (Number) jsExecutor.executeScript(script);

        // Imprime el resultado como un número
        return result.longValue();
    }

    public static void selectOptionBasedOnResult(Actor actor, Target radioButtons, long expectedValue) {
        // Obtener todos los elementos radio dentro del contenedor especificado
        List<WebElementFacade> options = BrowseTheWeb.as(actor).findAll(radioButtons);

        // Recorrer las opciones para encontrar y seleccionar la correcta
        for (WebElementFacade option : options) {
            String value = option.getAttribute("value");

            if (value != null && Long.parseLong(value) == expectedValue) {
                option.click();

                break;
            }
        }
    }
}
