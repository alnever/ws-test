package sample.ocpp.mock;

import sample.ocpp.types.*;
import sample.ocpp.utils.DateTimeFormater;
import sample.ocpp.utils.Status;

import java.util.Date;

public class Mock {
    private static int transactionId = 0;

    private static int getNextTransactionId() {
        return ++ Mock.transactionId;
    }

    public static BootNotification bootNotificationMock = new BootNotification(
            DateTimeFormater.get(new Date()),
            300,
            Status.BootNotificationAccepted
    );

    public static Authorize authorizeMock = new Authorize(
            new IdTagInfo(
                    DateTimeFormater.get(new Date()),
                    "",
                    Status.AuthorizeAccepted

            )
    );

    public static StartTransaction startTransactionMock = new StartTransaction(
            new IdTagInfo(
                    DateTimeFormater.get(new Date()),
                    "",
                    Status.AuthorizeAccepted
            ),
            getNextTransactionId()
    );

    public static StopTransaction stopTransactionMock = new StopTransaction(
            new IdTagInfo(
                    DateTimeFormater.get(new Date()),
                    "",
                    Status.AuthorizeAccepted
            )
    );

    public static StatusNotification statusNotificationMock = new StatusNotification();

    public static MeterValues meterValuesMock = new MeterValues();

    public static Heartbeat heartbeatMock = new Heartbeat(
            DateTimeFormater.get(new Date())
    );

}
