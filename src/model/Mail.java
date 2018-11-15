/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Usuario
 */
public class Mail {
    private String mail;
    
    public Mail(String mail) {
        this.mail = mail;
    }
    
    public String getDomain() {
        
        String domain = ""; 
        /**Pattern pattern = Pattern.compile("([a-z]+\\.)+([a-z]+)");
        Matcher matcher = pattern.matcher(mail);
        
        if(matcher.find()) {
            return matcher.group();
        }*/
        
        return mail.substring(mail.indexOf('@')+1);
    }
}
