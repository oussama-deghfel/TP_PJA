package Dev_TP2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Class3 {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		RandomAccessFile raf = new RandomAccessFile("empdirect.dat", "r");
//		Employee [] Emps = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre le numéro de employee");
		int em = sc.nextInt();
		
		for(int j=0; j<raf.length(); j++) {
//		if (Emps[i] == em){
//			raf.writeUTF("Name : "+Emps[i].name + "\n" + "Address : "+ Emps[i].address +"\n"+ "Numero SSN : "+ Emps[i].SSN + "\n"+ "Number : "+ Emps[i].number + "\n############");
//			}else{
//			raf.writeUTF("il n'existe pas");
//		
//		raf.seek(0);
//		while (raf.getFilePointer() < raf.length()) {
//			System.out.println(raf.readUTF());
//			}
//		raf.close();
	}
}
}