import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class RunningMain{
	public static void main(String[] args){
		//Lot l;
		Prize p=new Prize();

			//for defaultPrize Setter
		Scanner sc=new Scanner(System.in);
		System.out.println("Are you Fuller(Admin) or Student.Please Enter your Status Please Enter your Status like \n Fuller \n Student");
		String userSelection;
		String selection="N";
	  int	StudentMENu;
		do{
			userSelection=sc.next();
			if(userSelection.equalsIgnoreCase("Student"))
			{
			 selection="Student";
		 }
		 else if(userSelection.equalsIgnoreCase("Fuller"))
		 {
			 selection="Fuller";
		 }
		 else 
			System.out.println("Enter Again you entered invalid Status to enter");

	}
	while(!(userSelection.equalsIgnoreCase("Student")||userSelection.equalsIgnoreCase("Fuller")));

	if(selection.equalsIgnoreCase("Student")){
		Student st;
		
		System.out.println("ENTER YOUR DETAILS");
		            st=new Student(p);
		            System.out.println("IF YOU WANT TO CHECK PRIZE Type 1 ");
		             System.out.println("IF YOU WANT TO  END TYPE 2");
		            StudentMENu=sc.nextInt();
		            while(!(StudentMENu==1||StudentMENu==2)){
		            	System.out.println("ENTER VALID COMMANDS");
		            	System.out.println("IF YOU WANT TO CHECK PRIZE Type 1 ");
		            
		            System.out.println("IF YOU WANT TO  END TYPE 2");
		            StudentMENu=sc.nextInt();

		            }
		            if(StudentMENu==1){
		            	st.totalbill();
                 StudentMENu=2;		            
		            }

		           while(!(StudentMENu==2));
		           System.out.println("_______________________BYE____________________");


	
					 }//if of (selection.equalsIgnoreCase("Student")
					 else {
					 	int repeator;
					 	do{
						JOptionPane.showMessageDialog(null, "Hello Fuller");
						Prize pri=new Prize();
						pri.prizeEntranceForall();

						
						ArrayList<Student> StudentArray=new ArrayList<Student>();
						;
						JOptionPane.showMessageDialog(null, "if you want  to enter Lot of  total Student  Type 1 \nif you want to Lot of Some Student Type 2");
						JOptionPane.showMessageDialog(null, "if you want to enter Lot of Some Student \n Type 2");
						int nselection=sc.nextInt();
						while(!(nselection==1 ||nselection==2)){
							JOptionPane.showMessageDialog(null, "Again types 1 or 2 ");
							nselection=sc.nextInt();
						}
						if(nselection==1){
						 JOptionPane.showMessageDialog(null, "ENTER total Students");
						 int totalStudents=sc.nextInt();
						 StudentArray=new ArrayList<Student>();
						 for(int i=0;i<totalStudents;i++){
							System.out.println("ENTER DATA for  Student  "+ i);
							StudentArray.add(new Student(pri));


							 }//for loop
						 }//if statement
						 else if(nselection==2){
							int iterator;
							do{
								StudentArray= new ArrayList<Student>();
								JOptionPane.showMessageDialog(null, "Enter Details");
								
								StudentArray.add(new Student(pri));
								JOptionPane.showMessageDialog(null, "if you want to enter another Random Student \n Type 2 other wise enter anykey");
								iterator=sc.nextInt();

							}
							while(iterator==2);
							 }//else if(nselection==2)
								 int doIterator;//to remove and add again
								 
								 do{
									 JOptionPane.showMessageDialog(null, "if You want to remove any student Enter 3 ,Enter His id which should be less than total student \n if you want to add more student enter 4 ");
									 int ns=sc.nextInt();
									 
									 while(!(ns==3 || ns==4 ))
									 {
										JOptionPane.showMessageDialog(null, "INVALID");
									 JOptionPane.showMessageDialog(null, "if You want to remove any student Enter 3 ,Enter His id which should be less than total student \n if you want to add more student enter 4 ");
                   ns=sc.nextInt();
                      
									}// while(!(ns==3 || ns==4))
									if(ns==3){
										JOptionPane.showMessageDialog(null,"ENTER ID OFSTUDENT WHICH YOU WANT TO REMOVE"); 
										int removeofSelection=sc.nextInt();
										while(removeofSelection>=StudentArray.size() || removeofSelection<0){
											JOptionPane.showMessageDialog(null,"INVALID");
											removeofSelection=sc.nextInt();
                        }// while(removeofSelection>StudentArray.size() && removeofSelection>0)
										StudentArray.remove(removeofSelection);
									}//if(ns==3)
									else if(ns==4){
										StudentArray.add(StudentArray.size(),new Student(pri));
									}//Add Student after remove
									
               	JOptionPane.showMessageDialog(null,"IF YOU WANT TO ADD OR REMOVE AGAIN ENTER 7 Other Wise enter any key");
									doIterator=sc.nextInt();
								 }//do
								 while(doIterator==7);
								 JOptionPane.showMessageDialog(null,"If you want to show details of Any student ENTER yes /n If you want to Show Details of All Student Enter AllDetails");
             String yesChecker=sc.nextLine();
								 while(!(yesChecker.equalsIgnoreCase("yes")|| yesChecker.equalsIgnoreCase("AllDetails")))
								 {
									JOptionPane.showMessageDialog(null,"ENTER ONLY 'YES' to SHOW DETAILS OF ANY STUDENT OR ENTER 'AllDetails' to Show Details of All Students");
									yesChecker=sc.nextLine();
								}
								if(yesChecker.equalsIgnoreCase("yes")){
								 JOptionPane.showMessageDialog(null,"ENTER STUDENT ID");
										 int idSe=sc.nextInt();//id student to show details
											//Student[] StudentArray= StudentArray.toArray();
										 while(idSe<0 || idSe>=StudentArray.size()){
											 JOptionPane.showMessageDialog(null,"INVALID");
											 idSe=sc.nextInt();  
										 }//while(idSel<0 || idSel>=StudentArray.size() 
										 System.out.println("DETAILS OF STUDENT IS ");
										 System.out.println("_________________________*****__________________________");
										 
										 StudentArray.get(idSe).StudentINfo();
										 StudentArray.get(idSe).totalbill();
										 System.out.println("_________________________*****__________________________");
									}//if (yesChecker.equalsIgnoreCase("yes"))
									if(yesChecker.equalsIgnoreCase("AllDetails")){
										
										for(int i=0;i<StudentArray.size();i++){
										 System.out.println("££££££££££££££££££££££££££££££££££££££££££££££££££££££££");
										 System.out.println("DETAIL OF STUDENT"+i);
										 System.out.println("STUDENT PERSONAL INFORMATION");
										 System.out.println("_________________________*****__________________________");
										 StudentArray.get(i).StudentINfo();
										  
										 System.out.println("STUDENT BILL");
										 System.out.println("_________________________*****__________________________");
										 StudentArray.get(i).totalbill();
										  StudentArray.get(i).totalbill();
										 System.out.println("££££££££££££££££££££££££££££££££££££££££££££££££££££££££");
										}//for loop
									}//(yesChecker.equalsIgnoreCase("AllDetails"))
								 //  if("PROFIT OR LOSS CHECk"){
								 	System.out.println("IF YOU WANT TO AGAIN LOGIN AS FULLER TYPE 1 ELSE ANYKEY");
								 	repeator=sc.nextInt();
								 }
								 while(repeator==1);
								 System.out.println("______________BYE_______________");
                   }//else 
              }
     }