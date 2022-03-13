package sv.edu.udb.ml161665.primerdesafiopractico_ml161665_rf181492;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Ejercicio3ImprimeDatos extends AppCompatActivity {

    private TextView tvName1, tvLastName1,  tvEmployeePosition1, tvHours1, tvDiscountISS1, tvDiscountAFP1, tvDiscountRent1, tvTotalSalary1, tvNetSalary1, tvMessage2Employee1,
            tvName2, tvLastName2,  tvEmployeePosition2, tvHours2, tvDiscountISS2, tvDiscountAFP2, tvDiscountRent2, tvTotalSalary2, tvNetSalary2, tvMessage2Employee2,
            tvName3, tvLastName3,  tvEmployeePosition3, tvHours3, tvDiscountISS3, tvDiscountAFP3, tvDiscountRent3, tvTotalSalary3, tvNetSalary3, tvMessage2Employee3,
            tvMessage, tvHighestPaidEmployee, tvLowestPaidEmployee, tvHowManyEarnMoreThanThreeHundred;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3_imprime_datos);

        tvName1 = (TextView) findViewById(R.id.textViewName1);
        tvLastName1 = (TextView) findViewById(R.id.textViewLastName1);
        tvEmployeePosition1 = (TextView) findViewById(R.id.textViewEmployeePosition1);
        tvMessage2Employee1 = (TextView) findViewById(R.id.textViewMessage2Employee1);
        tvHours1 = (TextView) findViewById(R.id.textViewWorkedHours1);
        tvDiscountISS1 = (TextView) findViewById(R.id.textViewAFP1);
        tvDiscountAFP1 = (TextView) findViewById(R.id.textViewISS1);
        tvDiscountRent1 = (TextView) findViewById(R.id.textViewRent1);
        tvTotalSalary1 = (TextView) findViewById(R.id.textViewTotalSalary1);
        tvNetSalary1 = (TextView) findViewById(R.id.textViewNetSalary1);


        tvName2 = (TextView) findViewById(R.id.textViewName2);
        tvLastName2 = (TextView) findViewById(R.id.textViewLastName2);
        tvEmployeePosition2 = (TextView) findViewById(R.id.textViewEmployeePosition2);
        tvMessage2Employee2 = (TextView) findViewById(R.id.textViewMessage2Employee2);
        tvHours2 = (TextView) findViewById(R.id.textViewWorkedHours2);
        tvDiscountISS2 = (TextView) findViewById(R.id.textViewAFP2);
        tvDiscountAFP2 = (TextView) findViewById(R.id.textViewISS2);
        tvDiscountRent2 = (TextView) findViewById(R.id.textViewRent2);
        tvTotalSalary2 = (TextView) findViewById(R.id.textViewTotalSalary2);
        tvNetSalary2 = (TextView) findViewById(R.id.textViewNetSalary2);

        tvName3 = (TextView) findViewById(R.id.textViewName3);
        tvLastName3 = (TextView) findViewById(R.id.textViewLastName3);
        tvEmployeePosition3 = (TextView) findViewById(R.id.textViewEmployeePosition3);
        tvMessage2Employee3 = (TextView) findViewById(R.id.textViewMessage2Employee3);
        tvHours3 = (TextView) findViewById(R.id.textViewWorkedHours3);
        tvDiscountISS3 = (TextView) findViewById(R.id.textViewAFP3);
        tvDiscountAFP3 = (TextView) findViewById(R.id.textViewISS3);
        tvDiscountRent3 = (TextView) findViewById(R.id.textViewRent3);
        tvTotalSalary3 = (TextView) findViewById(R.id.textViewTotalSalary3);
        tvNetSalary3 = (TextView) findViewById(R.id.textViewNetSalary3);

        tvMessage = (TextView) findViewById(R.id.textViewMessage);
        tvHighestPaidEmployee = (TextView) findViewById(R.id.textViewhighestPaidEmployee);
        tvLowestPaidEmployee = (TextView) findViewById(R.id.lowestPaidEmployee);
        tvHowManyEarnMoreThanThreeHundred = (TextView) findViewById(R.id.howManyEarnMoreThanThreeHundred);

        Bundle bundle = getIntent().getExtras();
        String name1 = bundle.getString("txtName1");
        String lastName1 = bundle.getString("txtLastName1");
        String employeePosition1 = bundle.getString("txtEmployeePosition1");
        String deductionsafp1 = bundle.getString("deductionsAFP1");
        String deductionsiss1 = bundle.getString("deductionsISS1");
        String deductionsrent1 = bundle.getString("deductionsRent1");
        String totalSalary1 = bundle.getString("totalSalary1");
        String netSalary1 = bundle.getString("netSalary1");
        String hours1 = bundle.getString("txtHours1");
        String message2Employee1 = bundle.getString("message2Employee1");

        String name2 = bundle.getString("txtName2");
        String lastName2 = bundle.getString("txtLastName2");
        String employeePosition2 = bundle.getString("txtEmployeePosition2");
        String deductionsafp2 = bundle.getString("deductionsAFP2");
        String deductionsiss2 = bundle.getString("deductionsISS2");
        String deductionsrent2 = bundle.getString("deductionsRent2");
        String totalSalary2 = bundle.getString("totalSalary2");
        String netSalary2 = bundle.getString("netSalary2");
        String hours2 = bundle.getString("txtHours2");
        String message2Employee2 = bundle.getString("message2Employee2");

        String name3 = bundle.getString("txtName3");
        String lastName3 = bundle.getString("txtLastName3");
        String employeePosition3 = bundle.getString("txtEmployeePosition3");
        String deductionsafp3 = bundle.getString("deductionsAFP3");
        String deductionsiss3 = bundle.getString("deductionsISS3");
        String deductionsrent3 = bundle.getString("deductionsRent3");
        String totalSalary3 = bundle.getString("totalSalary3");
        String netSalary3 = bundle.getString("netSalary3");
        String hours3 = bundle.getString("txtHours3");
        String message2Employee3 = bundle.getString("message2Employee3");

        String message = bundle.getString("message");
        String highestPaidEmployee = bundle.getString("highestPaidEmployee");
        String lowestPaidEmployee = bundle.getString("lowestPaidEmployee");
        String howManyEarnMoreThanThreeHundred = bundle.getString("howManyEarnMoreThanThreeHundred");


        tvName1.setText(getResources().getString(R.string.Name, name1));
        tvLastName1.setText(getResources().getString(R.string.LastName, lastName1));
        tvEmployeePosition1.setText(getResources().getString(R.string.EmployeePosition, employeePosition1));
        tvHours1.setText(getResources().getString(R.string.Hours, hours1));
        tvDiscountRent1.setText(getResources().getString(R.string.DiscountRent, deductionsrent1));
        tvDiscountISS1.setText(getResources().getString(R.string.DiscountISS,deductionsiss1));
        tvDiscountAFP1.setText(getResources().getString(R.string.DiscountAFP, deductionsafp1));
        tvTotalSalary1.setText(getResources().getString(R.string.TotalSalary, totalSalary1));
        tvNetSalary1.setText(getResources().getString(R.string.NetSalary,  netSalary1));
        tvMessage2Employee1.setText(message2Employee1);

        tvName2.setText(getResources().getString(R.string.Name, name2));
        tvLastName2.setText(getResources().getString(R.string.LastName, lastName2));
        tvEmployeePosition2.setText(getResources().getString(R.string.EmployeePosition, employeePosition2));
        tvHours2.setText(getResources().getString(R.string.Hours, hours2));
        tvDiscountRent2.setText(getResources().getString(R.string.DiscountRent, deductionsrent2));
        tvDiscountISS2.setText(getResources().getString(R.string.DiscountISS,deductionsiss2));
        tvDiscountAFP2.setText(getResources().getString(R.string.DiscountAFP, deductionsafp2));
        tvTotalSalary2.setText(getResources().getString(R.string.TotalSalary, totalSalary2));
        tvNetSalary2.setText(getResources().getString(R.string.NetSalary,  netSalary2));
        tvMessage2Employee2.setText(message2Employee2);

        tvName3.setText(getResources().getString(R.string.Name, name3));
        tvLastName3.setText(getResources().getString(R.string.LastName, lastName3));
        tvEmployeePosition3.setText(getResources().getString(R.string.EmployeePosition, employeePosition3));
        tvHours3.setText(getResources().getString(R.string.Hours, hours3));
        tvDiscountRent3.setText(getResources().getString(R.string.DiscountRent, deductionsrent3));
        tvDiscountISS3.setText(getResources().getString(R.string.DiscountISS,deductionsiss3));
        tvDiscountAFP3.setText(getResources().getString(R.string.DiscountAFP, deductionsafp3));
        tvTotalSalary3.setText(getResources().getString(R.string.TotalSalary, totalSalary3));
        tvNetSalary3.setText(getResources().getString(R.string.NetSalary,  netSalary3));
        tvMessage2Employee3.setText(message2Employee3);

        tvMessage.setText(message);
        tvHighestPaidEmployee.setText(getResources().getString(R.string.highestPaidEmployee, highestPaidEmployee));
        tvLowestPaidEmployee.setText(getResources().getString(R.string.lowestPaidEmployee, lowestPaidEmployee));
        tvHowManyEarnMoreThanThreeHundred.setText(getResources().getString(R.string.howManyEarnMoreThanThreeHundred, howManyEarnMoreThanThreeHundred));

    }
}