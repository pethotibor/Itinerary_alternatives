/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.nye.algoritmusok_tervezese.Itinerary_alternatives.database_models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author x
 */
public class ContinetsModel {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "regionId")
	private int regionId;
	@Column(name = "settelmentNumber")
	private int settelmentNumber;
        
	public ContinetsModel() {
    
	}
	@Override
	public String toString() {
		return "Még nincs";
	}
}
