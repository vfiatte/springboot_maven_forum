/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.entity.Sujet;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author admin
 */
public interface SujetService extends CrudRepository<Sujet, Long>{
    
    public Iterable<Sujet> findAllByTitre(String titre);
}
