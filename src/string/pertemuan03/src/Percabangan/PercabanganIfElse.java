package Percabangan;

public class PercabanganIfElse {
    public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangDiDompet = 25000;

        if (uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, kurangi jajan anda");
        }else  if (uangDiDompet>totalBelanja){
            double angsul = uangDiDompet-totalBelanja;
            System.out.println("uang cukup, angsul : "+angsul);
        }else {
            System.out.println("Uang pas .. UwU..");
        }
    }
}
