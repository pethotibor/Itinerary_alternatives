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
public class Settelments {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", updatable = false, nullable = false)
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "countryid")
	private int countryId;
        
	protected Settelments() {
    
	}
        
        public String getname() {
            return name;
        }
        public void setname(String n) {
            name = n;
        }
        
        public Settelments(String name, int countryId) {
            this.name = name;
            this.countryId = countryId;
        }
	@Override
	public String toString() {
		return Long.toString(id)+" "+name+" "+Integer.toString(countryId);
	}
}
