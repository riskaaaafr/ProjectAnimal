package pojo;
// Generated Oct 21, 2020 2:52:16 AM by Hibernate Tools 4.3.1

import dao.DAOContact;
import java.util.List;
import javax.faces.bean.ManagedBean;




/**
 * Contact generated by hbm2java
 */
@ManagedBean
public class Contact  implements java.io.Serializable {


     private int idContact;
     private String email;
     private String pesan;
     private String nama;

    public Contact() {
    }

    public Contact(int idContact, String email, String pesan, String nama) {
       this.idContact = idContact;
       this.email = email;
       this.pesan = pesan;
       this.nama = nama;
    }
   
    public int getIdContact() {
        return this.idContact;
    }
    
    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPesan() {
        return this.pesan;
    }
    
    public void setPesan(String pesan) {
        this.pesan = pesan;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void save() 
    {
        DAOContact cdao = new DAOContact();
        cdao.addContact(this);
    }
     
      public List<Contact> getallrecords(){
        DAOContact kontak = new DAOContact();
        List<Contact> con = kontak.lihatdata();
        return con;
    }
      
    public String getbyid(){
        DAOContact cont = new DAOContact();
        List<Contact> lat = cont.cari(idContact);
        if(lat != null){
            email = lat.get(0).email;
                pesan = lat.get(0).pesan;
                nama = lat.get(0).nama;
        return "Contact2";
    }
    return "Contact2";
}
    public void update(){
        DAOContact a = new DAOContact();
        a.ubah(this);
        
        pesan="";
        email="";
        nama="";
    }
    
    public void delete(){
        DAOContact a = new DAOContact();
        a.deleteContact(idContact);
        email="";
        pesan="";
        nama="";
    }
}


