import java.util.Calendar;
import java.util.GregorianCalendar;

public class Timedate {
    public static void main(String args[]){
        int day,month,year;
        int hour,minute,second;
        GregorianCalendar date=new GregorianCalendar();
        day=date.get(Calendar.DAY_OF_MONTH); 
        month=date.get(Calendar.MONTH);
        year=date.get(Calendar.YEAR);
        hour=date.get(Calendar.HOUR);
        minute=date.get(Calendar.MINUTE);
        second=date.get(Calendar.SECOND);
        System.out.println("Todays Date & Time:-"+day +"/"+month+"/"+year+"  --  "+hour+":"+minute+":"+second);

    }
}
