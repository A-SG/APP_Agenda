/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appagenda;

import entidades.Provincia;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Alejandro
 */
public class AppAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AppAgendaPU");
        EntityManager em = emf.createEntityManager();
        
        Provincia provinciaSevilla = new Provincia();
        provinciaSevilla.setNombre("Sevilla");
        
        em.getTransaction().begin();
        em.persist(provinciaSevilla);
        em.getTransaction().commit();
      
    em.close();
    emf.close();
    try{
        DriverManager.getConnection("jdbc:derby:BDAgenda;shutdown=true");
    } catch (SQLException ex){
        }
    }
    
}
