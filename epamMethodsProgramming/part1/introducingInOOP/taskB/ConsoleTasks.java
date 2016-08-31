package methodsProgramming.part1.introducingInOOP.taskB;

import java.util.*;

/**
 * Created by Alexander on 8/30/2016.
 */

public class ConsoleTasks {
    public static void main(String[] args) {

        System.out.println("ENTER THE COUNT OF NUMBERS: ");
        Scanner scanner = new Scanner(System.in);
        //ARRAY FILLER
        int[] array = new int[scanner.nextInt()];
        checkNotNull(array);
        fillArray(scanner, array);

        //BL
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("             Choose the task: \n " +
                "1: Choose odd and even numbers. \n " +
                "2: Choose the least and the largest number . \n " +
                "3: The numbers that are divisible by 3 or 9 . \n " +
                "4: The numbers that are divisible by 5 and 7 . \n " +
                "5: Items located by bubble descending modules . \n " +
                "6: All three-digit number in decimal which is not the same recording . \n " +
                "7: The greatest common divisor and least common multiple of these numbers . \n " +
                "8: Prime Numbers . \n " +
                "9: Sorting . \n " +
                "10: The numbers in descending order of frequency of occurrence of numbers . \n " +
                "11: «Happy» numbers... \n " +
                "12: Fibonacci numbers: f0 = f1 = 1, f (n) = f (n-1) + f (n-2). \n " +
                "13: Numbers-palindromes whose values are in direct and reverse order coincides give . \n " +
                "14: Items that are equal to half the sum of neighboring elements . \n " +
                "15: Period decimal p = m / n for the first two positive integers " +
                "the numbers n and m, are located in a row. . \n " +
                "16: Construct Pascal's triangle for the first positive number . \n " +
                "0: Print your numbers.  ");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");

        //TASKS
        switch (scanner.nextInt()) {
            case 0:
                System.out.println(Arrays.toString(array));
                break;
            case 1:
                oddEvenFinder(array);
                break;
            case 2:
                leastAndLarger(array);
                break;
            case 3:
                divisibleBy3Or9(array);
                break;
            case 4:
                divisibleBy5And7(array);
                break;
            case 5:
                sortNumbersWithBubbleReverseByAbs(array);
                break;
            case 6:
                findNumbersWithThreeDifferentDigits(array);
                break;
            case 7:
                findGreatestCommonDivisor(array);
                findLeastCommonMultiple(array);
                break;
            case 8:
                findPrimeNumbers(array);
                break;
            case 9:
                sortUp(array);
                sortDown(array);
                break;
            case 10:
                findNumbersFrequencyByDesc(array);
                break;
            case 11:
                findHappyNumbers(array);
                break;
            case 12:
                findFibonacciNumbers(array);
                break;
            case 13:
                findPalindromicNumbers(array);
                break;
            case 14:
                findNumbersOfHalfSumOfNeighbors(array);
                break;
            case 15:
                findPeriodForFirstTwoPositiveNumbersInARow(array);
                break;
            case 16:
                buildPascalTriangleForFirstPositiveNumber(array);
                break;
        }
    }

    public static void findNumbersFrequencyByDesc(int[] sourceNumbers) {
        List<Integer> numbers = toIntegerList(sourceNumbers);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer number : numbers) {
            map.put(number, Collections.frequency(numbers, number));
        }
        System.out.println("The numbers in descending order of frequency of occurrence numbers (n = occurrence): "
                + sortNumbersWithDescByValue(map));
    }

    public static Map<Integer, Integer> sortNumbersWithDescByValue(
            Map<Integer, Integer> map) {
        List<Map.Entry<Integer, Integer>> frequencyList = new ArrayList<Map.Entry<Integer, Integer>>(
                map.entrySet());
        Collections.sort(frequencyList, new Comparator<Object>() {
            @SuppressWarnings("unchecked")
            public int compare(Object o1, Object o2) {
                return ((Map.Entry<Integer, Integer>) (o2)).getValue().compareTo(
                        ((Map.Entry<Integer, Integer>) (o1)).getValue());
            }
        });
        Map<Integer, Integer> result = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> frequency : frequencyList) {
            result.put(frequency.getKey(), frequency.getValue());
        }
        return result;
    }

    public static List<Integer> toIntegerList(int[] array) {
        List<Integer> result = new ArrayList<Integer>(array.length);
        for (int element : array) {
            result.add(element);
        }
        return result;
    }

    public static long findGreatestCommonDivisor(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void findGreatestCommonDivisor(int[] array) {
        long result = array[0];
        if (result == 0) {
            System.out.println("The greatest common divisor is: " + result);
        } else {
            for (int i = 1; i < array.length; i++) {
                result = findGreatestCommonDivisor(result, array[i]);
            }
            System.out.println("The greatest common divisor is: " + result);
        }
    }

    public static long findLeastCommonMultiple(long a, long b) {
        return a * (b / findGreatestCommonDivisor(a, b));
    }

    public static void findLeastCommonMultiple(int[] array) {
        long result = array[0];
        if (result == 0) {
            System.out.println("The least common multiple is: " + result);
        } else {
            for (int i = 1; i < array.length; i++) {
                if (array[i] == 0) {
                    break;
                }
                result = findLeastCommonMultiple(result, array[i]);
            }
        }
        System.out.println("The least common multiple is: " + result);
    }

    public static boolean isPrimeNumber(int number) {
        final double numberSquareRoot = Math.sqrt(number);
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (long i = 3; i <= numberSquareRoot; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return ((number % 2 != 0) && number > 2);
    }

    public static void findPrimeNumbers(int[] array) {
        System.out.print("Prime numbers are: ");
        for (int sourceNumber : array) {
            if (isPrimeNumber(sourceNumber)) {
                System.out.print(sourceNumber + ", ");
            }
        }
        System.out.println();
    }

    public static void findHappyNumbers(int[] array) {
        System.out.print("“Happy number (the sum of the first pair of numbers are: "
                + " = the sum of the second pair) ");
        int digit1, digit2, digit3, digit4;
        for (int sourceNumber : array) {
            if ((int) Math.log10(Math.abs(sourceNumber)) + 1 == 4) {
                digit1 = sourceNumber / 1000;
                digit2 = sourceNumber / 100 % 10;
                digit3 = sourceNumber % 100 / 10;
                digit4 = sourceNumber % 10;
                if (digit1 + digit2 == digit3 + digit4) {
                    System.out.print(sourceNumber + ", ");
                }
            }
        }
        System.out.println();

    }

    public static void findFibonacciNumbers(int[] array) {
        System.out.print("Fibonacci numbers are: ");
        if (array.length >= 3) {
            if (array[0] == 0) {
                System.out.print("0, ");
                if (array[1] == 1) {
                    System.out.print("1, ");
                }
            }
            for (int i = 2; i < array.length; i++) {
                if (array[i] == array[i - 2] + array[i - 1]) {
                    System.out.print(array[i] + ", ");
                }
            }
        } else {
            System.out.print("sourceNumbers.length < 3");
        }
        System.out.println();
    }

    public static int reverseInt(int value) {
        int result = 0;
        final int limit = (int) Math.log10(Math.abs(value)) + 1;
        for (int i = 0; i < limit; i++) {
            result = result * 10 + value % 10;
            value /= 10;
        }
        return result;
    }

    public static void findPalindromicNumbers(int[] array) {
        System.out.print("Numbers-palindromes are: ");
        for (int sourceNumber : array) {
            if (sourceNumber == reverseInt(sourceNumber)) {
                System.out.print(sourceNumber + ", ");
            }
        }
        System.out.println();
    }

    public static void findNumbersOfHalfSumOfNeighbors(int[] array) {
        System.out.print("Items that are equal to half the sum of neighboring cells: ");
        if (array.length >= 3) {
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] == ((float) (array[i - 1] + array[i + 1]) / 2)) {
                    System.out.print(array[i] + ", ");
                }
            }
        } else {
            System.out.print("sourceNumbers.length < 3");
        }
        System.out.println();
    }

    public static int[] findFirstTwoPositiveNumbersInARow(int[] sourceNumbers) {
        int[] twoPositiveNumbers = new int[2];
        for (int i = 0; i < sourceNumbers.length - 1; i++) {
            if ((sourceNumbers[i] > 0) && (sourceNumbers[i + 1] > 0)) {
                twoPositiveNumbers[0] = sourceNumbers[i];
                twoPositiveNumbers[1] = sourceNumbers[i + 1];
                break;
            }
        }
        return twoPositiveNumbers;
    }

    public static void findPeriodForFirstTwoPositiveNumbersInARow(
            int[] sourceNumbers) {
        String message = "The decimal period for "
                + "of the first two positive integers, " + "located in a row: ";
        if (sourceNumbers.length >= 2) {
            int r, l, t, i;
            int[] twoPositiveNumbers = findFirstTwoPositiveNumbersInARow(sourceNumbers);
            if (twoPositiveNumbers[0] > 0 || twoPositiveNumbers[1] > 0) {
                int numerator = twoPositiveNumbers[0];
                int denominator = twoPositiveNumbers[1];
                r = numerator;
                for (i = 0; i < denominator; i++) {
                    r = (r * 10) % denominator;
                }
                t = r;
                l = 0;
                do {
                    r = (r * 10) % denominator;
                    l++;
                } while (r != t);
                t = r = numerator;
                System.out.print(message + "0.");
                for (i = 0; i < l; i++) {
                    r = (r * 10) % denominator;
                }
                for (i = 0; r != t; i++) {
                    System.out.print(t * 10 / denominator);
                    r = (r * 10) % denominator;
                    t = (t * 10) % denominator;
                }
                System.out.print('(');
                for (i = 0; i < l; i++) {
                    System.out.print(t * 10 / denominator);
                    t = (t * 10) % denominator;
                }
                System.out.println(')' + " = " + numerator + "/" + denominator);
            } else {
                System.out.println(message + "No two positive integers, located in a row");
            }
        } else {
            System.out.println(message + "sourceNumbers.length < 2");
        }
    }

    public static int findFirstPositiveNumber(int[] sourceNumbers) {
        int positiveNumber = 0;
        for (int sourceNumber : sourceNumbers) {
            if (sourceNumber > positiveNumber) {
                positiveNumber = sourceNumber;
                break;
            }
        }
        return positiveNumber;
    }

    public static void buildPascalTriangleForFirstPositiveNumber(
            int[] sourceNumbers) {
        final int firstPositiveNumber = findFirstPositiveNumber(sourceNumbers);
        if (firstPositiveNumber > 0) {
            System.out.print("How many rows of Pascal's triangle for the number of "
                    + firstPositiveNumber + " display? ");
            Scanner in = new Scanner(System.in);
            if (in.hasNext()) {
                final int rows = in.nextInt();
                for (int y = 0; y < rows; y++) {
                    int c = firstPositiveNumber;
                    for (int i = 0; i < rows - y; i++) {
                        System.out.print("   ");
                    }
                    for (int x = 0; x <= y; x++) {
                        System.out.print("   " + c + " ");
                        c = c * (y - x) / (x + 1);
                    }

                    System.out.println();
                }
            } else {
                System.out.println("!in.hasNext()");
            }
        } else {
            System.out.println("Pascal's Triangle for the first positive "
                    + "number: no numbers > 0");
        }
    }

    public static void findNumbersWithThreeDifferentDigits(int[] array) {
        String number;
        System.out.print("All three-digit number in decimal which is not the same recording are: ");
        for (int sourceNumber : array) {
            if ((int) Math.log10(Math.abs(sourceNumber)) + 1 == 3) {
                number = String.valueOf(sourceNumber);
                if ((number.charAt(0) != number.charAt(1))
                        && (number.charAt(1) != number.charAt(2))
                        && (number.charAt(0) != number.charAt(2))) {
                    System.out.print(sourceNumber + ", ");
                }
            }
        }
        System.out.println();
    }

    public static void sortNumbersWithBubbleReverseByAbs(int[] array) {
        boolean swapped;
        int j = 0;
        int temp;
        do {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (Math.abs(array[i]) < Math.abs(array[i + 1])) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        System.out.print("Items located by bubble descending modules are: " + Arrays.toString(array));
    }

    private static void divisibleBy3Or9(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0 || array[i] % 9 == 0) {
                System.out.print("The numbers that divisible by 3 or 9 are: " + array[i] + " ");
            }
        }
    }

    private static void divisibleBy5And7(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0 && array[i] % 7 == 0) {
                System.out.print("The numbers that are divisible by 5 and 7 are: " + array[i] + " ");
            }
        }
    }

    public static void sortDown(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int max_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    max_i = j;
                }
            }
            if (i != max_i) {
                int tmp = array[i];
                array[i] = array[max_i];
                array[max_i] = tmp;
            }
        }
        System.out.println("Sort down: " + Arrays.toString(array));
    }

    public static void sortUp(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
        System.out.println("Sort up: " + Arrays.toString(array));
    }

    private static void leastAndLarger(int[] array) {

        int max = 0;

        if (array.length > 0) {
            int min = array[0];

            for (int el : array) {
                if (el < min) min = el;
            }
            System.out.println("The least number: " + min);
        }

        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        System.out.println("The largest number: " + max);
    }

    private static void oddEvenFinder(int[] array) {
        System.out.print("Odd numbers are: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Even numbers are: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    private static void checkNotNull(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("null array");
        }
    }

    private static void fillArray(Scanner scanner, int[] array) {
        checkNotNull(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Please enter number: ");
            array[i] = scanner.nextInt();
        }
    }
}
