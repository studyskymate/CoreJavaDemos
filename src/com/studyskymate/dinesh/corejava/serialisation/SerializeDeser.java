package com.studyskymate.dinesh.corejava.serialisation;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
 
class MyClass implements Serializable {
	
}

class Employee implements Serializable {
    
    private static final long serialVersionUID = 1L;
     public Integer id;
     public MyClass myClass ;
    
    public Employee(Integer id) {
           this.id = id;
           myClass=new MyClass();
    }
 
    @Override
    public String toString() {
           return "Employee [id=" + id + "]";
    }
 
}
 
public class SerializeDeser {
 
    public static void main(String[] args) {
 
           Employee object1 = new Employee(8);
 
           try {
                  OutputStream fout = new FileOutputStream("ser.txt");
                  ObjectOutput oout = new ObjectOutputStream(fout);
                  System.out.println("Serialization process has started, serializing objects...");
                  oout.writeObject(object1);
                  System.out.println("Object Serialization completed.");
                  fout.close();
                 oout.close();
         
         
           
           } catch (IOException  e) {
                  e.printStackTrace();
           }
           
           try {
               InputStream fout = new FileInputStream("ser.txt");
               ObjectInputStream  oout = new ObjectInputStream(fout);
               System.out.println("Deserialization process has started, serializing objects...");
               
               Employee e = (Employee) oout.readObject();
               System.out.println("Object Deserialization completed."+ e.id);
               fout.close();
              oout.close();
      
      
        
        } catch (IOException  e) {
               e.printStackTrace();
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
    }
 
}