public class Student
{
    private String name;
    private int age;
    private double score;

    /**
     * Creates a Student object.
     *
     * @param name the student's name
     * @param age the student's age
     * @param score the student's score
     */

    public Student(String name, int age, double score)
    {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    /**
     * Determines the student's letter grade.
     *
     * @return  the student's letter grade
     */
    public char getGrade()
    {
        if (score > 69)
        {
            return 'A';
        }
        else if (score > 59)
        {
            return 'B';
        }
        else if (score > 49)
        {
            return 'C';
        }
        else if (score > 44)
        {
            return 'D';
        }
        else
        {
            return 'F';
        }
    }

    /**
     * Determines whether the student is passing
     *
     * @return true if the student passed, otherwise false
     */

    public boolean isPassing()
    {
        char grade = getGrade();

        if (grade == 'A' || grade == 'B' || grade == 'C')
        {
            return true;
        }
        return false;
    }


}
