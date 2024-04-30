package com.evarlat.certification.automation.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

public final class MethodEmoji {

    private MethodEmoji() {
    }

    public static String extractFirstEmojiFromText(Actor actor, Target textContainer) {
        // Encontrar el elemento especificado y extraer su texto
        WebElementFacade element = BrowseTheWeb.as(actor).find(textContainer);
        String text = element.getText();

        // Devolver el primer emoji encontrado
        return findFirstEmoji(text);
    }
    private static String findFirstEmoji(String text) {
        // Recorrer el texto y buscar el primer emoji
        for (int i = 0; i < text.length(); i++) {
            if (Character.isSurrogate(text.charAt(i))) {
                // Asumiendo que el emoji es un caracter único o un par de sustitutos
                return text.substring(i, i + Character.charCount(text.codePointAt(i)));
            }
        }
        throw new IllegalArgumentException("No se encontró ningún emoji en el texto.");
    }


    public static int countEmojiOccurrences(Actor actor, Target textContainer, String emoji) {
        // Encontrar el elemento especificado y extraer su texto
        WebElementFacade element = BrowseTheWeb.as(actor).find(textContainer);
        String text = element.getText();

        // Contar cuántas veces aparece el emoji en el texto
        return countEmojiInText(text, emoji);
    }

    private static int countEmojiInText(String text, String emoji) {
        int count = 0;
        int index = text.indexOf(emoji);
        while (index >= 0) {
            count++;
            index = text.indexOf(emoji, index + emoji.length());
        }

        return count;
    }


}
