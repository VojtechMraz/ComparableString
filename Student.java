

public class Student implements Comparable<Student>{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    @Override
    public int compareTo(Student other) {
        // compareToIgnoreCase ignoruje rozlišení velkých a malých písmen
        return this.name.compareToIgnoreCase(other.name);
    }

}
