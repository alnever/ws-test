package sample.ocpp.types;

public class Authorize {
    private IdTagInfo idTagInfo;

    public Authorize(IdTagInfo idTagInfo) {
        this.idTagInfo = idTagInfo;
    }


    public IdTagInfo getIdTagInfo() {
        return idTagInfo;
    }

    public void setIdTagInfo(IdTagInfo idTagInfo) {
        this.idTagInfo = idTagInfo;
    }
}
