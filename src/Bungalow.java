
public class Bungalow extends Parcela{
    
    int numAdultos;

    public Bungalow(int aux) {
        super(aux);
    }
    public void numAdultos (int numAd){
        this.numAdultos = numAd;
    }
    @Override
    public double checkOut(Parametros param) {
        ocupada = false;
        return coste = numAdultos * param.C_ADULTO_BUNGALOW * dias;
    }
    
}
