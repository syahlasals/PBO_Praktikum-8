public class Salesperson implements Comparable<Salesperson> {
    private String firstName, lastName;
    private int totalSales;

    public Salesperson (String first, String last, int sales)
    {
        this.firstName = first;
        this.lastName = last;
        this.totalSales = sales;
    }

    @Override
    public String toString()
    {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    public boolean equals (Object other){
        return (lastName.equals(((Salesperson)other).getLastName()) &&
                firstName.equals(((Salesperson)other).getFirstName()));
    }

    @Override
    // Metode compareTo berdasarkan total sales, kemudian nama untuk mengatasi tie
    public int compareTo(Salesperson other) {
        if (this.totalSales != other.totalSales) {
            return other.totalSales - this.totalSales; // Urutkan berdasarkan total sales (descending)
        } else {
            return other.lastName.compareTo(this.lastName); // Urutkan alfabetis terbalik jika sales sama
        }
    }

    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }

    public int getSales()
    {
        return totalSales;
    }
}
