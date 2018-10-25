/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv;

import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import static org.opencv.imgcodecs.Imgcodecs.CV_LOAD_IMAGE_COLOR;

/**
 *
 * @author moh
 */
public class ImageEditor implements File {

    // opens a file (Image in this case)
    public Mat openFile(String fileName) throws Exception {
        Mat newImage = Imgcodecs.imread(fileName);
        if (newImage.dataAddr() == 0) {
            throw new Exception("Couldn't open file " + fileName);
        }
        return newImage;
    }

    public Mat openFile(String fileName, int constant) throws Exception {
        Mat newImage = Imgcodecs.imread(fileName, constant);
        if (newImage.dataAddr() == 0) {
            throw new Exception("Couldn't open file " + fileName);
        }
        return newImage;
    }

    public void saveFile(String to, Mat image) {
        Imgcodecs.imwrite(to, image);
    }

    @Override
    public void deleteFile(Mat file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
