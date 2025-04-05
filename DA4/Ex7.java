package FileHandling;
import java.io.*;
public class Ex7{
  public static void main (String[] args){
    try{
      File obj = new File("newfile.txt");
      FileOuputStream fout = new FileOutputStream(obj);
      DataOutputStream ob = new DataOutpurStream(fout);
      ob.writeInt(72);
      ob.writeChar(72);
      ob.writeUTF("Hello");
      ob.writeBoolean(false);
      System.out.println("written successfully");
      ob.close();
      fout.close();
      FileInputStream fin = new FileInputStream(obj);
      DataInputStrean ob1 = new DataInputStream(fin);
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
