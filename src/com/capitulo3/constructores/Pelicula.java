<<<<<<< HEAD


package com.capitulo3.constructores;


public class Pelicula {
    private String Titulo;
    private int Duracion;

    public Pelicula() {
    }



    public Pelicula(String Titulo, int Duracion) {
        this.Titulo = Titulo;
        this.Duracion = Duracion;
    }
   
    

   public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }
    
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.capitulo3.constructores;


public class Pelicula {
   private String titulo;
   private int duracion;

    public Pelicula() {
    }

    public Pelicula(int duracion) {
        this.duracion = duracion;
    }

    public Pelicula(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }
 
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
>>>>>>> origin/master
}
