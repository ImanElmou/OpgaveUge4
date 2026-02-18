
Student findOldest(Student[] students) {
        Student oldest = students[0];
        for (Student s : students) {
            if (s.age > oldest.age) {
                oldest = s;
            }
        }
        return oldest;
    }

    void main () {

        Student s1 = new Student("Iman", 22);
        Student s2 = new Student("Zouhir", 21);
        Student s3 = new Student("Hannah", 23);


        Student[] students = {s1, s2, s3};

        System.out.println("Alle studerende: ");
        for (Student s : students) {
            s.printInfo();
        }


        Student oldest = findOldest(students);
        System.out.println("\n Ældste studerende:");
        oldest.printInfo();

    }






