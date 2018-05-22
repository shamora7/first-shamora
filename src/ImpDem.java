/**
 * Created by user on 11.05.2018.
 */
import java.io.*;
public class ImpDem {
/* Локализованный ввод вывод */
    public static void main(String[] args) {
        Writer ow = new OutputStreamWriter(System.out);
                PrintWriter pw = new PrintWriter(ow,true);
        Reader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        try {
            pw.print("Введиите строку: ");
            pw.flush();
            String s = br.readLine();
            pw.println("Вы написали: "+s);
            }
        catch (IOException ioex) {
            System.err.println(ioex);
        }
    }
}
