package control;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class WriteFiles {

    private static final String path = "ip.txt";
    private static final String path1 = "usr.txt";
    private static final String path2 = "pass.txt";

    public static String Write() throws IOException {
        String aux = "";
        File file = new File(path);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(dao.Conexao.url);
        //Criando o conteúdo do arquivo
        writer.flush();
        //Fechando conexão e escrita do arquivo.
        writer.close();
        aux += ("Arquivo "+dao.Conexao.url+" gravado")+"\n";

        file = new File(path1);
        writer = new BufferedWriter(new FileWriter(file));
        writer.write(dao.Conexao.usr);
        //Criando o conteúdo do arquivo
        writer.flush();
        //Fechando conexão e escrita do arquivo.
        writer.close();
        aux += ("Arquivo "+dao.Conexao.usr+" gravado")+"\n";

        file = new File(path2);
        writer = new BufferedWriter(new FileWriter(file));
        writer.write(dao.Conexao.pass);
        //Criando o conteúdo do arquivo
        writer.flush();
        //Fechando conexão e escrita do arquivo.
        writer.close();
        aux += ("Arquivo ******* gravado")+"\n";
        
        return aux;
    }
}
