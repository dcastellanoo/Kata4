package kata4;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class KATA4 {

    public static void main(String[] args) {
        String filename = "email.txt";
        List<Mail> mailList = MailListReader.read(filename);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        
        HistogramDisplay histo = new HistogramDisplay("Histograma", histogram);
        histo.execute();
    }
    
}
