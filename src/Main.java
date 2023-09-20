import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a1[][] = { { 10, 20 },
                { 40, 50 },
                { 60, 70 } };

        int a2[][] = { { 30, 20 },
                { 10, 0 },
                { 60, 80 } };

        int a3[][] = { { 10, 20 },
                { 40, 50 },
                { 60, 70 } };
        System.out.println("Check if a1 is equal to a2 : "
                + Arrays.deepEquals(a1, a2));

        System.out.println("Check if a2 is equal to a3 : "
                + Arrays.deepEquals(a2, a3));

        System.out.println("Check if a1 is equal to a3 : "
                + Arrays.deepEquals(a1, a3)+"\n");


        Employee e1[][] = { { new Employee(10, "Geek1"),
                new Employee(11, "Geek2") },
                { new Employee(12, "Geek3"),
                        new Employee(13, "Geek4") } };

        Employee e2[][] = { { new Employee(10, "Geek1"),
                new Employee(11, "Geek2") },
                { new Employee(12, "Geek3"),
                        new Employee(13, "Geek4") } };

        Employee e3[][] = { { new Employee(12, "Geek2"),
                new Employee(25, "Geek4") },
                { new Employee(15, "Geek3"),
                        new Employee(30, "Geek1") } };

        System.out.println("Check if e1 is equal to e2 : "
                + Arrays.deepEquals(e1, e2));

        System.out.println("Check if e2 is equal to e3 : "
                + Arrays.deepEquals(e2, e3));

        System.out.println("Check if a1 is equal to a3 : "
                + Arrays.deepEquals(e1, e3));
    }
}