package org.hbrs.se1.ws21.uebung1.factories;

import org.hbrs.se1.ws21.uebung1.control.GermanTranslator;
import org.hbrs.se1.ws21.uebung1.control.Translator;

public class TranslateFactory {
    public static Translator createGermanTranslator() {
        return new GermanTranslator();
    }
}
