package Mail;

import java.text.MessageFormat;

public enum MailCode {
    GREET, SPAM, WORK;
    public String toString() {
        switch (this) {
            case GREET:
                return "my greetings.";
            case SPAM:
                return "please buy.";
            case WORK:
                return "this is your salary.";
            default:return "this is random mail.";
        }
    }
}
