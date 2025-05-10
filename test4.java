//heriachical inheritance

class person {

    int id;
    int age;
    String name;
    String course;
    float fee;
    String sub;
    float salary;

    person(int id, int age, String name) {

        // id = id;
        // age = age;
        // name = name;
        System.out.println("person id " + id);
        System.out.println("person age " + age);
        System.out.println("person name " + name);
    }
}

class student extends person {

    student(int id, int age, String name, String course, float fee) {

        super(id, age, name);
        // course = course;
        // fee = fee;
        System.out.println("student course" + course);
        System.out.println("student fee" + fee);
    }
}

class teacher extends person {

    teacher(int id, int age, String name, String sub, float salary) {

        super(id, age, name);
        // sub = sub;
        // salary = salary;
        System.out.println("teacher subject=" + sub);
        System.out.println("teacher salary=" + salary);
    }
}

class test4 {

    public static void main(String[] args) {
        student ob = new student(201, 21, "naveen kumar", "BCA", 23023f);
        //teacher o = new teacher(73, 24, " rajesh ", "MATHS", 23000f);
    }
}
