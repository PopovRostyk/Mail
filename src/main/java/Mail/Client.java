package Mail;

import java.util.List;

import java.util.ArrayList;

public class Client {
    private String name;
    private int age;
    private String sex;
    private List<MailInfo> clientLists = new ArrayList();
    public Client(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void addMail(MailInfo mail) {
        this.clientLists.add(mail);
    }
    public String toString() {
        return  name + " with age of " + age + " of " + sex + " gender.";
    }
}