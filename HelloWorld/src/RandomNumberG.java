import javax.swing.JOptionPane;

//Thomas Varano
//[Program Descripion]
//Nov 18, 2016
public class RandomNumberG
{
   public static void main(String[] args)
   {
      String[] fav = {"She doesn't", "A little I guess", "She likes me", "She'd kill her child for me"};
      String[] favloop = {"Exit", "She doesn't", "A little I guess", "She likes me", "She'd kill her child for me"};
      String input = (String) JOptionPane.showInputDialog(null, "How much does the teacher like you?","RNG", JOptionPane.PLAIN_MESSAGE, null, fav, null);
      
     while (input != "Exit"){
        if (input == "She doesn't"){
      JOptionPane.showMessageDialog(null, "Here's what you got.\n"+(10+MyStaticMethods.roundTo(Math.random(),4)*100%10),"RNG",JOptionPane.PLAIN_MESSAGE);
      input = (String) JOptionPane.showInputDialog(null, "How much does the teacher like you?","RNG", JOptionPane.PLAIN_MESSAGE, null, favloop, null);
     }
     else if (input == "A little I guess"){
        JOptionPane.showMessageDialog(null, "Here's what you got.\n"+(50+MyStaticMethods.roundTo(Math.random(),4)*100%10),"RNG",JOptionPane.PLAIN_MESSAGE);
        input = (String) JOptionPane.showInputDialog(null, "How much does the teacher like you?","RNG", JOptionPane.PLAIN_MESSAGE, null, favloop, null);
       }
     else if (input == "She likes me"){
        JOptionPane.showMessageDialog(null, "Here's what you got.\n"+(70+MyStaticMethods.roundTo(Math.random(),4)*100%10),"RNG",JOptionPane.PLAIN_MESSAGE);
        input = (String) JOptionPane.showInputDialog(null, "How much does the teacher like you?","RNG", JOptionPane.PLAIN_MESSAGE, null, favloop, null);
     }
     else if (input == "She'd kill her child for me"){
        JOptionPane.showMessageDialog(null, "Here's what you got.\n"+(90+MyStaticMethods.roundTo(Math.random(),4)*100%10),"RNG",JOptionPane.PLAIN_MESSAGE);
        input = (String) JOptionPane.showInputDialog(null, "How much does the teacher like you?","RNG", JOptionPane.PLAIN_MESSAGE, null, favloop, null);
       }
     else break;
     }
     System.exit(0);
   }
}

