package sample.ocpp.mock;

import sample.ocpp.types.*;
import sample.ocpp.utils.DateTimeFormater;
import sample.ocpp.utils.Status;

import java.util.Date;

public class Mock {
    private static int transactionId = 0;

    public static int getNextTransactionId() {
        Mock.transactionId = Mock.transactionId + 1;
        return Mock.transactionId;
    }

    public static BootNotification bootNotificationMock = new BootNotification(
            DateTimeFormater.get(new Date()),
            30,
            Status.BootNotificationAccepted
    );

    public static Authorize authorizeMock = new Authorize(
            new IdTagInfo(
                    "2021-03-19T08:44:00.131Z",
                    "",
                    Status.AuthorizeAccepted

            )
    );

    public static StartTransaction startTransactionMock = new StartTransaction(
            new IdTagInfo(
                    DateTimeFormater.get(new Date()),
                    "",
                    Status.ConcurrentTx
            ),
            (int) Math.round(Math.random() * 1000)
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
