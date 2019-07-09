package com.dovm.jrnn_lib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;
import java.io.IOException;

import jrnnlm.core.RNNLM;
import jrnnlm.core.RNNLMConfiguration;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        RNNLMConfiguration conf = new RNNLMConfiguration();
//        conf.trainFile = new File("data/ptb.train.10k.txt");
//        conf.validFile = new File("data/ptb.valid.txt");
//        conf.hiddenSize = 100;
//        conf.maxIters = 50;
//        conf.fastMath = true;
//
//        RNNLM lm = null;
//        try {
//            lm = new RNNLM(conf);
//            lm.train();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
