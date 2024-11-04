package models;

public interface Builder {
    void reset();
    void setSender(String sender);
    void setRecipient(String recipient);
    void setSubject(String subject);
    void setBody(String body);
}
