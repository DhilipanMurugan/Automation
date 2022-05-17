package encaps;

 import java.util.Scanner;
 
  public class Registration {
	  
  public static void main(String[] args) {

  Student oStudent = new Student();
  Scanner scan = new Scanner(System.in);

  System.out.println("Enter the details");
  
  oStudent.setAdmission_id(scan.nextInt());
  oStudent.setPhone_number(scan.nextInt());
  oStudent.setName(scan.next());
  oStudent.setEmail(scan.next());

  System.out.println("Student Id : "+oStudent.getAdmission_id());
  System.out.println("Phone number : "+oStudent.getPhone_number());
  System.out.println("Student name : "+oStudent.getName());
  System.out.println("Email-id : 1234"+oStudent.getEmail());
 }

}
