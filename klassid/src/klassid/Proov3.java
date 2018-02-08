package klassid;
import java.util.*;

public class Proov3 {
    public static void main(String[] args) {
        List<Pall> pallid = new ArrayList<Pall>();
        pallid.add(new Pall(3, 5));
        pallid.add(new Pall(5, 5));
        pallid.add(new Pall(2, 5, 2));
        pallid.add(new Pall(-3, 5));
       
        //System.out.println(pallid);
        Pall suurimR = pallid.get(0);
        for (Pall p: pallid) {
            System.out.println(p);
            if (p.getR() > suurimR.getR()) {
                suurimR = p;
            }
        }
        System.out.println("Suurima raadiuega pall: " + suurimR);
    }
}
