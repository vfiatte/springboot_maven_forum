/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import java.util.Date;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service("log-jpa")
public class LoggerjpaImpl implements LoggerService{
     public void log(){
        System.out.println(new Date() + " : Ecriture dans la base de donnée");
    }
}
