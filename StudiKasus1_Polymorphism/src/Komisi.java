public class Komisi extends PekerjaLepas {
    private double totalSales;
    private double commissionRate;

    public Komisi(String name, String address, String phone, String socialSecurityNumber, double payRate, double commissionRate) {
        super(name, address, phone, socialSecurityNumber, payRate); 
        this.commissionRate = commissionRate; 
        totalSales = 0; 
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double payment = super.pay(); // Mendapatkan gaji dari jam kerja
        payment += totalSales * commissionRate; // Menambahkan komisi berdasarkan penjualan
        totalSales = 0; // Reset total penjualan setelah gaji dibayarkan
        return payment; // Mengembalikan total pembayaran
    }

    @Override
    public String toString() {
        String result = super.toString(); // Memanggil metode toString dari kelas Hourly
        result += "\nTotal Penjualan: " + totalSales; // Menambahkan total penjualan ke hasil output
        return result;
    }
}
