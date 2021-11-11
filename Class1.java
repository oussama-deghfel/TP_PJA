package Dev_TP2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Class1 {

	public static void main(String [] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre le Nombre des Employees :");

		int nbrEmp = sc.nextInt();
		Employee [] Emps = new Employee[nbrEmp];
		
		for (int i = 0; i<nbrEmp; i++) {
			int j = i+1;
			Emps[i]= new Employee();
			
			System.out.println("Employee Numero " + j + "\nEntre le nom :");
			Emps[i].name = sc.next();
			
			System.out.println("Entre l`address :");
			Emps[i].address = sc.next();
			
			System.out.println("Entre l`SSN :");
			Emps[i].SSN = sc.nextInt();
			
			System.out.println("Entre le number :");
			Emps[i].number = sc.nextInt();
		}
		sc.close();
		
		
		FileOutputStream fileOut = new FileOutputStream("emp.dat");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(Emps);
		out.close();
		fileOut.close();
		
		System.out.println("Done");
	}
}