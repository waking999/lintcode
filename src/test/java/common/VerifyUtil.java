package common;


import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class VerifyUtil {
    private final static double DIFF = 0.0000000000001;

    public static void verifySortedInOut(int[][] expect, List<List<Integer>> output, int seq) {
        int expectLen = expect.length;
        int outputSize = output.size();
        Assertions.assertEquals(expectLen, outputSize, seq + ":wrong");

        String[] expectOut = new String[expectLen];
        String[] outputOut = new String[expectLen];
        for (int i = 0; i < expectLen; i++) {
            String s1 = IntStream.of(expect[i]).boxed().sorted().collect(Collectors.toList()).stream()
                    .map(num -> Integer.toString(num)).collect(Collectors.joining(","));
            expectOut[i] = s1;
            String s2 = output.get(i).stream().sorted().map(num -> Integer.toString(num)).collect(Collectors.joining(","));
            outputOut[i] = s2;

        }
        Arrays.sort(expectOut);
        Arrays.sort(outputOut);
        for (int i = 0; i < expectLen; i++) {
            Assertions.assertEquals(expectOut[i], outputOut[i], seq + ":wrong");
        }

    }

    public static void verifySortedInOut(String[][] expect, List<List<String>> output, int seq) {
        int expectLen = expect.length;
        int outputSize = output.size();
        Assertions.assertEquals(expectLen, outputSize, seq + ":wrong");

        String[] expectOut = new String[expectLen];
        String[] outputOut = new String[expectLen];
        for (int i = 0; i < expectLen; i++) {
            String s1 = Arrays.stream(expect[i]).sorted().collect(Collectors.joining(","));
            expectOut[i] = s1;
            String s2 = output.get(i).stream().sorted().collect(Collectors.joining(","));
            outputOut[i] = s2;

        }
        Arrays.sort(expectOut);
        Arrays.sort(outputOut);
        for (int i = 0; i < expectLen; i++) {
            Assertions.assertEquals(expectOut[i], outputOut[i], seq + ":wrong");
        }

    }

    public static void verifySortedOut(Integer[][] expect, List<List<Integer>> output, int seq) {
        int expectLen = expect.length;
        int outputSize = output.size();
        Assertions.assertEquals(expectLen, outputSize, seq + ":wrong");

        String[] expectOut = new String[expectLen];
        String[] outputOut = new String[expectLen];
        for (int i = 0; i < expectLen; i++) {
            int expectInLen=expect[i].length;
            StringBuilder sb1=new StringBuilder();
            for(int j=0;j<expectInLen;j++){
                if(expect[i][j]==null){
                    sb1.append("null,");
                }else{
                    sb1.append(expect[i][j]).append(",");
                }
            }
            expectOut[i] = sb1.toString();

            int outputInLen=output.get(i).size();
            StringBuilder sb2=new StringBuilder();
            for(int j=0;j<outputInLen;j++){
                if(output.get(i).get(j)==null){
                    sb2.append("null,");
                }else{
                    sb2.append(output.get(i).get(j)).append(",");
                }
            }
            outputOut[i] = sb2.toString();

        }
        Arrays.sort(expectOut);
        Arrays.sort(outputOut);
        for (int i = 0; i < expectLen; i++) {
            Assertions.assertEquals(expectOut[i], outputOut[i], seq + ":wrong");
        }

    }

    public static void verifyUnsort(int[][] expect, List<List<Integer>> output, int seq) {
        int expectLen = expect.length;
        int outputSize = output.size();
        Assertions.assertEquals(expectLen, outputSize, seq + ":wrong");

        for (int i = 0; i < expectLen; i++) {
            String expectStr = IntStream.of(expect[i]).boxed().collect(Collectors.toList()).stream()
                    .map(num -> Integer.toString(num)).collect(Collectors.joining(","));

            String outputStr = output.get(i).stream().map(num -> Integer.toString(num)).collect(Collectors.joining(","));
            Assertions.assertEquals(expectStr, outputStr, seq + ":wrong");
        }
    }

    public static void verifyUnsort(String[][] expect, List<List<String>> output, int seq) {
        int expectLen = expect.length;
        int outputSize = output.size();
        Assertions.assertEquals(expectLen, outputSize, seq + ":wrong");

        for (int i = 0; i < expectLen; i++) {
            String expectStr = String.join(",", expect[i]);
            String outputStr = String.join(",", output.get(i));
            Assertions.assertEquals(expectStr, outputStr, seq + ":wrong");
        }
    }

    public static void verifyUnsort(List<List<Integer>> expect, List<List<Integer>> output, int seq) {
        int expectLen = expect.size();
        int outputSize = output.size();
        Assertions.assertEquals(expectLen, outputSize, seq + ":wrong");

        for (int i = 0; i < expectLen; i++) {
            String expectStr = expect.get(i).stream().map(num -> Integer.toString(num)).collect(Collectors.joining(","));
            String outputStr = output.get(i).stream().map(num -> Integer.toString(num)).collect(Collectors.joining(","));
            Assertions.assertEquals(expectStr, outputStr, seq + ":wrong");
        }
    }
    public static void verifyUnsort( Integer[][] expect, List<List<Integer>> output, int seq) {
        int expectLen = expect.length;
        int outputSize = output.size();
        Assertions.assertEquals(expectLen, outputSize, seq + ":wrong");

        for (int i = 0; i < expectLen; i++) {
            String expectStr = Arrays.stream(expect[i]).map(num -> Integer.toString(num)).collect(Collectors.joining(","));
            String outputStr = output.get(i).stream().map(num -> Integer.toString(num)).collect(Collectors.joining(","));
            Assertions.assertEquals(expectStr, outputStr, seq + ":wrong");
        }
    }

    public static void verifyUnsort(int[][] expect, int[][] output, int seq) {
        int expectLen = expect.length;
        int outputSize = output.length;
        Assertions.assertEquals(expectLen, outputSize, seq + ":wrong");

        for (int i = 0; i < expectLen; i++) {
            String expectStr = Arrays.stream(expect[i]).boxed().collect(Collectors.toList()).stream()
                    .map(num -> Integer.toString(num)).collect(Collectors.joining(","));

            String outputStr = Arrays.stream(output[i]).boxed().collect(Collectors.toList()).stream()
                    .map(num -> Integer.toString(num)).collect(Collectors.joining(","));
            Assertions.assertEquals(expectStr, outputStr, seq + ":wrong");
        }

    }

    public static void verifyUnsort(String[] expect, List<String> output, int seq) {
        if (expect == null && output == null) {
            return;
        }

        assert expect != null;
        int expectLen = expect.length;
        int outputSize = output.size();
        Assertions.assertEquals(expectLen, outputSize, seq + ":wrong");

        String expectStr = String.join(",", expect);
        String outputStr = String.join(",", output);
        Assertions.assertEquals(expectStr, outputStr, seq + ":wrong");
    }

    public static void verifyUnsort(String[] expect, String[] output, int seq) {

        int expectLen = expect.length;
        int outputSize = output.length;
        Assertions.assertEquals(expectLen, outputSize, seq + ":wrong");

        String expectStr = String.join(",", expect);
        String outputStr = String.join(",", output);
        Assertions.assertEquals(expectStr, outputStr, seq + ":wrong");
    }

    public static void verifySort(int[] expect, List<Integer> output, int seq) {

        int expectLen = expect.length;
        int outputSize = output.size();
        Assertions.assertEquals(expectLen, outputSize, seq + ":wrong");

        String expectStr = Arrays.stream(expect).sorted().boxed().collect(Collectors.toList()).stream()
                .map(num -> Integer.toString(num)).collect(Collectors.joining(","));
        String outputStr = output.stream().sorted().map(num -> Integer.toString(num)).collect(Collectors.joining(","));
        Assertions.assertEquals(expectStr, outputStr, seq + ":wrong");
    }
    public static void verifySort(Integer[] expect, List<Integer> output, int seq) {

        int expectLen = expect.length;
        int outputSize = output.size();
        Assertions.assertEquals(expectLen, outputSize, seq + ":wrong");

        String expectStr = Arrays.stream(expect).sorted().map(num -> Integer.toString(num)).collect(Collectors.joining(","));
        String outputStr = output.stream().sorted().map(num -> Integer.toString(num)).collect(Collectors.joining(","));
        Assertions.assertEquals(expectStr, outputStr, seq + ":wrong");
    }

    public static void verifySort(String[] expect, String[] output, int seq) {

        int expectLen = expect.length;
        int outputSize = output.length;
        Assertions.assertEquals(expectLen, outputSize, seq + ":wrong");

        String expectStr = Arrays.stream(expect).sorted().collect(Collectors.joining(","));
        String outputStr = Arrays.stream(output).sorted().collect(Collectors.joining(","));
        Assertions.assertEquals(expectStr, outputStr, seq + ":wrong");
    }



    public static void verifySort(String[] expect,List<String> output, int seq) {

        int expectLen = expect.length;
        int outputSize = output.size();

        Assertions.assertEquals(expectLen, outputSize, seq + ":wrong");

        String expectStr = Arrays.stream(expect).sorted().collect(Collectors.joining(","));
        String outputStr = output.stream().sorted().collect(Collectors.joining(","));
        Assertions.assertEquals(expectStr, outputStr, seq + ":wrong");
    }


    public static void verifyUnSort(Boolean[] expect, List<Boolean> output, int seq) {

        int expectLen = expect.length;
        int outputSize = output.size();
        Assertions.assertEquals(expectLen, outputSize, seq + ":wrong");

        String expectStr = Arrays.stream(expect).map(Object::toString).collect(Collectors.joining(","));
        String outputStr = output.stream().map(Object::toString).collect(Collectors.joining(","));
        Assertions.assertEquals(expectStr, outputStr, seq + ":wrong");
    }

    public static void verifyUnsort(int[] expect, List<Integer> output, int seq) {
        if (expect == null && output == null) {
            return;
        }
        assert expect != null;
        int expectLen = expect.length;
        int outputSize = output.size();
        Assertions.assertEquals(expectLen, outputSize, seq + ":wrong");

        String expectStr = Arrays.stream(expect).boxed().map(num -> Integer.toString(num)).collect(Collectors.joining(","));
        String outputStr = output.stream().map(num -> Integer.toString(num)).collect(Collectors.joining(","));
        Assertions.assertEquals(expectStr, outputStr, seq + ":wrong");
    }


    public static void verifyUnsort(Integer[] expect, List<Integer> output, int seq) {
        if(expect==null&&output==null){
            return;
        }
        assert expect != null;
        int expectLen = expect.length;
        int outputSize = output.size();

        Assertions.assertEquals(expectLen, outputSize, seq + ":wrong");
        for (int i = 0; i < expectLen; i++) {
            Assertions.assertEquals(expect[i], output.get(i), seq + ":wrong");
        }


    }

    public static void verifyUnsort(double[] expect, List<Double> output, int seq) {

        int expectLen = expect.length;
        int outputSize = output.size();
        Assertions.assertEquals(expectLen, outputSize, seq + ":wrong");

        for (int i = 0; i < expectLen; i++) {

            Assertions.assertTrue(Math.abs(expect[i] - output.get(i)) < DIFF, seq + ":wrong");
        }

    }

    public static void verifyUnsort(int[] expect, Integer[] output, int seq) {

        int expectLen = expect.length;
        int outputSize = output.length;
        Assertions.assertEquals(expectLen, outputSize, seq + ":wrong");


        String expectStr = Arrays.stream(expect).sorted().boxed().collect(Collectors.toList()).stream()
                .map(num -> Integer.toString(num)).collect(Collectors.joining(","));
        String outputStr = Arrays.stream(output).sorted().collect(Collectors.toList()).stream()
                .map(num -> Integer.toString(num)).collect(Collectors.joining(","));

        Assertions.assertEquals(expectStr, outputStr, seq + ":wrong");

    }

//	public static void verify(int[] expect, int[] output, int seq) {
//
//		int expectLen = expect.length;
//		int outputSize = output.length;
//		assert (expectLen == outputSize) : seq + ":wrong";
//		String expectStr = Arrays.stream(expect).sorted().boxed().collect(Collectors.toList()).stream()
//				.map(num -> Integer.toString(num)).collect(Collectors.joining(","));
//		String outputStr = Arrays.stream(output).sorted().boxed().collect(Collectors.toList()).stream()
//				.map(num -> Integer.toString(num)).collect(Collectors.joining(","));
//		assert (expectStr.equals(outputStr)) : seq + ":wrong";
//	}

    public static void verifyUnsort(char[] expect, char[] output, int seq) {

        int expectLen = expect.length;
        int outputSize = output.length;
        Assertions.assertEquals(expectLen, outputSize, seq + ":wrong");

        String expectStr = new String(expect);
        String outputStr = new String(output);
        Assertions.assertEquals(expectStr, outputStr, seq + ":wrong");
    }

    public static void verifySort(int[] expect, int[] output, int seq) {

        int expectLen = expect.length;
        int outputSize = output.length;
        Assertions.assertEquals(expectLen, outputSize, seq + ":wrong");

        String expectStr = Arrays.stream(expect).sorted().boxed().collect(Collectors.toList()).stream()
                .map(num -> Integer.toString(num)).collect(Collectors.joining(","));
        String outputStr = Arrays.stream(output).sorted().boxed().collect(Collectors.toList()).stream()
                .map(num -> Integer.toString(num)).collect(Collectors.joining(","));
        Assertions.assertEquals(expectStr, outputStr, seq + ":wrong");
    }

    public static void verifyUnsort(int[] expect, int[] output, int seq) {
        if(expect==null&&output==null){
            return;
        }

        assert expect != null;
        int expectLen = expect.length;
        int outputSize = output.length;
        Assertions.assertEquals(expectLen, outputSize, seq + ":wrong");

        String expectStr = Arrays.stream(expect).boxed().collect(Collectors.toList()).stream()
                .map(num -> Integer.toString(num)).collect(Collectors.joining(","));
        String outputStr = Arrays.stream(output).boxed().collect(Collectors.toList()).stream()
                .map(num -> Integer.toString(num)).collect(Collectors.joining(","));
        Assertions.assertEquals(expectStr, outputStr, seq + ":wrong");
    }


    public static void verify(int expect, int output, int seq) {
        Assertions.assertEquals(expect, output, seq + ":wrong");
    }

    public static void verify(double expect, double output, int seq) {
        Assertions.assertTrue(Math.abs(expect - output) < DIFF, seq + ":wrong");
    }

    public static void verify(boolean expect, boolean output, int seq) {
        Assertions.assertEquals(expect, output, seq + ":wrong");
    }

    public static void verify(String expect, String output, int seq) {
        Assertions.assertEquals(expect, output, seq + ":wrong");
    }
}
