package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException, InputMismatchException {
        Scanner s = new Scanner(new File("scores.txt"));
        int maxIndx = -1;
        String a[] = new String[100000000];
        Schools b[] = new Schools[10000000];
        int math = 0, reading = 0, writing = 0;
        String schoolName;

        while (s.hasNext()) {
            maxIndx++;
            a[maxIndx] = s.nextLine();
        }

        s.close();
        //methods.ReadFile();fjfhjf


        for (int i = 1; i <= maxIndx; i++) {
            Scanner s2 = new Scanner(a[i]);
            s2.useDelimiter("\t");

            s2.next();
            schoolName = s2.next();

            for (int j = 0; j < 16; j++)
                if (s2.hasNext())
                    s2.next();

            String math2, reading2, writing2;

            if (s2.hasNext())
            {
                math2 = s2.next();

                if (math2.equals(""))
                    math = 0;
                else
                    math = Integer.valueOf(math2);

            }
            if (s2.hasNext())
            {
                reading2 = s2.next();

                if (reading2.equals(""))
                    reading = 0;
                else
                    reading = Integer.valueOf(reading2);
            }
            if (s2.hasNext()) {
                writing2 = s2.next();

                if (writing2.equals(""))
                    writing = 0;
                else
                    writing = Integer.valueOf(writing2);
            }

            b[i] = new Schools(schoolName, math, reading, writing);

        }

        System.out.println("School SAT Average");
        for (int k = 1; k < maxIndx; k++)
            System.out.println(b[k].schoolName + "\t" + b[k].satAverage);

        System.out.println("\nHighest Averages ");

        System.out.println("#1 " + Schools.highestSchool + " " + Schools.satHighest);
        if (Schools.highestSchool2 != null)
            System.out.println("\t" + " " + Schools.highestSchool2 + " " + Schools.satHighest );

        System.out.println("#2 " + Schools.secondSchool + " " + Schools.satSecond);
        if (Schools.secondSchool2 != null)
            System.out.println("\t" + " " + Schools.secondSchool2 + " " + Schools.satSecond );

        System.out.println("#3 " + Schools.thirdSchool + " " + Schools.satThird);
            if (Schools.thirdSchool2 != null)
                System.out.println("\t" + " " + Schools.thirdSchool2 + " " + Schools.satThird );

        System.out.println("\nNew York State Average: " + Schools.stateAverage);
    }

}
