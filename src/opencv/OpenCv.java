/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv;

import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFrame;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import static org.opencv.core.CvType.CV_8U;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import static org.opencv.highgui.HighGui.destroyWindow;
import static org.opencv.highgui.HighGui.imshow;
import static org.opencv.highgui.HighGui.namedWindow;
import static org.opencv.highgui.HighGui.*;
import static org.opencv.highgui.HighGui.waitKey;
import org.opencv.imgcodecs.Imgcodecs;
import static org.opencv.imgcodecs.Imgcodecs.CV_LOAD_IMAGE_COLOR;
import static org.opencv.imgcodecs.Imgcodecs.IMREAD_GRAYSCALE;
import org.opencv.imgproc.Imgproc;
import static org.opencv.imgproc.Imgproc.ADAPTIVE_THRESH_MEAN_C;
import static org.opencv.imgproc.Imgproc.THRESH_BINARY;
import static org.opencv.imgproc.Imgproc.THRESH_OTSU;
import static org.opencv.imgproc.Imgproc.adaptiveThreshold;
import static org.opencv.imgproc.Imgproc.threshold;
import org.opencv.videoio.VideoCapture;

/**
 *
 * @author moh
 */
public class OpenCv {

    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void filter(Mat image) {
        int totalBytes = (int) (image.total() * image.elemSize());
        byte buffer[] = new byte[totalBytes];
        image.get(0, 0, buffer);
        for (int i = 0; i < totalBytes; i++) {
            if (i % 3 == 0) {
                buffer[i] = 0;
            }
        }
        image.put(0, 0, buffer);
    }

    public static void main(String[] args) throws Exception {
//        VideoCapture capture = new VideoCapture("C:\\Users\\moh\\Videos\\funny video.mp4");
//         capture.release();
        Mat newImage = Imgcodecs.imread("C:\\Users\\moh\\Desktop\\opencvTut\\image.jpg");
    //    Mat mat =  new Mat ();
      //  Imgproc.GaussianBlur(newImage, mat, newImage.size() , 4.0 );
        imshow("test", newImage);
        waitKey(10);
//        ImageEditor editor = new ImageEditor();
//        Mat image =editor.openFile("C:\\Users\\moh\\Desktop\\opencvTut\\image.jpg",IMREAD_GRAYSCALE);
//        MainFrame frame = new MainFrame();
//        frame.show(image,"Hello");
        
//        Mat image = new Mat(new Size(50, 50), CvType.CV_8UC3, new Scalar(new double[]{128, 3, 4}));
//        for (int row = 0 ; row < image.rows() ; row++ ){
//            for (int col = 0 ; col < image.cols() ; col++){
//                image.put(row, col, new byte[]{2,2,2}); // 1 Blue , 2 Green , 3 Red
//            }
//        }
//        imshow("a",image);
//        moveWindow("a", 300, 200);
//        resizeWindow("a", 600, 200);
//        String filePath = "C:\\Users\\moh\\Desktop\\opencvTut\\image.jpg";
//        Mat newImage = Imgcodecs.imread(filePath);
//        //filter(newImage);
//        imshow("F",newImage);
//        Mat image2 = new Mat();
//        namedWindow
////        filter(newImage);
        // adaptiveThreshold(newImage, image2, 255, ADAPTIVE_THRESH_MEAN_C, THRESH_BINARY, 15, 40);
//        threshold(newImage,image2, 0, 255, THRESH_BINARY + THRESH_OTSU);
//        if (newImage.dataAddr() == 0) {
//            throw new Exception ("Couldn't open file "+fileName);
//        } else {
//            ImageViewer imageViewer = new ImageViewer();
//            imageViewer.show(image2, "Loaded image");
//        }
//        Mat image = Imgcodecs.imread("C:/Users/moh/Documents/Desktop 2018/kaneki_wallpaper.jpg", CV_LOAD_IMAGE_COLOR);
//        Mat splitchannels[] = new Mat[3];
//        List<Mat> splitchannels = new ArrayList<>(3);
//        Core.split(image, splitchannels);
//        namedWindow("G",WINDOW_NORMAL);
//        namedWindow("B",WINDOW_NORMAL);
//        namedWindow("R",WINDOW_NORMAL);
//        imshow("B", splitchannels.get(0));
//        imshow("G", splitchannels.get(1));
//        imshow("R", splitchannels.get(2));
//        moveWindow("B", 300, 200);
//        moveWindow("G", 600, 200);
//        moveWindow("R", 900, 200);
//        resizeWindow("B", 300, 200);
//        resizeWindow("G", 300,200);
//        resizeWindow("R", 300,200);
//        namedWindow("test", WINDOW_NORMAL);
//        //namedWindow("test", WINDOW_AUTOSIZE);
//        imshow("test",image);
//        resizeWindow("test", image.cols()/2, image.rows()/2);
//        moveWindow("test", 300, 200);
//        imshow("Example1", image);
//        Mat image2 = Imgcodecs.imread("C:/Users/moh/Documents/Desktop 2018/kaneki_wallpaper.jpg", CV_LOAD_IMAGE_COLOR);
//        imshow("Example1", image);
//        imshow("Example2", image2);
//        Imgcodecs.imwrite("C:/Users/moh/Desktop/Gray.png",image);
//        destroyWindow("Example1");
    }

}
