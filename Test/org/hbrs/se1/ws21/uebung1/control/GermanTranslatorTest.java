package org.hbrs.se1.ws21.uebung1.control;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {

    GermanTranslator germanTranslator;

    @BeforeEach
    void setUp() {
        germanTranslator = new GermanTranslator();
    }

    @AfterEach
    void tearDown() {
        germanTranslator = null;
    }

    @Test
    void translateNumber() {
        // [1,10]
        assertEquals("Drei", germanTranslator.translateNumber(3), "es sollte 'Drei' ausgegeben werden");
        // > 10
        assertNotEquals("Fünfzen", germanTranslator.translateNumber(15));
        // < 1
        assertNotEquals("minus siebzehn", germanTranslator.translateNumber(-17));
    }
}