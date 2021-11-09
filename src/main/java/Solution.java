import java.io.*;

class Result {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */
/**
 * This is another way of solve the same problem
 * The limitation is that the modulo for big numbers in the computer doesn't work
 * and the loop will take forever with big strings down there is the another approach
    public static long repeatedString(String s, long n) {
        long countOfACharacters = 0;
        int lengthOfString = s.length();
        for(long i=0; i<n; i++) {
            if (s.charAt(i % lengthOfString))=='a') countOfACharacters++;
        }
        return countOfACharacters;
    }
*/
    public static long repeatedString(String s, long n) {
        long countOfACharacters = 0;
        int lengthOfString = s.length();
        for (int i=0; i<lengthOfString; i++) {
            if (s.charAt(i)=='a') countOfACharacters++;
        }
        long timesOfRepetition = (n / lengthOfString);
        long remainderOfString = n - (lengthOfString * timesOfRepetition);
        long extraCountOfACharacters = 0;
        for (int i=0; i<remainderOfString; i++) {
            if (s.charAt(i)=='a') extraCountOfACharacters++;
        }
        return timesOfRepetition * countOfACharacters + extraCountOfACharacters;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
