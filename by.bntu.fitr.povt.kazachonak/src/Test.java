
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MaKSim
 */
public class Test {
    public static void main(String[] args) {
        Logger log = Logger.getRootLogger();
        BasicConfigurator.configure();
        
        log.setLevel(Level.INFO);
        
        log.info("sdfnsdkjfnskdjn sdfsdfsdfsd");
        log.trace("sdfnsdkjfnskdjn sdfsdfsdfsd");
        log.debug("sdfnsdkjfnskdjn sdfsdfsdfsd");
    }
}
