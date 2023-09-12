package org.cpts422;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/*
We use this utility class to generate a CSV which has the inputs for our Boundary Value Test Case
As a software engineer responsible for testing the software, you will end up creating many such utilities.
 */
public class BoundaryValueTestSetGenerator {

    public static void main(String[] args) {
        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter(new File("data1.csv")));
            /*
            Note: After writing into the CSV, you need to manually add the expected value. See data.csv for example
             */
            String[] bvs = {"1","200","100"};
            Set<List<String>> tcs = new HashSet<>();
            for (String bv: bvs) {
                for (int i = 0; i < 3 ; i++) {
                    List<String> tc = new ArrayList<>(Arrays.asList("100","100","100"));
                    tc.set(i,bv);
                    tcs.add(tc);
                }
            }
            for(List<String> tc: tcs){
                csvWriter.writeNext(tc.toArray(new String[tc.size()]));
            }
            csvWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
