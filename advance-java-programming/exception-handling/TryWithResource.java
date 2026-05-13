import java.io.*;

public class TryWithResource {
    public static void main(String[] args) {
        System.out.println("Starting first");
        System.out.println("path is" + System.getProperty("file.txt"));
        /*
         * try (FileReader fr = new FileReader(
         * "bridgelabz-training-java-programming\\advance-java-programming\\exception-handling\\file.txt"
         * );
         * BufferedReader br = new BufferedReader(fr);) {
         * 
         * // fr implemets AutoCloseable interface that's why it know how to close that
         * // resource
         * 
         * String line;
         * System.out.println("starting");
         * while ((line = br.readLine()) != null) {
         * // System.out.println(br.readLine());//now it print next line instead of
         * first
         * // line
         * System.out.println(line);
         * }
         * 
         * } catch (Exception e) {
         * System.out.println(e.getClass().getName());// for error type
         * // e.printStackTrace();
         * } finally {
         * // br.close(); it will give error
         * System.out.println("End of file");
         * }
         */

        try (FileWriter fw = new FileWriter(
                "bridgelabz-training-java-programming\\advance-java-programming\\exception-handling\\file.txt");
                BufferedWriter bw = new BufferedWriter(fw)) {
            System.out.println("Start writing");

            bw.write("Writing using relative path");
            bw.append('\n');
            bw.append('u');
            bw.append('s');
            bw.append('i');
            bw.append('n');
            bw.append('g');
            System.out.println("Done writing");

        } catch (IOException e) {
            System.out.println(e.getCause());
        }

        System.out.println("End");
    }
}
