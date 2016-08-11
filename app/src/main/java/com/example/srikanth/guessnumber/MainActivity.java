package com.example.srikanth.guessnumber;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.*;

public class MainActivity extends AppCompatActivity {
    EditText mEdit,mEdit2,mEdit3;
    public static final int EXITT=0,Help=1;
    Button Button4,Button6,Button5;
    public int attempts,c,num;
    public String user=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        menu.add(Menu.NONE,Help,Menu.NONE,"Help");
        menu.add(Menu.NONE,EXITT,Menu.NONE,"Exit");
        return true;
    }
    @Override public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case Help:
                setContentView(R.layout.activity_help);
                return true;
            case EXITT:
                new AlertDialog.Builder(this).setMessage("Are you sure you want to exit?").setNegativeButton(android.R.string.no,null).setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface arg0, int arg1) {
                        MainActivity.super.onBackPressed();
                    }
                }).create().show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void ButtonClick(View view)
    {
        setContentView(R.layout.activity_button);
    }
    public void Button1(View view) {
        setContentView(R.layout.activity_button1);
        c = -1;
        Button4 = (Button) findViewById(R.id.button4);
        mEdit = (EditText) findViewById(R.id.editText);
        Random generate = new Random();
        num = generate.nextInt(100);
        attempts = 6;
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        Button4.setOnClickListener(new View.OnClickListener() {
            public void onBackPressed(){
                setContentView(R.layout.activity_button);
            }
            @Override
            public void onClick(View view) {
                user=mEdit.getText().toString();
                c=Integer.parseInt(user);
                if(c==-1) {
                    builder.setMessage("Please enter a number first!!!");
                    builder.show();
                }
                if (c < 0 || c > 100) {
                        builder.setMessage("This is an invalid number, enter another number");
                        builder.show();
                }
                else{
                    if (c==num) {
                        builder.setMessage("Congrats, You win");
                        builder.show();
                        setContentView(R.layout.activity_button);
                    }
                        else if (c < num) {
                            attempts = attempts - 1;
                            if(attempts!=0) {
                                builder.setMessage("You are almost there, the number you entered is less than my number");
                                builder.show();
                            }
                        }
                        else {
                            attempts = attempts - 1;
                            if(attempts!=0) {
                                builder.setMessage("You are almost there, the number you entered is more than my number");
                                builder.show();
                            }
                        }
                    }
                    if(attempts==0) {
                        builder.setMessage("You lose, Better luck next time.The number i thought is  "+num);
                        builder.show();
                        setContentView(R.layout.activity_button);
                    }
                    else {
                        Context context = getApplicationContext();
                        Toast.makeText(context, attempts + " more attempts left", Toast.LENGTH_SHORT).show();
                    }
                }
        });
    }
    public void Button2(View view)
    {
        setContentView(R.layout.activity_button2);
        Button5 = (Button)this.findViewById(R.id.button6);
        mEdit2 = (EditText) findViewById(R.id.editText2);
        attempts=7;
        c=-1;
        Random generate = new Random();
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        num = generate.nextInt(500);
        Button5.setOnClickListener(new View.OnClickListener() {
            public void onBackPressed(){
                setContentView(R.layout.activity_button);
            }
            @Override
            public void onClick(View view) {
                user = mEdit2.getText().toString();
                c = Integer.parseInt(user);
                if (c == -1) {
                    builder.setMessage("Please enter a number first");
                    builder.show();
                }
                else {
                    if (c < 0 || c > 500) {
                        builder.setMessage("This is an invalid number, enter another number");
                        builder.show();
                    } else {
                        if (c == num) {
                            builder.setMessage("Congrats, You win");
                            builder.show();
                            setContentView(R.layout.activity_button);
                        } else if (c < num) {
                            attempts = attempts - 1;
                            if(attempts!=0) {
                                builder.setMessage("You are almost there, the number you entered is less than my number");
                                builder.show();
                            }
                        } else {
                            attempts = attempts - 1;
                            if(attempts!=0) {
                                builder.setMessage("You are almost there, the number you entered is more than my number");
                                builder.show();
                            }
                        }
                    }
                    if (attempts == 0) {
                        builder.setMessage("You lose, Better luck next time.The number i thought is  "+num);
                        builder.show();
                        setContentView(R.layout.activity_button);
                    }
                    else {
                        Context context = getApplicationContext();
                        Toast.makeText(context, attempts + " more attempts left", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
    public void Button3(View view) {
        setContentView(R.layout.activity_button3);
        Button6 = (Button) findViewById(R.id.button8);
        mEdit3 = (EditText) findViewById(R.id.editText3);
        attempts = 8;
        c = -1;
        Random generate = new Random();
        num = generate.nextInt(1000);
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        Button6.setOnClickListener(new View.OnClickListener() {
            public void onBackPressed() {
                setContentView(R.layout.activity_button);
            }
            @Override
            public void onClick(View view) {
                user = mEdit3.getText().toString();
                c = Integer.parseInt(user);
                if (c == -1) {
                    builder.setMessage("Please enter a number first");
                    builder.show();
                } else {
                    if (c < 0 || c > 1000) {
                        builder.setMessage("This is an invalid number, enter another number");
                        builder.show();
                    } else {
                        if (c == num) {
                            builder.setMessage("Congrats, You win");
                            builder.show();
                            setContentView(R.layout.activity_button);
                        } else if (c < num) {
                            attempts = attempts - 1;
                            if(attempts!=0) {
                                builder.setMessage("You are almost there, the number you entered is less than my number");
                                builder.show();
                            }
                        } else {
                            attempts = attempts - 1;
                            if(attempts!=0) {
                                builder.setMessage("You are almost there, the number you entered is more than my number");
                                builder.show();
                            }
                        }
                    }
                    if (attempts == 0) {
                        builder.setMessage("You lose, Better luck next time.The number i thought is  "+num);
                        builder.show();
                        setContentView(R.layout.activity_button);
                    }
                    else {
                        Context context = getApplicationContext();
                        Toast.makeText(context, attempts + " more attempts left", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
    public void Button4(View view)
    {
        setContentView(R.layout.activity_developer);
    }
}

