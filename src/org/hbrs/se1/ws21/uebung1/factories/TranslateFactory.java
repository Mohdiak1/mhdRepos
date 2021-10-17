package org.hbrs.se1.ws21.uebung1.factories;

import org.hbrs.se1.ws21.uebung1.control.GermanTranslator;

public class TranslateFactory {
    public static GermanTranslator createGermanTranslator (){
        return new GermanTranslator();
    }
}
