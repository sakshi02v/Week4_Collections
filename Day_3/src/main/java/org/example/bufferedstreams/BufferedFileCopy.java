import java.io.*;

public class BufferedFileCopy {
    private static final int BUFFER_SIZE = 4096; // 4 KB buffer size

    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\hp\\Desktop\\CG Training\\Week4\\Day_3\\src\\main\\java\\org\\example\\bufferedstreams\\examplefile.txt"; // Replace with actual file path
        String destBuffered = "C:\\Users\\hp\\Desktop\\CG Training\\Week4\\Day_3\\src\\main\\java\\org\\example\\bufferedstreams\\bufferedcopy";
        String destUnbuffered = "C:\\Users\\hp\\Desktop\\CG Training\\Week4\\Day_3\\src\\main\\java\\org\\example\\bufferedstreams\\unbufferedcopy";

        // Copy using buffered streams
        long bufferedTime = copyUsingBufferedStreams(sourceFile, destBuffered);
        System.out.println("Buffered Stream Copy Time: " + bufferedTime + " ns");

        // Copy using unbuffered streams
        long unbufferedTime = copyUsingUnbufferedStreams(sourceFile, destUnbuffered);
        System.out.println("Unbuffered Stream Copy Time: " + unbufferedTime + " ns");

        // Compare performance
        if (unbufferedTime > 0) {
            double speedup = (double) unbufferedTime / bufferedTime;
            System.out.printf("Buffered streams are %.2f times faster!\n", speedup);
        }
    }

    // Copy file using BufferedInputStream and BufferedOutputStream
    private static long copyUsingBufferedStreams(String src, String dest) {
        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src), BUFFER_SIZE);
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest), BUFFER_SIZE)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error in buffered copy: " + e.getMessage());
        }
        return System.nanoTime() - startTime;
    }

    // Copy file using FileInputStream and FileOutputStream (fixed to use 4 KB chunks)
    private static long copyUsingUnbufferedStreams(String src, String dest) {
        long startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[BUFFER_SIZE]; // Read in 4 KB chunks
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error in unbuffered copy: " + e.getMessage());
        }
        return System.nanoTime() - startTime;
    }
}
