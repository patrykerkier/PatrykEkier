package hello;

public class Greeting {
    private final long id;
    private final String content;
    private final int age;
    private final String rodzaj;
    public Greeting(long id, String content, int age, String rodzaj) {
        this.id = id;
        this.content = content;
        this.age = age;
        this.rodzaj = rodzaj;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    public int getAge(){
        return age;
    }
    public String getRodzaj(){
        return rodzaj;
    }


}