public class Q01DralicanCozumut {

    static int counterAdd = 0;
    static int result = 0;



   public static void main(String[] args) {
       //System.out.println(counterAdd);
        int input =123456;                                  //sayıyı buradan giriyoruz
       System.out.println(additivePersistence(input));


//
//
//        int result1 = additivePersistence(5);
//        int result2 = additivePersistence(27);
//        int result3 = additivePersistence(58);
//        int result4 = additivePersistence(5789);
//        long result5 = multiplicativePersistence(7);
//        long result6 = multiplicativePersistence(1234567890);
//        long result7 = multiplicativePersistence(39);
//        long result8 = multiplicativePersistence(6788);
//        long result9 = multiplicativePersistence(277777788888899L);
//
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);
//        System.out.println(result4);
//        System.out.println(result5);
//        System.out.println(result6);
//        System.out.println(result7);
//        System.out.println(result8);
//        System.out.println(result9);


}

    public static int additivePersistence(int input) {



        if (counterAdd == 0) {
            if (input < 10) {
                return counterAdd;
            }
        }
        while (input > 0) {
            result += input % 10;
            input /= 10;
        }
        counterAdd++;
        if (result >= 10) {
            int gec = result;       //burada resultı sıfırlamamız ve resultın değeriyle tekrar methodu çağırmamız gerekiyor
            result =0;              //bu yüzden gec(ici) variable oluşturdum resultı da 0 a eşitledim.
            result = additivePersistence(gec);
        } else {
            return counterAdd;
        }
        return counterAdd;

    }

//    public static int additivePersistence(int input, int counterAdd) {
//        int result = 0;
//        while (input > 0) {
//            result += input % 10;
//            input /= 10;
//        }
//        counterAdd++;
//        if (result >= 10) {
//            result = additivePersistence(result, counterAdd);
//        } else {
//            return counterAdd;
//        }
//        return result;
//    }

}

//    public static long multiplicativePersistence(long input) {
//        int counterMulti = 0;
//        long result = 1;
//        if (counterMulti == 0) {
//            if (input < 10) {
//                return counterMulti;
//            }
//        }
//
//        while (input > 0) {
//            result *= input % 10;
//            input /= 10;
//
//        }
//        counterMulti++;
//        if (result >= 10) {
//            result = multiplicativePersistence(result, counterMulti);
//        } else {
//            return counterMulti;
//        }
//        return result;
//    }
//
//    public static long multiplicativePersistence(long input, int counterMulti) {
//        long result = 1;
//        while (input > 0) {
//            result *= input % 10;
//            input /= 10;
//
//        }
//        counterMulti++;
//        if (result >= 10) {
//            result = multiplicativePersistence(result, counterMulti);
//        } else {
//            return counterMulti;
//        }
//        return result;
//
//    }
//
//
//}
//
