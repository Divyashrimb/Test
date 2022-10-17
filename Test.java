import java.util.Scanner;
class Management_System {
       void S(String i){ 
        if(i == "IT_Team"){
            System.out.println("This is the It team");
            Scanner sc=new Scanner(System.in);
            String status=sc.nextLine();
            if(status == "Done"){
                System.out.println("The issue has been fixed");
            }
            else{
                System.out.println("The issue has not fixed");
            }
        }
        else if (i == "HR_Team") {
            System.out.println("This is HR team");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if (s == "Done"){
                System.out.println("The issue has been fixed");
            }
            else {
                System.out.println("The issue has not fixed");
            }
        }
        else if (i == "Finance_Team") {
            System.out.println("This is Finance team");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if (s == "Done"){
                System.out.println("The issue has been fixed");
            }
            else {
                System.out.println("The issue has not fixed");
            }
        }
        else{
            System.out.println("This is Facility team");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if (s == "Done"){
                System.out.println("The issue has been fixed");
            }
            else {
                System.out.println("The issue has not fixed");
            }
        }
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.print("Choose");
        Scanner sc=new Scanner(System.in);
        String id= sc.next();
        System.out.print("Name");
        String name=sc.next();
        System.out.print("Issue Description");
        String issue=sc.next();
        System.out.println(" id +" "+name+" "+issue);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Hi, Choose  one of the below");
        System.out.println(" 1.IT_Team\n 2.HR_Team\n 3.Finance_Team\n 4.Facility_Team\n");
        String s = sc1.next();
        switch (s){

            case "1":
                int id;
                String name,issue;
                System.out.println("This is IT_Team");
                System.out.println("generating ticket\n");
                name = sc.nextLine();
                System.out.println("Enter the Emp name");
                id = sc.nextInt();

                System.out.println("Enter the emp id");
                issue= sc.nextLine();
                System.out.println("Enter your issue");

            case "2":
                System.out.println("This is HR_Team");
                System.out.println("generating ticket\n");
                name = sc.nextLine();
                System.out.println("Enter the Emp name");
                id = sc.nextInt();

                System.out.println("Enter the emp id");
                issue= sc.nextLine();
                System.out.println("Enter your issue");
            case "3":
                System.out.println("This is Finance_Team");
                System.out.println("generating ticket\n");
                name = sc.nextLine();
                System.out.println("Enter the Emp name");
                id = sc.nextInt();

                System.out.println("Enter the emp id");
                issue= sc.nextLine();
                System.out.println("Enter your issue");
            case "4":
                System.out.println("This is Facility_Team");
                System.out.println("generating ticket\n");
                name = sc.nextLine();
                System.out.println("Enter the Emp name");
                id = sc.nextInt();

                System.out.println("Enter the emp id");
                issue= sc.nextLine();
                System.out.println("Enter your issue");
            default:
                System.out.println("Exit");
        }
    }
}
