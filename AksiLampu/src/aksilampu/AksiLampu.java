/*
Mutiara Dolla M. | 4405 | A11.2021.13745
*/
package aksilampu;

class lampu{
    //atribut
    boolean nyala;
    
    //method
    void nyalakanLampu(){
        nyala = true;
    }
    void matikanLampu(){
        nyala = false;
    }
}

public class AksiLampu {

    public static void main(String[] args) {
        //membuat objek
        lampu lampu1 = new lampu();
        lampu1.nyalakanLampu();
        System.out.println("Apakah lampu menyala?"+lampu1.nyala);
        lampu1.matikanLampu();
        System.out.println("Apakah lampu menyala?"+lampu1.nyala);
    }
    
}
