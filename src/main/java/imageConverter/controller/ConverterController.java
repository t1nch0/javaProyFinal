package imageConverter.controller;

import imageConverter.model.ImageConverter;
import imageConverter.model.parameter.ImageParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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
@RestController
@RequestMapping("/convert")
public class ConverterController {
    @PostMapping
    public String extract(@RequestParam(value="format") String format,
                          @RequestParam(value="file")MultipartFile file){
        if(format.isEmpty()){
            return "error, no format choose";
        }
        if(file.isEmpty()){
            return "error file is empty";
        }

        fileBackup f=new fileBackup();
        ImageParam IPar=new ImageParam();
        ImageConverter Iconv=new ImageConverter();
        IPar.setImageFile(f.fileBackup(file));
        IPar.setFormat(format);
        String result=Iconv.ImageParameters(IPar);
        return result;
    }
}
