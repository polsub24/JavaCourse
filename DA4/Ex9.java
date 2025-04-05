package FileHandling;
import java.io.*;
public class Ex9{
  public static void main(String[] args){
    try{
      File obj = new File("sample.txt");
      PrintStream p = new PrintStream(obj);
      p.println("hello world");
      p.print("I am good");
      p.printf("My roll no is %d",101);
      p.close();
      System.out.println("success");
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
