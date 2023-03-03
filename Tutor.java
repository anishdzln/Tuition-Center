public class Tutor {

    private String name, IC, address, qualification;
    private int numyearexp, datejoined;
    private Students student;

    public Tutor(String name, String IC, String address, String qualification, int numyearexp, int datejoined) {
        this.name = name;
        this.IC = IC;
        this.address = address;
        this.qualification = qualification;
        this.numyearexp = numyearexp;
        this.datejoined = datejoined;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Students student) {
        this.student = student;
    }

    public Students getStudent(){
        return student;
    }

    @Override
    public String toString() {
        return "Tutor: " + name + '\'' +
                ": \nstudent=" + student;
    }
}
