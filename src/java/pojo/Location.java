package pojo;
// Generated Oct 21, 2020 2:52:16 AM by Hibernate Tools 4.3.1



/**
 * Location generated by hbm2java
 */
public class Location  implements java.io.Serializable {


     private int kodeLoc;
     private int namaHewan;

    public Location() {
    }

    public Location(int kodeLoc, int namaHewan) {
       this.kodeLoc = kodeLoc;
       this.namaHewan = namaHewan;
    }
   
    public int getKodeLoc() {
        return this.kodeLoc;
    }
    
    public void setKodeLoc(int kodeLoc) {
        this.kodeLoc = kodeLoc;
    }
    public int getNamaHewan() {
        return this.namaHewan;
    }
    
    public void setNamaHewan(int namaHewan) {
        this.namaHewan = namaHewan;
    }




}


