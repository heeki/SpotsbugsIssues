package cloud.heeki;

public class App {
    /** runner for issue 1501 */
    public void run1501() {
        Issue1501 issue1501 = new Issue1501();
        issue1501.warnsOnIssue();
        issue1501.doesNotWarnOnIssue();
    }

    /** runner for issue 1518 */
    public void run1518() {
        Issue1518 issue1518 = new Issue1518();
        issue1518.warnsOnIssue();
        issue1518.doesNotWarnOnIssue();
    }

    /** main execution */
    public static void main( String[] args ) {
        App app = new App();
        app.run1501();
        app.run1518();
    }
}
