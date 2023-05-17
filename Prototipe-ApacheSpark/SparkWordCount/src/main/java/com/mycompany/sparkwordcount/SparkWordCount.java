/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sparkwordcount;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import scala.Tuple2;

import java.util.Arrays;

public class SparkWordCount {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: SparkWordCount <input> <output>");
            System.exit(1);
        }

        SparkConf sparkConf = new SparkConf().setAppName("Spark Word Count");
        JavaSparkContext sc = new JavaSparkContext(sparkConf);

        JavaRDD<String> inputFile = sc.textFile(args[0]);
        JavaPairRDD<String, Integer> wordCounts = inputFile
                .flatMap(s -> Arrays.asList(s.split(" ")).iterator())
                .mapToPair(word -> new Tuple2<>(word, 1))
                .reduceByKey(Integer::sum);

        wordCounts.saveAsTextFile(args[1]);

        sc.stop();
    }
}
