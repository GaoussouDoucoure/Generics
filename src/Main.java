public class Main {
    public static void main(String[] args) {
        /*
         Generics = A concept where you can write a class, interface, or method
                    that is compatible with different data types.
                    type parameter (placeholder that gets replaced with a real type)
                    type argument (specifies the type)
        */

        //Generic with one paramater
        Box<Integer> box1 = new Box<>();
        box1.setItem(15);
        System.out.println(box1.getItem());

        Box<Double> box2 = new Box<>();
        box2.setItem(3.14);
        System.out.println(box2.getItem());
        /*
         above we can see that we are using the Generic to switch in between
         without using multiple classes
        */
        System.out.println(); // to skip a line in the terminal

        //Generic with multiple parameter
        Product<String, Double> product1 = new Product<>("apple", 0.50);
        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());
        Product<String, Integer> product2 = new Product<>("ticket", 15);
        System.out.println(product1.getItem());
        System.out.println(product2.getPrice());

    }
}