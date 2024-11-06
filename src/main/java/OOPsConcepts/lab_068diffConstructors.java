package OOPsConcepts;

public class lab_068diffConstructors {
    public static void main(String[] args) {

        Car2 t1 = new Car2("Tesla", 2015);
        System.out.println("Car Details:");
        System.out.println("Model: " + t1.model);
        System.out.println("Created in: " + t1.year);
        t1.display();
        System.out.println();

        Car2 t2 = new Car2("NANO", 2013);
        System.out.println("Car Details:");
        System.out.println("Model: " + t2.model);
        System.out.println("Created in: " + t2.year);
        t2.display();
        System.out.println("----------------");

        String model_name_input = "Skoda"; //ref variable
        int year_input = 2023;             //ref variable

        Car2 t3 = new Car2(model_name_input, year_input); //Pass ref variables as args
        System.out.println("Car Details:");
        System.out.println("Model: " + t3.model);
        System.out.println("Created in: " + t3.year);
        t3.display();
    }
}

class Car2 {
    String model;
    int year;

    // Parameterized Constructor
    Car2(String model_name, int year_created) {
        System.out.println("PC");
        this.model = model_name; //assigning value of the current obj
        this.year = year_created; //assigning value of the current obj
    }

    //Method
    void display() {
        System.out.println(this.model + " <--- Car is created");
    }
}
