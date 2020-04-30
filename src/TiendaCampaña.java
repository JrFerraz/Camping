
public class TiendaCampaña extends Parcela{
    
    int costeTienda;
    int costeElectricidad; 

    public TiendaCampaña(int aux, Parametros param) {
        super(aux);
        this.costeTienda = param.COST_TIENDA;
        this.costeElectricidad = param.COST_ELECT;
    }

    

    @Override
    public double checkOut(Parametros param) {
        ocupada = false;
        coste = (costeTienda * dias)+(costeElectricidad * dias);
        if(dias >=7 ){
            coste = coste * param.DESCUENTO_TIENDA;
        }
        return coste;
    }
    
}
