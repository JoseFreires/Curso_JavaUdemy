// Mostrando como funciona a Interface Comparable e sua utilidade em organizar informações de objetos

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		String path = "C:\\temp\\ws-eclipse\\curso_java_interfaces\\listaNomes.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String employeeCsv = br.readLine();
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(","); 
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}
			Collections.sort(list);
			for(Employee employee : list) {
				System.out.println(employee.getName() + ", " + employee.getReward());
			}
			
		} catch (IOException e) {
			System.out.print(e);
		}
		
	}

}
