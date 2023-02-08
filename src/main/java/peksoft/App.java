package peksoft;

import peksoft.config.HibernateConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        HibernateConfiguration.getEntityManager();
    }
}
