
package hacker;


public class Usuario2 {
    
     private String login = "casa1";
     private String senha = "123456";
    
    
    
    void inserir1(String log, String senh){
        login = log;
        senha = senh;
       
        if (senha!= "123456" || login != "casa1"){
            invalido1();
            login = "casa1";
            senha = "123456";
        }
            
    }
    
    void invalido1(){
        
        System.out.println("nao é perimitido alterar login e senha");
    }

    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
    

