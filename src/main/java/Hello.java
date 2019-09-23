public class Hello {
    private String text = "Hello JSON-world";

    //Names must property name for serialization to work!
    public String getText() {
        return text;
    }

    //Names must match property name for serialization to work!
    public void setText(String text) {
        this.text = text;
    }
}
