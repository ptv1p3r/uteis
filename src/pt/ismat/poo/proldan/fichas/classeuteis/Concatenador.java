package pt.ismat.poo.proldan.fichas.classeuteis;

import java.util.ArrayList;

/**
 * @author Pedro Roldan on 18-11-2016.
 * @version 0.0
 */
public class Concatenador {

    private ArrayList<Inteiro> arrInteiros;

    public Concatenador(ArrayList<Inteiro> Inteiros) {
        this.arrInteiros = (ArrayList<Inteiro>) Inteiros.clone();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i=0; i< this.arrInteiros.size();i++){
            sb.append(this.arrInteiros.get(i).toString() + " ");
        }

        return sb.toString();
    }
}
