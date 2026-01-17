import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public Student(String name, Integer... grades) {

        this.name = name;
        this.grades = new ArrayList<>();

        if (grades != null) {
            for(Integer grade : grades) {
                addGrade(grade);
            }
        }

    }


    public void addGrade (int grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Все оценки должны быть в диапазоне от 2 до 5");
        }
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    @Override
    public String toString() {
        return name + ": " + grades;
    }

}
