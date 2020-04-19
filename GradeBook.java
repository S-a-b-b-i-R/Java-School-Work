// Coded by Sabbir Ahmed %035170112
public class GradeBook{

    private String courseName;
    private String instructorName;

    // constructor
    public GradeBook(String name, String instructor){
        courseName = name;
        instructorName = instructor;
    }

    // set the courseName
    public void setCourseName(String name){
        courseName = name;
    }

    public void setInstructor(String instructor){
        instructorName = instructor;
    }

    // get courseName
    public String getCourseName(){
        return courseName;
    }

    public String getInstructor(){
        return instructorName;
    }

    // display a welcome message to the GradeBook user
    public void displayMessage(){
        System.out.printf(
                "Welcome to the Grade Book for %s!\nThis course is presented by: %s\n\n",
                getCourseName(), getInstructor());
    }
}
