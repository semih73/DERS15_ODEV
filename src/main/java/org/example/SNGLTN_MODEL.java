package org.example;

public class SNGLTN_MODEL {
    private static SNGLTN_MODEL instance;

    private SNGLTN_MODEL() {
        System.out.println("Singleton modelde constructor içinden yazıldı.");
    }
    public static SNGLTN_MODEL getInstance() {
        if (instance == null) {
            instance = new SNGLTN_MODEL();
        }
        return instance;
    }
    public void SNGLTN_METHOD() {
        System.out.println("Singleton modelde metod içinden yazdırıldı.");
    }
}

