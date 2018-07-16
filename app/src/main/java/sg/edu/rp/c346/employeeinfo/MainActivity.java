package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployeeInfo;

    ArrayList<EmployeeItem> alEmployeeInfo;
    CustomAdapter caEmployee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployeeInfo = findViewById(R.id.listViewEmployee);

        alEmployeeInfo = new ArrayList<>();
        EmployeeItem emp1 = new EmployeeItem("John","Software Technical Leader", 3400.0);
        EmployeeItem emp2 = new EmployeeItem("May","Programmer",2200.0);
        EmployeeItem emp3 = new EmployeeItem("May","Programmer",2200.0);
        EmployeeItem emp4 = new EmployeeItem("May","Programmer",2200.0);
        EmployeeItem emp5 = new EmployeeItem("May","Programmer",2200.0);
        EmployeeItem emp6 = new EmployeeItem("May","Programmer",2200.0);
        EmployeeItem emp7 = new EmployeeItem("May","Programmer",2200.0);
        EmployeeItem emp8 = new EmployeeItem("May","Programmer",2200.0);
        EmployeeItem emp9 = new EmployeeItem("May","Programmer",2200.0);
        EmployeeItem emp10 = new EmployeeItem("May","Programmer",2200.0);
        EmployeeItem emp11 = new EmployeeItem("John","Software Technical Leader", 3400.0);
        EmployeeItem emp12 = new EmployeeItem("May","Programmer",2200.0);
        EmployeeItem emp13 = new EmployeeItem("May","Programmer",2200.0);
        EmployeeItem emp14 = new EmployeeItem("May","Programmer",2200.0);
        EmployeeItem emp15 = new EmployeeItem("May","Programmer",2200.0);

        alEmployeeInfo.add(emp1);
        alEmployeeInfo.add(emp2);
        alEmployeeInfo.add(emp3);
        alEmployeeInfo.add(emp4);
        alEmployeeInfo.add(emp5);
        alEmployeeInfo.add(emp6);
        alEmployeeInfo.add(emp7);
        alEmployeeInfo.add(emp8);
        alEmployeeInfo.add(emp9);
        alEmployeeInfo.add(emp10);
        alEmployeeInfo.add(emp11);
        alEmployeeInfo.add(emp12);
        alEmployeeInfo.add(emp13);
        alEmployeeInfo.add(emp14);
        alEmployeeInfo.add(emp15);

        caEmployee = new CustomAdapter(this,R.layout.employeeinfo_item,alEmployeeInfo);

        lvEmployeeInfo.setAdapter(caEmployee);
    }
}
