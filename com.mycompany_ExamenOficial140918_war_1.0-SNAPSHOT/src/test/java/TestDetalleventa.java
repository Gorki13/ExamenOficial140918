import com.mycompany.modell.Deatalleventa;
import com.mycompany.controllerimpl.ProductoCtrlImpl;
import java.util.ArrayList;
import com.mycompany.dao.DetalleventaDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANDY
 */
public class TestDetalleventa {
static ArrayList<Deatalleventa> list = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DetalleventaDAO catdao;
        catdao = new ProductoCtrlImpl();
//        list = catdao.readCategoria();
//        for(Categoria item: list){
//            System.out.println(""+item.getName_cat());
//        }
        Deatalleventa cat = new Deatalleventa(); 
        cat.setId_categoria("9");
        cat.setName_cat("loco");
        cat.setEstado("1");
        if(catdao.createCategoria(cat)){
           System.out.println("insertar");
        }else{
            System.out.println("error al momento de insertar");
        }
    }
    
}
