public class Application {

  public static void main(String[] args) {  
    SubstringSlidingWindow subString = new SubstringSlidingWindow();
    
		int len1 = subString.lengthOfLongestSubstring("abcabcbb");
		System.out.println("Test 1 " + len1);

		int len2 = subString.lengthOfLongestSubstring("abcadcbb");
		System.out.println("Test 2 " + len2);

		int len3 = subString.lengthOfLongestSubstring("pwwwkew");
		System.out.println("Test 3 " + len3);

    int len4 = subString.lengthOfLongestSubstring("bbbbb");
    System.out.println("Test 4 " + len4);

    int len5 = subString.lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ ");
    System.out.println("Test 5 " + len5);
  }
}
