public class l2q3jc
{
   public static void main(String args[])
   {
   	  String arg []={"5","*","10"};
   	  Object op = arg[1];
      int num1 = Integer.parseInt(arg[0]);
      int num2 = Integer.parseInt(arg[2]);

      System.out.println(num1 +" " +arg[1] +" " +num2 +" = " +(num1 op num2));
   }
}