public class testing1 {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

    public static void main(String[] args) {
        testing1 t = new testing1();  // Create an instance to access the 'cars' array
        for (int i = 0; i < t.cars.length; i++) {
            System.out.println(t.cars[i]);  // Print car names
        }
    }
}
