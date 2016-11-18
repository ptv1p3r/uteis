package pt.ismat.poo.proldan.fichas.classeuteis;

/**
 * @author Pedro Roldan on 18-11-2016.
 * @version 0.0
 */
public class Inteiro {

    private Integer intValor;

    /**
     * Construtor que recebe um valor int
     * @param valor
     */
    public Inteiro(int valor) {
        this.intValor = new Integer(valor);
    }

    /**
     * Override ao metodo string
     * @return
     */
    @Override
    public String toString() {
        return this.intValor.toString();
    }

    /**
     * retorna valor do objecto em int
     * @return int
     */
    public int toInt(){
        return this.intValor.intValue();
    }

    /**
     * somar com outro inteiro
     * @param valor
     * @return resultado
     */
    public Inteiro somaCom(Inteiro valor){

        Inteiro resultado = new Inteiro(this.intValor.intValue() + valor.intValor.intValue()) ;

        return resultado;
    }

    /**
     * multiplica por outro inteiro
     * @param valor
     * @return resultado
     */
    public Inteiro multiplicaCom(Inteiro valor){

        Inteiro resultado = new Inteiro(this.intValor.intValue() * valor.intValor.intValue()) ;

        return resultado;
    }

    /**
     * divide valor com outro inteiro
     * @param valor
     * @return
     */
    public Inteiro divideCom(Inteiro valor){

        Inteiro resultado = new Inteiro(this.intValor.intValue() / valor.intValor.intValue()) ;

        return resultado;
    }

    /**
     * subtração com outro inteiro
     * @param valor
     * @return
     */
    public Inteiro subtraiCom(Inteiro valor){

        Inteiro resultado = new Inteiro(this.intValor.intValue() - valor.intValor.intValue()) ;

        return resultado;
    }

    /**
     * incrementa o valor com inteiro
     * @param valor
     */
    public void incrementaEm(Inteiro valor){
        this.intValor += valor.intValor;
    }

    /**
     * decrementa o valor com o inteiro
     * @param valor
     */
    public void decrementaEm(Inteiro valor){
        this.intValor -= valor.intValor;
    }

    /**
     * multiplica o valor em inteiro
     * @param valor
     */
    public void multiplicaEm(Inteiro valor){
        this.intValor *= valor.intValor;
    }

    /**
     * divide o valor em inteiro
     * @param valor
     */
    public void divideEm(Inteiro valor){
        this.intValor /= valor.intValor;
    }

    /**
     * incrementa o valor com int
     * @param valor
     */
    public void incrementaEm(int valor){
        this.intValor += new Integer(valor);
    }

    /**
     * decrementa o valor em int
     * @param valor
     */
    public void decrementaEm(int valor){
        this.intValor -= new Integer(valor);
    }

    /**
     * multiplica o valor em int
     * @param valor
     */
    public void multiplicaEm(int valor){
        this.intValor *= new Integer(valor);
    }

    /**
     * divide valor em inteiro
     * @param valor
     */
    public void divideEm(int valor){
        this.intValor /= new Integer(valor);
    }

    /**
     * compara valores entre inteiros
     * @param valor
     * @return boolean
     */
    public boolean igualA(Inteiro valor){
        if (this.intValor.intValue() == valor.intValor.intValue()){
            return true;
        }
        return false;
    }

    /**
     * compara valores entre inteiros e retorna -1,0,1 consoante seja inferior,igual ou superior
     * @param valor
     * @return int
     */
    public int comparaCom(Inteiro valor){
        if (this.intValor.intValue() == valor.intValor.intValue()){
            return 0;
        } else if (this.intValor.intValue() < valor.intValor.intValue()) {
            return -1;
        } else {
            return 1;
        }
    }

}
