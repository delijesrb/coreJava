package rs.srb.sedmi.loop;

public class domaciPopravka {
    public static void main(String[] args) {
        String recenica = "petar pan oma pantalone pan je";
        String rec = "pan";
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
        }
        System.out.println("rec:"+rec+ " se ponavlja: "+n+" puta");
    }}

