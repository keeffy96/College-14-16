public class Lab2_Question3
{
   public static void main(String args[])
   {
      int num1 = Integer.parseInt(args[0]);
      int num2 = Integer.parseInt(args[2]);

      if(args[1].charAt(0)=='+')
      {
         System.out.println(num1 +" " +args[1] +" " +num2 +" = " +(num1+num2));
      }
      else if(args[1].charAt(0)=='-')
      {
         System.out.println(num1 +" " +args[1] +" " +num2 +" = " +(num1-num2));
      }
      else if(args[1].charAt(0)=='/')
      {
         System.out.println(num1 +" " +args[1] +" " +num2 +" = " +(num1/num2));
      }
      else if(args[1].charAt(0)=='*')
      {
         System.out.println(num1 +" " +args[1] +" " +num2 +" = " +(num1*num2));
      }
      else
      {
         System.out.println("You need to re-enter your values, invalid operator.");
	 args[0]="";
	 args[1]="";
	 args[2]="";
      }
   }
}