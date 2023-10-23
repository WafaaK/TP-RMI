package clientrmi2;

import dao.IDao;
import entities.Machine;
import entities.Salle;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Clientrmi2 {
    public static void main(String[] args) {
        try {
            IDao<Machine> dao = (IDao<Machine>) Naming.lookup("rmi://localhost:1099/dao");
            IDao<Salle> dao1 = (IDao<Salle>) Naming.lookup("rmi://localhost:1099/dao1");
            dao.create(new Machine("ER44", "HP", 1000));
            dao.create(new Machine("ER46", "LENOVO", 5000));
            dao.create(new Machine("ER48", "HP", 5000));
            
            dao1.create(new Salle("Salle1"));
            dao1.create(new Salle("Salle2"));
            dao1.create(new Salle("Salle3"));
            
            for (Machine m : dao.findAll()) {
                System.out.println(m);
            }
        } catch (NotBoundException ex) {
            Logger.getLogger(Clientrmi2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Clientrmi2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Clientrmi2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
