package JavaInterviewPrograms;

public class labInt_003switchCase {
    public static void main(String[] args) {
        int a = 11; // we r not using a
        switch (-1){ //It's matching with the args & will print acc.
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
        }
    }
}
