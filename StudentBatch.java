public class StudentBatch {

    protected Students[] student = new Students [3];     //Students - data type for array
    private int currsz = 0;

    // operation

    public void add(Students s, int i){

        student[i] = s;
    }

    //method overloading
    public void add(Students s){

        student[currsz++] = s;

    }
}
