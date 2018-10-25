/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv;

import org.opencv.core.Mat;

/**
 *
 * @author moh
 */
public interface File {
    
    public Mat openFile(String fileName) throws Exception;
    public void saveFile (String to ,Mat file);
    public void deleteFile (Mat file);
    
    
    
}
