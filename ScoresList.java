public class ScoresList {
    protected Students [] scores = new Students[3];
    private int currsz = 0;


    public void add(Students mark, int i){

        scores[i] = mark;
    }

    public void add(Students mark){

        scores[currsz++] = mark;

    }
}
