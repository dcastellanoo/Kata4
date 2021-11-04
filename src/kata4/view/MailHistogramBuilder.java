package kata4.view;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;

public class MailHistogramBuilder {
    public static Histogram<String> build(List<Mail> emails){
        Histogram<String> histogram = new Histogram();
        for (Mail email : emails) {
            histogram.increment(email.getDomain());
        }
        return histogram;
    }
}
