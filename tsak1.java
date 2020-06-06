import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        // 1
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите делимое");
        int a1 = vvod.nextInt();
        System.out.println("Введите делитель");
        int b1 = vvod.nextInt();
        int remainder = a1 % b1;
        System.out.println(remainder);
        //2
        System.out.println("Введите основание треугольника");
        int a2 = vvod.nextInt();
        System.out.println("Введите высоту треугольника");
        int b2 = vvod.nextInt();
        System.out.println("Площадь теругольника = " + a2*b2/2);
        //3
        System.out.println("Введите количество куриц, коров и свиней");
        int a3 = vvod.nextInt();
        int b3 = vvod.nextInt();
        int c3 = vvod.nextInt();
        System.out.println("Количество ног всего = " + (a3*2+b3*4+c3*4));
        //4
        System.out.println("Введите prob, prize, pay");
        int prob = vvod.nextInt();
        int prize = vvod.nextInt();
        int pay = vvod.nextInt();
        if (prob * prize > pay)
            System.out.println("true");
        else
            System.out.println("false");
        //5
        System.out.println("Введите 3 числа");
        int sc1 = vvod.nextInt();
        int sc2 = vvod.nextInt();
        int sc3 = vvod.nextInt();
        System.out.println("Выполненое действие:");
        task5(sc1,sc2,sc3);
        //6
        System.out.println("Введите символ");
        char Sc = vvod.next().charAt(0);
        System.out.println("Код симиовла: " +task6(Sc));
        //7
        System.out.println("Введите число");
        int a7 = vvod.nextInt();
        System.out.println("Сумма всех цифр "+ task7(a7));
        //8
        System.out.println("Введите 2 стороны треугольника ");
        int A = vvod.nextInt();
        int B = vvod.nextInt();
        System.out.println("Максимально значение третьего ребра " +task8(A,B));
        //9
        System.out.println("Введите количество элементов массив ");
        int a9 = vvod.nextInt();
        int mas[] = new int[a9];
        for (int i = 0; i < a9; i++) {
            mas[i] = vvod.nextInt();
        }
        System.out.println("Вывод вашего массива");
        for (int i = 0; i < a9; i++) {
            System.out.println(mas[i]);
        }
        System.out.println("Сумма кубов: " +task9(mas));
        //10
        System.out.println("Введите a,b,c");
        int a10 = vvod.nextInt();
        int b10 = vvod.nextInt();
        int c10 = vvod.nextInt();
        System.out.println("Результат" + task10(a10,b10,c10));
    }
    //Функции
    //5
    public static void task5(int a5, int b5, int N){
        if (a5 + b5 == N)
            System.out.println("added");
        else if (Math.abs(a5-b5)==N)
            System.out.println("subtracted");
        else if (a5*b5==N)
            System.out.println("multiplied");
        else if (a5/b5==N || b5/a5==N)
            System.out.println("divided");
        else
            System.out.println("none");
    }
    //6
    public static int task6(char Sc){
        return Sc;
    }
    //7
    public static int task7(int a7){
        int a0 = 0;
        for (int i = a7; i > 0; i--){
            a0+=i;
        }
        return a0;
    }
    //8
    public static int task8(int A, int B){
         return A + B - 1;
    }
    //9
    public static int task9(int mas[]){
        int sum = 0;
        for (int i = 0; i < mas.length; i++){
            sum += Math.pow(mas[i],3);
        }
        return sum;
    }
    //10
    public static boolean task10(int a10,int b10,int c10){
        return a10*Math.pow(2,b10)%c10==0;
    }
}
