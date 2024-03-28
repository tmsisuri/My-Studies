import java.util.Scanner;

public class StudentGradeCalculation {
    private final String name;
    private final String email;
    private final int age;
    private final String address;
    private final int mark;
    private  char grade;

    public StudentGradeCalculation(String name, String email, int age, String address, int mark) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
        this.mark = mark;
        calculateGrade();
    }

    public static StudentGradeCalculation obtainDetails(Scanner scanner){

        System.out.print("Enter name : ");
        String name = scanner.nextLine();

        System.out.print("Enter email : ");
        String email = scanner.nextLine();

        System.out.print("Enter age : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter address : ");
        String address = scanner.nextLine();

        System.out.print("Enter mark  : ");
        int mark  = scanner.nextInt();
        scanner.nextLine();

        return new StudentGradeCalculation(name,email,age,address,mark);
    }

    private void calculateGrade(){
        if (mark >= 90)
            grade = 'A';
        else if (mark >= 80)
            grade = 'B';
        else if (mark >= 70)
            grade = 'C';
        else if (mark >= 60)
            grade = 'D';
        else
            grade = 'F';
    }

    public void displayDataAndGrade(){
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Age : " + age);
        System.out.println("Address : " + address);
        System.out.println("Mark : " + mark);
        System.out.println("Grade : " + grade);
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        StudentGradeCalculation[] studentsGradeCalculations = new StudentGradeCalculation[5];
        int choice;

        do{
            System.out.println("\nMenu:");
            System.out.println("1.Input data for a student");
            System.out.println("2.Calculate and display the grade & student data for a student");
            System.out.println("3.Exit the program");

            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 :
                    for(int i=0 ; i<5 ; i++){
                        System.out.println("\nEnter details for student " + (i+1) +":" );
                        studentsGradeCalculations[i] = obtainDetails(scanner);
                    }
                    break;
                case 2 :
                    System.out.println("\nEnter the student number (1 to 5)");
                    int studentNumber = scanner.nextInt();
                    scanner.nextLine();
                    if(studentNumber >=1 && studentNumber <= 5) {
                        studentsGradeCalculations[studentNumber - 1].displayDataAndGrade();
                    }
                    else {
                        System.out.println("Invalid student number.");
                    }
                    break;
                case 3 :
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3 ");
            }
        }
        while (choice != 3);
        scanner.close();
    }
}
