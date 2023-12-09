class Student{
    int rollno;
    String name;
    int marks;
}
class ArrayOfObjects {
    public static void main(String arg[]){
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Sara";
        s1.marks = 89;

        Student s2 = new Student();
        s2.rollno = 1;
        s2.name = "Jeni";
        s2.marks = 74;
        
        Student s3 = new Student();
        s3.rollno = 1;
        s3.name = "Anne";
        s3.marks = 63;
        
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i<students.length; i++){
            System.out.println(students[i].name + " : " + students[i].marks);
        }
        //using enhanced for loop
        for(Student std : students){
            System.out.println(std.name + " : " + std.marks);
        }
    }
    
}
