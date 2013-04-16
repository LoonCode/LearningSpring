package com.loon.service.impl;


import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class MailTest {

    public static void main(String[] args) {


        Email email = new SimpleEmail();
        email.setHostName("smtp.163.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("bvnghjfd", "bvnghjfd1"));
        email.setSSLOnConnect(true);
        email.setCharset("UTF-8");
        try {
            email.setFrom("bvnghjfd@163.com");
            email.setSubject("TestMail");
            email.setMsg("This is a test mail ... :-)");
            email.addTo("e1543819@rmqkr.net");
            email.send();
        } catch (EmailException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }
}
