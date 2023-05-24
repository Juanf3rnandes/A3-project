/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_a3;
import java.net.http.*;
import java.net.URI;
import java.io.IOException;

public class Api{

        public void RequestData(String url){
           HttpClient client = HttpClient.newHttpClient();
           HttpRequest request = HttpRequest.newBuilder()
         
    .uri(URI.create(url))
    .header("Content-Type", "application/json")
    .build();
    try{
       HttpResponse<String> response =  client.send(request, HttpResponse.BodyHandlers.ofString());
       System.out.println(response.body());
    }catch(IOException e){
        System.out.println(e);
    }catch (InterruptedException e) {
    // Trate a exceção InterruptedException aqui
    System.out.println("A operação foi interrompida: " + e.getMessage());
}
    }
        
        public static void main(String args[]){
            Api api = new Api();
            api.RequestData("https://www.kaggle.com/datasets/amandalk/sp-air-quality");
        }
     
}