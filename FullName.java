public class FullName {

    private String fname, mname, lname;

    //default value
    public FullName() {
        this.fname = "fname";
        this.lname = "lname";
        this.mname = "mname";
    }

    public FullName(String fname, String mname, String lname) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }

    public String getLname() {
        return lname;
    }

    @Override
    public String toString() {
        return "'" + lname + "'";
    }
}
