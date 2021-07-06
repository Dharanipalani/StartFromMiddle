import java.lang.*;
import java.io.*;

public class StartFromMiddle {

 public static void printFromMiddleCharacter(String str){
  String tempString = "";
  int i, length = str.length();
  
	for (i = 1; i <= length; i++) {
        if (length / 2 + i <= length) {
            tempString = str.substring(length/ 2, length/ 2 + i);
            System.out.println(String.format("%" + (length) + "s", tempString).replaceAll(".(?!$)", "$0 "));
      } 
      else {
          
        System.out.println(String.format("%" + (length) + "s", tempString + str.substring(0, i - length/ 2 - 1)).replaceAll(".(?!$)", "$0 "));
      }
    }
}
public static void main(String args[])
    {
		String str = "W E L C O M E";
		printFromMiddleCharacter(str.replaceAll("\\s", ""));
	}
}
