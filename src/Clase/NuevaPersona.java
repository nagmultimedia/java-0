/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

/**
 *
 * @author Nati
 */
public class NuevaPersona {
    
    String nombre = "";
    String apellido = "";
    String dni = "";
    String cel = "";
    String correo = "";
    String pais = "";
    String rama = "";
    String sexo = "";
    
    public NuevaPersona(){    
}
    public NuevaPersona(String nombre, String apellido, String dni,String cel,String correo, String pais, String rama, String sexo){
        setNombre(nombre);
        setApellido(apellido);
        setDni(dni);
        setCel(cel);
        setCorreo(correo);
        setPais(pais);
        setRama(rama);
        setSexo(sexo);
    }
    public String getNombre(String nombre){
        this.nombre = nombre;
        return nombre;
    }
    public String getApellido (String apellido){
        this.apellido = apellido;
        return apellido;
    }
    public String getDni(String dni){
        this.dni = dni;
        return dni ;
    }
    public String getCel(String Cel){
        this.cel = cel;
        return cel ;
    }
    public String getCorreo(String Correo){
        this.correo = correo;
        return correo ;
    }
    
    public String getPais (String pais){
        this.pais = pais;
        return pais;
    }
    public String getRama (String rama){
        this.rama = rama;
        return rama;
    }
    public String getSexo (String sexo){
        this.sexo = sexo;
        return sexo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido (String apellido){
        this.apellido = apellido;
    }
    public void setDni(String dni){
        this.dni = dni;
    }
    public void setCel (String cel){
        this.cel = cel;
    }
    public void setCorreo (String correo){
        this.correo = correo;
    }
     public void setPais (String pais){
        this.pais = pais;
        
    }
    public void setRama (String rama){
        this.rama = rama;
        
    }
    public void setSexo (String sexo){
        this.sexo = sexo;
        
    }

    @Override
    public String toString() {
        return "NuevaPersona " + "\nNombre = " + nombre 
                + " | apellido = " + apellido + " | dni = " + dni 
                + " | cel = " + cel + " | correo = " + correo + " | pais = " 
                + pais + " | rama = " + rama+ " | sexo = " + sexo;
    
    }
}
