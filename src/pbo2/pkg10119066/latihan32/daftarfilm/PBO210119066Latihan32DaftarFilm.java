/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan32.daftarfilm;

/**
 *
 * @author Neyza-T
 */
public class PBO210119066Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=====Daftar Film Sedang Tayang====");
        System.out.println(" ");
        Film film1 = new Film("Venom", "Action, Horror, Sci-fi", 8.5, 120);
        System.out.println("Judul Film\t : "+film1.getName());
        System.out.println("Genre Film\t :"+film1.getGenre());
        System.out.println("Rating Film\t :"+film1.getRating());
        System.out.println("Duration Film\t :"+film1.getDuration()+" Menit");
        System.out.println(" ");
        Film film2 = new Film("Small Foot", "Action, Horror, Sci-fi", 9.0, 96);
        System.out.println("Judul Film\t : "+film2.getName());
        System.out.println("Genre Film\t :"+film2.getGenre());
        System.out.println("Rating Film\t :"+film2.getRating());
        System.out.println("Duration Film\t :"+film2.getDuration()+" Menit");
        System.out.println(" ");
        Film film3 = new Film("Crazy Rich Asian", "Action, Horror, Sci-fi", 7.8, 119);
        System.out.println("Judul Film\t : "+film3.getName());
        System.out.println("Genre Film\t :"+film3.getGenre());
        System.out.println("Rating Film\t :"+film3.getRating());
        System.out.println("Duration Film\t :"+film3.getDuration()+" Menit");
        System.out.println(" ");
        Film film4 = new Film("Horror", "Action, Horror, Sci-fi", 6.0, 100);
        System.out.println("Judul Film\t : "+film4.getName());
        System.out.println("Genre Film\t :"+film4.getGenre());
        System.out.println("Rating Film\t :"+film4.getRating());
        System.out.println("Duration Film\t :"+film4.getDuration()+" Menit");
        System.out.println(" ");
    }
    
}
