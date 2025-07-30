package Observer;

public class EmailAlertsListener implements EventListener {
    private String email;

    public EmailAlertsListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String filename) {
        System.out.println("Email to : " + email + "File " + filename + " has changed. \n");
    }
}
