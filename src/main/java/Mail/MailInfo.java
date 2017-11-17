package Mail;

public class MailInfo {
    Client client;
    MailCode mailCode;
    public MailInfo (Client client, MailCode mailCode){
        this.client = client;
        this.mailCode = mailCode;
    }
    public Client getClient(){
        return this.client;
    }

    public MailCode getMailCode() {
        return mailCode;
    }

    @Override
    public String toString() {
        return getMailCode().testString().format(client.getName(), client.getAge());
    }

}
