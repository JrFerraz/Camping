
public abstract class Parcela implements iAlquilable{
    
    String [] tiposPosibles = {"TiendaCampaña","Bungalow","Caravana"};
    double coste;
    int dias;
    boolean ocupada;
    String tipo;
    
    Parcela (int aux){
        this.dias = 0;
        this.coste = 0;
        this.ocupada = false;
        this.tipo = tiposPosibles[aux];
    }
    public void datosEstancia (int numDias){
        this.dias = numDias;
    }
    @Override
    public boolean checkIn(String dniHuesped) {
        return ocupada = true;
    }

    @Override
    public double checkOut(Parametros param) {
        ocupada = false;
        return coste;
    }
    
}
