import java.util.Scanner;

class invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public invoice(String var1, String var2, int var3, double var4) {
        this.partNumber = var1;
        this.partDescription = var2;
        this.quantity = var3;
        this.pricePerItem = var4;
    }

    public String getPartNumber() {
        return this.partNumber;
    }

    public String getPartDescription() {
        return this.partDescription;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPricePerItem() {
        return this.pricePerItem;
    }

    public void setPartNumber(String var1) {
        this.partNumber = var1;
    }

    public void setPartDescription(String var1) {
        this.partDescription = var1;
    }

    public void setQuantity(int var1) {
        this.quantity = var1;
    }

    public void setPricePerItem(double var1) {
        this.pricePerItem = var1;
    }
}

public class Task15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many invoices? ");
        int n = sc.nextInt();
        sc.nextLine();

        invoice[] arr = new invoice[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nInvoice " + (i + 1));

            System.out.print("Part number: ");
            String number = sc.nextLine();

            System.out.print("Description: ");
            String desc = sc.nextLine();

            System.out.print("Quantity: ");
            int q = sc.nextInt();

            System.out.print("Price per item: ");
            double price = sc.nextDouble();
            sc.nextLine();

            arr[i] = new invoice(number, desc, q, price);
        }

        System.out.println("\n--- Invoice Details ---");

        for (int i = 0; i < arr.length; i++) {

            double total = arr[i].getQuantity() * arr[i].getPricePerItem();

            System.out.println("\nInvoice " + (i + 1));
            System.out.println("Part number: " + arr[i].getPartNumber());
            System.out.println("Description: " + arr[i].getPartDescription());
            System.out.println("Quantity: " + arr[i].getQuantity());
            System.out.println("Price per item: " + arr[i].getPricePerItem());
            System.out.println("Invoice amount: " + total);
        }

        sc.close();
    }
}