
import entidades.Provincia;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lourdes
 */
public class ConsultaProvincias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("AppAgendaPU");
        EntityManager em = emf.createEntityManager();
        
        Query queryProvincias = em.createNamedQuery("Provincia.findAll");
        List<Provincia> listProvincias = queryProvincias.getResultList();
        /*for(Provincia provincia : listProvincias)
        {
            System.out.println(provincia.getNombre());
        }*/
        
        /*for(int i=0;i<listProvincias.size();i++)
        {
            Provincia provincia=listProvincias.get(i);
            System.out.println(provincia.getNombre());
        }*/
        
        
        /*Query queryProvinciaCadiz = em.createNamedQuery("Provincia.findByNombre");
        queryProvinciaCadiz.setParameter("nombre", "Cádiz");
        List<Provincia> listProvinciasCadiz =queryProvinciaCadiz.getResultList();
        for(Provincia provinciaCadiz:listProvinciasCadiz)
        {
            System.out.println(provinciaCadiz.getId()+":");
            System.out.println(provinciaCadiz.getNombre());
        }*/
        
        
       
        /*Provincia provinciaId2 = em.find(Provincia.class,2);
        if (provinciaId2 != null)
        {
            System.out.print(provinciaId2.getId() + ":");
            System.out.println(provinciaId2.getNombre());
        } else 
        {
            System.out.println("No hay ninguna provincia con ID=2");
        }*/

        
        /*Query queryProvinciaCadiz = em.createNamedQuery("Provincia.findByNombre");
        queryProvinciaCadiz.setParameter("nombre", "Cádiz");
        List<Provincia> listProvinciasCadiz =queryProvinciaCadiz.getResultList();
        em.getTransaction().begin();
        for(Provincia provinciaCadiz : listProvinciasCadiz)
        {
            provinciaCadiz.setCodigo("CA");
            em.merge(provinciaCadiz);
        }
        em.getTransaction().commit();*/
        
        //Eliminar un determinado objeto de la lista
        /*Provincia provinciaId15 = em.find(Provincia.class, 15);
        em.getTransaction().begin();
        if (provinciaId15 != null)
        {
            em.remove(provinciaId15);
        }else{
            System.out.println("No hay ninguna provincia con ID=15");
        }
        em.getTransaction().commit();
        */
    }
    
}
