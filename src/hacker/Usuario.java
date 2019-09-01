
package hacker;


public class Usuario {
    

    public String login="casa";
    String senha="12345";
    
    void inserir(String log, String senh){
        login = log;
        senha = senh;
       
        if (senha!= "12345" || login != "casa"){
            invalido();
            login = "casa";
            senha = "12345";
        }
            
    }
    
    void invalido(){
        
        System.out.println("nao é perimitido alterar login e senha");
    }
    String mostrar(){
        return login + senha;
    }
   
}
