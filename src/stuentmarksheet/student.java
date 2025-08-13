package stuentmarksheet;

import java.util.Scanner;


public class student {

	public student() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		//student details 
		while(true) {
			System.out.println("enter student name (letters only): ");
			name = sc.nextLine(); 
		
			if (name.matches("[a-zA-z]+")) {
				System.out.println("name is valid");
				break;
				
			} else {
				System.out.println("plz name is in letter only");
			}
		}

	
		
		
	
		System.out.println("enter roll number: ");
		int rollnum = sc.nextInt();
		 
		int subjects= 5;
		int[]marks = new int [subjects];
		int total = 0;
		boolean valid = true;
		
		// input marks 
		
		for (int i=0; i < subjects; i++ ) { 
			 System.out.println("enter marks for subjects :" + (i+1)+ "(0 to 100)"	);
			 marks[i]=sc.nextInt(); 
			 if (marks[i] < 35 || marks[i]>100) {
				 valid = false;
				 
				 System.out.println("fail1 ");
				
				 
				}
			 total += marks[i];
			 }
		if (valid) {
		    double percentage = (double) total / subjects;
		    String result = (percentage >= 35) ? "Pass" : "Fail";
		      
		   System.out.println(" student marksheet");
		   System.out.println("name   :" +name );
		   System.out.println("rollnum :" + rollnum);
		   
		 for(int i =0; i <subjects; i++) {
			 System.out.println("subject "+ (i+1)+ "marks:" +marks[i]);
			 
		 }
		   System.out.println("total marks: "+ total + "/"+ (subjects*100));
		   System.out.printf("percentage : %.2f%%\n", percentage);
		   System.out.println("overall result:" + result);
		   
		   
	}else {
		System.out.println("student is fail  ");
		
	}

	}}
