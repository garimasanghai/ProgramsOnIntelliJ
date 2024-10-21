package SwitchStatement;

public class lab_030switchWithMultipleValue {
    public static void main(String[] args) {
        int itemCode = 003;

        switch(itemCode){
            case 004,005,006:
                System.out.println("Electronic Gadgets");
                break;
            case 007, 001, 002:
                System.out.println("Medical Supplies");
                break;
            default:
                System.out.println("System doesn't recognise");
        }
    }
}
