/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.nye.algoritmusok_tervezese.Itinerary_alternatives;

/**
 *
 * @author x
 */
class cityData {
   
    public int id;
    public static String fromCity;
    public static String toCity;
    public int transferCount;
    public int time;

    public cityData() {
        
    }
 
    public void setup(int id1, String from, String to, int tc, int time) {
        this.id = id1;
        this.fromCity = from;
        this.toCity = to;
        this.transferCount = tc;
        this.time = time;
    }
    
    public cityData setup_now(int id1, String from, String to, int tc, int time) {
        cityData data = new cityData();
        data.setup(id1, from, to, tc, time);
        return data;
    }
}
