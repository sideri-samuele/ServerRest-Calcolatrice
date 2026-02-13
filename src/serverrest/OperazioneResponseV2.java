/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

/**
 *
 * @author delfo
 */
public class OperazioneResponseV2 {
    private double operando1;
    private double operando2;
    private String operatore;
    private double risultato;
    private String operazione;

    // Campi aggiuntivi per v2
    private String timestamp;
    private String versione_api;
    private String request_id;

    public OperazioneResponseV2(double op1, double op2,
    String oper, double ris) {
    this.operando1 = op1;
    this.operando2 = op2;
    this.operatore = oper;
    this.risultato = ris;
    this.operazione = String.format("%.2f %s %.2f = %.2f",
    op1, oper, op2, ris);

    // Metadata automatici
    this.timestamp = LocalDateTime.now().format(
    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    this.versione_api = "2.0";
    UUID.randomUUID().toString();
    }

    // Getter
    public double getOperando1() {
        return operando1;
    }
    
    public double getOperando2() {
        return operando2;
    }
    
    public String getOperatore() {
        return operatore;
    }
    
    public double getRisultato() {
        return risultato;
    }
    
    public String getOperazione() {
        return operazione;
    }
    
    // Setter
    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }
    
    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }
    
    public void setOperatore(String operatore) {
        this.operatore = operatore;
    }
    
    public void setRisultato(double risultato) {
        this.risultato = risultato;
    }
    
    public void setOperazione(String operazione) {
        this.operazione = operazione;
    }
}