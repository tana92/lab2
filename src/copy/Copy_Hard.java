package copy;

import basic.interfaces.Fisier;

/**
 *
 * clasa copy_hard poate face transfer de fisiere doar utilizand spatiul hard-disk avut la dispozitie,adica de pe o partitie pe alta
 * sau dintr-un folder in altul
 *
 * Created by Tanasescu on 10/29/2014.
 */
public class Copy_Hard extends MyCopy implements Fisier {
    @Override
    public void Get_Sursa_Destinatie(String sursa, String destinatie) {

    }

    @Override
    public void get_path_file(String cale) {

        System.out.println(cale + " Aceasta este calea");
    }

    @Override
    public void set_path_file(String cale) {

        this.sursa = cale;
    }

    public Copy_Hard(String nume, int dimensiune, String sursa, String destinatie) {
        super(nume, dimensiune, sursa, destinatie);
    }

    public void afisare()
    {
        System.out.println("fisierul : "+getNume()+" are dimensiunea : "+getDimensiune()+" a fost copiat din  : "+getSursa()+" in : "+getDestinatie());
    }
}
