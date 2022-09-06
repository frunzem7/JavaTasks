package task2;

public enum Grades {
    BASIC(0), ACCEPTABLE(1), GOOD(2), EXCELLENT(3);
    private final Integer order;

    Grades(Integer order) {
        this.order = order;
    }

    public Grades previous() {
        Grades grades = findEnumByVariable(order - 1);
        return grades == null ? BASIC : grades;
    }

    public static Grades findEnumByVariable(int code) {
        for (Grades e : Grades.values()) {
            if (code == e.order) return e;
        }
        return null;
    }

    public Grades next() {
        Grades grades = findEnumByVariable(order + 1);
        return grades == null ? EXCELLENT : grades;
    }

    public static Grades[] showAll() {
        return values();
    }
}