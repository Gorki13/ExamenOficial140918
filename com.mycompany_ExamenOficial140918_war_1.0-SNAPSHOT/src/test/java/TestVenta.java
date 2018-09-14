import com.mycompany.modell.Venta;
import com.mycompany.controllerimpl.VentaCtrlImpl;
import java.util.ArrayList;
import com.mycompany.dao.VentaDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *
 */
public class TestVenta {
static ArrayList<Venta> list = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentaDAO vendao;
        vendao = new VentaCtrlImpl();
//        list = catdao.readCategoria();
//        for(Categoria item: list){
//            System.out.println(""+item.getName_cat());
//        }
        Venta ven = new Venta(); 
        ven.setId_venta("2");
        ven.setFecha("14/09/18");
        ven.setConcepto("compra");
        ven.setIgv("8");
        ven.setTotal("150");
        ven.setSub_total("200");
        ven.setId_cliente_direccion("1");
        ven.setId_vendedor("3");
        
        if(vendao.createVenta(ven)){
           System.out.println("Usuario insertado");
        }else{
            System.out.println("error al momento de insertar venuario");
        }
    }
    
}
