package Dev_TP2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;

public class Class2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		Employee [] Emps = null;
		FileInputStream fileIn = new FileInputStream("C:\\Users\\oussama\\eclipse-workspace\\Dev_TP2\\emp.dat");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		Emps = (Employee []) in.readObject();
		in.close();
		fileIn.close();

		
		RandomAccessFile raf = new RandomAccessFile("empdirect.dat", "rw");
		
		for (int i = 0; i < Emps.length; i++) {
			raf.writeUTF("Name : "+Emps[i].name + "\n" + "Address : "+ Emps[i].address +"\n"+ "Numero SSN : "+ Emps[i].SSN + "\n"+ "Number : "+ Emps[i].number + "\n############");
			}
		
		raf.seek(0);
		while (raf.getFilePointer() < raf.length()) {
			System.out.println(raf.readUTF());
			}
		raf.close();
		
	}

}