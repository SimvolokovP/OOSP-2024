package models;

public class EmailBuilder implements Builder{
    private Email email;
    @Override
    public void reset() {
        email = new Email();
    }

    @Override
    public void setSender(String sender) {
        email.setSender(sender);
    }

    @Override
    public void setRecipient(String recipient) {
        email.setRecipient(recipient);
    }

    @Override
    public void setSubject(String subject) {
        email.setSubject(subject);
    }

    @Override
    public void setBody(String body) {
        email.setBody(body);
    }

    public Email getEmail() {
        return email;
    }
}
