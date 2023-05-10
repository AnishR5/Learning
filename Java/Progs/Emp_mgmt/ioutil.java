package Emp_mgmt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class ioutil {
	
	public static void store(String filename,Map<String, Employee> emps) throws FileNotFoundException, IOException
	{  // java-->Oos-->fileopstream-->bin file
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename)))
		{
			out.writeObject(emps);   //serialization
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public static HashMap<String, Employee> restoreObjects(String filename) 
	{
		//bin-->fileinputstream-->Ois-->Object
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename)))
		{
			return ( HashMap<String, Employee>)in.readObject();
		}
		catch(Exception e)
		{
			System.out.println("Error during deserialization");
			return new HashMap<String, Employee>();
		}
		
	}

}
