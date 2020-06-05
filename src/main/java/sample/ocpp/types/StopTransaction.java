package sample.ocpp.types;

public class StopTransaction {
    private IdTagInfo idTagInfo;

    public StopTransaction(IdTagInfo idTagInfo) {
        this.idTagInfo = idTagInfo;
    }

    public IdTagInfo getIdTagInfo() {
        return idTagInfo;
    }

    public void setIdTagInfo(IdTagInfo idTagInfo) {
        this.idTagInfo = idTagInfo;
    }
}
