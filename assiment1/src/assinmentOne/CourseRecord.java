package assinmentOne;
import java.util.Vector;
import java.util.Enumeration;

public class CourseRecord {
        private Student student;
        private Vector assignments;
        CourseRecord() {assignments = new Vector();}
        public Student getStudent() {return student;}
        public void setStudent(Student s) {student = s;}
        public void addAssignment(Assignment a) {assignments.addElement(a);}
        public Enumeration getAssignments() {return assignments.elements();}
        public double average() throws NotYetSetException {
            int numOfMarks = 0;
            double marks = 0;
            for (Object assignment : assignments) {
                Assignment temp = (Assignment) assignment;
                try {
                    if (temp.getMark() != -1) {
                        marks += temp.getMark();
                        numOfMarks++;
                    }
                } catch (NotYetSetException e) {
                    e.printStackTrace();
                }
            }
            if (numOfMarks != 0)
                return marks / numOfMarks;
            else
                return 0.0;

        }
        public boolean canTakeFinalExam() {
            int numOfMarks = 0;
            for (Object assignment : assignments) {
                Assignment temp = (Assignment) assignment;
                try {
                    if (temp.getMark() != -1)
                        numOfMarks++;
                }catch (NotYetSetException e){
                    e.printStackTrace();
                }
            }
            return numOfMarks >= 3;
        }
}
