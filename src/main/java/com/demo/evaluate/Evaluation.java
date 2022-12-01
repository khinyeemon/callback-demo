package com.demo.evaluate;

import com.demo.ds.Pair;
import com.demo.evaluation.Evaluator;
import com.demo.printer.ValuePrinter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Evaluation {

    public void evaluate(int num, Evaluator evaluator, ValuePrinter valuePrinter){
        List<Pair>pairs=generatePairs(num);
        for(Pair pair:pairs){
            valuePrinter.print(evaluator.evaluate(pair.getA(),pair.getB()));
        }

    }
    private List<Pair>generatePairs(int num){
        return IntStream.range(1,num+1)
                .mapToObj(i->new Pair(i,i*2))
                .collect(Collectors.toList());
    }
}
