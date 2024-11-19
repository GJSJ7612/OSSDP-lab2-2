import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L2022111171_2_Test {

    @Test
    public void testSolution2() {
        Solution2 sol = new Solution2();
        //标准示例
        assertEquals("abc", sol.removeDuplicateLetters("bcabc"));
        assertEquals("acdb", sol.removeDuplicateLetters("cbacdcbc"));
        //单字符
        assertEquals("a", sol.removeDuplicateLetters("a"));
        //104 字符
        assertEquals("abcdefghijklmnopqrstuvwxyz", sol.removeDuplicateLetters("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"));
        //无重复字符
        assertEquals("abcd", sol.removeDuplicateLetters("abcd"));
        //包含重复字符且保持字符序最小
        assertEquals("eacb", sol.removeDuplicateLetters("ecbacba"));
        assertEquals("bac", sol.removeDuplicateLetters("bbcaac"));
        assertEquals("abc", sol.removeDuplicateLetters("aabbcc"));
    }

}
