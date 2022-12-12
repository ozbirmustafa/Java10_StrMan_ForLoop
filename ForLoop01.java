package day10stringmanipulations;

public class ForLoop01 {
    public static void main(String[] args) {

        //Ex 1 : Ekrana 5 kere "hi" yazdırınız.
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        /*Tekrarlı işler için loop kullanırız.
        Dört çeşit loop vardır.
        i)   for-loop
        ii)  while-loop
        iii) do-while-loop
        iv)  for-each-loop
        */

        System.out.println(" ");
        //for-loop
        //Ex 1 : Ekrana 5 kere "hi" yazdırınız.
        //   baslangic degeri ; loop hangi şart alında çalışacak ; increment ve decrement
        for (    int i = 1    ;                i<6              ; i=i+1                 ){
            System.out.println("Hi");                           //i+=1 ya da
                                                                // "i++" ---> bu yöntem sadece 1 ile artırmada kullanılır
        }
        System.out.println(" ");
        //EX:3   4'ten 7'ye kadar tüm tam sayıları ekrana yazdiriniz.
        for ( int sayi = 4  ;  sayi<8  ; sayi = sayi +1  ){
            System.out.print(sayi + " ");

        }
        System.out.println("\n");
        for (int x = 2; x<5000 ; x*=2){
            System.out.println(x);
        }

        System.out.println(" \n");
        //Decrement

        for (int z = 1000 ; z>0 ; z/=5)
            System.out.println(z);
        System.out.println(" ");

        for (int y = 14; y>4; y--){
            System.out.print(y + " ");
        }

        System.out.println("\n");
        //2. Yol
        for (int j = 14; j>4; j--){
            if(j%2==0){
                System.out.print(j + " ");
            }
        }
        System.out.println("");

        for (int k1= 28 ; k1<111 ;  k1++){
            if (k1%2!=0){
                System.out.print(k1 + " ");
            }
        }
        System.out.println("");

        //Java String ini "J*a*v*a*" String ine çeviren kodu yazınız.
        String str = "Java";
        for ( int r = 0   ; r<str.length()  ; r++  )
            System.out.print(str.charAt(r) + "*");

        //Size verilen stringte tekrarsız karakterleri ekrana yazdırınız.
        // "Helloooo Ali" ==> He Ai
        System.out.println("\n");
        String str2 = "Helloooo Ali";
        for ( int xx = 0  ; xx<str2.length()  ; xx++  ){
            char ch = str2.charAt(xx);
            if (str2.indexOf(ch)==str2.lastIndexOf(ch)){
                System.out.print(ch);
            }
        }



    }
}