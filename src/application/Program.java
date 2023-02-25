package application;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        Map<String, Double> states = new HashMap<>();
        states.put("SP", 67836.43);
        states.put("RJ", 36678.66);
        states.put("MG", 29229.88);
        states.put("ES", 27165.48);
        states.put("Outros", 19849.53);
        double total = 0.0;
        for(String key : states.keySet()){
            total += states.get(key);
        }
        double percentSp = (states.get("SP") * 100) / total;
        double percentRj = (states.get("RJ") * 100) / total;
        double percentMg = (states.get("MG") * 100) / total;
        double percentEs = (states.get("ES") * 100) / total;
        double percentOutros = (states.get("Outros") * 100) / total;
        System.out.println("Percentual sobre o total da distribuidora do estado de SP é: " + String.format("%.2f", percentSp));
        System.out.println("Percentual sobre o total da distribuidora do estado de RJ é: " + String.format("%.2f", percentRj));
        System.out.println("Percentual sobre o total da distribuidora do estado de MG é: " + String.format("%.2f", percentMg));
        System.out.println("Percentual sobre o total da distribuidora do estado de ES é: " + String.format("%.2f", percentEs));
        System.out.println("Percentual sobre o total da distribuidora e Outros é: " + String.format("%.2f", percentOutros));
    }
}
