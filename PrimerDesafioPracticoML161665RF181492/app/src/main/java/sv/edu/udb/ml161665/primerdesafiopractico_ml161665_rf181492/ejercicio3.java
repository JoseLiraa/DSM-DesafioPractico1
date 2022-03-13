package sv.edu.udb.ml161665.primerdesafiopractico_ml161665_rf181492;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ejercicio3 extends AppCompatActivity {

    private EditText eName1, eLastName1, eEmployePosition1, eWorkedHours1, eName2, eLastName2,
            eEmployePosition2, eWorkedHours2, eName3, eLastName3, eEmployePosition3, eWorkedHours3;

    double iss = 0.0525, afp = 0.0688, rent = 0.1;
    double remaining1, remaining2, remaining3;
    double liquidSalary1, liquidSalary2,liquidSalary3;
    double deductions1, netSalary1, totalSalary1;
    double deductions2, netSalary2, totalSalary2;
    double deductions3, netSalary3, totalSalary3;

    double deductionsiss1, deductionsafp1, deductionsrent1;
    double deductionsiss2, deductionsafp2, deductionsrent2;
    double deductionsiss3, deductionsafp3, deductionsrent3;
    String message, message2Employee1, message2Employee2, message2Employee3;
    String highestPaidEmployee;
    String lowestPaidEmployee;
    String Position1 = "Gerente";
    String Position2 = "Asistente";
    String Position3 = "Secretaria";
    int howManyEarnMoreThanThreeHundred=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);
        eName1 = (EditText)findViewById(R.id.txtName1);
        eLastName1 = (EditText)findViewById(R.id.txtLastName1);
        eEmployePosition1 = (EditText)findViewById(R.id.txtemployeePosition1);
        eWorkedHours1 = (EditText)findViewById(R.id.txtWorkedHours1);

        eName2 = (EditText)findViewById(R.id.txtName2);
        eLastName2 = (EditText)findViewById(R.id.txtLastName2);
        eEmployePosition2 = (EditText)findViewById(R.id.txtemployeePosition2);
        eWorkedHours2 = (EditText)findViewById(R.id.txtWorkedHours2);

        eName3 = (EditText)findViewById(R.id.txtName3);
        eLastName3 = (EditText)findViewById(R.id.txtLastName3);
        eEmployePosition3 = (EditText)findViewById(R.id.txtemployeePosition3);
        eWorkedHours3 = (EditText)findViewById(R.id.txtWorkedHours3);
    }




    public void calculate(View v){
        if(validation()){
            Toast.makeText(this,"Ingreso datos", Toast.LENGTH_SHORT).show();
        }

        String name1 = eName1.getText().toString();
        String name2 = eName2.getText().toString();
        String name3 = eName3.getText().toString();

        String hour1String =eWorkedHours1.getText().toString();
        String hour2String =eWorkedHours2.getText().toString();
        String hour3String =eWorkedHours3.getText().toString();

        String employePosition1 = eEmployePosition1.getText().toString();
        String employePosition2 = eEmployePosition2.getText().toString();
        String employePosition3 = eEmployePosition3.getText().toString();

        //The total salary is calculated, based on the hours worked
        if(!hour1String.isEmpty()){
            int hour1 = Integer.parseInt(eWorkedHours1.getText().toString());

            if(!hour2String.isEmpty()){
                int hour2 = Integer.parseInt(eWorkedHours2.getText().toString());

                if(!hour3String.isEmpty()){
                    int hour3 = Integer.parseInt(eWorkedHours3.getText().toString());

                    if(hour1 <= 160){
                        totalSalary1 = hour1 * 9.75;
                    }
                    if(hour1 > 160){
                        remaining1 = hour1 - 160;
                        totalSalary1 = remaining1 * 11.5;
                        totalSalary1 = totalSalary1 + (160 * 9.75);
                    }

                    if(hour2 <= 160){
                        totalSalary2 = hour2 * 9.75;
                    }
                    if(hour2 > 160){
                        remaining2 = hour2 - 160;
                        totalSalary2 = remaining2 * 11.5;
                        totalSalary2 = totalSalary2 + (160 * 9.75);
                    }

                    if(hour3 <= 160){
                        totalSalary3 = hour3 * 9.75;
                    }
                    if(hour3 > 160){
                        remaining3 = hour3 - 160;
                        totalSalary3 = remaining3 * 11.5;
                        totalSalary3 = totalSalary3 + (160 * 9.75);
                    }
                }
            }
        }

        //Discounts, liquid salary and deductions are calculated
        deductions1 = (iss + afp + rent) * totalSalary1;
        liquidSalary1 = totalSalary1 - deductions1;
        deductionsafp1 = totalSalary1 * afp;
        deductionsiss1 = totalSalary1 * iss;
        deductionsrent1 = totalSalary1 * rent;

        deductions2 = (iss + afp + rent) * totalSalary2;
        liquidSalary2 = totalSalary2 - deductions2;
        deductionsafp2 = totalSalary2 * afp;
        deductionsiss2 = totalSalary2 * iss;
        deductionsrent2 = totalSalary2 * rent;

        deductions3 = (iss + afp + rent) * totalSalary3;
        liquidSalary3 = totalSalary3 - deductions3;
        deductionsafp3 = totalSalary3 * afp;
        deductionsiss3 = totalSalary3 * iss;
        deductionsrent3 = totalSalary3 * rent;

        //determined the bonus
        if(employePosition1.equals(Position1) && employePosition2.equals(Position2) && employePosition3.equals(Position3)){
            message = "NO HAY BONO";
            message2Employee1 = "";
            message2Employee2 = "";
            message2Employee3 = "";
        }
        else{
            message = "HAY BONO";

            if(employePosition1.equals(Position1)){
                netSalary1 = liquidSalary1 * 1.1;
                message2Employee1 = "El bono del Gerente es de 10%";
            } else if(employePosition1.equals(Position2)){
                netSalary1 = liquidSalary1 * 1.05;
                message2Employee1 = "El bono del Asistente es de 5%";
            }
            else if(employePosition1.equals(Position3)){
                netSalary1 = liquidSalary1 * 1.03;
                message2Employee1 = "El bono de la Secretaria es de 3%";
            }else{
                netSalary1 = liquidSalary1 * 1.02;
                message2Employee1 = "El bono es de 2%";
            }




            if(employePosition2.equals(Position1)){
                netSalary2 = liquidSalary2 * 1.1;
                message2Employee2 = "El bono del Gerente es de 10%";
            } else if(employePosition2.equals(Position2)){
                netSalary2 = liquidSalary2 * 1.05;
                message2Employee2 = "El bono del Asistente es de 5%";
            }else if(employePosition2.equals(Position3)){
                netSalary2 = liquidSalary2 * 1.03;
                message2Employee2 = "El bono de la Secretaria es de 3%";
            }else{
                netSalary2 = liquidSalary2 * 1.02;
                message2Employee2 = "El bono es de 2%";
            }





            if(employePosition3.equals(Position1)){
                netSalary3 = liquidSalary3 * 1.1;
                message2Employee3 = "El bono del Gerente es de 10%";
            } else if(employePosition3.equals(Position2)){
                netSalary3 = liquidSalary3 * 1.05;
                message2Employee3 = "El bono del Asistente es de 5%";
            } else if(employePosition3.equals(Position3)){
                netSalary3 = liquidSalary3 * 1.03;
                message2Employee3 = "El bono de la Secretaria es de 3%";
            }else{
                netSalary3 = liquidSalary3 * 1.02;
                message2Employee3 = "El bono es de 2%";
            }
        }




        //looking for the employee with the highest and lowest salary
        double array[] = {netSalary1, netSalary2, netSalary3};
        double biggestNumber = array[0];
        double smallestNumber = array[0];

        for (int x = 1; x < array.length; x++) {
            double currentNumber = array[x];
            if (currentNumber > biggestNumber) {
                biggestNumber = currentNumber;
            }
        }

        for (int y = 1; y < array.length; y++) {
            double currentNumber2 = array[y];
            if (currentNumber2 < smallestNumber) {
                smallestNumber = currentNumber2;
            }
        }


        if(biggestNumber == netSalary1){
            highestPaidEmployee = name1;
        }
        if(biggestNumber == netSalary2){
            highestPaidEmployee = name2;
        }
        if(biggestNumber == netSalary3){
            highestPaidEmployee = name3;
        }

        if(smallestNumber == netSalary1){
            lowestPaidEmployee = name1;
        }
        if(smallestNumber == netSalary2){
            lowestPaidEmployee = name2;
        }
        if(smallestNumber == netSalary3){
            lowestPaidEmployee = name3;
        }

        for (int z = 0; z < array.length; z++) {
            double currentNumber2 = array[z];
            if (currentNumber2 > 300) {
                howManyEarnMoreThanThreeHundred ++;
            }
        }


        Intent i = new Intent(this, Ejercicio3ImprimeDatos.class);
        i.putExtra("txtName1", eName1.getText().toString());
        i.putExtra("txtLastName1", eLastName1.getText().toString());
        i.putExtra("txtEmployeePosition1", eEmployePosition1.getText().toString());
        i.putExtra("deductionsAFP1",String.valueOf(deductionsafp1));
        i.putExtra("deductionsISS1",String.valueOf(deductionsiss1));
        i.putExtra("deductionsRent1",String.valueOf(deductionsrent1));
        i.putExtra("totalSalary1", String.valueOf(totalSalary1));
        i.putExtra("netSalary1", String.valueOf(netSalary1));
        i.putExtra("txtHours1", eWorkedHours1.getText().toString());
        i.putExtra("message2Employee1", String.valueOf(message2Employee1));




        i.putExtra("txtName2", eName2.getText().toString());
        i.putExtra("txtLastName2", eLastName2.getText().toString());
        i.putExtra("txtEmployeePosition2", eEmployePosition2.getText().toString());
        i.putExtra("deductionsAFP2",String.valueOf(deductionsafp2));
        i.putExtra("deductionsISS2",String.valueOf(deductionsiss2));
        i.putExtra("deductionsRent2",String.valueOf(deductionsrent2));
        i.putExtra("totalSalary2", String.valueOf(totalSalary2));
        i.putExtra("netSalary2", String.valueOf(netSalary2));
        i.putExtra("txtHours2", eWorkedHours2.getText().toString());
        i.putExtra("message2Employee2", String.valueOf(message2Employee1));



        i.putExtra("txtName3", eName3.getText().toString());
        i.putExtra("txtLastName3", eLastName3.getText().toString());
        i.putExtra("txtEmployeePosition3", eEmployePosition3.getText().toString());
        i.putExtra("deductionsAFP3",String.valueOf(deductionsafp3));
        i.putExtra("deductionsISS3",String.valueOf(deductionsiss3));
        i.putExtra("deductionsRent3",String.valueOf(deductionsrent3));
        i.putExtra("totalSalary3", String.valueOf(totalSalary3));
        i.putExtra("netSalary3", String.valueOf(netSalary3));
        i.putExtra("txtHours3", eWorkedHours3.getText().toString());
        i.putExtra("message2Employee3", String.valueOf(message2Employee1));

        i.putExtra("message",String.valueOf(message));
        i.putExtra("highestPaidEmployee",String.valueOf(highestPaidEmployee));
        i.putExtra("lowestPaidEmployee",String.valueOf(lowestPaidEmployee));
        i.putExtra("howManyEarnMoreThanThreeHundred",String.valueOf(howManyEarnMoreThanThreeHundred));
        startActivity(i);



    }






    public boolean validation(){
        boolean result = true;

        String name1 = eName1.getText().toString();
        String lastName1 = eLastName1.getText().toString();
        String employePosition1 = eEmployePosition1.getText().toString();
        String hour1String =eWorkedHours1.getText().toString();


        String name2 = eName2.getText().toString();
        String lastName2 = eLastName2.getText().toString();
        String employePosition2 = eEmployePosition2.getText().toString();
        String hour2String =eWorkedHours1.getText().toString();


        String name3 = eName3.getText().toString();
        String lastName3 = eLastName3.getText().toString();
        String employePosition3 = eEmployePosition3.getText().toString();
        String hour3String =eWorkedHours1.getText().toString();



        //--------------------------------------------------------------
        if(name1.isEmpty()){
            eName1.setError("Campo vacio, ingrese un nombre");
            result = false;
        }
        if(lastName1.isEmpty()){
            eLastName1.setError("Campo vacio, ingrese un apellido");
            result = false;
        }
        if(employePosition1.isEmpty()){
            eEmployePosition1.setError("Campo vacio, ingrese un cargo de trabajo");
            result = false;
        }
        if(hour1String.isEmpty()){
            eWorkedHours1.setError("Campo vacio, ingrese las horas trabajadas");
            result = false;
        }else{
            int hour1 = Integer.parseInt(eWorkedHours1.getText().toString());
            if(hour1 <= 0) {
                eWorkedHours1.setError("Dato incorrecto, ingrese solo números mayores a 0");
                result = false;
            }
        }



        //--------------------------------------------------------------
        if(name2.isEmpty()){
            eName2.setError("Campo vacio, ingrese un nombre");
            result=false;
        }
        if(lastName2.isEmpty()){
            eLastName2.setError("Campo vacio, ingrese un apellido");
            result = false;
        }
        if(employePosition2.isEmpty()){
            eEmployePosition2.setError("Campo vacio, ingrese un cargo de trabajo");
            result = false;
        }
        if(hour2String.isEmpty()){
            eWorkedHours2.setError("Campo vacio, ingrese las horas trabajadas");
            result = false;
        }else{
            int hour2 = Integer.parseInt(eWorkedHours2.getText().toString());
            if(hour2 <= 0) {
                eWorkedHours2.setError("Dato incorrecto, ingrese solo números mayores a 0");
                result = false;
            }
        }


        //--------------------------------------------------------------
        if(name3.isEmpty()){
            eName3.setError("Campo vacio, ingrese un nombre");
            result=false;
        }
        if(lastName3.isEmpty()){
            eLastName3.setError("Campo vacio, ingrese un apellido");
            result = false;
        }
        if(employePosition3.isEmpty()){
            eEmployePosition3.setError("Campo vacio, ingrese un cargo de trabajo");
            result = false;
        }
        if(hour3String.isEmpty()){
            eWorkedHours3.setError("Campo vacio, ingrese las horas trabajadas");
            result = false;
        }else{
            int hour3 = Integer.parseInt(eWorkedHours3.getText().toString());
            if(hour3 <= 0) {
                eWorkedHours3.setError("Dato incorrecto, ingrese solo números mayores a 0");
                result = false;
            }
        }


        return result;
    }
}