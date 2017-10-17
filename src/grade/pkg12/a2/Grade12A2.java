/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grade.pkg12.a2;

import java.util.Scanner;

/**
 *
 * @author millc9988
 */
public class Grade12A2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grade12A2 call = new Grade12A2();
        Scanner in = new Scanner(System.in);
        //First problem starts
        //System.out.println("Please enter the number you want to count the digits for.");
        //int number = in.nextInt();
        //int sum = call.add(number, 0);
        //System.out.println("The sum of your digits is "+sum);
        //first problem ends


        //second problem starts
        //System.out.println("Please enter the number you want to find the digital root for.");
        //int num = in.nextInt();
        //int root = call.digitalRoot(num, 0);
        //System.out.println("The digital root is "+root);
        //second problem ends


        //third problem starts
        //System.out.println("Please enter the desired tier for your pyramid.");
        //int end = in.nextInt();
        //if (end==0) {
        //    System.out.println("If you have no tiers there are no blocks stop trying to break this.");
        //}else{
        //int tri = call.triangle(end, 0, 0);
        //System.out.println("The total number of boxes in a pyramid " + end + " tiers high is " + tri);
        //}
        //third problem donionrings


        //fourth problem starts
        //System.out.println("Please enter your starting number.");
        //int n = in.nextInt();
        //call.hail(n);
        //fourth problem ends


        //fifth problem starts
        //System.out.println("Please enter a number you want to convert to binary");
        //int n = in.nextInt();
        //call.binaryConverter(n,2);
        //System.out.println("");
        //fifth problem ends


        //sixth problem starts
        //System.out.println("Please enter number you want to convert.");
        //int n = in.nextInt();
        //System.out.println("Please enter base you want to use.");
        //int base = in.nextInt();
        //call.binaryConverter(n, base);
        //System.out.println("");
        //sixth problem ends
        
        //seventh problem starts
        //System.out.println("Please enter your word");
        //String word = in.nextLine();
        //String reversed = call.reverseString(word, 0);
        //if (word.equals(reversed)) {
        //    System.out.println("Your word is a palindrome!");
        //}else{
        //    System.out.println("Your word is not a palindrome.");
        //}
        //seventh problem ends
    }

    public int add(int number, int count) {
        //creating a seperate integer for the last digit and adding the last digit to the count
        int addOn = number % 10;
        count = count += addOn;
        //if the digits have all been totaled return the sum of the digits
        if ((number / 10) == 0) {
            return count;
        } //otherwise divide the number by 10 and start over again
        else {
            number = number / 10;
            return add(number, count);
        }

    }

    public int digitalRoot(int num, int count) {
        Grade12A2 call = new Grade12A2();
        int maymays = 0;
        maymays = call.add(num, 0);
        if (count > 0) {
            return maymays;
        }
        count++;
        return digitalRoot(maymays, count);
    }

    public int triangle(int end, int tier, int blocks) {
        tier++;
        blocks = blocks += tier;
        if (tier == end) {
            return blocks;
        } else {
            return triangle(end, tier, blocks);
        }
    }

    public int hail(int n) {
        if (n == 1) {
            return n;
        }

        if (n % 2 == 0) {
            n = n / 2;
        } else {
            n = n * 3;
            n++;
        }
        System.out.println(n);
        return hail(n);
    }

    public static void binaryConverter(int num, int div) {
        String[] letters = new String[]{"A", "B", "C", "D", "E", "F"};
        if (num == 0) {
            return;
        }
        if (num > 0) {
            binaryConverter(num / div, div);
            if (!(div == 2)) {
                if (num % div > 9) {
                    System.out.print(letters[(num % div) - 10]);
                } else {
                    System.out.print(num % div);
                }
            } else {
                System.out.print(num % div);
            }
        }
    }
    public String swap(String word,int posA,int posB){
        StringBuilder helper = new StringBuilder(word);
        char save = helper.charAt(posA);
        helper.setCharAt(posA, helper.charAt(posB));
        helper.setCharAt(posB, save);
        word = helper.toString();
        return word;
    }
    public String reverseString(String word,int pass){
        int endpos = pass+1;
        if (pass<word.length()/2) {
            word = swap(word,pass,word.length()-endpos);
            pass++;
        }
        if(pass<word.length()/2){
            return reverseString(word,pass);
        }else{
            return word;
        }
    }
}
