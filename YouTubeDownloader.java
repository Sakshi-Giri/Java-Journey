import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YouTubeDownloader {

    public static void main(String[] args) {
        try {
            // Accept YouTube video URL from the user
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the YouTube video URL: ");
            String videoUrl = reader.readLine().trim();

            // Prepare the youtube-dl command
            String[] command = {"C:\\Python311\\Scripts\\youtube-dl.exe", "-o", "%(title)s.%(ext)s", videoUrl};

            // Execute the command using ProcessBuilder
            ProcessBuilder processBuilder = new ProcessBuilder(command);
            Process process = processBuilder.start();

            // Read output from the process
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = inputReader.readLine()) != null) {
                System.out.println(line);
            }

            // Wait for the process to complete
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("Video downloaded successfully!");
            } else {
                System.out.println("Error downloading the video.");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
