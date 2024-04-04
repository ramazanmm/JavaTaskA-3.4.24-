import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



//        Scanner task = new Scanner(System.in);
//        System.out.print("ayin adini daxil edin: ");
//        String month = task.nextLine();
//
//        switch (month){
//            case "yanvar" -> System.out.println("31 gun");
//            case "fevral" -> System.out.println("28 gun");
//            case "mart" -> System.out.println("31 gun");
//            case "aprel" -> System.out.println("30 gun");
//            case "dekabr" -> System.out.println("31 gun");
//
//        }








//        1-dən n-dək ədədlər verilib.n-i inputdan alın. O ədədlər içərisində switch-case ilə yoxlayın.
//        1-5 arasında olanları tapdıqda , çapa "1-5 arasındadır",5-10 arasında olanları tapdıqda ,
//                çapa "5-10 arasındadır" yazsın. Default-da da ədəd 10-dan böyükdür çıxsın.


        Scanner task = new Scanner(System.in);
        System.out.print("eded daxil edin: ");
        int eded = task.nextInt();

        switch (eded){
            case 1,2,3,4,5 -> System.out.println("eded 1-5 arasindadir");
            case 6,7,8,9,10 -> System.out.println("eded 5-10 arasindadir");
            default -> System.out.println("eded 10-dan boyukdur");
        }
    }
}