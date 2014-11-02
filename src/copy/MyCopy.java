package copy;

/**
 *
 * aceasta este clasa abstracta din care vom deriva mai tarziu alte doua clase
 *
 * Created by Tanasescu on 10/29/2014.
 */
public abstract class MyCopy {

    public String nume;
    public int dimensiune;



    public String sursa;
    public String destinatie;

    /**
     * aici avem metoda abstracta neimplementata
     */

    public abstract void Get_Sursa_Destinatie(String sursa , String destinatie);


    /**
     * aici avem metoda abstracta implementata
     */

    public int Set_SD(String s,String d)
    {
        if(s != null || d != null)
            return 0;

        else
        {
            this.sursa=s;
            this.destinatie=d;
        }
        return 1;

    }

    protected MyCopy(String nume, int dimensiune, String sursa, String destinatie) {
        this.nume = nume;
        this.dimensiune = dimensiune;
        this.sursa = sursa;
        this.destinatie = destinatie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getDimensiune() {
        return dimensiune;
    }

    public void setDimensiune(int dimensiune) {
        this.dimensiune = dimensiune;
    }

    public String getSursa() {
        return sursa;
    }

    public void setSursa(String sursa) {
        this.sursa = sursa;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }
}
