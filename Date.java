/**
  Represent a date
 */
public class Date{
    private int y,m,d;
    
    public int compareTo( Object otherObj){
        /* Use the Pythagorean theorem.
           Double.compare helped me.
           If the math is a problem, use a simpler
           relationship, like "higher is bigger"
           and change the tests accordingly */
        Date otherDate = (Date)otherObj;
        double thisDate = this.d + this.m * 12 + this.y * 365;
        double thatDate = otherDate.d + otherDate.m * 12 + otherDate.y * 365;
        return (int)(thatDate - thisDate);
    }

    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

}