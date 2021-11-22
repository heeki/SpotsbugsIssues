package cloud.heeki;

public class Issue1501 {

    /** warns on the String.format line properly */
    public void warnsOnIssue() {
        System.out.format("hello world" + " GitHub.\n");
    }

    /** no warning on the String.format line (false negative) */
    public void doesNotWarnOnIssue() {
        String var = "hello world";
        System.out.format(var + " GitHub.\n");
    }
}