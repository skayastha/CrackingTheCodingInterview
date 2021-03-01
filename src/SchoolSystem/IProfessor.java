package SchoolSystem;

public interface IProfessor {
    void teach(int profId);
    void giveAssignments(int courseId);
    void gradeAssignments(int courseNumber);
    void gradeExams(int courseNumber);
    void giveExams(int courseNumber);
}
