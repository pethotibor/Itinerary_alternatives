/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.nye.algoritmusok_tervezese.Itinerary_alternatives.database_models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author x
 */
@Entity
public class Continets {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "regionid")
	private int regionId;
	@Column(name = "settelmentnumber")
	private int settelmentNumber;
        
	protected Continets() {
    
	}
        
        public Continets(String name, int regionId) {
            this.name = name;
            this.regionId = regionId;
        }
	@Override
	public String toString() {
		return "Még nincs";
	}
}
