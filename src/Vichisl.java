import java.util.Scanner;

/**
 * Created by user on 18.05.2018.
 */
public class Vichisl {

    static double pi = 3.14;
    static double usd = 60
    static double eur = 70;


    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Введиите цифру");
        int y = scanner.nextInt();
        System.out.println("Обрабатывается число : " + y);
        //Scanner s = ысфттукютуче();
        // bufferedReader bufferedReader(new input...
        //s.split(regex:" ");

        System.out.println("Значение первого разряда : "+ lastRazr(y));
        System.out.println("Количество десятков : " + decDec(y));


        System.out.println("Вычисляем следующее четное. Введите число : ");
        y = scanner.nextInt();
        System.out.println("Следующее четное : "+ sledChetn(y));

        System.out.println("Вычисляем площадь S и длинну L окружности. Введите радиус R : ");
        double r = scanner.nextInt();
        double krug[] = radSquLei(r);
        System.out.println("Площадь круга S : " + krug[0] + "   Длинна круга L :" + krug[1]);

    }
            //VМетод вычисления последнего разряда
    public static int lastRazr(int y) {

        return y%10;

        // String s = String.valueOf(y) ;
        //char c;
        //for (int i = 0; i< s.length(); i++)
        // c = s.charAt(s.lenght()-1);
        //return Integer.parseInt(String);

        // string{} c = s.split(regex:"[\\s\\xA0]} | \\p {Punct}");
        // for (int i= 0; i < s1.leght; i++);
        //system.out.println(s1[i]);
        // }
        // system.out.println("Результат вычислений"+z);
    }

    /** Метод
     * вводим двухзначное число натуральное
     * натуральное
     * вывести к-во десятков
     * @param y
     * @return
     */
    public static int decDec(int y) {
        y = y % 100 / 10;
        return Math.round(y);
    }
    /** Метод
     * находим следующее четное
     * @param y
     * @return
     */
    public static double sledChetn(int y) {
        y = y/2;
        double x = ((double) y/2 +1) * 2;
        int z = (int) x;
        z = y + z;
        return z;
    }

    /** Метод
     * предлагаем пользователю ввести радиус Rad окружности,
     * считаем Squ площадь и длину Lei этой окружности.
     * Число Pi задать как вещественную константу.
     * @param y
     * @return
     */
    public static double[] radSquLei(double rad) {
        double squ = pi * Math.pow(rad, 2);
        double lei = 2 * pi * rad;
        return new double[] {squ, lei};
    }
    /** Метод
     * конвертер рублей в $ и E$.
     * @param y
     * @return
     */
    public static double[] rubConvToUSDToEur(double rubl) {

        double $ = convertEurToUsd(50 , 1.2) ;
        return new double[] {squ, lei};
    }


}