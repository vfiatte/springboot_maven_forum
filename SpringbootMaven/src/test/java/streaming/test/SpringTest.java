/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import forum.service.LoggerServiceConsoleImpl;
import forum.service.SecurityService;
import forum.service.SecurityServiceJpaImpl;
import forum.service.SecurityServiceMock;
import forum.service.deuxService;
import forum.service.unService;
import forum.spring.SpringConfig;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author ETY
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=SpringConfig.class)//configure spring a partir d'une classe de configuration
public class SpringTest {
    
    @PersistenceContext
    private EntityManager em;
    
    
    @Autowired
    private LoggerServiceConsoleImpl l1;
    
    @Autowired
    private LoggerServiceConsoleImpl l2;
           
    @Autowired
    @Qualifier("security-console")
    private SecurityService sec;
    
    @Test
    public void doNadaOK(){
        Assert.assertTrue(l1 == l2);
    }
    
}
