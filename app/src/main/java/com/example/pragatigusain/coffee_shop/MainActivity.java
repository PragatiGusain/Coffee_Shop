package com.example.pragatigusain.coffee_shop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    TextView cname,cquantity;
    EditText enter_name,enter_quantity;
    RadioButton quantity250, quantity500;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cname=(TextView)findViewById(R.id.tv2);
        cquantity=(TextView)findViewById(R.id.tv3);
        enter_name=(EditText)findViewById(R.id.et1);
        enter_quantity=(EditText)findViewById(R.id.et2);
        quantity250=(RadioButton)findViewById(R.id.r1);
        quantity500=(RadioButton)findViewById(R.id.r2);
        submit=(Button)findViewById(R.id.b1);
        submit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String name=String.valueOf(enter_name.getText());
                int quantity=Integer.parseInt(enter_quantity.getText().toString());
                int totalPrice=0;
                if(quantity250.isChecked())
                    totalPrice=quantity*10;
                else if(quantity500.isChecked())
                    totalPrice=quantity*15;
                else
                    Toast.makeText(getApplicationContext(),"Please Enter Valid Details",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Hello " +name+ "Your Total Price Is: " +totalPrice,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
