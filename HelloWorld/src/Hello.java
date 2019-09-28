public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, " + args[0] + "!");

        int myFirstNumber = (10 + 5) + (2 * 10);
//        "expressions" evaluate to a single value
        System.out.println(myFirstNumber);
        System.out.println("intelliJ will interpret \"sout\" as \"System.out.println()\" ");

        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        System.out.println(mySecondNumber);
        System.out.println(myThirdNumber);

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }
}


