package operator;

public class OperatoUnary {
    public static void main(String[] args) {
        int i = 0;
        i++;                    //i tadinya 0 ditambahkan1 sehingga i = 1
        System.out.println(i);  //betulkan i nilainya 1
        i++;                    //karena i tadinya sudah bernilai 1 maka sekarang di tambahkan lagi 1 menjadi 2
        System.out.println(i);  //tuh betulkan i nilainya 2
        i=i+1;                  //bisa dilihat i++ sama dengan i = i+1
        System.out.println(i);  //i tadi 2 sekarang menjadi 3
    }
}
