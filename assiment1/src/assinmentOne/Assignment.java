package assinmentOne;

public class Assignment {
    private double mark=-1;

    public double getMark() throws NotYetSetException {
        if (mark==-1) {
            throw new
                    NotYetSetException("Mark is not yet set");
        }
        return mark;
    }
    public void setMark( int mark) {
        this.mark=mark;
    }
}
