package br.com.sqs_sender;

import java.time.LocalDate;
import java.util.Scanner;

import br.com.sqs_sender.services.SQSService;

public class App {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String mensagem, topico;
    System.out.print("Entre com a mensagem que deseja enviar:");
    mensagem = sc.nextLine();
    System.out.print("Entre com o topico da mensagem que deseja enviar:");
    topico = sc.nextLine();

    SQSService.sendMessage(( mensagem +" Data de envio: "+ LocalDate.now()),topico );

    sc.close();
  }
}
