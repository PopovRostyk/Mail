package Mail;

import java.text.MessageFormat;

public enum MailCode {
    GREET, SPAM, WORK;
    public MessageFormat testString() {
        switch (this) {
            case GREET:
                MessageFormat greetMail = new MessageFormat("Dear {0} {1}, \n my greetings.");
            return greetMail;
            case SPAM:
                MessageFormat spamMail = new MessageFormat("Dear {0} {1}, \n please buy.");
                return spamMail;
            case WORK:
                MessageFormat workMail = new MessageFormat("Dear {0} {1}, \n this is your salary.");
                return workMail;
            default: MessageFormat out = new MessageFormat("Dear {0} {1}, \n this is random mail.");
                return out;
        }
    }
}
