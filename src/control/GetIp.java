/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Enumeration;

/**
 *
 * @author FERNANDO ROGI
 */
public class GetIp {

    public static String Get() throws UnknownHostException, SocketException {
        String ip = "";
        // Imprime apenas "localhost/127.0.0.1"
        for (InetAddress ia : InetAddress.getAllByName("localhost")) {
            ip += "localhost: " + ia + "\n";
        }
        // Deve imprimir todos os endereços do host local. 
        for (InetAddress ia : InetAddress.getAllByName(InetAddress.getLocalHost().getHostName())) {
            ip += ia + "\n";
        }
        ip += "\n ----------------------------------------------------------------------------------- \n";
        // No caso de uma máquina Linux, é necessário listar as interfaces de rede. Normalmente a primeira placa de rede é eth0,
        // mas em uma máquina Solaris as interfaces de rede têm nomes diferentes e relacionados com o driver usado.
        for (NetworkInterface ni : Collections.list(NetworkInterface.getNetworkInterfaces())) {
            ip += ("Interface de rede: " + ni.getName() + " (" + ni.getDisplayName() + ")") + "\n";
            ip += ("Endereços de rede associados à interface " + ni.getName() + ":") + "\n";
            for (InetAddress ia : Collections.list(ni.getInetAddresses())) {
                ip += ia + "\n";
            };
        }
        
        ip += " \n ----------------------------------------------------------------------------------- \n";
        
        Enumeration nis = null;
        try {
            nis = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException e) {
            e.printStackTrace();
        }
        while (nis.hasMoreElements()) {
            NetworkInterface ni = (NetworkInterface) nis.nextElement();
            Enumeration ias = ni.getInetAddresses();
            while (ias.hasMoreElements()) {
                InetAddress ia = (InetAddress) ias.nextElement();
                if (!ni.getName().equals("lo")) {
                    ip += (ia.getHostAddress())+"\n";
                }
            }
        }
        return ip;
    }
}
