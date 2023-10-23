package test;

import dao.IDao;
import entities.Machine; 
import entities.Salle;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.MachineService;
import service.SalleService;
import util.HibernateUtil;

public class Test {
    public static void main(String[] args) {
        try {
            IDao<Machine> dao = new MachineService();
            IDao<Salle> dao1 = new SalleService();
            
           // dao.create(new Machine("ER44", "HP", 1000));
            //dao.create(new Machine("ER46", "LENOVO", 5000));
            //dao.create(new Machine("ER48", "HP", 5000));
            dao1.create(new Salle("Salle1"));
            dao1.create(new Salle("Salle2"));
            dao1.create(new Salle("Salle3"));
            for (Machine m : dao.findAll()) {
                System.out.println(m);
            }
            for(Salle s : dao1.findAll())
            System.out.println(s);
            
        } catch (Exception ex) { // Utilisation d'une exception plus générale pour l'exemple
        Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
