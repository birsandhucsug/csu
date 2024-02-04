package assignment1;

import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    int income = 0;
      System.out.println ("How much is your income?");
    Scanner input = new Scanner (System.in);
      income = input.nextInt ();
    if (income < 500)
      {
        System.out.println ("The tax rate is 10%");
      }
    if ((income >= 500) && (income < 1500))
      {
        System.out.println ("The tax rate is 15%");
      }
    if ((income >= 1500) && (income < 2500))
      {
        System.out.println ("The tax rate is 20%");
      }
    if (income > 2000)
      {
        System.out.println ("The tax rate is 30%");
      }
  }
}