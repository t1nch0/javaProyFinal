package imageConverter.model.parameter;

/**
 * @version 1.1
 * @autor Martin Fernandez
 */
public class ImageParam {
    private String imageFile;
    private String format;

    public String getImageFile() {
        return imageFile;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    public String getFormat() {
        return format.toLowerCase();
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
