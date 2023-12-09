import java.util.Scanner;

public class allinone {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("********************************************** WELCOME TO DATA STRUCTURE PROJECT **********************************************");
        System.out.println("CHOOSE THE OPTION SEACHING AND SORTING");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.println("3. Bubble Sort");
        System.out.println("4. Selection Sort");
        System.out.println("5. Insertion Sort");
        System.out.println("6. Merge Sort");
        System.out.println("7. Quick Sort");
        // System.out.println("8. Heap Sort");

        System.out.println("--------------------------------------------------");
        System.out.print("SELECT THE OPTION : ");
        int choice = input.nextInt();

        switch (choice) {
            case 1: {
                linearsearch();
                break;
            }
            case 2: {
                binarysearch();
                break;
            }
            case 3: {
                bubblesort();
                break;
            }
            case 4: {
                selectionsort();
                break;
            }
            case 5: {
                insertionsort();
                break;
            }
            case 6: {
                mergesort();
                break;
            }
            case 7: {
                quicksort();
                break;
            }
            // case 8:
            // {
            // heapsort();
            // break;
            // }
            default:
                System.out.println("Invalid Choice. please enter 1 to 7");

        }
        input.close();
    }

    public static void linearsearch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("*********************************WELCOME TO LINEAR SEARCH*********************************");
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        System.out.print("Enter the elements :");
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Print all elements:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nEnter the search element : ");
        int key = sc.nextInt();

        boolean elementFound = false;

        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("Element is found :" + arr[i] + " And Index is : " + i);
                elementFound = true;
                break;
            }
        }
        if (!elementFound) {
            System.out.println("Element not found");
        }
        sc.close();
    }

    public static void binarysearch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("*********************************WELCOME TO BINARY SEARCH*********************************");
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter The Sorted Array :");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Print All Sorted Elements :");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nEnter the search element : ");
        int key = sc.nextInt();

        int low = 0;
        int high = size - 1;
        boolean elementFound = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element is found :" + arr[mid] + " And Index is : " + mid);
                elementFound = true;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        if (!elementFound) {
            System.out.println("Element not found");
        }
        sc.close();

    }

    public static void bubblesort() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("*********************************WELCOME TO BUBBLE SORT*********************************");
        System.out.print("Enter the size of array : ");
        int size = sc1.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter The Array Elements :");

        for (int i = 0; i < size; i++) {
            arr[i] = sc1.nextInt();
        }

        System.out.print("Print Array Elements :");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\n Sorted Array is : ");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc1.close();
    }

    public static void selectionsort() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("*********************************WELCOME TO SELECTION SORT*********************************");
        System.out.print("Enter the size of array : ");
        int size = sc2.nextInt();

        int arr2[] = new int[size];
        System.out.print("Enter The Array Elements :");

        for (int i = 0; i < size; i++) {
            arr2[i] = sc2.nextInt();
        }

        System.out.print("Print Array Elements :");

        for (int i = 0; i < size; i++) {
            System.out.print(arr2[i] + " ");
        }

        for (int i = 0; i < size - 1; i++) {
            int loc = i;
            for (int j = i + 1; j < size; j++) {
                if (arr2[j] < arr2[loc]) {
                    loc = j;
                }
                int temp = arr2[i];
                arr2[i] = arr2[loc];
                arr2[loc] = temp;

            }
        }
        System.out.print("\n Sorted Array is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr2[i] + " ");
        }
        sc2.close();
    }

    public static void insertionsort() {
        Scanner sci = new Scanner(System.in);
        System.out.println("*********************************WELCOME TO INSERTION SORT*********************************");
        System.out.println("Enter the number of elements in an array:");
        int n = sci.nextInt();
        int a[] = new int[n];

        System.out.print("Enter The Array Elements :");
        for (int i = 0; i < n; i++) {
            a[i] = sci.nextInt();
        }

        System.out.print("Print Array Elements :");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        int temp;
        for (int i = 1; i < n; i++) {
            temp = a[i];
            int j = i - 1;
            while (j >= 0 && temp < a[j]) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = temp;
        }

        System.out.print("\n Sorted Array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sci.close();
    }

    public static void mergesort() {
        Scanner scm = new Scanner(System.in);
        System.out.println("*********************************WELCOME TO MERGE SORT*********************************");
        System.out.print("Enter the size of array : ");
        int size = scm.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter The Array Elements :");

        for (int i = 0; i < size; i++) {
            arr[i] = scm.nextInt();
        }

        System.out.print("Print Array Elements :");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        mergesort(arr, 0, size - 1);

        System.out.print("\n Sorted Array is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        scm.close();
    }

    public static void mergesort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergesort(arr, l, m);
            mergesort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void quicksort() {
        Scanner scq = new Scanner(System.in);
        System.out.println("*********************************WELCOME TO QUICK SORT*********************************");
        System.out.print("Enter the size of array : ");
        int size = scq.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter The Array Elements :");

        for (int i = 0; i < size; i++) {
            arr[i] = scq.nextInt();
        }

        System.out.print("Print Array Elements :");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        quicksort(arr, 0, size - 1);

        System.out.print("\n Sorted Array is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        scq.close();
    }

    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
