public class Students {

    FullName name;
    String IC, address, schoolname;
    int year;
    float[] marks = new float[3];

    public Students() {
    }

    public Students(String IC, String address, int year, String schoolname) {
        this.IC = IC;
        this.address = address;
        this.year = year;
        this.schoolname = schoolname;
    }

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public void setMarks(float mark, int index) throws Exception {

        /*if (mark < 0) {
            //Exception - java class
            throw new Exception("Markah takleh negativeeeeeee");
        }*/

        if (index > marks.length){
            throw new Exception("APENIIIIIIIIII?????!!");
        }

        this.marks[index] = mark;


        /*else{
            System.out.println("Markah takleh negativeeeee");
            return;
        }*/
    }
    public float getMarks(int index) {return marks[index];
    }

    void displayMarks(){
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks at index " + i + ": " + marks[i]);
        }
    }

    float calcAvg(){
        float sum = 0;
        for (int i = 0; i < 3; i++){
            sum += marks[i];
        }

        float avg = sum/3;
        return avg;
    }

    float calcMin(){
        float min = marks[0];

        for (int i = 0; i < 3; i++){
            if (min > marks[i])
                min = marks[i];

        }
        return min;
    }

    float calcMax(){
        float max = -999;

        for (int i = 0; i < 3; i++){
            if (max < marks[i])
                max = marks[i];

        }
        return max;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name=" + name +
                ", IC='" + IC + '\'' +
                ", address='" + address + '\'' +
                ", schoolname='" + schoolname + '\'' +
                ", year=" + year +
                '}';
    }

    // to test the specific class
    public static void main(String[] args) {
        Students stud0 = new Students();
        try {   //try block.. something in here can cause exception

            stud0.setMarks(98.5f, 0);
            stud0.setMarks(12f, 1);
            stud0.setMarks(90.5f, 2);

        } catch (Exception ex) { // catch block.. action to be taken in case of Exception

            System.out.println("cannot continue");
            ex.printStackTrace();

            //report which particular line or method that's problem

        }
            stud0.displayMarks();
            //stud1.displayMarks();
    }
}
