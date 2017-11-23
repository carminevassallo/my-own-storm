package ch.uzh.sur.nam;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String hellomessage = "Hello World Travis CI!";
        System.out.println(hellomessage);
        
        Pluto p = new Pluto("plutino");
        System.out.println(p.getName());
    }
}
