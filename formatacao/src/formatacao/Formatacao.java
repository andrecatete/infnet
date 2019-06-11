package formatacao;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Formatacao {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.forLanguageTag("pt-br"));
        
        NumberFormat a = NumberFormat.getCurrencyInstance();
        NumberFormat b = NumberFormat.getNumberInstance();
        NumberFormat c = NumberFormat.getPercentInstance();
        
        String saida1 = a.format(100.90);
        System.out.println(saida1);
        
        String saida2 = b.format(100.90);
        System.out.println(saida1);
        
        String saida3 = c.format(100.90);
        System.out.println(saida3);
        
        DateFormat d = DateFormat.getDateInstance();
        DateFormat e = DateFormat.getTimeInstance();
        DateFormat f = DateFormat.getDateTimeInstance();
        
        Date hoje = new Date();
        Date ontem = new Date(hoje.getTime() - (1000*60*60*24));
        Calendar ca = Calendar.getInstance();
        ca.set(2019, 5, 7);
        Date anteontem = ca.getTime();
        
        String saida4 = d.format(hoje);
    }
    
}
