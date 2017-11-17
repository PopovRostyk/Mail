package Mail;
import java.util.ArrayList;
import java.util.List;
public class MailBox {
    List<MailInfo> infos = new ArrayList();
    public void addMailInfo(MailInfo mailInfo) {
        this.infos.add(mailInfo);
    }
    public void sendAll() {
        for (MailInfo mail: this.infos){
            new MailSender(mail).sentMail();
        }
    }
}
