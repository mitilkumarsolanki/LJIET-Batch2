import java.util.Scanner;
public class student {
	private int roll_no;
	private int marks;
	private String std_name;
	 Scanner sc=new Scanner(System.in);
	public void setdetails(){
		System.out.println("Enter student Name:");
		std_name=sc.next();
		System.out.println("Enter student roll number:");
		roll_no=sc.nextInt();
		System.out.println("Enter student marks:");
		marks=sc.nextInt();
	}
	public void show(){
		System.out.println("Student Name:"+std_name+", Roll number:"+roll_no+", marks:"+marks);
	}
	public static void main(String []args){
		student std[]=new student[5];
		int a=0;
		do{
			std[a]= new student();
			std[a].setdetails();
			a++;
		}while(a<5);

		a=0;
		do{
			std[a].show();
			a++;
		}while(a<5);
	}
}