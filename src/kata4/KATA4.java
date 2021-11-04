package kata4;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class KATA4 {
    private static String filename;
    private static List<Mail> mailList; 
    private static Histogram<String> histogram;
    
    public static void main(String[] args) {
        execute();
    }
    
    public static void execute(){
        input();
        process();
        output();
    }

    private static void input() {
        filename = "email.txt";
        mailList = MailListReader.read(filename);
    }

    private static void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }

    private static void output() {
        HistogramDisplay histo = new HistogramDisplay("Histograma", histogram);
        histo.execute();
    }
    
}
