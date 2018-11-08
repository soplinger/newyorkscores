package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException,InputMismatchException
    {
	    Scanner s = new Scanner(new File("scores.txt"));
        int maxIndx = -1;
        String a[] = new String[100000000];
        Schools b[]= new Schools[10000000];
        double math = 0, reading = 0, writing = 0;

        while (s.hasNext())
        {
            maxIndx++;
            a[maxIndx] = s.nextLine();
        }

        s.close();

        System.out.println(a[3]);


         for (int i=0; i<=maxIndx;i++)
        {
            Scanner s2 = new Scanner(a[i]);
            s2.useDelimiter("\t");
            System.out.println(s2.next());
            System.out.println(s2.next());

            Schools aa = new Scanner()


            //for (int j = 0; j < 18; j++)
           // {
           //     if(s2.hasNext())
          //          s2.next();
          //  }

          //  if(s2.hasNext())
          //      math = s2.nextDouble();
         //   if(s2.hasNext())
            //    reading = s2.nextDouble();
         //   if(s2.hasNext())
         //       writing = s2.nextDouble();
//
     //       b[i]= new Schools(math,reading,writing);
        }

        for(int i=0; i<=maxIndx;i++)
        {
           System.out.println(b[i].math);
        }

    }
}
