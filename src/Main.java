import copy.Copy_Extern;
import copy.Copy_Hard;
import basic.interfaces.Fisier;
import copy.MyCopy;
import exceptions.MyException;

/**
 * Created by Tanasescu on 10/25/2014.
 */
public class Main {

    /**
     *
     * @param arguments
     * mai jos am facut functia "main"
     *
     */
    public static void main(String[] arguments)
    {


        Copy_Hard fis = new Copy_Hard("andrei",256,"localC","localD");

       try{
           fis.afisare();
       }catch (MyException e) {
         System.out.println("avem o eroare "+e.getMessage());
       }

        Fisier fisier = new Copy_Extern("radu",512,"localE","localF");

        try {
            fisier.get_path_file("localG");

        }catch (MyException e)
        {
            System.out.println("avem o eroare : "+e.getMessage());
        }
        MyCopy alandal  =   new Copy_Extern("tema",1024,"ceva","altceva");

        try{
        System.out.println(alandal.getDimensiune());

          }catch(MyException e)
        {
            System.out.println("avem o eroare : " + e.getMessage());
        }
    }







}
