package JAN;

public class Main {

    public static void main(String[] args)
    {
//      DeskPhone jansPhone;
        ITelephone jansPhone;

        jansPhone = new DeskPhone(12345);

        jansPhone.powerOn();
        jansPhone.callPhone(12345);
        jansPhone.answer();

        jansPhone = new MobilePhone(23456);
        jansPhone.powerOn();
        jansPhone.callPhone(23456);
        jansPhone.answer();
    }
}
