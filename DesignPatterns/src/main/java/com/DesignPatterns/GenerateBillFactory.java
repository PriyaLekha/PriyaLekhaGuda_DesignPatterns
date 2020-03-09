package com.DesignPatterns;

import java.io.*;      
abstract class Plan

{
       protected double rate;

       abstract void getRate();


       public void calculateBill(int units)

     {
       
         System.out.println(units*rate);
     }

}
class  DomesticPlan extends Plan
{
    public void getRate()
   {
        rate=3.50;            
   }
}
class  CommercialPlan extends Plan
{
   
    public void getRate()
   {
        rate=7.50;
   }
}
class  InstitutionalPlan extends Plan
{
 
    public void getRate()
   {
        rate=5.50;
   }
}

     
class GetPlanFactory
{
public Plan getPlan(String planType)
{

       if(planType == null)
      {
        return null;
      }

   if(planType.equalsIgnoreCase("Domestic Plan"))
      {
        return new DomesticPlan();
      }

      else if(planType.equalsIgnoreCase("Commercial Plan"))
     {
       return new CommercialPlan();
     }

     else if(planType.equalsIgnoreCase("Institutional Plan"))
     {
       return new InstitutionalPlan();
     }
 

 return null;
}
}

class GenerateBillFactory
{
public static void main(String args[])throws IOException
{
 GetPlanFactory planFactory = new GetPlanFactory();
 System.out.print("Enter the name of plan for which the bill will be generated: ");
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 String planName=br.readLine();
 System.out.print("Enter the number of units for bill will be calculated: ");
 int units=Integer.parseInt(br.readLine());
 Plan p = planFactory.getPlan(planName);
  System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
      p.getRate();
      p.calculateBill(units);
      }
}

/* OUTPUT OF THE ABOVE PROGRAM

Enter the name of plan for which the bill will be generated: Institutional Plan
Enter the number of units for bill will be calculated: 3
Bill amount for Institutional Plan of  3 units is: 16.5

*/