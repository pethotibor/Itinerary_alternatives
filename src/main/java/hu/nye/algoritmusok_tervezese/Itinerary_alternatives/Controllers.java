/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.nye.algoritmusok_tervezese.Itinerary_alternatives;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author x
 */

@Controller
public class Controllers {
   
    
       @GetMapping("/continents")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "continents";
	}

        @GetMapping("/routes")
	public String routes_search(@RequestParam(name="honnan", required=false, defaultValue="World") String honnan,
                                    @RequestParam(name="hova", required=false, defaultValue="World") String hova
                , Model model) {

                ArrayList<cityData> cityData1 = new ArrayList<>();
                cityData data = new cityData();
                data.fromCity = honnan;
                data.toCity = hova;
                cityData1.add(new cityData());
                model.addAttribute("cityData", cityData1);
                
		return "routes";
	}
        
        @RequestMapping("/{id}")
	public String default_mapping(@PathVariable("id") String id, Model model) {
		model.addAttribute("id", id);
		return id;
	}
    
}