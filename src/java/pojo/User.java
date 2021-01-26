package pojo;
// Generated Oct 21, 2020 2:52:16 AM by Hibernate Tools 4.3.1

import dao.DAOUser;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;




/**
 * User generated by hbm2java
 */
@ManagedBean
public class User  implements java.io.Serializable {

    private boolean error = false;
    private String firstName;
     private String lastName;
     private String address;
     private String email;
     private String phone;
     private String username;
     private String password;
     
    public User() {
    }

    public User(String firstName, String lastName, String address, String email, String phone, String username, String password) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.address = address;
       this.email = email;
       this.phone = phone;
       this.username = username;
       this.password = password;
    }
   
  
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String validasiLogin() {
        DAOUser uDao = new DAOUser();
        List<User> us = uDao.getBy(username, password);
        if (us != null){
        firstName = us.get(0).firstName;
        lastName = us.get(0).lastName;
        username = us.get(0).username;
        email = us.get(0).email;
        address = us.get(0).address;
        phone = us.get(0).phone;
        password = us.get(0).password;
            return "Home";
        }
        error = true;
        return "index";

    }
        


    public String getbyid() {
        DAOUser udao = new DAOUser();
        List<User> user1 = udao.getbyid(username);
        firstName = user1.get(0).firstName;
        lastName = user1.get(0).lastName;
        password = user1.get(0).password;
        address = user1.get(0).address;
        email = user1.get(0).email;
        phone = user1.get(0).phone;
        
        return "Home";
    }
    
     
     public void save()
    {
        DAOUser udao = new DAOUser();
        udao.addUser(this);
        firstName ="";
        lastName ="";
        email ="";
        username ="";
        password ="";
        address ="";
        phone ="";
        password ="";
    }
    
    
    
       
    

//    public boolean isError() {
//        return error;
//    }
//
//    public void setError(boolean error) {
//        this.error = error;
//    }
    
    public String logout(){        
        username = null;
        firstName = null;
        lastName = null;
        email = null;
        address = null;
        password = null;
        phone = null;
        return "Home";
        
    }
    
        public void update() {
        DAOUser udao = new DAOUser();
        udao.updateUser(this);    
        
    }
}






