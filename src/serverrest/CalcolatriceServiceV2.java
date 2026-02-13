/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;


/**
 *
 * @author sideri.samuele
 */
public class CalcolatriceServiceV2 extends CalcolatriceService {
    public static double calcola(double op1, double op2, String operatore) {
        String op = operatore.toUpperCase().trim();

        switch (op) {
            case "POTENZA":
            case "POW":
            case "^":
            return Math.pow(op1, op2);

            case "MODULO":
            case "MOD":
            case "|":
            return op1 % op2;

            case "RADICE":
            case "SQRT":
            case "√":
            return radice(op1, op2);

            default:
                throw new IllegalArgumentException(
                    "Operatore non valido: " + operatore + 
                    ". Operatori consentiti: SOMMA, SOTTRAZIONE, MOLTIPLICAZIONE, DIVISIONE, RADICE, MODULO, POTENZA"
                );
        }
    }
    
    public static double radice(double radicando, double indice) {
        if (indice == 0) {
            throw new IllegalArgumentException("Indice non può essere zero");
        }return Math.pow(radicando, 1.0 / indice);
    }
}
