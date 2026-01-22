package Default;

import javax.swing.JOptionPane;

public class cs04Assignment05 {
    public static void main(String[] args) {

       	int again;		

        do {
            int students, i = 1;
            String name = "", result = "";
            double grade = 0, grade1 = 0;

            students = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "How many students are there?",
                    "1 - BSCS - A",
                    JOptionPane.PLAIN_MESSAGE));

            if (students > 0) {

                while (i <= students) {
                    name = JOptionPane.showInputDialog(
                            null,
                            "Name of Student " + i + ":",
                            "1 - BSCS - A | Name",
                            JOptionPane.PLAIN_MESSAGE);

                    grade = Double.parseDouble(JOptionPane.showInputDialog(
                            null,
                            name + "'s Grade:",
                            "1 - BSCS - A | Grade",
                            JOptionPane.PLAIN_MESSAGE));

                    if (grade >= 0 && grade < 70) {
                        grade1 = 5.0;
                    } else if (grade >= 70 && grade < 75) {
                        grade1 = 4.0;
                    } else if (grade >= 75 && grade < 78) {
                        grade1 = 3.0;
                    } else if (grade >= 78 && grade < 81) {
                        grade1 = 2.75;
                    } else if (grade >= 81 && grade < 84) {
                        grade1 = 2.50;
                    } else if (grade >= 84 && grade < 87) {
                        grade1 = 2.25;
                    } else if (grade >= 87 && grade < 90) {
                        grade1 = 2.0;
                    } else if (grade >= 90 && grade < 93) {
                        grade1 = 1.75;
                    } else if (grade >= 93 && grade < 96) {
                        grade1 = 1.50;
                    } else if (grade >= 96 && grade < 99) {
                        grade1 = 1.25;
                    } else if (grade >= 99 && grade < 101) {
                        grade1 = 1.0;
                    } else {
                        grade1 = 0;
                    }

                    result += name + "                 " + grade + "                 " + grade1 + "                 \n";

                    i++;
                }

                JOptionPane.showMessageDialog(
                        null,
                        "CS 01 Fundamentals of Programming\n" +
                        "Final Grades\n" +
                        "1st Semester 2025-2026\n\n" +
                        "Name               " + 
                        "Grade               "   +
                        "Equivalent\n" +
                        result,
                        "1 - BSCS - A | Result",
                        JOptionPane.PLAIN_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Please Try Again!",
                        "1 - BSCS - A | ERROR",
                        JOptionPane.ERROR_MESSAGE);
            }

            again = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "Do you want to try again?" +
                            "\n[1] Yes" +
                            "\n[2] No",
                    "1 - BSCS - A | TRY AGAIN?",
                    JOptionPane.PLAIN_MESSAGE));

        } while (again == 1);
    }
}
