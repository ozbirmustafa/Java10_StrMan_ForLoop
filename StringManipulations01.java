package day10stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        String a = "Java kolaydır.";
        boolean b = a.startsWith("va", 2);
        //kaçıncı karakterden sonra ne ile başlıyor.
        System.out.println(b);//true

        boolean b1 = a.startsWith(" ", 4);
        System.out.println(b1);//İlk 4 karakter "Java" ardından string "space" ile devam ettiği için "true" return eder.

        String c = a.replaceFirst("a", "*");
        System.out.println(c); //J*va kolaydır.

        String d = a.concat(" Anladın mı?");
        System.out.println(d);//Java kolaydır. Anladın mı?

        String e = "   Tom Hanks  ";
        String f = e.trim();//Bir String in baş ve sonundaki "space" karakterlerini siler. Aradaki "space"karakterlerine dokunmaz.
        System.out.println(f);//Tom Hanks

        String h = "Java", i = "Java";
        int j = h.compareTo(i);//iki tane string i alfabetik(lexicographic) olarak karşılaştırır.
        // büyük ve küçük harfe duyarlıdır. bunu istemezsek "compareToIGnoreCase()" kullanabilirsiniz.
        //int j = h.compareTo(i) "h" nin alfabetik sırasından "i" nin alfabetik sırası çıkarılır.
        System.out.println(j);

        String n = a.repeat(3);
        System.out.println(n);//Java kolaydır.Java kolaydır.Java kolaydır.
        //repeat methodu yan yana 3 kere yazar.



    }
}
