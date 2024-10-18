public class Sukarela extends DaftarPegawai
{
    //----------------------------------------------------------
    //  Constructor: Sets up this volunteer using the specified
    //  information.
    //----------------------------------------------------------
    public Sukarela (String eName, String eAddress, String ePhone)
    {
        super (eName, eAddress, ePhone);
    }

    //----------------------------------------------------------
    //  Returns a zero pay value for this volunteer.
    //----------------------------------------------------------
    public double pay()
    {
        return 0.0;
    }
}
