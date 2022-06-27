/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.nye.algoritmusok_tervezese.Itinerary_alternatives;

import hu.nye.algoritmusok_tervezese.Itinerary_alternatives.database_models.Settelments;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author x
 */
public interface SettelmentsInterface extends CrudRepository<Settelments, Long> {
    
}
