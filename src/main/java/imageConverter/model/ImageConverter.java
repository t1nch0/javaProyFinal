package imageConverter.model;

import imageConverter.model.parameter.ImageParam;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;


/**
 * @version 1.1
 * @autor Martin Fernandez
 */
public class ImageConverter {
    public String ImageParameters(ImageParam param){
        File image=new File(param.getImageFile());

        String inputImage="imFolderOutput/";
        File outputFile=new File("convertedImages/converted."+param.getFormat());
        String formatName=param.getFormat();
        System.out.println(formatName);

        try{
           // main.convertFormat(inputImage,
                    //outputImage, formatName);
            BufferedImage bi=ImageIO.read(image);
            ImageIO.write(bi,formatName,outputFile);
                 }
        catch (Exception ex){
            return ex.getMessage()+ex.getStackTrace();
        }
        return "converted succesfully";
    }
}
