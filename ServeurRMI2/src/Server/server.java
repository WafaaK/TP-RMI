/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import dao.IDao;
import entities.Machine;
import entities.Salle;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.hibernate.annotations.common.util.impl.LoggerFactory.logger;
import service.MachineService;
import service.SalleService;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author hp
 */
public class server {
    public static void main(String[] args) {
      
        try {
            
            
            IDao<Machine> dao = new MachineService();
            LocateRegistry.createRegistry(1099);
            Naming.bind("rmi://localhost:1099/dao",dao);
            
             IDao<Salle> dao1 = new SalleService();
            
            Naming.bind("rmi://localhost:1099/dao1",dao1);
            
            System.out.println("En attente des clients");
        } catch (RemoteException ex) {
            Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
    
}
