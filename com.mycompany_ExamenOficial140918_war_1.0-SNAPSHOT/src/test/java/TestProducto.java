import com.mycompany.modell.Producto;
import com.mycompany.controllerimpl.VentaCtrlImpl;
import java.util.ArrayList;
import com.mycompany.dao.ProductoDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANDY
 */
public class TestProducto {
static ArrayList<Producto> list = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoDAO perdao;
        perdao = new VentaCtrlImpl();
//        list = catdao.readCategoria();
//        for(Categoria item: list){
//            System.out.println(""+item.getName_cat());
//        }
        Producto per = new Producto(); 
        per.setFirst_name("nel");
        per.setLast_name("sol");
        per.setDni("12345879");
        per.setId_persona("7");
        
        if(perdao.createPersona(per)){
           System.out.println("insertado");
        }else{
            System.out.println("error al momento de insertar");
        }
    }
    
}
