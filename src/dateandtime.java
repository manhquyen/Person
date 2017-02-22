import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

/**
 * Created by MyPC on 10/02/2017.
 */
 public class dateandtime {
    public void thoigian()
    {   Calendar time = Calendar.getInstance();
        int h=time.get(Calendar.HOUR_OF_DAY);
        int m=time.get(Calendar.MINUTE);

        System.out.println("bay gio la " +h+":"+m);
    }


}

