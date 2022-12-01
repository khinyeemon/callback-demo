package com.demo;

import com.demo.evaluate.Evaluation;
import com.demo.evaluation.MultiplyEvaluator;
import com.demo.evaluation.PlusEvalutor;
import com.demo.printer.DecorateValuePrinter;
import com.demo.printer.StandardValuePrinter;

public class Main {
    public static void main(String[] args) {
        Evaluation evaluation=new Evaluation();
        evaluation.evaluate(3,new MultiplyEvaluator(),new StandardValuePrinter());
    }
}
