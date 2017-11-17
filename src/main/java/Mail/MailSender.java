package Mail;

public class MailSender {
    MailInfo mailInfo;
    public MailSender(MailInfo mailInfo){
        this.mailInfo = mailInfo;
    }
    public MailInfo getMailInfo() {
        return mailInfo;
    }
    public void setMailInfo(MailInfo mailInfo){
        this.mailInfo = mailInfo;
    }
    public MailSender(){
    }
    public void sentMail(){
        this.getMailInfo().getClient().addMail(mailInfo);
        mailInfo.toStr();
    }
}