package FileHandling;
import java.io.*;
public class Ex7{
  public static void main (String[] args){
    try{
      File obj = new File("newfile.txt");
      FileOutputStream fout = new FileOutputStream(obj);
      DataOutputStream ob = new DataOutputStream(fout);
      ob.writeInt(72);
      ob.writeChar(72);
      ob.writeUTF("Hello");
      ob.writeBoolean(false);
      ob.writeDouble(5.8);
      System.out.println("written successfully");
      ob.close();
      fout.close();
      FileInputStream fin = new FileInputStream(obj);
      DataInputStream ob1 = new DataInputStream(fin);
      int i = ob1.readInt();
      char c1 = ob1.readChar();
      String s = ob1.readUTF();
      boolean b = ob1.readBoolean();
      double d = ob1.readDouble();
      System.out.println(i);
      System.out.println(c1);
      System.out.println(s);
      System.out.println(b);
      System.out.println(d);
      System.out.println("reading successfully done");
      ob1.close();
      fin.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
