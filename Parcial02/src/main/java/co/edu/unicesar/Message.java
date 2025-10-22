package co.edu.unicesar;

public class Message {
    private String recipient;
    private String subjetc;
    private String content;

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSubjetc() {
        return subjetc;
    }

    public void setSubjetc(String subjetc) {
        this.subjetc = subjetc;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Message(String recipient, String subjetc, String content) {
        this.recipient = recipient;
        this.subjetc = subjetc;
        this.content = content;
    }
}
