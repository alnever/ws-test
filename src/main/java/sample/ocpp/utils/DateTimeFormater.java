package sample.ocpp.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormater {

    public static String get(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        return formatter.format(date != null ? date : new Date()).replace(" ","T").concat(".000Z");
    }
}
