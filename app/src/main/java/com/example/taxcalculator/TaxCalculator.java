package com.example.taxcalculator;

public class TaxCalculator {
    private float totalSalary, totalTax,tax1, tax2,tax3;
    public TaxCalculator(float salary){
        totalSalary = salary * 12;
    }

    public float getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(float totalSalary) {
        this.totalSalary = totalSalary;
    }

    public float getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(float totalTax) {
        this.totalTax = totalTax;
    }
    public float calculate(){
        if (totalSalary <=200000){
            tax1 = totalSalary/100;
            return  tax1;
        }
        else if (totalSalary >=200000 && totalSalary <=350000){
            tax1 =(200000*1)/100;
            totalSalary=totalSalary-200000;
            tax2=(totalSalary*15)/100;
            return  tax1 + tax2;
        }
        else if (totalSalary >= 350000){
            tax1 = (200000*1)/100;
            totalSalary=totalSalary-200000;
            tax2=(150000*15)/100;
            totalSalary=totalSalary-150000;
            tax3=(totalSalary*25)/100;
            return tax1+tax2+tax3;
        }
        return 0;
    }
}

