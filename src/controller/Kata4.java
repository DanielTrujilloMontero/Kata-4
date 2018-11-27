/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

/**
 *
 * @author Daniel
 */
public class Kata4 {

    private String fileName;
    private List<Mail> mailsList;
    private Histogram<String> histogram;
    private HistogramDisplay histogramDisplay;
    
    public static void main(String[] args) throws IOException {
       Kata4 kata4 = new Kata4("email.txt");
       kata4.execute();
    }
    
    public Kata4(String fileName) {
        this.fileName = fileName;
    }
    
    private void input() throws IOException {
        mailsList = MailListReader.read(fileName);
    }
    
    private void process() {
        histogram = MailHistogramBuilder.build(mailsList);
    }
    
    private void output() {
        histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }
    
    private void execute() throws IOException {
        input();
        process();
        output();
    }
    
}
