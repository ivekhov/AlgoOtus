import java.io.*;

public class Main{


    public static void main(String[] args) throws IOException {

        String GLOBAL_PATH = "/home/ivan/Dropbox/work/algo/java/JavaTester";
        String LOCAL_PATH = "/data4test/strings";

        Integer ix = 0;
        File myFolder = new File("." + LOCAL_PATH);
        File[] files = myFolder.listFiles();
        String[] fileNames = new String[100];

        for (int i = 0; i < files.length; i++) {
            String temp = String.valueOf(files[i]);
            String[] parts = temp.split("/");
            String fileName = parts[parts.length - 1];
            fileNames[i] = fileName;
        }

        FileWriter writer = new FileWriter("." + LOCAL_PATH + "/TestResults.txt");

        while (true){
            String first = GLOBAL_PATH + LOCAL_PATH + "/test." + ix + ".in";
            File firstFile = new File(first);
            String second = GLOBAL_PATH + LOCAL_PATH + "/test." + ix + ".out";
            File secondFile = new File(second);

            if (!firstFile.exists() | !secondFile.exists()) {break;}

            long timeStart = System.nanoTime();
            Boolean flag = compareFiles(firstFile, secondFile);
            long timeDelta = System.nanoTime() - timeStart;

            System.out.printf("Test #%d is %s, time: %.3f ms\n", ix, flag, timeDelta/1_000_000.0);

            writer.write("Test #" + ix + " is " + flag + ", time: " +
                    timeDelta / 1_000_000.0 + " ms\n");
            ix++;
        }
        writer.close();

    }

    public static boolean compareFiles(File firstFile, File secondFile) throws IOException {
        // prepare files
        FileReader inFileReader = new FileReader(firstFile);
        BufferedReader inReader = new BufferedReader(inFileReader);
        String inTempRow = inReader.readLine();
        inReader.close();

        FileReader outFileReader = new FileReader(secondFile);
        BufferedReader outReader = new BufferedReader(outFileReader);
        String outTempRow = outReader.readLine();
        int expValue;
        expValue = Integer.parseInt(outTempRow);
        outReader.close();


        // Main algo function for checking
        //************************************

        Integer result = countLenOfRow(inTempRow);


        //************************************
        return result.equals(expValue);
    }

    // specific function
    private static Integer countLenOfRow(String row) {
        return row.length();
    }

}
