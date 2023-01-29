public class Month {

    public static void howDaysInMonth() {
        int month = 3;
        int year = 2023;
        int numDays = 0;

        switch (month) {
            case 1:
                month = 1;
            case 3:
                month = 3;
            case 5:
                month = 5;
            case 7:
                month = 7;
            case 8:
                month = 8;
            case 10:
                month = 10;
            case 12:
                month = 12;
                numDays = 31;
                System.out.println(31);
                break;
            case 4:
                month = 4;
            case 6:
                month = 6;
            case 9:
                month = 9;
            case 11:
                month = 11;
                numDays = 30;
                System.out.println(30);
                break;
            case 2:
                month = 2;
                numDays = 28;
                System.out.println(28);
                break;
            default:
                System.out.println("isNotCorrect");
        }
    }

    public static void main(String[] args) {
        howDaysInMonth();
    }
}