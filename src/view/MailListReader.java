/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Mail;

public class MailListReader {

    public static List<Mail> read(String fileName) throws FileNotFoundException, IOException {
        List<Mail> mailsList = new ArrayList();
        
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        //br.readLine().matches("([A-Za-z0-9]+)@([a-z]+\\.)+([a-z]+)")
        String line;
        while((line = br.readLine()) != null) {
            if(line.matches(".+@(.+\\.).+")){
                mailsList.add(new Mail(line));
            }
        }
        return mailsList;
    }
}
