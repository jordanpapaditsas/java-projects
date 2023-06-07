package gr.aueb.cf.ch9;

import java.io.*;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Providing a program that reads
 * name, surname and 2 grades of a
 * student, calculates the AVG and prints
 * out Name, Surname and AVG grade of
 * every student, additionally the program
 * writes in a log file if any error reports
 * occurred.
 *
 */
public class StudentsGradesApp {

    public static void main(String[] args) {
        // Initializing variables
        String line;
        String[] info;
        String firstname;
        String lastname;
        int grade1;
        int grade2;
        double avg;
        String result;

        // Inside a try catch we are passing the new information in a new file
        try {
            BufferedReader bf = new BufferedReader(new FileReader("C:/tmp/grades.txt"));
            BufferedWriter wr = new BufferedWriter(new FileWriter("C:/tmp/primOut.txt"));
            Logger logger = getLogger();

            while ((line = bf.readLine()) != null) {
                info = line.split(" +");
                firstname = info[0];
                lastname = info[1];
                grade1 = Integer.parseInt(info[2]);
                grade2 = Integer.parseInt(info[3]);

                //Validation if the grades are valid numbers, if not we are logging them
                if(incorrectGrade(grade1) || incorrectGrade(grade2)) {
                    logger.info("Student grades are incorrect!");
                    continue;
                }
                avg = (grade1 + grade2) / 2.0;
                result = String.format("%s %s %.2f", firstname, lastname, avg);
                wr.write(result + "\n");

            }
            wr.flush();
            wr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getLogger() {
        Logger logger = Logger.getLogger(StudentsGradesApp.class.getName());
        Handler fileHandler;

        try {
            fileHandler = new FileHandler("C:/tmp/log.txt", true);
            fileHandler.setFormatter(new SimpleFormatter());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.addHandler(fileHandler);
        return logger;
    }

    public static boolean incorrectGrade(int grade) {
        return grade < 0 || grade > 10;
    }
}
