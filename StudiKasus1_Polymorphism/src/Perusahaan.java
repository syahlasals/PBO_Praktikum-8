//*************************************************************
//  Firm.java       Author: Lewis/Loftus
//
//  Demonstrates polymorphism via inheritance.
//*************************************************************

public class Perusahaan
{
   //----------------------------------------------------------
   //  Creates a staff of employees for a firm and pays them.
   //----------------------------------------------------------
    public static void main (String[] args)
    {
        Karyawan personnel = new Karyawan();

        personnel.payday();
    }
}

