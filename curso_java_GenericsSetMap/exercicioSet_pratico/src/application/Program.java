/*
	Em um portal de cursos online, cada usuário possui um código único, representado por
	um número inteiro.
	Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
	matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não
	é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
	alunos repetidos em mais de um curso.
	O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
	Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a
	quantidade total e alunos dele 
 */

package application;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> courseA = new LinkedHashSet<>();
		Set<Integer> courseB = new LinkedHashSet<>();
		Set<Integer> courseC = new LinkedHashSet<>();
		
		System.out.print("How many students? ");
		int qntA = sc.nextInt();
		
		for(int studentNumber = 0; studentNumber < qntA; studentNumber++) {
			courseA.add(sc.nextInt());
		}
		
		System.out.print("How many students? ");
		int qntB = sc.nextInt();
		
		for(int studentNumber = 0; studentNumber < qntB; studentNumber++) {
			courseB.add(sc.nextInt());
		}
		
		System.out.print("How many students? ");
		int qntC = sc.nextInt();
		
		for(int studentNumber = 0; studentNumber < qntC; studentNumber++) {
			courseC.add(sc.nextInt());
		}
		
		int total = 0;
		
		for(int item : courseA) {
			if(courseB.contains(item)) {
				total = total + 1;
			}
		}
		
		for(int item : courseB) {
			if(courseC.contains(item)) {
				total = total + 1;
			}
		}
		
		for(int item : courseC) {
			if(courseA.contains(item)) {
				total = total + 1;
			}
		}
		
		total = (courseA.size() + courseB.size() + courseC.size()) - total;
		
		
		System.out.print("Total students: " + total);
		
		
		sc.close();

	}

}
