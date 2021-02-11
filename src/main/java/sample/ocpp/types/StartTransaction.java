package sample.ocpp.types;

import sample.ocpp.mock.Mock;

public class StartTransaction {
    private IdTagInfo idTagInfo;
    private int transactionId;


    public StartTransaction(IdTagInfo idTagInfo, int transactionId) {
        this.idTagInfo = idTagInfo;
        this.transactionId = Mock.getNextTransactionId();
    }

    public IdTagInfo getIdTagInfo() {
        return idTagInfo;
    }

    public void setIdTagInfo(IdTagInfo idTagInfo) {
        this.idTagInfo = idTagInfo;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
}
