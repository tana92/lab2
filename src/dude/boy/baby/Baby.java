package dude.boy.baby;

/**
 * Created by Tanasescu on 10/25/2014.
 */
public class Baby {

    String name;
    boolean isMale;
    double weight;
    double decibels;
    int numPoops = 0;

    void poop() {
        numPoops += 1;
        System.out.println("Dear mother, " + "I have pooped. Ready the diaper.");
    }

    public Baby(String n, double w) {
        this.name = n;
        this.weight = w;
    }

    public void afisare() {

            System.out.println(this.name);
            System.out.println(this.weight);
    }

}
