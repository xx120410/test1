package com.xx.demo.utiles;

/**
 * @author ssss
 * @date 2022/1/25 9:58
 */
class TestIt
{
    public static void main ( String[] args )
    {
        int[] myArray = {1, 2, 3, 4, 5};
        ChangeIt.doIt( myArray );
        for(int j=0; j<myArray.length; j++)
            System.out.print( myArray[j] + " " );
    }
}
class ChangeIt
{
    static void doIt( int[] z )
    {
        z = null ;
    }
}
