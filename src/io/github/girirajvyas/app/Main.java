package io.github.girirajvyas.app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import io.github.girirajvyas.pojo.ProcessingYear;
import io.github.girirajvyas.pojo.TaxLiability;
import io.github.girirajvyas.pojo.TaxPayerIndividual;
import io.github.girirajvyas.util.InputDataParser;

public class Main {

    public static void main(String[] args) {
        // year,age,income,investment
        // String arg = "2019,28,500000,75000";
        List<String[]> arguments = Arrays.stream(args).map(p -> p.split(",")).collect(Collectors.toList());

        // print to check input data
        arguments.forEach(p -> System.out.println(Arrays.toString(p)));

        String data = args[0];
        String[] individualData = data.split(",");

        System.out.println(Arrays.toString(individualData));

        // Print data
        //Arrays.stream(individualData).forEach(System.out::println);

        ProcessingYear processingYear = ProcessingYear.getEnum(InputDataParser.getInt(individualData[0]));

        Integer age = InputDataParser.getInt(individualData[1]);
        Integer income = InputDataParser.getInt(individualData[2]);
        Integer investmentDeductions = InputDataParser.getInt(individualData[3]);

        TaxPayerIndividual individual = new TaxPayerIndividual(age, income, investmentDeductions);
        System.out.println(individual);

        TaxLiability tax = TaxCalculator.processTax(individual, processingYear);
        System.out.println(tax);

    }
}
