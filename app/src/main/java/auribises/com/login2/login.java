package auribises.com.login2;

import android.provider.ContactsContract;

import java.io.Serializable;
import java.util.Date;
//Model,Bean and POJO

public class login implements Serializable {
    //attributes
    int id;
    String username,password;

    //constructors

    public login() {
    }


    public login(int id, String username, String password) {

        this.username = username;
        this.password = password;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "login{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +

                '}';
    }
}
