package hacker;




public class Hacker {

    
    public static void main(String[] args) {

        Usuario hacker = new Usuario();
        
        System.out.println(hacker.login + hacker.senha);

        hacker.inserir("violao", "54321");
        System.out.println(hacker.mostrar());
        hacker.login = "viola";
        hacker.senha = "000000";
        
        System.out.println(hacker.mostrar());
    
        
        Usuario2 hacker2 = new Usuario2();
        
        System.out.println(hacker2.getLogin() + hacker2.getSenha());

        hacker2.inserir1("violao", "54321");
        System.out.println(hacker2.getLogin() + hacker2.getSenha());
        hacker2.login = "viola";
        hacker2.senha = "000000";
       
        System.out.println(hacker2.getLogin() + hacker2.getSenha());
    
    }
    
    
}
 