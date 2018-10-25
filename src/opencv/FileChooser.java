/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import static org.opencv.imgcodecs.Imgcodecs.IMREAD_GRAYSCALE;

/**
 *
 * @author moh
 */
public class FileChooser extends JPanel {

    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    private JFileChooser chooseFile;
    private JButton browseFile;
    private JButton save;
    private JButton applyFilter;
    private JLabel label;
    private MainFrame frame ;
    private String  chooseValue ;
    public FileChooser() {
        browseFile = new JButton("Browse a Picture");
        applyFilter = new JButton("Apply Filter");
        save = new JButton ("Save");
        label = new JLabel();
        add(browseFile, BorderLayout.NORTH);
        add(applyFilter, BorderLayout.NORTH);
        add(save, BorderLayout.NORTH);
        add(label, BorderLayout.EAST);
        browseFile.addActionListener(new MyActionListener());
        applyFilter.addActionListener(new MyActionListener());
        save.addActionListener(new MyActionListener());
        removeFocus();
    }

    public void removeFocus() {
        browseFile.setFocusable(false);
        applyFilter.setFocusable(false);
        save.setFocusable(false);
    }

    private class MyActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == browseFile) {
                JFileChooser chooseFile = new JFileChooser();
                chooseFile.setDialogTitle("Choose Your File");
                chooseFile.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int returnval = chooseFile.showOpenDialog(browseFile);
                if (returnval == JFileChooser.APPROVE_OPTION) {
                    try {
                        ImageEditor editor = new ImageEditor();
                        chooseValue = chooseFile.getSelectedFile().toString();
                        Mat image = editor.openFile(chooseValue);
                        frame = new MainFrame();
                        label.setIcon(new ImageIcon(frame.show(image, "hello")));
                    } catch (Exception ex) {
                        Logger.getLogger(FileChooser.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            } else if (e.getSource() == applyFilter) {
                try {
                    ImageEditor editor = new ImageEditor();
                    Mat image = editor.openFile(chooseValue,IMREAD_GRAYSCALE);
                    label.setIcon(new ImageIcon(frame.show(image, "hello")));
                } catch (Exception ex) {
                    Logger.getLogger(FileChooser.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                 ImageEditor editor = new ImageEditor();
                try {
                    Mat image = editor.openFile(chooseValue,IMREAD_GRAYSCALE);
                    editor.saveFile("C:\\Users\\moh\\Desktop\\hello.png",image);
                } catch (Exception ex) {
                    Logger.getLogger(FileChooser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }

}
