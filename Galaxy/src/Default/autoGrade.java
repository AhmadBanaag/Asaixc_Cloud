package Default;
import javax.swing.JOptionPane;

public class autoGrade {
    public static void main(String[] args) {
        
        // Declaring Variables
        double percentA = 0.1, percentB = 0.15, percentC = 0.2, percentD = 0.25, percentE = 0.3;
        double totalA = 15, totalB = 50, totalC = 80, totalD = 100, totalE = 100;
        
        // Student's name
        String name = JOptionPane.showInputDialog(
                null, 	
                "Name of the student: ", 
                "NAME OF STUDENT", 
                JOptionPane.PLAIN_MESSAGE
        ); 
        
        // Attendance
        double attendance = Double.parseDouble(JOptionPane.showInputDialog(
                null, 
                "Raw Score of \"" + name + "\" in Attendance (10%):", 
                "ATTENDANCE", 
                JOptionPane.PLAIN_MESSAGE
        ));
        
        double attendanceResult = (((attendance / totalA) * 60) + 40) * percentA;
                    
        // Assignment
        double assignment = Double.parseDouble(JOptionPane.showInputDialog(
                null, 
                "Raw Score of \"" + name + "\" in Assignment (15%):", 
                "ASSIGNMENT", 
                JOptionPane.PLAIN_MESSAGE
        ));
        
        double assignmentResult = (((assignment / totalB) * 60) + 40) * percentB;	
        
        // Quiz
        double quiz = Double.parseDouble(JOptionPane.showInputDialog(
                null, 
                "Raw Score of \"" + name + "\" in Quiz (20%):", 
                "QUIZ", 
                JOptionPane.PLAIN_MESSAGE
        ));
        
        double quizResult = (((quiz / totalC) * 60) + 40) * percentC;
        
        // Lab Activity
        double labAct = Double.parseDouble(JOptionPane.showInputDialog(
                null, 
                "Raw Score of \"" + name + "\" in Lab Activity (25%):", 
                "LAB ACTIVITY", 
                JOptionPane.PLAIN_MESSAGE
        ));
        
        double labActResult = (((labAct / totalD) * 60) + 40) * percentD;
        
        // Exam
        double exam = Double.parseDouble(JOptionPane.showInputDialog(
                null, 
                "Raw Score of \"" + name + "\" in Exam (30%):", 
                "EXAM", 
                JOptionPane.PLAIN_MESSAGE
        ));
        
        double examResult = (((exam / totalE) * 60) + 40) * percentE;
        
        // Final Grade
        double finalOverallGrade = (attendanceResult + assignmentResult + quizResult + labActResult + examResult);
        
        JOptionPane.showMessageDialog(
                null, 
                "Attendace Grade: " + 
                	attendanceResult +
                "\n\nAssignment Grade: " + 
                	assignmentResult +
                	"\n\nQuiz Grade: " + 
                	quizResult + 
                	"\n\nLaboratory Grade: " + 
                	labActResult +
                	"\n\nExam Grade: " + 
                	examResult +
                "\n\nOverall Grade: " + 
                finalOverallGrade, 
                "OVERALL GRADE", 
                JOptionPane.PLAIN_MESSAGE
        );
    }
}
