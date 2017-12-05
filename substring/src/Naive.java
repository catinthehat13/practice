// Given a string, find the length of the longest substring without repeating characters.

public class Naive {

    public int lengthOfLongestSubstring(String s) {

        int result = 0;
        int curLen = 0;

        String resultSt = "";
        String curSt = "";

        for (int i = 0; i < s.length(); i++) {
            int[] vc = initVC();

            for (int j = i; j < s.length(); j++) {
                if(hasSeen(s.charAt(j), vc)) {
                    if(result < curLen) {
                        result = curLen;
                        resultSt = curSt;
                    }
                    curLen = 0;
                    curSt = "";
                }
                else {
                    int vcIndex = getVCIndex(s.charAt(j));
                    vc[vcIndex] = 1;
                    curLen++;
                    curSt += s.charAt(j);
                }
            }

            // We got to the end of the string. Store results and reset.
            if (result < curLen) {
                result = curLen;
                resultSt = curSt;
            }

            curLen = 0;
            curSt = "";
        }


        System.out.println("Result String: " + resultSt);
        return result;
    }

    private int getVCIndex(char ch) {

        int chAscii = (int) ch;

        if (chAscii < 0) {
            throw new IllegalArgumentException("Letter not supported: " + ch);
        }

        return chAscii;
    }

    private boolean hasSeen(char ch, int[] vc) {
        int vcIndex = getVCIndex(ch);
        return vc[vcIndex] == 1;
    }

    private int[] initVC() {
        int[] vc = new int[256];

        for(int i = 0; i < vc.length; i++) {
            vc[i] = 0;
        }

        return vc;
    }
}
