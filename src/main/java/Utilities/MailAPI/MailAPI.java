/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities.MailAPI;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Cuack
 */
public class MailAPI{
    public static void enviarMail(String correoEnviador, String codigo, String destinatario, String subject, String text) throws Exception{
        Properties propiedades = new Properties();
        propiedades.put("mail.smtp.auth", "true");
        propiedades.put("mail.smtp.starttls.enable","true");
        propiedades.put("mail.smtp.host", "smtp.gmail.com");
        propiedades.put("mail.smtp.port", "587");
        
        Session sesionIniciada = Session.getInstance(propiedades, new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(correoEnviador,codigo);
            }
        });
        
        Message mensaje = prepararMensaje(sesionIniciada,correoEnviador,destinatario,subject,text);
        Transport.send(mensaje);
        JOptionPane.showMessageDialog(null, "Mensaje enviado satisfactoriamente");
    }
    
    private static Message prepararMensaje(Session sesion, String miCuentaEmail, String destinatario, String subject, String text){
        try {
            Message mensaje = new MimeMessage(sesion);
            mensaje.setFrom(new InternetAddress(miCuentaEmail));
            mensaje.setRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            mensaje.setSubject(subject);
            mensaje.setText(text);
            return mensaje;
        } catch (Exception ex) {
            Logger.getLogger(MailAPI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}