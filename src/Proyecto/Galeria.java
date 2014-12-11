/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;
import java.util.ArrayList;
/**
 *
 * @author Jorge Luis
 */
public class Galeria {
    ArrayList<Imagensita> imagenes;

    public Galeria() {
        imagenes= new ArrayList<Imagensita>();
        Imagensita i1=new Imagensita();
        i1.setUrl("/Proyecto/4.png");
        i1.setTitulo("Au revoir!!");
        i1.setDescripcion("Cancion mas exitosa de Carlos Sadness");
        
        Imagensita i2=new Imagensita();
        i2.setUrl("/Proyecto/1.png");
        i2.setTitulo("Siempre esperandote");
        i2.setDescripcion("Tema numero 12 de su disco Ciencias Celestes");
        
        Imagensita i3=new Imagensita();
        i3.setUrl("/Proyecto/2.png");
        i3.setTitulo("Monteperdido");
        i3.setDescripcion("Ultimo disco de Carlos Sadness");
        
        Imagensita i4=new Imagensita();
        i4.setUrl("/Proyecto/3.png");
        i4.setTitulo("Au revoir!!");
        i4.setDescripcion("Cancion mas exitosa de Carlos Sadness");
        
        Imagensita i5=new Imagensita();
        i5.setUrl("/Proyecto/5.png");
        i5.setTitulo("Au revoir!!");
        i5.setDescripcion("Imagen del tema Au Revoir");
    
     imagenes.add(i1);
               
        imagenes.add(i2);
        imagenes.add(i3);
        imagenes.add(i4);
        imagenes.add(i5);
    
    }

    public ArrayList<Imagensita> leerTodas() {
        return imagenes;
    }

    public void setImagenes(ArrayList<Imagensita> imagenes) {
        this.imagenes = imagenes;
    }
    
}
