/*
* File: Controller.java
* Author: Kurucz János
* Copyright: 2023, Kurucz János
* Group: Szoft II/1/E
* Date: 2023-11-25
* Github: https://github.com/KuruczJanos/Dolgozat20231123ASZTALI.git
* Licenc: GNU GPL
*/
public class Controller implements Controllable{
    @Override
    public void start () {
        System.out.println("Interfész Start Metódus funkció helye");
    }
    @Override
    public void stop() {
        System.out.println("Interfész Stop Metódus funkció helye");
    }
    @Override
    public void restart() {
        System.out.println("Interfész Restart Metódus funkció helye");
    };
}
