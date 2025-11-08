package compressor;

import java.io.*;
import java.util.zip.*;

public class FileCompressor {

    public static void compress(String inputFile, String outputFile) throws IOException {
        FileInputStream fis = new FileInputStream(inputFile);
        GZIPOutputStream gos = new GZIPOutputStream(new FileOutputStream(outputFile));

        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1) {
            gos.write(buffer, 0, len);
        }

        gos.close();
        fis.close();

        System.out.println("File compressed successfully!");
    }

    public static void decompress(String inputFile, String outputFile) throws IOException {
        GZIPInputStream gis = new GZIPInputStream(new FileInputStream(inputFile));
        FileOutputStream fos = new FileOutputStream(outputFile);

        byte[] buffer = new byte[1024];
        int len;
        while ((len = gis.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }

        gis.close();
        fos.close();

        System.out.println("File decompressed successfully!");
    }
}
