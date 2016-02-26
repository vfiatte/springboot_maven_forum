/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import java.util.Date;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service("log-console")
@Scope("prototype")
public class LoggerServiceConsoleImpl implements LoggerService{
    
    public void log(){
        System.out.println(new Date() + " : Ecriture dans la console");
    }
}
