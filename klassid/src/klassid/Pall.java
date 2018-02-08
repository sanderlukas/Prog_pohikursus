package klassid;

public class Pall {
    protected double x;
    protected double y;
    protected double r;
    
    public Pall(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    
    public Pall(double x, double y) {
        /*this.x = x;
        this.y = y;*/
        this(x, y, 1);
    }
    
    public double kaugusNullist() {
        return Math.sqrt(x*x + y*y);
    }
    
    public double getX() { return x;}
    public double getY() {return y;}
    public double getR() {return r;}
    
    public double kaugusPallist(Pall teine) {
        double dx = getX() - teine.getX();
        double dy = getY() - teine.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }
    
    public double pallRaadius(double x, double y) {
        double keskk_x = getX();
        double keskk_y = getY();
        return Math.sqrt(Math.pow((x - keskk_x), 2) + Math.pow((y - keskk_y), 2));
    }
    
    public boolean kasPuutub(Pall teine) {
        return kaugusPallist(teine) < getR() + teine.getR();
    }
    
    @Override
    public String toString() {
        return "Pall kohal (" + x + ", " + y + ") - raadius " + r + ".";
    }
}
