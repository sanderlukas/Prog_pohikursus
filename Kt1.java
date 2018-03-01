package kt1;
import java.io.*;
import java.util.*;
public class Kt1 {
    //ÜL 1 funktsioon
    public static double ruutjuur(double arv1, double arv2) {
        double korrutis = arv1 * arv2;
        return Math.round(Math.sqrt(korrutis));
    }
    // ÜL 2 funktsioon
    public static double geo_keskmine(int[] arvud) {
        int korrutis = 1;
        int kogus = 0;
        if (arvud.length == 1) {
            return Math.sqrt(arvud[0]);
        } else {
            for (int arv: arvud) {
                korrutis = korrutis * arv;
                kogus++;
            }
        }
        return Math.pow(korrutis, 1.0 / kogus);
    }
    
    public static void main(String[] args) throws Exception{
        int[] arvud = {5, 5, 5};
        int x = 5;
        int y = 20;
        System.out.println(ruutjuur(x, y));
        System.out.printf("Arvude %d ja %d korrutise ruutjuur on %.2f %n", x, y, ruutjuur(x, y));
        //Geomeetriline keskmine
        System.out.println("Massiivi elementide geomeetriline keskmine: " + geo_keskmine(arvud));
        
        
        BufferedReader br = new BufferedReader(new FileReader("palk.txt"));
        List<String> koefitsiendid = new ArrayList<String>();
        String palkFailist = br.readLine(); // 1. real palga suurus
        double palk = Double.parseDouble(palkFailist);
        String rida = br.readLine();
        
        while (rida != null) {
            koefitsiendid.add(rida);
            rida = br.readLine();
        }
        
        br.close();
        System.out.println(koefitsiendid);
        double[] uuedPalgad = new double[koefitsiendid.size()];
        for (int i = 0; i < koefitsiendid.size(); i++) {
            uuedPalgad[i] = (Double.parseDouble(koefitsiendid.get(i)) + 100 / 100) * palk;
        }
        System.out.println(Arrays.toString(uuedPalgad));
        PrintWriter pw = new PrintWriter(new FileWriter("palk_aastati.txt"));
        
        for (double p: uuedPalgad) {
            pw.print(p);  
        }
        pw.close();  
     //võrdlusena kõrvale palk, kui sama alg- ja lõppsumma juures olnuks koef ühtlane
    }
}
