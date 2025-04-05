package FileHandling;
import java.io.*;
class Student implements Serializable{
  String name;
  int rollno;
  Student(String n, int r){
    name=n;
    rollno=r;
  }
}
public class Ex10{
  public static void main(String[] args){
    try{
      Student s1 = new Student ("Subham",101);//object created
      File fobbj = new File("Subham1.txt");//file created
      FileOutputStream fout = new FileOutputStream(fobj);
      ObjectOuputStream obj = new ObjectOutputStream(fout);
      obj.writeObject(s1);//object written to file (serialisation)
      obj.close();
      fout.close();

      FileInputStream fin = new FileInputStream(fobj);
      ObjectInputStream objin = new ObjectInputStream(fin);
      Student data = (Student)objin.readObject();
      System.out.println("name"+data.name+"rollno: "+data.rollno);
      objin.close();
      fin.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
