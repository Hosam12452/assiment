package assaf.hosam.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    Button btnNext;
    RadioButton firstR;
    RadioButton secondR;
    RadioButton thirdR;
    TextView chosenNumber;
    TextView randomNumber;
   private final int scoreNumber=10;
    private int sucece=0;
    private int failed=0;
    TextView score;
    RadioGroup radioGroup;
    private int k;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);
        btnNext = findViewById(R.id.Next);
        firstR = findViewById(R.id.radioButton);
        secondR = findViewById(R.id.radioButton2);
        thirdR = findViewById(R.id.radioButton3);
        chosenNumber = findViewById(R.id.textView2);
        randomNumber = findViewById(R.id.textView);
        score=findViewById(R.id.textView3);
        radioGroup=findViewById(R.id.radiogroup);
        result=findViewById(R.id.textView5);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score.setText("Your score is :"+"Success:"+sucece+"   "+ "Failed:"+failed);

            }
        });


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                chosenNumber.setText(R.string.chosen);
                randomNumber.setText(R.string.random);

                String selectedItem = parent.getItemAtPosition(position).toString();


//                if (sucece + failed > 10) {
//                    if (sucece >= 6) {
//                        result.setText("Nice Gob! you success with grade :" + sucece + "/10");
//                    } else {
//                        result.setText("Sorry(><) :" + sucece + "/10");
//
//                    }
               // } else {
                    switch (selectedItem) {

                        case " ":
                            chosenNumber.setText("CHOSEN NUMBER");
                        case "One":
                                 Numbers number = new Numbers(1, firstR, secondR, thirdR, chosenNumber, randomNumber, score);
                                 number.result();
                                 k = number.d;
                                 if (number.j == 1) {
                                     int first = Integer.parseInt((String) firstR.getText());
                                     if (k == first) {
                                         sucece++;
                                     } else {
                                         failed++;
                                     }
                                 } else if (number.j == 2) {
                                     int second = Integer.parseInt((String) secondR.getText());
                                     if (k == second) {
                                         sucece++;
                                     } else {
                                         failed++;
                                     }
                                 } else {
                                     int third = Integer.parseInt((String) thirdR.getText());
                                     if (k == third) {
                                         sucece++;
                                     } else {
                                         failed++;
                                     }
                                 }

                            break;
                        case "Two":
                            Numbers number2 = new Numbers(2, firstR, secondR, thirdR, chosenNumber, randomNumber, score);
                            number2.result();
                            k = number2.d;
                            if(number2.j==1){
                                int first = Integer.parseInt((String) firstR.getText());
                                if (k == first) {
                                    sucece++;
                                } else {
                                    failed++;
                                }
                            }
                            else if(number2.j==2){
                                int second = Integer.parseInt((String) secondR.getText());
                                if (k == second) {
                                    sucece++;
                                } else {
                                    failed++;
                                }
                            }
                            else{
                                int third = Integer.parseInt((String)thirdR.getText());
                                if (k == third) {
                                    sucece++;
                                } else {
                                    failed++;
                                }
                            }
                            break;
                        case "Three":
                            Numbers number3 = new Numbers(3, firstR, secondR, thirdR, chosenNumber, randomNumber, score);
                            number3.result();
                            break;
                        case "Four":
                            Numbers number4 = new Numbers(4, firstR, secondR, thirdR, chosenNumber, randomNumber, score);
                            number4.result();
                            break;
                        case "Five":
                            Numbers number5 = new Numbers(5, firstR, secondR, thirdR, chosenNumber, randomNumber, score);
                            number5.result();
                            break;
                        case "Six":
                            Numbers number6 = new Numbers(6, firstR, secondR, thirdR, chosenNumber, randomNumber, score);
                            number6.result();
                            break;
                        case "Seven":
                            Numbers number7 = new Numbers(7, firstR, secondR, thirdR, chosenNumber, randomNumber, score);
                            number7.result();
                            break;
                        case "Eight":
                            Numbers number8 = new Numbers(8, firstR, secondR, thirdR, chosenNumber, randomNumber, score);
                            number8.result();
                            break;
                        case "Nine":
                            Numbers number9 = new Numbers(9, firstR, secondR, thirdR, chosenNumber, randomNumber, score);
                            number9.result();
                            break;
                        case "Ten":
                            Numbers number10 = new Numbers(10, firstR, secondR, thirdR, chosenNumber, randomNumber, score);
                            number10.result();
                            break;
                        default:
                            break;
                    }


           //     }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });









}}
