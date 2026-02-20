import java.util.Scanner;

public class Task02 {

    public static int min(int[] a) {
        int m = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < m) m = a[i];
        }
        return m;
    }

    public static int max(int[] a) {
        int m = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > m) m = a[i];
        }
        return m;
    }

    public static int[] both(int[] a) {
        int mn = a[0], mx = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < mn) mn = a[i];
            if (a[i] > mx) mx = a[i];
        }
        return new int[]{mn, mx};
    }

    public static void main(String[] args) {

        if (args.length > 0) {
            int[] arr = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }

            System.out.println("Cmd Min: " + min(arr));
            System.out.println("Cmd Max: " + max(arr));

            int[] r = both(arr);
            System.out.println("Both -> " + r[0] + " " + r[1]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers: ");
        int n = sc.nextInt();

        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Min: " + min(arr2));
        System.out.println("Max: " + max(arr2));

        int[] r2 = both(arr2);
        System.out.println("Both -> " + r2[0] + " " + r2[1]);

        sc.close();
    }
}