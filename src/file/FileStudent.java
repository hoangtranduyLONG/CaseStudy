package file;
import main.SinhVien;

import java.io.*;
import java.util.List;
import java.util.Scanner;
public class FileStudent {

    public static void readFromFile() throws IOException {
        File file1 = new File("sinhvien.csv");

        FileReader fileReader = new FileReader(file1);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Scanner sc= new Scanner(file1);
        String line = "";
        while ((line =bufferedReader.readLine())!= null){
            System.out.println(line);
        }
        bufferedReader.close();
    }

    public static void writeToFile(List<SinhVien> list)throws FileNotFoundException{
        File file = new File("sinhvien.csv");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.print("\n");
        for (int i=0;i<list.size();i++){
            printWriter.print(list.get(i));
        }
        printWriter.close();
    }
}
