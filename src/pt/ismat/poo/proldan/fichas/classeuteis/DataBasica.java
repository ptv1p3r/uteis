package pt.ismat.poo.proldan.fichas.classeuteis;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * @author Pedro Roldan on 18-11-2016.
 * @version 0.0
 */
public class DataBasica {

    private Date dataCorrente;

    /**
     * construtor por omissao inicializa com data corrente
     */
    public DataBasica() {
        this.dataCorrente = new Date();
    }

    /**
     * construtor que recebe dia mes e ano como int
     * @param dia
     * @param mes
     * @param ano
     */
    public DataBasica(int dia, int mes, int ano) {
        GregorianCalendar gc = new GregorianCalendar(ano,mes-1,dia);
        this.dataCorrente = gc.getTime();
    }

    /**
     * retorna string de data do objecto formatado
     * @return String
     */
    public String getAsString() {
        Locale lc = new Locale("pt", "PT");
        SimpleDateFormat sdf = new SimpleDateFormat("d 'de' MMMM 'de' yyyy",lc);
        return sdf.format(this.dataCorrente);
    }

    public String nextDay(){
        Locale lc = new Locale("pt", "PT");
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(this.dataCorrente);
        gc.add(GregorianCalendar.DATE,1);

        SimpleDateFormat sdf = new SimpleDateFormat("d 'de' MMMM 'de' yyyy",lc);
        return sdf.format(gc.getTime());
    }
}
