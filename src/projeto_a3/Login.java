package projeto_a3;

import javax.swing.*;

public class Login extends App
{
    public void Validacao(){
        String usuario = JOptionPane.showInputDialog(null,"usuario");
        String password = JOptionPane.showInputDialog(null,"senha");
       Login login = new Login();
       login.Run(login);
    }

    public static void main(String args[]){
        Login app = new Login();
        app.Validacao();
    }
}