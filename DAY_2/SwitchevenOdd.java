class Switchevenodd {
    public static void main(String args[]) {
        int a = 10;
        switch (a % 2) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}