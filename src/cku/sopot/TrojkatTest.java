package cku.sopot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrojkatTest {

    @Test
    void podstawaNieMozeBycUjemna() {
        Trojkat trojkat = new Trojkat(4, 10);
        trojkat.setPodstawa(-10);
        Assertions.assertEquals(10, trojkat.getPodstawa());
    }

    @Test
    void wysokoscNieMozeBycUjemna() {
        Trojkat trojkat = new Trojkat(4, 5);
        trojkat.setWysokosc(-5);
        Assertions.assertEquals(5, trojkat.getWysokosc());
    }

    @Test
    void wartosciWKonstruktorzeNieMogaBycUjemne() {
        Trojkat trojkat = new Trojkat(-5, -8);
        Assertions.assertEquals(5, trojkat.getPodstawa());
        Assertions.assertEquals(8, trojkat.getWysokosc());
    }

    @Test
    void poprawneObliczeniePola() {
        Trojkat trojkat = new Trojkat(-8, -6);
        Assertions.assertEquals(24, trojkat.obliczPole());
    }
}