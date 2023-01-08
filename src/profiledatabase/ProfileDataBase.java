/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profiledatabase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author kmoran095
 * This is a program I created used to write a profile database and writes them in text files.
 */
public class ProfileDataBase {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        try {
            
            File files = new File("Profiles.txt");
            
            /* A file output stream is an output 
            stream for writing data to a File or to a FileDescriptor.*/
            FileOutputStream data = new FileOutputStream(files);
            
            //Class used to write objects into files.
            ObjectOutputStream writer = new ObjectOutputStream(data);

            Scanner scanner = new Scanner(System.in);

            System.out.print("Please enter the number of profiles you would like to document: ");

            int numProfiles = scanner.nextInt();

            Profile[] profiles = new Profile[numProfiles];

            for (int i = 0; i < profiles.length; i++) {

                profiles[i] = new Profile();

                System.out.print("Enter name: ");

                profiles[i].setName(scanner.next());

                System.out.print("Enter age: ");

                profiles[i].setAge(scanner.nextInt());

                System.out.print("Enter location: ");

                profiles[i].setLocation(scanner.next());
            }

            for (Profile listProfiles : profiles) {

                System.out.println(listProfiles);
                
                //Write the list of profiles into a textfile.
                writer.writeObject(listProfiles);

                /* Flushes the stream. This will write any buffered 
                output bytes and flush through to the underlying stream */
                writer.flush();

            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File is not found.");
        }

    }

}
