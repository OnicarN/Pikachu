public class Pikachu {
private String sexo;
private int edad;
private boolean fuerte;

public Pikachu (String elSexo, int laEdad){
    sexo = elSexo;
    edad = laEdad;
    fuerte = true;
}

public int getEdad (){
    return edad;
}

public boolean getFuerte (){
    return fuerte;
}
public void setSexo (String elSexo){
    sexo = elSexo;
}
public void aumentoEdad (int laEdad){
    edad = laEdad + edad;
}
public void condicionFuerte(){
    if (fuerte == true){
        fuerte = false;
    }else if(fuerte == false){
        fuerte = true;
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}