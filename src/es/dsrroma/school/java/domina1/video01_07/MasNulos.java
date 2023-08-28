package es.dsrroma.school.java.domina1.video01_07;
import java.time.LocalDate;
import java.time.Month;

public class MasNulos
{    
    private static String fichaCoche(Coche coche) {
        return "Nacida en " + coche.getPropietaria().getFechaNac().getYear()
            + ", " + coche.getPropietaria().getNombre() 
            + " es titular del coche " + coche.getMatricula() + ".";
    }
    
    public static void main(String[] args) {
        Titular laura = new Titular("Laura", 
            LocalDate.of(1994, Month.JUNE, 30));
        Coche bueno = new Coche("1234 BCD", laura);        
        System.out.println(fichaCoche(bueno));
        
        Coche nulo = null;
//        System.out.println(fichaCoche(nulo));
        
        Coche nuevo = new Coche(null, null);
//        System.out.println(fichaCoche(nuevo));
        
        Coche vendido = new Coche(null, new Titular(null, null));
//        System.out.println(fichaCoche(vendido));
        
        Coche yaSi = new Coche(null, new Titular(null, LocalDate.now()));
        System.out.println(fichaCoche(yaSi));
    }
}

class Titular {
    private String nombre;
    private LocalDate fechaNac;
    
    public Titular(String nombre, LocalDate fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }
    
    public String getNombre() {
        return nombre;
    }
    public LocalDate getFechaNac() {
        return fechaNac;
    }
}

class Coche {
    private String matricula;
    private Titular propietaria;
    
    public Coche(String matr, Titular prop) {
        matricula = matr;
        propietaria = prop;
    }
    
    public String getMatricula() {
        return matricula;
    }
    public Titular getPropietaria() {
        return propietaria;
    }
}
