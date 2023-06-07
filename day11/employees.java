import java.util.Scanner;
public class employees {
    String name,dept;
    int id;
    private static int count=0;
    Scanner sc=new Scanner(System.in);

    public void setdetails(){
        System.out.println("Enter employee name:");
        name=sc.next();
        System.out.println("Enter employee id:");
        id=sc.nextInt();
        System.out.println("Enter employee department:");
        dept=sc.next();
        count++;
    }

    public void show(){
        System.out.println("Employee id:"+id+", employee name:"+name+", employee department:"+dept+".");
    }

    public static void main(String[]args){
        int i;
        employees emp[]=new employees[5];
        for(i=0;i<emp.length;i++){
            emp[i]=new employees();
            emp[i].setdetails();
        }
        System.out.println("Printing array of employees.");
        for(i=0;i<emp.length;i++){
            emp[i].show();
        }
        System.out.println("Number of employees "+employees.count);
    }
}
