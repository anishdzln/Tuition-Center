public class Main {
    public static void main(String[] args) {

        //tutor 1 - student 1

        Tutor t1 = new Tutor ("Teacher lily", "234567", "dfghjk", "vbnm", 6, 78907);

        Students s1 = new Students("034567", "030615140200", 2022,  "SK1");
        FullName name = new FullName("Ali", "mikail", "rukaini");
        s1.setName(name);

        try{
            s1.setMarks(78.5f, 0);
            s1.setMarks(85.2f, 1);
            s1.setMarks(90.8f, 2);
        } catch (Exception ex) { // catch block.. action to be taken in case of Exception

            System.out.println("cannot continue");
            ex.printStackTrace();
            //report which particular line or method that's problem

        }
        t1.addStudent(s1);
        System.out.println(t1);

        System.out.println("Minimum marks for " + s1.name.getLname() + " = " + s1.calcMin());
        System.out.println("Maximum mark for " + s1.name.getLname() + " = " + s1.calcMax());
        System.out.println("Average marks for " + s1.name.getLname() + " = " + s1.calcAvg());

        //tutor 2 - student 2

        Tutor t2 = new Tutor ("Teacher liana", "98765", "dfghjk", "vbnm", 6, 78907);

        Students s2 = new Students("034567", "030615140200", 2022,  "SK1");
        name = new FullName("Ahmad", "mikail", "afiq");
        s2.setName(name);

        try {

            s2.setMarks(89.5f, 0);
            s2.setMarks(80.2f, 1);
            s2.setMarks(93.0f, 2);

        } catch (Exception ex) { // catch block.. action to be taken in case of Exception

            System.out.println("cannot continue");
            ex.printStackTrace();
            //report which particular line or method that's problem

        }

        t2.addStudent(s2);
        System.out.println("\n" + t2);

        System.out.println("Minimum marks for " + s2.name.getLname() + " = " + s2.calcMin());
        System.out.println("Maximum mark for " + s2.name.getLname() + " = " + s2.calcMax());
        System.out.println("Average marks for " + s2.name.getLname() + " = " + s2.calcAvg());

        // tutor 3 - student 3

        Tutor t3 = new Tutor ("Teacher lisa", "7345678", "dfghjk", "vbnm", 6, 78907);

        Students s3 = new Students("034567", "030615140200", 2022,  "SK1");
        name = new FullName("Apollo", "mikail", "haziq");
        s3.setName(name);

        try {

            s3.setMarks(56.2f, 0);
            s3.setMarks(70.5f, 1);
            s3.setMarks(86.5f, 2);

        } catch (Exception ex) { // catch block.. action to be taken in case of Exception

            System.out.println("cannot continue");
            ex.printStackTrace();
            //report which particular line or method that's problem

        }

        t3.addStudent(s3);
        System.out.println("\n" + t3);

        System.out.println("Minimum marks for " + s3.name.getLname() + " = " + s3.calcMin());
        System.out.println("Maximum mark for " + s3.name.getLname() + " = " + s3.calcMax());
        System.out.println("Average marks for " + s3.name.getLname() + " = " + s3.calcAvg());

       StudentBatch sb2023 = new StudentBatch();

        sb2023.add(s1, 0);
        sb2023.add(s2, 1);
        sb2023.add(s3, 2);

        for (int i = 0; i < 3; i++){
            System.out.println(sb2023.student[i].getName());
        }

        ScoresList sl2023 = new ScoresList();

        sl2023.add(s1, 0);
        sl2023.add(s2, 1);
        sl2023.add(s3, 2);

        for (int i = 0; i < 3; i++)
            System.out.println(sl2023.scores[i].getMarks(i));
    }
}