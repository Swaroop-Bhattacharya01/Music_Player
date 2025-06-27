import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class music_player {
    public static void main(String[] args) {
        String filepath = "Ran During Time - Freedom Trail Studio.wav";
        File file = new File(filepath);
        try (Scanner scanner = new Scanner(System.in)) {
            AudioInputStream audiostream = AudioSystem.getAudioInputStream(file); // Get the audio input stream from the
            Clip clip = AudioSystem.getClip(); // Create a Clip object which helps in playing the audio
            clip.open(audiostream); // Open the audio stream

            String response = "";
            while (!response.equals("Q")) {
                System.out.println("Press P to play, S to stop, R to reset, Q to quit");
                response = scanner.nextLine().toUpperCase();
                switch (response) {
                    case "P":
                        clip.start();
                        break;
                    case "S":
                        clip.stop();
                        break;
                    case "R":
                        clip.setMicrosecondPosition(0);
                        break;
                    case "Q":
                        clip.close();
                        break;
                    default:
                        System.out.println("Invalid input, please try again.");
                }
            }
            System.out.println("no problems so far");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: ");
        } catch (LineUnavailableException e) {
            System.out.println("Line unavailable: ");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("audio file not supported: ");
        } catch (IOException e) {
            System.out.println("An error occurred while trying to play the audio file: " + e.getMessage());
        } finally {
            System.out.println("Finished playing the audio file.");
        }
    }
}