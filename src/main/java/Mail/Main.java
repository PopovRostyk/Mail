package Mail;

public class Main {
    public static void main(String[] args) {
        Client clientOne = new Client("Kostyan", 19, "male");
        Client clientTwo = new Client("Rostyk", 19, "male");
        Client clientThree = new Client("Ka4ka", 19, "female");
        MailInfo mailinfoOne = new MailInfo(clientOne, MailCode.GREET);
        MailInfo mailinfoTwo = new MailInfo(clientTwo, MailCode.SPAM);
        MailInfo mailinfoThree = new MailInfo(clientThree, MailCode.WORK);
        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(mailinfoOne);
        mailBox.addMailInfo(mailinfoTwo);
        mailBox.addMailInfo(mailinfoThree);
        mailBox.sendAll();
    }
}
