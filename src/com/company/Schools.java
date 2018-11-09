package com.company;

/**
 * Created by so367 on 11/8/18.
 */
public class Schools {
    public int math;
    public int reading;
    public int writing;
    public int satAverage;
    public static int satHighest;
    public static int satSecond;
    public static int satThird;
    public static int satTotal;
    public static int satCount;
    public static double stateAverage;
    public static String highestSchool;
    public static String secondSchool;
    public static String thirdSchool;

    public String schoolName;


    public Schools(String n, int a, int b, int c) {
        math = a;
        reading = b;
        writing = c;
        schoolName = n;
        satAverage = math + reading + writing;
        if (satAverage > satHighest){
            satThird = satSecond;
            thirdSchool = secondSchool;
            satSecond = satHighest;
            secondSchool = highestSchool;
            satHighest = satAverage;
            highestSchool = schoolName;
        }
        else if (satAverage > satSecond){
            satThird = satSecond;
            thirdSchool = secondSchool;
            satSecond = satAverage;
            secondSchool = schoolName;
        }
        else if (satAverage > satThird){
            satThird = satAverage;
            thirdSchool = schoolName;
        }
        if (satAverage > 0){
            satCount++;
            satTotal += satAverage;
            stateAverage = satTotal/satCount;
        }
    }

}