import java.util.Scanner;

public class Usuario {
    //atributos
    private int id;
    private String email;
    protected int eded;
    //gets
    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public int getEded() {
        return eded;
    }
    //sets

    public void setEded(int eded) {
        this.eded = eded;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }
    // contructor

    public Usuario( String email, int id) {
        this.email = email;
        this.id = id;
    }
    // to string

    @Override
    public String toString() {
        return "Usuario{" +
                "eded=" + eded +
                ", id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
     public String usuario(){
        return id+email;

    }
public Boolean cambiar_email(String nuevo){
        if(!nuevo.contains("@")) return  false;
        this.email=nuevo;
        return true ;


    }
}
