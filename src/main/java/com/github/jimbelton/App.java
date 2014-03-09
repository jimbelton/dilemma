package com.github.jimbelton.dilemma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public int method(int param)
    {
        if (param == 0) {
            return 0;
        }
        
        return 1;
    }
}
