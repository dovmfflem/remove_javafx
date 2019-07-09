package com.dovm.jrnn_lib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import jrnnlm.core.RNNLM;
import jrnnlm.core.RNNLMConfiguration;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RNNLMConfiguration conf = new RNNLMConfiguration();
        conf.vocabSize = 4;
        conf.hiddenSize = 2;
        conf.maxIters = 10;
        conf.bpttBlock = 2;
        conf.trainData = new int[]{1, 2, 3, 0};
        conf.validData = new int[]{1, 2, 3, 0};

        try {
            RNNLM lm = new RNNLM(conf);

            Arrays.fill(lm.inputSynapse.weights.getData(), 0.1);
            Arrays.fill(lm.recurrentSynapse.weights.getData(), 0.1);
            Arrays.fill(lm.hiddenSynapse.weights.getData(), 0.1);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
