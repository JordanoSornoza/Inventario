/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author PC-Admin
 */
public class Inventario {

    /**
     * @param args the command line arguments
     */
   
         static Scanner sc = new Scanner(System.in);
    
    static ArrayList<Libro> libros = new ArrayList();
    
    public static void Solicitar(){
        int codigo;
        double precio;
        int cantidad;
        Libro aux;
        int i, n;
        
        do {
            System.out.print("¿Número de libros? ");
            n = sc.nextInt();
        } while (n < 0);
        sc.nextLine();
        
        for (i = 1; i <= n; i++) {
            System.out.println("Libro " + i);
            System.out.print("Codigo: ");
            codigo = sc.nextInt();          
            System.out.print("Precio: ");
            precio = sc.nextDouble();
            System.out.print("Cantidad: ");
            cantidad = sc.nextInt();
            sc.nextLine();
            
            aux = new Libro();
            
            aux.setCodigo(codigo);
            aux.setPrecio(precio);
            aux.setCantidad(cantidad);
            
            libros.add(aux);
        }
    }
    
    public static void Consultar(){
        int codigo;
        System.out.println("\nConsulte un libro del inventario por medio del codigo");
        System.out.print("Introduzca codigo: ");
        codigo = sc.nextInt();
        System.out.println("Libro consultado por el codigo " + codigo);
        for(int i = 0; i < libros.size(); i++){
            if(libros.get(i).getCodigo()== codigo){
                System.out.println(libros.get(i));
                } 
            }           
    }
    
    public static void ActualizarVenta(){
        int codigo; 
        Libro aux;
        int venta=0;
        double pre=0;
        System.out.println("\nConsulte un libro que desee comprar");
        System.out.print("Introduzca el codigo: ");
        codigo = sc.nextInt();
        for(int i = 0; i < libros.size(); i++){
            if(libros.get(i).getCodigo()== codigo){
                pre=libros.get(i).getPrecio();
                aux = new Libro();
                
                if(libros.get(i).getCantidad()>0){
                    venta = libros.get(i).getCantidad();
                    venta--;
                } else if(libros.get(i).getCantidad()==0){
                    venta = libros.get(i).getCantidad();
                    System.out.println("Libro Agotado");
                }

                aux.setCodigo(codigo);
                aux.setPrecio(pre);
                aux.setCantidad(venta);
              
                libros.set(i,aux);
                }
            
            System.out.println(libros.get(i));
    }
        System.out.println("\nInventario Actualizado");
    }
    
    public static void MayoresCosto(){
        Libro mayor1 = libros.get(0);
        Libro mayor2 = libros.get(0);
        Libro mayor3 = libros.get(0);
        for(int i = 0; i < libros.size(); i++){
            if(libros.get(i).getPrecio()> mayor1.getPrecio()){
                mayor1 = libros.get(i);
            }
        }
        for(int i = 0; i < libros.size(); i++){
            if(libros.get(i).getPrecio()< mayor1.getPrecio() && libros.get(i).getPrecio()> mayor2.getPrecio()){
                mayor2 = libros.get(i);
            }
        }
        for(int i = 0; i < libros.size(); i++){
            if(libros.get(i).getPrecio()< mayor1.getPrecio() && libros.get(i).getPrecio()< mayor2.getPrecio() && libros.get(i).getPrecio()> mayor3.getPrecio()){
                mayor3 = libros.get(i);
            }
        }
        System.out.println("\nLos 3 libros mas costosos");
        System.out.println(mayor1);
        System.out.println(mayor2);
        System.out.println(mayor3);
    }
    
    
    public static void main(String[] args) {
       Solicitar();
       Consultar();
       ActualizarVenta();
       MayoresCosto();
    }
    
}
