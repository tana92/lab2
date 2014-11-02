package copy;

import basic.interfaces.Fisier;

/**
 *
 * clasa copy_extern poate face transfer de fisiere inclusiv cu porturile usb disponibile pe stickuri sau harduri externe
 *
 * Created by Tanasescu on 10/29/2014.
 */
public class Copy_Extern extends MyCopy implements Fisier {
    public Copy_Extern(String nume, int dimensiune, String sursa, String destinatie) {
        super(nume, dimensiune, sursa, destinatie);
    }

    @Override
    public void set_path_file(String cale) {

        this.sursa=cale;
    }

    @Override
    public void Get_Sursa_Destinatie(String sursa, String destinatie) {

    }


    @Override
    public void get_path_file(String cale) {

        System.out.println(cale + " Aceasta este calea");
    }

}
