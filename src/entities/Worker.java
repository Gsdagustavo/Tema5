package entities;

public class Worker {

    private String cpf, name;
    private int hoursWorked;
    private char turn, category;
    private float incomePerHour;
    private float actualIncome;

    public Worker(String cpf, String name, int hoursWorked, char turn, char category, float incomePerHour) {
        this.cpf = cpf;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.turn = turn;
        this.category = category;
        this.incomePerHour = incomePerHour;
    }

    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public char getTurn() {
        return turn;
    }

    public char getCategory() {
        return category;
    }

    public float getIncomePerHour() {
        return incomePerHour;
    }

    public float calculateIncome() {
        return incomePerHour * hoursWorked;
    }

    @Override
    public String toString() {
        return "CPF: " + cpf + "\n" +
                "Name: " + name + "\n" +
                "Hours Worked: " + hoursWorked + "\n" +
                "Turn: " + turn + "\n" +
                "Category: " + category + "\n" +
                "Worked hour value: $ " + incomePerHour + "\n" +
                "Actual income: $ " + String.format("%.2f", calculateIncome()) + "\n";
    }
}
