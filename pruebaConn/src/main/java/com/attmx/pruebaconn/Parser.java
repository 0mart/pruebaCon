package com.attmx.pruebaconn;
 import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author otrejov
 */
public class Parser {
BufferedReader br = null;
ArrayList<String[]> listaWeb = new ArrayList<String[]>();
ArrayList<String[]> servicio = new ArrayList<String[]>();
    
public void leeArchivo () throws IOException{
    
        String csvFile = "E:\\listaIPs.csv";
        String linea = "";
        String[] columnas;
        String[] arrTMP = null;
        br = new BufferedReader(new FileReader(csvFile));
        while ((linea = br.readLine()) != null) {
            if (!linea.contains("#")) {
                if (linea.contains("http")) {
                    arrTMP[0] = linea.split(",")[0];
                    arrTMP[1] = linea.split(",")[1];
                    listaWeb.add(arrTMP);
                } else {
                    arrTMP[0] = linea.split(",")[0];
                    arrTMP[1] = linea.split(",")[1];
                    servicio.add(arrTMP);
                }
            }
        }
        System.out.println("Lista páginas web http:");
        for (String[] tmp : listaWeb) {
            System.out.println(tmp);
                 
        }
        System.out.println("Lista páginas web https:");
        System.out.println("Lista servicios:");
}
}