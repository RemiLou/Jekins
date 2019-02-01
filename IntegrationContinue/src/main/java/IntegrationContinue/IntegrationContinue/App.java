package IntegrationContinue.IntegrationContinue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Calculs ca = new Calculs(1,2);
        System.out.println("On additionne : " + ca.additionner());
        System.out.println("On multiplie : " + ca.multiplier());
        System.out.println("On divise : " + ca.diviser());
    }
}
