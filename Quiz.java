import java.util.Scanner;

class Quiz {
    public static void main(String[] args) {
        Question[] ques = new Question[4];
        question(ques);
        Scanner sc = new Scanner(System.in);
        int nums = 0;
        int point = 0;
        int n = 0;
        while (nums < ques.length) {
            System.out.println(ques[nums].q);
            System.out.println("1." + ques[nums].op1);
            System.out.println("2." + ques[nums].op2);
            System.out.println("3." + ques[nums].op3);
            System.out.println("4." + ques[nums].op4);
            while (true) {
                System.out.print("Enter option number : ");
                n = sc.nextInt();
                if (n == ques[nums].ans) {
                    System.out.println("Correct ans (^_^)");
                    point++;
                    break;
                } else if (n == 1 || n == 2 || n == 3 || n == 4) {
                    System.out.println("Wrong Ans (•_•)");
                    break;
                } else {
                    System.out.println("Enter valid option number");
                }
            }
            nums++;

        }
        System.out.println("Your Score is " + point + "/" + ques.length);
    }

    public static void question(Question[] que) {
        Question q1 = new Question();
        q1.q = "a.What was the fastest growing web browser in 2020?";
        q1.op1 = "Microsoft Edge";
        q1.op2 = "FireFox";
        q1.op3 = "Brave";
        q1.op4 = "Google chrome";
        q1.ans = 4;

        que[0] = q1;

        Question q2 = new Question();
        q2.q = "b.Jeff Bezos is CEO and President of which online retailer?";
        q2.op1 = "Flipkart";
        q2.op2 = "Amazon";
        q2.op3 = "Oracle";
        q2.op4 = "Apple";
        q2.ans = 2;
        que[1] = q2;
        Question q3 = new Question();
        q3.q = "c.Which social media app only lets you view pictures and messages for a limited time?";
        q3.op1 = "Instagram";
        q3.op2 = "Facebook";
        q3.op3 = "Snapchat";
        q3.op4 = "Whatsapp";
        q3.ans = 3;
        que[2] = q3;
        Question q4 = new Question();
        q4.q = "d.What does CPU stand for?";
        q4.op1 = "Central Power Unit";
        q4.op2 = "Center Preprocessing Unit";
        q4.op3 = "Central Processing Unit";
        q4.op4 = "Center Power Unit";
        q4.ans = 3;
        que[3] = q4;
    }
}

class Question {
    String q;
    String op1;
    String op2;
    String op3;
    String op4;
    int ans;
}
