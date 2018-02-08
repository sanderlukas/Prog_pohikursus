package klassid;
public class Proov {
    public static void main(String[] args) {
        Pall p1 = new Pall(3, 5);
        Pall p2 = new Pall(4, 6);
        System.out.println(p1 + " Kaugus algkohast: " + p1.kaugusNullist());
        System.out.println(p2);
        System.out.println("Omavaheline kaugus: " + p1.kaugusPallist(p2));
        System.out.println("Palli raadius: " + p1.pallRaadius(5, 3));
        
        if (p1.kasPuutub(p2)) {
            System.out.println("1 ja 2 puutuvad");
        }
    }
}
