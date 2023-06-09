package org.geekster;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class CustomizedMailAuthentication extends Authenticator {

    protected PasswordAuthentication getPasswordAuthentication()
    {
        return new PasswordAuthentication(MailMetaData.myUserMail,MailMetaData.password);
    }
}
