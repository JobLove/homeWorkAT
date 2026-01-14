import java.lang.reflect.Array;
import java.util.Arrays;

public class Module5 {
    static void main(String[] args) {

    /*    //task 5.1
        System.out.println("Проверка задачи 5.1");
        System.out.println(listNums(15));

        //task 5.2
        System.out.println("Проверка задачи 5.2");
        System.out.println(reverseListNums(15));

        //task 5.3
        System.out.println("Проверка задачи 5.3");
        System.out.println(chet(100));

        //task 5.4
        System.out.println("Проверка задачи 5.4");
        System.out.println(pow(8, 8));
        System.out.println(pow(8, 0));

        //task 5.5
        System.out.println("Проверка задачи 5.5");
        System.out.println(numLen(123456));
        System.out.println(numLen(1));
        System.out.println(numLen(0));

        //task 5.6
        System.out.println("Проверка задачи 5.6");
        System.out.println(equalNum(222));
        System.out.println(equalNum(0000));
        System.out.println(equalNum(11));
        System.out.println(equalNum(123));
        System.out.println(equalNum(65345345));
        System.out.println(equalNum(666666663));
        System.out.println(equalNum(66666666));

        //task 5.7
        System.out.println("Проверка задачи 5.7");
        square(3);
        square(4);

        //task 5.8
        System.out.println("Проверка задачи 5.8");
        leftTriangle(2);

        //task 5.9
        System.out.println("Проверка задачи 5.9");
        rightTriangle(5);
        guessGame2();


        //задача 5.1.1
        System.out.println("Массивы. Проверка задачи 5.1.1");
        int [] arr = {1,2,3,4,101, 5,6, 11};
        System.out.println(findFirst(arr, 101));

        //задача 5.1.2
        System.out.println("Массивы. Проверка задачи 5.1.2");
        int [] arr = {11, 2, 101, 101, 11, 4, 101, 5, 6, 11, 231, 432, 33};
        System.out.println(findLast(arr, 102));

        //задача 5.1.3
        System.out.println("Массивы. Проверка задачи 5.1.3");
        int [] arr = {11, 2, 101, 101, 11, 4, 101, 5, 6, 11, -23123, -432, 33 , 23124};
        System.out.println(maxAbs(arr));

        //задача 5.1.4
        System.out.println("Массивы. Проверка задачи 5.1.4");
        int [] arr = {-11, 2, 101, -101, 11, -4, 101, 5, 6, -11, -23123, -432, -33 , -23124};
        System.out.println(countPositive(arr));
        //задача 5.1.5
        System.out.println("Массивы. Проверка задачи 5.1.5");
        int [] arr = {4, 5, 6, 10, 233, 233, 10, 6, 5, 4};
        System.out.println(palindrom(arr));
        int [] arr2 = {4, 5, 6, 10, 233, 233, 10, 6, 5, 4, 1, 2, 543,42342, 54, 10, 6, 5, 4};
        System.out.println(palindrom(arr2));

        //задача 5.1.6
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0};
        reverse(arr);

        //задача 5.1.7
        int [] arr = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0};
        int []arr2 = reverseBack(arr);
        for (int i = 0; i < arr2.length; i++) System.out.print(arr2[i] + " ");

        //задача 5.1.8
        int [] arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] arr2 = { -5, -6, -7, -8, -9, -10, -11};
        int []newArr = concat(arr1, arr2);
        for (int i = 0; i < newArr.length; i++) System.out.print(newArr[i] + " ");

        //задача 5.1.9
        int[] arr = {-1, 0, 1, 2, 3, 4, 3, 3, 3, 5, 6, 7, 8, 3, 9, 10, 0, 3, 3};
        int[] newArr = findAll(arr, 3);
        for (int i = 0; i < newArr.length; i++) System.out.print(newArr[i] + " ");

        //задача 5.1.10
        int[] arr = {-1, 0, 1, 2, 3, -4, 3, -3, 3, 5, 6, 7, -8, -3, 9, -10, 0, -3, -3, 185};
        int[] newArr = deleteNegative(arr);
        for (int i = 0; i < newArr.length; i++) System.out.print(newArr[i] + " ");

        //задача 5.1.11
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = add(arr, 1800, 2);
        for (int i = 0; i < newArr.length; i++) System.out.print(newArr[i] + " ");
        */


        int[] arr = {1, 2, 3, 4, 5};
        int[] ins = {10, 20, 30, 40, 50};
        int[] newArr = add(arr,  ins, 10);
        for (int i = 0; i < newArr.length; i++) System.out.print(newArr[i] + " ");


    }

    //задача 5.1
    public static String listNums(int x) {
        String str = "";
        for (int i = 0; i <= x; i++) {
            str += i + " ";
        }
        return str.trim();
    }

    //задача 5.2
    public static String reverseListNums(int x) {
        String str = "";
        for (int i = x; i >= 0; i--) {
            str += i + " ";
        }
        return str.trim();
    }

    //задача 5.3
    public static String chet(int x) {
        String str = "";
        for (int i = 0; i <= x; i += 2) {
            str += i + " ";
        }
        return str.trim();
    }

    //задача 5.4
    public static int pow(int x, int y) {

        int res = 1;
        for (int i = 0; i < y; i++) {
            res *= x;
        }
        return res;

    }

    //задача 5.5
    public static int numLen(long x) {
        int res = 0;
        do {
            res++;
            x /= 10;
        } while (x != 0);
        return res;
    }

    //задача 5.6
    public static boolean equalNum(int x) {
        int value = x % 10;
        while (x != 0) {
            if (x % 10 != value) return false;
            x /= 10;
        }
        return true;
    }

    //задача 5.7
    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //задача 5.8
    public static void leftTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //задача 5.9
    public static void rightTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = x - 1 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //задача 5.10
    public static void guessGame() {
        int randomNum = 3;
        int countAnswers = 0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (true) {
            System.out.println("What number am I thinking (0 to 9)? :");
            int x = sc.nextInt();
            if (x != randomNum) {
                System.out.println("No, try again");
                countAnswers++;
            } else {
                System.out.println("Yes, it`s " + randomNum);
                countAnswers++;
                System.out.println("Total number of responses: " + countAnswers);
                break;
            }
        }
    }

    //задача 5.10 (2)
    public static void guessGame2() {
        int randomNum = 3;
        int countAnswers = 0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x = 0;
        while (x != randomNum) {
            System.out.println("What number am I thinking (0 to 9)? :");
            x = sc.nextInt();
            if (x != randomNum) {
                System.out.println("No, try again");
                countAnswers++;
            } else {
                System.out.println("Yes, it`s " + randomNum);
                countAnswers++;
            }
        }
        System.out.println("Total number of responses: " + countAnswers);
    }

    //задача 5.1.1
    public static int findFirst(int[] arr, int x) {

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    //задача 5.1.2
    public static int findLast(int[] arr, int x) {

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    //задача 5.1.3
    public static int maxAbs(int[] arr) {
        int max = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (Math.abs(max) < Math.abs(arr[i])) max = arr[i];
        }
        return max;
    }

    //задача 5.1.4
    public static int countPositive(int[] arr) {
        int countPositive = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > 0) countPositive++;
        }
        return countPositive;
    }

    //задача 5.1.5
    public static boolean palindrom(int[] arr) {
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arrCopy[arrCopy.length - 1 - i]) continue;
            else return false;
        }
        return true;
    }

    //задача 5.1.6
    public static void reverse(int[] arr) {
        int temp = 0;

        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    }

    //задача 5.1.7
    public static int[] reverseBack(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i <= arr.length - 1; i++) {
            newArray[i] = arr[arr.length - 1 - i];
        }
        return newArray;
    }

    //задача 5.1.8
    public static int[] concat(int[] arr1, int[] arr2) {
        int[] newArray = new int[arr1.length + arr2.length];
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            newArray[j] = arr1[i];
            j++;
        }
        for (int i = 0; i < arr2.length; i++) {
            newArray[j] = arr2[i];
            j++;
        }
        return newArray;
    }

    //задача 5.1.9
    public static int[] findAll(int[] arr, int x) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) count++;
        }
        int[] arrAll = new int[count];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                arrAll[j] = i;
                j++;
            }
        }
        return arrAll;
    }

    //задача 5.1.10
    public static int[] deleteNegative(int[] arr) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) count++;
        }
        int[] arrPositive = new int[count];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arrPositive[j] = arr[i];
                j++;
            }
        }
        return arrPositive;
    }

    //задача 5.1.11
    public static int[] add(int[] arr, int x, int pos) {

        int newArrayLength = 0;

        if (pos < arr.length) newArrayLength = arr.length + 1;
        else newArrayLength = pos + 1;

        int[] newArray = new int[newArrayLength];
        int indexOldArray = 0;

        for (int i = 0; i < newArray.length; i++) {
            if (i == pos) {
                newArray[i] = x;
            } else {
                if (indexOldArray < arr.length) {
                    newArray[i] = arr[indexOldArray];
                    indexOldArray++;
                }
            }
        }
        return newArray;
    }

    //задача 5.1.12
    public static int[] add(int[] arr, int[] ins, int pos) {

        int newArrayLength = 0;

        if (pos < arr.length) newArrayLength = arr.length + ins.length;
        else newArrayLength = pos + ins.length;

        int[] newArray = new int[newArrayLength];
        int indexArr = 0;
        int indexIns = 0;

        for (int i = 0; i < newArray.length; i++) {
            if (i >= pos && i < pos + ins.length) {
                newArray[i] = ins[indexIns];
                indexIns++;
            } else {
                if (indexArr < arr.length) {
                    newArray[i] = arr[indexArr];
                    indexArr++;
                }
            }
        }
        return newArray;
    }

    /*
    public static int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];

        for (int i = 0; i < result.length; i++) {
            if (i < pos) {
                result[i] = arr[i];
            } else if (i<pos+ins.length) {
                result[i] = ins[i - pos];
            } else {
                result[i] = arr[i - ins.length];
            }
        }

        return result;
    }
    */


}
