package control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {

    private static File file = new File("ip.txt");
    private static File file1 = new File("usr.txt");
    private static File file2 = new File("pass.txt");
    public static File file3;

    private static final void readurl(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String data = null;
        while ((data = reader.readLine()) != null) {
            dao.Conexao.url = data;
        }
        fileReader.close();
        reader.close();
    }

    private static final void readusr(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String data = null;
        while ((data = reader.readLine()) != null) {
            dao.Conexao.usr = data;
        }
        fileReader.close();
        reader.close();
    }

    private static final void readpass(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String data = null;
        while ((data = reader.readLine()) != null) {
            dao.Conexao.pass = data;
        }
        fileReader.close();
        reader.close();
    }

    public static void ler() {
        try {
            ReadFiles.readurl(file);
            ReadFiles.readusr(file1);
            ReadFiles.readpass(file2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void lerInterface() {
        try {
            ReadFiles.readinterface(file3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static final void readinterface(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String data = null;
        while ((data = reader.readLine()) != null) {
            view.Menu.inter = data;
        }
        fileReader.close();
        reader.close();
    }
}
