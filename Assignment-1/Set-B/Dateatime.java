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

        SimpleDateFormat abz = new SimpleDateFormat("EEEE MMMM dd yyyy ");
        String acz = abz.format(atime.getTime());
        System.out.println(acz);

        SimpleDateFormat aba = new SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy ");
        String aca = aba.format(atime.getTime());
        System.out.println(aca);

        SimpleDateFormat abq = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a S ");
        String acq = abq.format(atime.getTime());
        System.out.println(acq);

        SimpleDateFormat ab = new SimpleDateFormat("HH:mm:ss ");
        String ac = ab.format(atime.getTime());
        System.out.println(ac);

        SimpleDateFormat abw = new SimpleDateFormat("w ");
        String acw = abw.format(atime.getTime());
        System.out.println(acw);

        SimpleDateFormat abe = new SimpleDateFormat("W ");
        String ace = abe.format(atime.getTime());
        System.out.println(ace);

        SimpleDateFormat abr = new SimpleDateFormat("D ");
        String acr = abr.format(atime.getTime());
        System.out.println(acr);        
}
}