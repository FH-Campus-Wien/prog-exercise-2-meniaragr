package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
        Scanner t1 = new Scanner(System.in);
        double n = 1;
        double ln = 0;
        int s = 1;
        while (n > 0) {
            System.out.print("Number " + s + ": ");
            s++;
            n = t1.nextDouble();

            if ((s == 2) && (n <= 0)) {
                System.out.println("No number entered.");
            } else if (n > ln) {
                ln = n;
            } else if ((n <= 0)) {
                System.out.println("The largest number is " + String.format("%.2f", ln));
            }
        }
    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        System.out.print("n: ");
        Scanner t2 = new Scanner(System.in);
        int n = t2.nextInt();
        int num = 1;

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++;
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j < 6 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        Scanner t4 = new Scanner(System.in);
        int noOfColumns = 0;
        System.out.print("h: ");
        int h = t4.nextInt();
        int h2 = h / 2;
        int numberOfSpaces = h2;
        int h3 = h2 + 1;
        System.out.print("c: ");
        char c = t4.next().charAt(0);
        int l1 = c;
        int start;
        int l2 = c - h2;
        int count = 1;

        if (h % 2 == 1) {
            for (int i = 0; i < h; i++) {

                if (i < h3) {
                    start = l1 - i;
                } else {
                    start = l2 + count;
                    count++;
                }

                for (int j = 1; j <= numberOfSpaces; j++) {
                    System.out.print(" ");
                }
                if (i < h2) {
                    numberOfSpaces = numberOfSpaces - 1;
                } else {
                    numberOfSpaces = numberOfSpaces + 1;
                }


                for (int j = 0; j <= noOfColumns; j++) {
                    int middleColumn = (noOfColumns / 2);
                    System.out.print((char) (start));

                    if (j < middleColumn) {
                        start++;
                    } else {
                        start--;
                    }

                }
                System.out.println();
                if (i < h2) {
                    noOfColumns = noOfColumns + 2;
                } else {
                    noOfColumns = noOfColumns - 2;
                }

            }
        } else {
            System.out.println("Invalid number!");
        }


    }

    //todo Task 5
    public void marks(){
        // input your solution here
        Scanner t5 = new Scanner(System.in);
        int num = 1;
        double m = 1;
        double s = 0;
        double a;
        int cM = 0;
        int cNM = 0;


        while (m > 0) {
            System.out.print("Mark " + num + ": ");
            num++;

            m = t5.nextInt();

            if ((num == 2) && (m == 0)) {
                System.out.println("Average: 0,00");
                System.out.println("Negative marks: 0");

            } else if ((m > 5) && (m != 0)) {
                System.out.println("Invalid mark!");
                num--;

            } else if ((m > 0) && (m < 6)) {
                s = s + m;
                cM++;

                if (m == 5) {
                    cNM++;
                }

            } else if (m == 0) {
                a = s / (cM);
                System.out.println("Average: " + String.format("%.2f", a));
                System.out.println("Negative marks: " + cNM);
            }

        }
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here

        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int number = scan.nextInt();
        int s2;
        int d1;
        int d2;
        int d3;

        while (number > 0) {
            if (number != 1 && number != 4) {
                d3 = number % 10;
                d2 = (number / 10) % 10;
                d1 = (number / 100) % 10;
                s2 = (int) (Math.pow(d1, 2) + Math.pow(d2, 2) + Math.pow(d3, 2));
                number = s2; }

            else if (number == 1) {

                System.out.println("Happy number!");
                break;
            }
            else if (number == 4) {
                System.out.println("Sad number!");
                break;
            }






            }
        }























    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}