/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.nye.algoritmusok_tervezese.Itinerary_alternatives;

import hu.nye.algoritmusok_tervezese.Itinerary_alternatives.database_models.ContinetsModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author x
 */
public interface ContinentsTable extends JpaRepository<ContinetsModel, Long> {
    
}
