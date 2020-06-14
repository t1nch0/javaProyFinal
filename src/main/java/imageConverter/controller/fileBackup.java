package imageConverter.controller;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @version 1.1
 * @autor Martin Fernandez
 */
public class fileBackup {
    public String fileBackup(MultipartFile file) {
        String convertedImage = "convertedImages/";
        String fileInput;
        try {
            String folder = "imFolder/";
            Files.createDirectories(Paths.get(folder));
            Files.createDirectories(Paths.get(convertedImage));
            fileInput = folder + file.getOriginalFilename();

            Path path = Paths.get(fileInput);

            Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            return ex.getMessage();
        }
        return fileInput;
    }
}