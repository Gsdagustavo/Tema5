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
        return "Worker{" +
                "cpf='" + cpf + '\'' +
                ", name='" + name + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", turn=" + turn +
                ", category=" + category +
                ", incomePerHour=" + incomePerHour +
                '}';
    }
}
