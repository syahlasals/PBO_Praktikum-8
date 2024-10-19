import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
    //hardcode
    //     Salesperson[] salesStaff = new Salesperson[10];

    //     salesStaff[0] = new Salesperson("Jane", "Jones", 3000);
    //     salesStaff[1] = new Salesperson("Daffy", "Duck", 4935);
    //     salesStaff[2] = new Salesperson("James", "Jones", 3000);
    //     salesStaff[3] = new Salesperson("Dick", "Walter", 2800);
    //     salesStaff[4] = new Salesperson("Don", "Trump", 1570);
    //     salesStaff[5] = new Salesperson("Jane", "Black", 3000);
    //     salesStaff[6] = new Salesperson("Harry", "Taylor", 7300);
    //     salesStaff[7] = new Salesperson("Andy", "Adams", 5000);
    //     salesStaff[8] = new Salesperson("Jim", "Jones", 2850);
    //     salesStaff[9] = new Salesperson("Walt", "Smith", 3000);
        
    //     Sorting.insertionSort(salesStaff);

    //     System.err.println("\nRanking of Sales for the Week\n");

    //     for (Salesperson s : salesStaff)
    //         System.out.println(s);
    
    //dengan scan, bukan hardcode
    Scanner scan = new Scanner(System.in);

        System.out.println("Berapa jumlah Salesperson?");
        int numSalesperson = scan.nextInt();
        scan.nextLine();

        Salesperson[] salesStaff = new Salesperson[numSalesperson];

        for (int i = 0; i < numSalesperson; i++) {
            System.out.println("Masukkan nama depan Sales Staff ke-" + (i + 1) + ":");
            String firstName = scan.nextLine();

            System.out.println("Masukkan nama belakang Sales Staff ke-" + (i + 1) + ":");
            String lastName = scan.nextLine();

            System.out.println("Masukkan total penjualan Sales Staff ke-" + (i + 1) + ":");
            int totalSales = scan.nextInt();
            scan.nextLine();
            salesStaff[i] = new Salesperson(firstName, lastName, totalSales);
        }

        Sorting.insertionSort(salesStaff);

        System.err.println("\nRanking of Sales for the Week\n");

        for (Salesperson s : salesStaff) {
            System.out.println(s);
        }

        scan.close();
    }
}
