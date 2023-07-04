public class Main {
Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
    Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
    Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string


 public static void main(String[] args) {
        double a = 10.5;
        double b = 3.2;

        Calculator calculator = new Calculator(a, b);

        // Perform addition
        double additionResult = calculator.add();
        System.out.println("Addition: " + additionResult);

        // Perform subtraction
        double subtractionResult = calculator.subtract();
        System.out.println("Subtraction: " + subtractionResult);

        // Perform multiplication
        double multiplicationResult = calculator.multiply();
        System.out.println("Multiplication: " + multiplicationResult);

        // Perform division
        try {
            double divisionResult = calculator.divide();
            System.out.println("Division: " + divisionResult);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}





Problem-2:  With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]

    Output: (examples)
        1) input a = 1, then output : 1
        2) input a = 2, then output : 1, 3
        3) input a = 3, then output : 1, 3, 5
        4) input a = 4, then output : 1, 3, 5, 7
        .
        .
        5) input a = x, then output : 1, 3, 5, 7, .......


import java.util.ArrayList;
import java.util.List;

public class NumberSeriesGenerator {
    public static List<Integer> generateSeries(int a) {
        List<Integer> series = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            int number = 2 * i - 1;
            series.add(number);
        }
        return series;
    }

    public static void main(String[] args) {
        System.out.println(generateSeries(1));  // Output: [1]
        System.out.println(generateSeries(2));  // Output: [1, 3]
        System.out.println(generateSeries(3));  // Output: [1, 3, 5]
        System.out.println(generateSeries(4));  // Output: [1, 3, 5, 7]
        // Add more test cases as needed
    }
}



Problem-3:  With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]

    Output: (examples)
        1) input a = 1, then output : 1
        2) input a = 2, then output : 1
        3) input a = 3, then output : 1, 3, 5
        4) input a = 4, then output : 1, 3, 5
        5) input a = 5, then output : 1, 3, 5, 7, 9
        6) input a = 6, then output : 1, 3, 5, 7, 9
        .
        .
        7) input a = x, then output : 1, 3, 5, 7, .......


import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        
        System.out.print("Output: ");
        for (int i = 1; i <= x; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}



Problem-4:  Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
    (examples)
    input: [1,2,8,9,12,46,76,82,15,20,30]
    Output:
        {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}


import java.util.HashMap;
import java.util.Map;

public class MultiplesCount {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        Map<Integer, Integer> counts = new HashMap<>();
        int[] multiples = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int multiple : multiples) {
            counts.put(multiple, 0);
        }

        for (int number : numbers) {
            for (int multiple : multiples) {
                if (number % multiple == 0) {
                    counts.put(multiple, counts.get(multiple) + 1);
                }
            }
        }

        System.out.println(counts);
    }
}

