package ch.uzh.sur.nam;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String hellomessage = "Hello World Travis!";
        System.out.println(hellomessage);
        
        Pluto p = new Pluto("plutino_2");
        System.out.println(p.getName());
    }
}
