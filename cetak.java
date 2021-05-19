package PraktikumModul4;
public class cetak {
    public static void main (String [] args ){
        
        OperasiBilangan opbil = new OperasiBilangan();
        opbil.setA(10.5);
        opbil.setB(0.5);
        opbil.setC();
        
        System.out.println("APLIKASI PERHITUNGAN");
        System.out.println("Bilangan A: " + opbil.getA());
        System.out.println("Bilangan B: " + opbil.getB());
        
        opbil.tampil();
        
        penjumlahan jumlah = new penjumlahan();
        jumlah.setA(10.5);
        jumlah.setB(0.5);
        jumlah.setC();
        
        System.out.println("");
        System.out.println("PENJUMLAHAN");
        System.out.println("Bilangan A: " + opbil.getA());
        System.out.println("Bilangan B: " + opbil.getB());
        System.out.println("Bilangan A+B: " + jumlah.getC());
        
        jumlah.tampil();
        
        pengurangan kurang = new pengurangan();
        kurang.setA(10.5);
        kurang.setB(0.5);
        kurang.setC();
        
        System.out.println("");
        System.out.println("PENGURANGAN");
        System.out.println("Bilangan A: " + opbil.getA());
        System.out.println("Bilangan B: " + opbil.getB());
        System.out.println("Bilangan A-B: " + kurang.getC());
        
        kurang.tampil();
        
        perkalian kali = new perkalian();
        kali.setA(10.5);
        kali.setB(0.5);
        kali.setC();
        
        System.out.println("");
        System.out.println("PERKALIAN");
        System.out.println("Bilangan A: " + opbil.getA());
        System.out.println("Bilangan B: " + opbil.getB());
        System.out.println("Bilangan A*B: " + kali.getC());
        
        kali.tampil();
        
        pembagian bagi = new pembagian();
        bagi.setA(10.5);
        bagi.setB(0.5);
        bagi.setC();
        
        System.out.println("");
        System.out.println("PEMBAGIAN");
        System.out.println("Bilangan A: " + opbil.getA());
        System.out.println("Bilangan B: " + opbil.getB());
        System.out.println("Bilangan A-B: " + bagi.getC());
        
        bagi.tampil();
    }   
}