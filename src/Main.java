import java.util.Scanner;

public class Main{

        private static final Scanner scan = new Scanner(System.in);
        private static final String otvet = "Заархивированный вирус";
        private static final String podskazka = "Подсказка";

        public static void main(String[] args){
            boolean exit = false;
            boolean cheat = true;
            System.out.println("Отгадай загадку:");
            System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает.");

            for (int i = 1; i <= 3 ; i++) {
                if (exit == true)
                    break;

//                if (cheat == true){
//                    System.out.println("Подсказка уже не доступна");
//                }

                    String str = scan.next();

                    switch (str){
                        case(otvet):
                            System.out.println("Правильно!");
                            exit=true;
                            break;
                        case (podskazka):
                            System.out.println("Может это какой-то вирус?");
                            str = scan.next();
                                if (str.equals(otvet)){
                                    System.out.println("Правильно!");
                                }// else {
                                 //   cheat = false;
                               // }
                                break;
                        default:
                            System.out.println("Подумай еще");
                    }
            }
            System.out.println("Обидно, приходи в другой раз");

        }
}