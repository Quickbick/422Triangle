package org.cpts422;

import com.opencsv.CSVReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream mockout = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(mockout));
    }

    @AfterEach
    void tearDown() {
        System.setOut(stdout);
    }

    @Test
    void mainTest() {
        // Example of a single Test case
        String[] input = {"100","100","100"};
        String expected = "Equilateral Triangle";
        Main.main(input);
        assertEquals(expected,mockout.toString().trim());
        mockout.reset();
        // Example of reading testcases from CSV
        try {
            //Note: remember the last column of data.csv is manually populated
            CSVReader csvReader = new CSVReader(new FileReader(new File("data.csv")));
            List<String[]> testCaseList = csvReader.readAll();
            for(String[] testCase: testCaseList){
                String[] in = {testCase[0],testCase[1],testCase[2]};
                String expect = testCase[3];
                Main.main(in);
                assertEquals(expect,mockout.toString().trim());
                mockout.reset();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}