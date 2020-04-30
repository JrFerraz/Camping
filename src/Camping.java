
import java.util.ArrayList;


public class Camping {
   
    ArrayList ArrayParcelas;
    
    public Camping() {
        Parametros param = new Parametros ();
        this.ArrayParcelas = new ArrayList <> ();
        for (int i = 0; i < 20; i++) {
            int aux = (int) (Math.random()*3);
            switch (aux) {
                case 0:
                    {
                        Parcela miParcela = new TiendaCampaña (aux, param);
                        ArrayParcelas.add(miParcela);
                        break;
                    }
                case 1:
                    {
                        Parcela miParcela = new Bungalow (aux);
                        ArrayParcelas.add(miParcela);
                        break;
                    }
                default:
                    {
                        Parcela miParcela = new Caravana (aux);
                        ArrayParcelas.add(miParcela);
                        break;
                    }
            }
    }
    
}
}
