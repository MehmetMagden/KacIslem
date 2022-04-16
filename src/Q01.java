public class Q01 {


//    additivePersistence(1679583) ➞ 3
//// 1 + 6 + 7 + 9 + 5 + 8 + 3 = 39
//// 3 + 9 = 12
//// 1 + 2 = 3
//// It takes 3 iterations to reach a single-digit number.
//
//    additivePersistence(123456) ➞ 2
//// 1 + 2 + 3 + 4 + 5 + 6 = 21
//// 2 + 1 = 3
//
//    additivePersistence(6) ➞ 0
//// Because 6 is already a single-digit integer.

    //    multiplicativePersistence(77) ➞ 4
//// 7 x 7 = 49
//// 4 x 9 = 36
//// 3 x 6 = 18
//// 1 x 8 = 8
//// It takes 4 iterations to reach a single-digit number.
//
//    multiplicativePersistence(123456) ➞ 2
//// 1 x 2 x 3 x 4 x 5 x 6 = 720
//// 7 x 2 x 0 = 0
//
//    multiplicativePersistence(4) ➞ 0
//// Because 4 is already a single-digit integer.
//
    static int num = 1679583;
    static int toplam = 0;
    static int counter = 0;

    public static void main(String[] args) {
        System.out.println(rakamTopla(num));

    }
    private static int rakamTopla(int num) {
        do {
            toplam += num % 10;
            num /= 10;

        } while (num > 0);
        counter++;

        if (toplam > 9) {
            int gec = toplam;  //burada toplamı tekrar işleme koymam gerekiyor ama aynı zamanda da sıfrlamam gerekiyor
            toplam = 0;         // bende geçici bir eleman koyarak sorunu çözdüm
            rakamTopla(gec);
        }
        return counter;
    }
}
