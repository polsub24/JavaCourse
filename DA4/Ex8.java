package FileHandling;
import java.io.*;
public class Ex8{
  public static void main(String[] args){
    try{
      File obj = new File("mydata3.txt");
      FileOutputStream fout = new FileOutputStream(obj);
      BufferedOutputStream ob = new BufferedOutputStream(fout);
      ob.write(72);
      ob.write(73);
      System.out.println("written successfully");
      ob.close();
      fout.close();
      FileInputStream fin = new FileInputStream(obj);
      BufferedInputStream ob1 = new BufferedInputStream(fin);
      //int i = ob1.read();
      int i=0;
      while((i=ob1.read())!=-1){
        System.out.print((char)i);
      }
      System.out.println("\nreading completed");
      ob1.close();
      fin.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
