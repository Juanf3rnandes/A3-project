package projeto_a3;

import javax.swing.*;

public class Login extends App
{
    public void Validacao(){
        String usuarioteste = "teste";
        String senhateste = "teste";
        String usuario = JOptionPane.showInputDialog(null,"usuario");
        String password = JOptionPane.showInputDialog(null,"senha");
        if (!usuario.equals(usuarioteste) && !password.equals(senhateste)) {
            System.out.println("Teste");
         
    }else{
            Login app = new Login();
            app.Run(app);
        }
//    }
    
    public static void main(String args[]){
        Login app = new Login();
        app.Validacao();
    }

}