/* 
import java.io.*;
import java.util.*;
public class StudentGradeManager {

    static ArrayList<Student> students = new ArrayList<>();
    static HashMap<Integer, Student> studentMap = new HashMap<>();

    static String fileName = "students.txt";


    static class Student {

        int rollNo;
        String name;
        int mark;

        Student(int rollNo, String name, int mark) {
            this.rollNo = rollNo;
            this.name = name;
            this.mark = mark;
        }


        String grade() {

            if(mark >= 90)
                return "A";
            else if(mark >= 75)
                return "B";
            else if(mark >= 50)
                return "C";
            else
                return "Fail";
        }


        public String toString() {

            return rollNo + "," + name + "," + mark;
        }
    }



    static void addStudent(Student s){

        students.add(s);
        studentMap.put(s.rollNo,s);

        System.out.println("Student Added Successfully");
    }



    static void viewStudents(){

        if(students.isEmpty()){

            System.out.println("No students found");
            return;
        }


        for(Student s: students){

            System.out.println(
            "Roll: "+s.rollNo+
            " Name: "+s.name+
            " Mark: "+s.mark+
            " Grade: "+s.grade());
        }
    }



    static void searchStudent(int roll){

        Student s = studentMap.get(roll);

        if(s != null)
            System.out.println(s.name+" "+s.mark+" "+s.grade());
        else
            System.out.println("Student not found");
    }




    static void deleteStudent(int roll){

        Student s = studentMap.remove(roll);

        if(s != null){

            students.remove(s);
            System.out.println("Deleted Successfully");
        }
        else
            System.out.println("Student not found");
    }




    static void saveFile(){

        try{

            FileWriter fw = new FileWriter(fileName);

            for(Student s: students){

                fw.write(s.toString()+"\n");
            }

            fw.close();

            System.out.println("Data Saved");

        }
        catch(Exception e){

            System.out.println("File Error");
        }
    }




    static void loadFile(){

        try{

            File f = new File(fileName);

            if(!f.exists())
                return;


            Scanner sc = new Scanner(f);


            while(sc.hasNextLine()){

                String data = sc.nextLine();

                String a[] = data.split(",");


                Student s =
                new Student(
                Integer.parseInt(a[0]),
                a[1],
                Integer.parseInt(a[2])
                );


                students.add(s);
                studentMap.put(s.rollNo,s);
            }

            sc.close();

        }
        catch(Exception e){

            System.out.println("Load Error");
        }
    }




    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        loadFile();


        while(true){

            try{

                System.out.println("\n--- Student Grade Manager ---");
                System.out.println("1.Add Student");
                System.out.println("2.View Student");
                System.out.println("3.Search");
                System.out.println("4.Delete");
                System.out.println("5.Save");
                System.out.println("6.Exit");


                System.out.print("Choice: ");

                int ch = sc.nextInt();



                switch(ch){

                    case 1:

                    System.out.print("Roll No: ");
                    int r = sc.nextInt();

                    System.out.print("Name: ");
                    String n = sc.next();

                    System.out.print("Mark: ");
                    int m = sc.nextInt();


                    addStudent(new Student(r,n,m));
                    break;



                    case 2:
                    viewStudents();
                    break;



                    case 3:

                    System.out.print("Roll No: ");
                    searchStudent(sc.nextInt());
                    break;



                    case 4:

                    System.out.print("Roll No: ");
                    deleteStudent(sc.nextInt());
                    break;



                    case 5:

                    saveFile();
                    break;



                    case 6:

                    saveFile();
                    System.out.println("Thank You");
                    return;



                    default:
                    System.out.println("Invalid Choice");
                }


            }
            catch(Exception e){

                System.out.println("Enter valid input");
                sc.nextLine();
            }
        }
    }
}
    
    */
   /*  public class StudentGradeManager {

    public static class Student {
        int id;
        String name;
        int marks;

        public Student(int id, String name, int marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        public String grade() {
            if (marks >= 90) return "A";
            else if (marks >= 75) return "B";
            else if (marks >= 60) return "C";
            else return "F";
        }
    }

    public static void main(String[] args) {
        Student s = new Student(1, "Harini", 88);
        System.out.println("Grade: " + s.grade());
    }
}
    */
    