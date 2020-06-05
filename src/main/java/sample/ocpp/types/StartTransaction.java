package sample.ocpp.types;

public class StartTransaction {
    private IdTagInfo idTagInfo;
    private int transactionId;


    public StartTransaction(IdTagInfo idTagInfo, int transactionId) {
        this.idTagInfo = idTagInfo;
        this.transactionId = transactionId;
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
