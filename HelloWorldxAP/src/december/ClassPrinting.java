//Thomas Varano
//[Program Descripion]
//Dec 27, 2017

package december;

public class ClassPrinting
{
   public static void main(String[] args) {
      printClass(ClassPrinting.class);
      printClass(ACSLCards.class);
   }
   
   public static void printClass(Class x) {
      System.out.println(x);
   }
}
