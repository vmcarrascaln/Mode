/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mode;

/**
 *
 * @author Estudiante
 */
public class Scientist {
    private Mode mode;
    public Scientist(){
        mode = new WriteMode(); /*default mode*/
    }
    // what scientist does
    public void doing(){ mode.work();}
    public void drink() { mode.drink();}
    
    // change modes methods
    public void setWrite() { mode = new WriteMode();}
    public void setTeach() {mode = new TeachMode();}
    public void setAdministrate() { mode = new AdmMode();}
    
            
    public static void main(String[] args) {
        Scientist einstein = new Scientist();
        einstein.doing();
        einstein.setTeach();
        einstein.doing();
        einstein.drink();
        einstein.setAdministrate();
        einstein.doing();
        einstein.drink();
        
    }
    
}
