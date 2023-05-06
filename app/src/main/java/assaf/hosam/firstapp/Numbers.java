package assaf.hosam.firstapp;



import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Random;

public class Numbers {
    RadioButton choice1;
    RadioButton choice2;
    RadioButton choice3;
    TextView chosen;
    TextView random;
    int number_chosen;
    int number_random;
    TextView score;
    int score_number = 0;
    int d;
    int j;

    public Numbers(int number_chosen, RadioButton choice1, RadioButton choice2, RadioButton choice3, TextView chosen, TextView random, TextView score) {
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
        this.number_chosen = number_chosen;
        this.chosen = chosen;
        this.random = random;
        this.score = score;

    }

    public void result() {

        int g = ran_3();

        Random rand = new Random();

            int randomNum = rand.nextInt(10) + 1;
            number_random = randomNum;
            int res = randomNum * number_chosen;
            d = res;
            int second_rand = rand.nextInt(20) + 1;
            int third_rand = rand.nextInt(30) + 1;
            String randomn = String.valueOf(randomNum);
            String number_chosen_s = String.valueOf(number_chosen);
            String second_random_s = String.valueOf(second_rand);
            String third_random_s = String.valueOf(third_rand);
            String result = String.valueOf(res);
            if (g == 1) {
                j=g;
                choice1.setText(result);
                choice2.setText(second_random_s);
                choice3.setText(third_random_s);
                chosen.setText(number_chosen_s);
                random.setText(randomn);

            } else if (g == 2) {
                j=g;
                choice1.setText(second_random_s);
                choice2.setText(result);
                choice3.setText(third_random_s);
                chosen.setText(number_chosen_s);
                random.setText(randomn);
            } else if (g == 3) {
                j=g;
                choice1.setText(second_random_s);
                choice2.setText(third_random_s);
                choice3.setText(result);
                chosen.setText(number_chosen_s);
                random.setText(randomn);
            }
        }



    public static int mul(int s) {

        Random rand = new Random();
        int randomNum = rand.nextInt(10) + 1;
        return s * randomNum;

    }

    public static int ran_3() {
        Random random = new Random();
        int r = random.nextInt(3) + 1;
        return r;
    }

    public boolean chick_answer(int g, int h) {
        if (g == h) {
            score_number++;
            return true;
        } else {
            return false;
        }


    }



}

