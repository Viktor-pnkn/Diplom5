package program;

import scheme.Scheme;
import tree.Tree;

import java.io.*;
import java.util.ArrayList;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        Scheme scheme = new Scheme();
        // Построение множества функций неисправности (1/4 схемы)
        /*TreeSet<String> functions = scheme.generateFunctions3();
        File file = new File("functions-RightBottomKonfeta.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        for (String f : functions) {
            bufferedWriter.write(f);
            bufferedWriter.write('\n');
        }
        bufferedWriter.close();*/

        // AND schemes
        /*File file1 = new File("functions-LeftUpperKonfeta.txt");
        File file2 = new File("functions-RightUpper.txt");
        TreeSet<String> functions = scheme.andSchemes(file1, file2);
        System.out.println("FUCK YEAH");
        File file = new File("functions-UpperKonfeta.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        for (String f : functions) {
            bufferedWriter.write(f);
            bufferedWriter.write('\n');
        }
        bufferedWriter.close();
*/
        // OR schemes
        /*File file1 = new File("functions-UpperKonfeta.txt");
        File file2 = new File("functions-BottomKonfeta.txt");
        TreeSet<String> functions = scheme.orSchemes(file1, file2);
        File file = new File("functionsAllKonfeta.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        for (String f : functions) {
            bufferedWriter.write(f);
            bufferedWriter.write('\n');
        }
        bufferedWriter.close();*/

        //  ГРАДИЕНТ
        File file1 = new File("functionsAllKonvert.txt");        // файл с функциями
        ArrayList<String> functions = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
        while (bufferedReader.ready()) {
            functions.add(bufferedReader.readLine());
        }
        ArrayList<Integer> points = new ArrayList<>();
        Tree tree = new Tree(functions, points);
        tree.buildTree();
        System.out.println();
        System.out.println(tree.highLevel);
        System.out.println(tree.test);

        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло времени, с: " + elapsed / 1000);
    }
}
