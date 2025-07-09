package builder;

public class Robot {
    private String head;
    private String body;
    private String arms;
    private String legs;

    public void setHead(String head) {
        this.head = head;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setArms(String arms) {
        this.arms = arms;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "head='" + head + '\'' +
                ", body='" + body + '\'' +
                ", arms='" + arms + '\'' +
                ", legs='" + legs + '\'' +
                '}';
    }
}
