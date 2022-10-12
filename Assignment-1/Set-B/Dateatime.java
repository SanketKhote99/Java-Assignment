import java.util.Date;
import java.text.SimpleDateFormat;
public class Dateatime {
    public static void main(String[] args) {
        Date atime = new Date(System.currentTimeMillis());
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy ");
        String strdate = formatter.format(atime.getTime());
        System.out.println(strdate);


        SimpleDateFormat abc = new SimpleDateFormat("MM-dd-yyyy ");
        String a = abc.format(atime.getTime());
        System.out.println(a);

        SimpleDateFormat ab = new SimpleDateFormat("");
        String ac = ab.format(atime.getTime());
        System.out.println(ac);
    }
}
