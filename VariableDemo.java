public class VariableDemo
{
   public static void main(String[] args)
   {
      double Present = 111.55;
      double Rate = 0.025;
      double Mound = 2.0;
      double Time = 10.0;
      
      double Annual = Present * Math.pow (1 + Rate / Mound, Mound * Time);
      
      System.out.println("The future value of investment after ten years will be " +Annual+".");
   }
   
}
