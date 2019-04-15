package com.example.taxcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText salary_et;
    private Button calculate_btn;
    private TextView totalsalary_tv, totaltax_tv;
    private Float salary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        salary_et = (EditText)findViewById(R.id.Salary_et);
        calculate_btn = (Button)findViewById(R.id.Calculate_btn);
        totalsalary_tv = (TextView)findViewById(R.id.TotalSalary_tv);
        totaltax_tv = (TextView)findViewById(R.id.TotalTax_tv);

        calculate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Validation() == true) {
                    salary = Float.parseFloat(salary_et.getText().toString());
                    TaxCalculator tax = new TaxCalculator(salary);
                    totalsalary_tv.setText(Float.toString(tax.getTotalSalary()));
                    totaltax_tv.setText(Float.toString(tax.calculate()));
                }
            }
        });


    }
    public Boolean Validation(){
        if (TextUtils.isEmpty(salary_et.getText())){
            salary_et.requestFocus();
            salary_et.setError("Please enter your salary");
            return false;
        }
        return  true;
    }
}
