package com.xx.demo.lianXi;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;


import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import static jdk.nashorn.internal.objects.Global.undefined;

/**
 * @author ssss
 * @date 2022/1/26 11:35
 */
public class SendEmail extends Authenticator
{
    public static String myEmailSMTPHost = "@qq.com";
    private static String sendAccount = "";
    private static String pa = "";
    private static String receiveAccount = "***@163.com";
    public static void main(String[] args) throws MessagingException, UnsupportedEncodingException {

        Properties props = new Properties();
        props.setProperty("mail.transport.protocol", "smtp");//使用协议
        props.setProperty("mail.smtp.host", myEmailSMTPHost);//发件人邮箱服务地址
        props.setProperty("mail.smtp.auth", "true");//需要请求认证
        props.setProperty("mail.smtp.port", "465");//ssl端口
        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.socketFactory.port", "465");
        Session session = Session.getInstance(props,new SendEmail());
        session.setDebug(true);
        MimeMessage mime = createMimeMessage(session, sendAccount, receiveAccount);
        Transport transport = session.getTransport();//根据session获得邮件传输对象
        transport.connect(sendAccount, pa);
        transport.send(mime, mime.getAllRecipients());
        transport.close();
    }

    private static MimeMessage createMimeMessage(Session session,String sendAccount,String receiveAccount) throws MessagingException, UnsupportedEncodingException{
        MimeMessage mime = new MimeMessage(session);
//        mime.setFrom(sendAccount);
        mime.setRecipient(RecipientType.TO, new InternetAddress(receiveAccount,"hello","UTF-8"));
        mime.setSubject("hello","UTF-8");
        mime.setContent("test mail", "text/html; charset=UTF-8");
        mime.setSentDate(new Date());
        mime.saveChanges();
        return mime;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        String username = "***@163.com";
        String pa = "*****";
        if(username != null && username.length()>0 && pa != null && pa.length()>0){
            return new PasswordAuthentication(username, pa);
        }
        return null;
    }
}