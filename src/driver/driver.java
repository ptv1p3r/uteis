package driver;

import pt.ismat.poo.proldan.fichas.classeuteis.Concatenador;
import pt.ismat.poo.proldan.fichas.classeuteis.DataBasica;
import pt.ismat.poo.proldan.fichas.classeuteis.Inteiro;

import java.util.ArrayList;

/**
 * @author Pedro Roldan on 18-11-2016.
 * @version 0.0
 */
public class driver {

    public static void main(String[] args){
        Inteiro m = new Inteiro(10);
        Inteiro x = new Inteiro(20);
        Inteiro r;
        ArrayList<Inteiro> arrInt = new ArrayList<>();

        arrInt.add(m);
        arrInt.add(x);

        r = m.somaCom(x);

        System.out.print("m: " + m + "\n");
        System.out.print("Resultado m+x: " + r + "\n");

        //m.incrementaEm(x);
        //m.incrementaEm(15);
        System.out.print("m: " + m + "\n");
        System.out.print("x: " + x + "\n");

        System.out.print("m=x: " + m.igualA(x) + "\n");
        System.out.print("m<=>x: " + m.comparaCom(x) + "\n");

        int w = m.toInt();
        System.out.print("w: " + w + "\n");

        System.out.print("concatenador: " + new Concatenador(arrInt) + "\n");


        DataBasica db = new DataBasica(28,2,1975);
        System.out.print("data: " + db.getAsString() + "\n");
        System.out.print("data dia seguinte: " + db.nextDay() + "\n");

    }

}
