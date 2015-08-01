import java.util.*;
import javax.swing.*;

public class SampleProgram{
  public static void main(String[] args){
    Scanner dataIn=new Scanner(System.in);
    String name=JOptionPane.showInputDialog("Enter name:");
    System.out.println("Enter age:");
     int age=dataIn.nextInt();
     JOptionPane.showMessageDialog("Hi "+ name +"\n"+ "You're " + age + "years old");
     }
     }
    
