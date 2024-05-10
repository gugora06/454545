import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //task 1
//        Scanner scanner = new Scanner(System.in);
//        String first = scanner.next();
//        String second = scanner.next();
//        String third = scanner.next();
//        String fourth = scanner.next();
//        String fifth = scanner.next();
//        String sentence = first.concat(" ").concat(second + " ").concat(third + " ").concat(fourth + " ").concat(fifth + " ");
//        System.out.println(sentence);

        //task 2
//        Scanner scanner = new Scanner(System.in);
//        String first = scanner.next();
//        String ffl = first.substring(0, 1);
//        String second = scanner.next();
//        String sfl = second.substring(0, 1);
//        String third = scanner.next();
//        String tfl = third.substring(0, 1);
//        String fourth = scanner.next();
//        String fofl = fourth.substring(0, 1);
//        String fifth = scanner.next();
//        String fifl = fifth.substring(0, 1);
//
//        String firstletters = ffl.concat(" ").concat(sfl + " ").concat(tfl + " ").concat(fofl + " ").concat(fifl + " ");
//        System.out.println(firstletters);

        //task 3
//        Scanner scanner = new Scanner(System.in);
//
//        double one, two, three;
//
//
//        if(scanner.hasNextDouble()){
//            one = scanner.nextDouble();
//        } else {
//            System.out.println("Введіть дробове число");
//            return;
//        }
//
//        if(scanner.hasNextDouble()){
//            two = scanner.nextDouble();
//        } else{
//            System.out.println("Введіть дробове число");
//            return;
//        }
//
//        if(scanner.hasNextDouble()){
//            three = scanner.nextDouble();
//        } else{
//            System.out.println("Введіть дробове число");
//            return;
//        }
//
//        double maxnumber = Math.max(Math.max(one, two), three);
//        System.out.println(maxnumber);

        //task 4
//        Scanner scanner = new Scanner(System.in);
//        String first = scanner.next();
//        String second = scanner.next();
//        System.out.println(first.equalsIgnoreCase(second));

        //task 5
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();
        if (first.length() > second.length()){
            System.out.println("Перше слово має більшу кількість символів");
        } else if(first.length() < second.length()){
            System.out.println("Друге слово має більшу кількість символів");
        } else{
            System.out.print("Слова мають одинакову кількість символів");
        }
    }
}

