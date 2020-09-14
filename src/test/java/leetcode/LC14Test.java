package leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LC14Test {
    @Test
    public void solution1Test() {
        var ownClassName = getClass().getName();
        var classToTestName = ownClassName.substring(0, ownClassName.length() - 4);
        var ownMethodName = new Object(){}.getClass().getEnclosingMethod().getName();
        var methodToTestName = ownMethodName.substring(0, ownMethodName.length() - 4);
        try {
            var lcClass = Class.forName(classToTestName);
            var methodToTest = lcClass.getDeclaredMethod(methodToTestName);
            var lc = lcClass.getDeclaredConstructor().newInstance();
            assertEquals("fl", methodToTest.invoke(lc, new Object[]{new String[]{"flower", "flow", "flight"}}));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
