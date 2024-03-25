import java.util.Calendar;

public class Person {
    private String firstName;
    private String lastName;
    private String ID;
    private String title;
    private int YOB;

    public Person(String idNum, String firstName, String lastName, String title, int YOB) {
        this.ID = idNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public String formalName() {
        return title + " " + lastName;
    }

    public int getAge() {
        return (2024 - YOB);
    }

    public int getAge(int currentYear) {
        currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return (currentYear - YOB);
    }

    public String toCSVDataRecord() {
        return ID + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
    }
}
