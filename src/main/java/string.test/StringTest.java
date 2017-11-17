package string.test;

import org.apache.commons.lang3.StringUtils;

public class StringTest {
    public static void main(String[] args) {
        System.out.println(StringUtils.isEmpty(null));
        System.out.println(StringUtils.isEmpty(""));
        System.out.println(StringUtils.isEmpty(" "));
        System.out.println(StringUtils.isEmpty("bob"));
        System.out.println(StringUtils.isEmpty(null));
        System.out.println(StringUtils.isEmpty(null));

    }
}

