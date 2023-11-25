/*
* File: App.java
* Author: Kurucz János
* Copyright: 2023, Kurucz János
* Group: Szoft II/1/E
* Date: 2023-11-25
* Github: https://github.com/KuruczJanos/Dolgozat20231123ASZTALI.git
* Licenc: GNU GPL
*/
public class App {
    public static void main(String[] args) throws Exception{
        System.out.println("Dolgozat20231123 Interfész megvalósítása");
        Controller D1 = new Controller();
        D1.start();
        D1.stop();
        D1.restart();
    }
}
