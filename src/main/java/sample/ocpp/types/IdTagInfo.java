package sample.ocpp.types;

public class IdTagInfo {
    private String expitityDate;
    private String parentIdTag;
    private String status;

    public IdTagInfo(String expitityDate, String parentIdTag, String status) {
        this.expitityDate = expitityDate;
        this.parentIdTag = parentIdTag;
        this.status = status;
    }

    public String getExpitityDate() {
        return expitityDate;
    }

    public void setExpitityDate(String expitityDate) {
        this.expitityDate = expitityDate;
    }

    public String getParentIdTag() {
        return parentIdTag;
    }

    public void setParentIdTag(String parentIdTag) {
        this.parentIdTag = parentIdTag;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
