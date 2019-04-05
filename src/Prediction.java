import java.util.Scanner;

public class Prediction {
    public static void main(String[]args){
        //variables
        boolean loop=true;
        Scanner equinox;
        equinox=new Scanner(System.in);
        int m;
        int q;
        int year;
        int J;
        int K;
        int h;
        int a, b, c, d, e, f;

        //rhyme
        System.out.println("There's an old nursery rhyme tht goes like this...\n"+" ");
        System.out.println("Monday's child is fair of face,\n" +
                "Tuesday's child is full of grace,\n" +
                "Wednesday's child is full of woe,\n" +
                "Thursday's child has far to go.\n" +
                "Friday's child is loving and giving,\n" +
                "Saturday's child works hard for a living,\n" +
                "But the child born on the Sabbath Day,\n" +
                "Is fair and wise and good in every way.");
        System.out.println(" ");
        //input
        System.out.println("Lets see what day you were born on.");
        while(loop){
            //month and day and year
            System.out.println("What month were you born in? Enter as a number (ex. January=1, February=2...) ");
            m = equinox.nextInt();

            System.out.println("What day were you born on?");
            q = equinox.nextInt();

            System.out.println("What year were you born in?");
            year = equinox.nextInt();

            if(m<3){
                m=m+12;
                year=year-1;
            }

            K= year%100;
            J=year/100;

            //Equation
            a = m+1;
            b = 13*a;
            c = b/5;
            d = K/4;
            e = J/4;
            f = J*5;

            h = q + c + K + d + e +f;
            h = h%7;




        }

    }
    public static void month(){


    }


    }

