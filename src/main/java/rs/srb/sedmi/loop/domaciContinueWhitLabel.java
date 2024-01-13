
package rs.srb.sedmi.loop;

public class domaciContinueWhitLabel {
    public static void main(String[] args) {
        String recenica = "petar pan oma pantalone pan je pan pan";
        String rec = "pan";
        boolean recJesteDeoRecenice = false;
        int n=0;
        srki:
        for (int i = 0; i < recenica.length(); i++) {

            for (int j = 0; j < rec.length(); j++) {
                char slovaRecenice = recenica.charAt(i + j);
                char slovoReci = rec.charAt(j);
                if (slovaRecenice != slovoReci) {
                    continue srki;
                }


            }n++;
            if (i < recenica.length()) {
                continue srki;

            }
            recJesteDeoRecenice = true;
            break;
        }
        System.out.println("rec:"+rec+ " se ponavlja: "+n+" puta");
    }}
