package exceptions;

/**
 *
 * Aceasta este clasa de ce extinde clasa Exception
 *
 * Created by Tanasescu on 10/29/2014.
 */
public class MyException  extends IllegalArgumentException{
    public MyException(String mesaj) {
        super(mesaj);
    }
}
