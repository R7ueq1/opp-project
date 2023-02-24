import java.util.Scanner;
public class Main extends Swiitch {


        static Scanner scan = new Scanner(System.in);

        public static void main(String args[]) {
            Swiitch AAA = new Swiitch();
            AAA.Switch();
            USER BBB = new USER();
            System.out.println("-----------welcome to Ahmad's ATM-------------");
            System.out.println("");
            System.out.println("Please Enter your name:");
            System.out.println("");

            String N = scan.nextLine();
            System.out.println("welcome" + N);

            //نعرف فاريبل الرصيد و السحب و الايداع كانتجر
            //int balance = 4000, withdraw, deposit;


            //   هنا استخدمت (while loop)عشان المستخدم يسوي اكثر من عملية
            while (true) {
                System.out.println("choose the opration:");
                System.out.println("Choose 1 for Withdraw");
                System.out.println("Choose 2 for Check your balance");
                System.out.println("Choose 3 for deposit");
                System.out.println("Choose 4 for EXIT");
                System.out.print("Choose the operation you want to perform:");

                //يطلب من المستخدم اختيار العملية المرغوبة بأدخال رقم العملية و تم استخدام كود(switch)
                //int choice = scan.nextInt();
           /* switch(choice)
            {
                //هنا عملية السحب من الرصيد
                case 1:
                    System.out.print("Enter money to be withdrawn:");


                    withdraw = scan.nextInt();

                    //هنا نتأكد اذا كان الرصيد يكفي لعملية السحب او لا
                    if(balance >= withdraw)
                    {
                        //يتم خصم المبلغ المرغوب سحبه
                    //    balance = balance - withdraw;
                        withdraw();
                        System.out.println("Please Take your money");
                    }
                    else
                    {
                        //هنا يتم اظهار رساله للمستخدم بأن رصيده غير كافي
                        System.out.println("Your balance is not enough to complete this process");
                    }
                    System.out.println("");
                    break;

                case 2:

                    //يتم عرض الرصيد الحالي للمستخدم
                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;

                case 3:
                    System.out.print("Enter money to be deposited:");

                    //نطلب من المستخدم ادخال مبلغ الايداع
                    deposit = scan.nextInt();

                    //يضاف المبلغ المرغوب ايداعه للرصيد
                   // balance = balance + deposit;
                    addBalance();

                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                    break;

                case 4:
                    //هنالانهاء البرنامج
                    System.out.println("Thank you for using Ahmad ATM");
                    System.exit(0);
            }*/
            }
        }

}
