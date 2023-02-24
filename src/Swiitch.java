import java.util.Scanner;

public class Swiitch extends oop{
    static Scanner as = new Scanner(System.in);
    //public static void choice() {
        public static int choice = as.nextInt();

        public static void Switch(){


            switch (choice) {
                //هنا عملية السحب من الرصيد
                case 1 -> {
                    System.out.print("Enter money to be withdrawn:");
                    withdraw = as.nextInt();

                    //هنا نتأكد اذا كان الرصيد يكفي لعملية السحب او لا
                    if (balance >= withdraw) {
                        //يتم خصم المبلغ المرغوب سحبه
                        //    balance = balance - withdraw;
                        withdraw();
                        System.out.println("Please Take your money");
                    } else {
                        //هنا يتم اظهار رساله للمستخدم بأن رصيده غير كافي
                        System.out.println("Your balance is not enough to complete this process");
                    }
                    System.out.println("");
                }
                case 2 -> {

                    //يتم عرض الرصيد الحالي للمستخدم
                    System.out.println("Balance : " + balance);
                    System.out.println("");
                }
                case 3 -> {
                    System.out.print("Enter money to be deposited:");

                    //نطلب من المستخدم ادخال مبلغ الايداع
                    deposit = as.nextInt();

                    //يضاف المبلغ المرغوب ايداعه للرصيد
                    // balance = balance + deposit;
                    addBalance();
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                }
                case 4 -> {
                    //هنالانهاء البرنامج
                    System.out.println("Thank you for using Ahmad ATM");
                    System.exit(0);
                }
            }
        }
    }


