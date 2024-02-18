/*
Mutiara Dolla M. | 4405 | A11.2021.13745
*/
package aksisepeda;

class Sepeda{
    //ini adalah tempat atribut
    int gear = 5;
    int jumlahRoda;
    String jenis;
    String merk;

    //ini adalah tempat method
        
    void ngerem(){
        System.out.println("Sepeda direm");
    }

    //ini adalah tempat konstruktor
    Sepeda(int jumlahRoda, String jenis, String merk){
        System.out.println("Sepeda "+jenis+" bermerk "+merk+" memiliki jumlah roda "+jumlahRoda);
    }
}

public class AksiSepeda {

    public static void main(String[] args) {
        Sepeda sepedaBalap = new Sepeda(2, "Gunung", "Polygon");
        Sepeda sepedaBayi = new Sepeda(3, "Sepeda Bayi", "Miami");

        //mengakses atribut dan method
        int gearSepeda = sepedaBalap.gear;
        System.out.println("Jumlah gear "+gearSepeda);
        sepedaBalap.ngerem();

    }
    
}
