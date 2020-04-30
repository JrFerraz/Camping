
import java.time.LocalDate;
import java.time.Month;


public class Caravana extends Parcela{
    
    Month mesActual;

    public Caravana(int aux) {
        super(aux);
        this.mesActual = LocalDate.now().getMonth();
    }

    

    @Override
    public double checkOut(Parametros param) {
         ocupada = false;
         if(mesActual.getValue() == param.MES_CARAVANA){
             return coste = dias * param.CARAVANA_MES_CRITICO;
         }else{
             return coste = dias * param.CARAVANA_MES_NORMAL;
         }
    }
    
}
