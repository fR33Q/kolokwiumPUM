package com.example.damian.myapplication;

/**
 * Created by Damian on 15.01.2018.
 */

public class Leki {

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getDawka() {
        return dawka;
    }

    public void setDawka(String dawka) {
        this.dawka = dawka;
    }

    private String nazwa;
    private String dawka;

    Leki(String nazwa, String dawka)
    {
        this.nazwa = nazwa;
        this.dawka = dawka;


    }
}
