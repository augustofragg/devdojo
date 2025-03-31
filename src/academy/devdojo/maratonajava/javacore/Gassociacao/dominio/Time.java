package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Time {
    private String name;

    public void imprimir() {
        System.out.println(this.name);
    }

    public Time(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
