package java_solutions;

public class Problem5 {
    public static void calculateTax(int income) {
        System.out.println("Taxable Income\t\t\tIncome Tax");

        if (income <= 250000) {
            System.out.println("Rs." + String.format("%,d", income) + "\t\t\t\t0");
            return;
        }

        System.out.print("Rs." + String.format("%,d", income) + "\t\t\t\t");

        int tax = 0;
        StringBuilder breakdown = new StringBuilder();

        if (income <= 500000) {
            int amt = income - 250000;
            tax = (int) (amt * 0.1);
            breakdown.append("10% x (" + String.format("%,d", income) + " – 2,50,000)\n")
                     .append("\t\t\t\t\t= 10% x " + String.format("%,d", amt) + "\n")
                     .append("\t\t\t\t\t= " + String.format("%,d", tax));
        } else if (income <= 1000000) {
            int amt1 = 250000;
            int amt2 = income - 500000;
            int tax1 = (int) (amt1 * 0.1);
            int tax2 = (int) (amt2 * 0.2);
            tax = tax1 + tax2;
            breakdown.append("10% x (5,00,000 – 2,50,000)\n")
                     .append("+ 20% x (" + String.format("%,d", income) + " – 5,00,000)\n")
                     .append("\t\t\t\t\t= 10% x " + String.format("%,d", amt1) + "\n")
                     .append("\t\t\t\t\t+ 20% x " + String.format("%,d", amt2) + "\n")
                     .append("\t\t\t\t\t= " + tax1 + " + " + tax2 + "\n")
                     .append("\t\t\t\t\t= " + tax);
        } else {
            int amt1 = 250000;
            int amt2 = 500000;
            int amt3 = income - 1000000;
            int tax1 = (int) (amt1 * 0.1);
            int tax2 = (int) (amt2 * 0.2);
            int tax3 = (int) (amt3 * 0.3);
            tax = tax1 + tax2 + tax3;
            breakdown.append("10% x (5,00,000 – 2,50,000)\n")
                     .append("+ 20% x (10,00,000 – 5,00,000)\n")
                     .append("+ 30% x (" + String.format("%,d", income) + " – 10,00,000)\n")
                     .append("\t\t\t\t\t= 10% x " + amt1 + "\n")
                     .append("\t\t\t\t\t+ 20% x " + amt2 + "\n")
                     .append("\t\t\t\t\t+ 30% x " + amt3 + "\n")
                     .append("\t\t\t\t\t= " + tax1 + " + " + tax2 + " + " + tax3 + "\n")
                     .append("\t\t\t\t\t= " + String.format("%,d", tax));
        }

        System.out.println();
        System.out.println(breakdown.toString());
        System.out.println();
    }

    public static void main(String[] args) {
        calculateTax(190000);    
        calculateTax(345000);     
        calculateTax(780000);     
        calculateTax(2400000);    
    }
}
