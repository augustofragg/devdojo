package academy.devdojo.maratonajava.javacore.Ycolecoes.domain;

public class Smartphone {
    private String seriaNumber;
    private String modelo;

    public Smartphone(String seriaNumber, String modelo) {
        this.seriaNumber = seriaNumber;
        this.modelo = modelo;
    }
    // Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
    // Simétrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
    // Transitividade: para x,y,z diferentes de null, se x.equals(y) == true, e x.equals(z) == true logo, y.equals(z) == true
    // Consistente: x.equals(x) sempre retorna true se x for diferente de null
    // para x diferente de null, x.equals(null) tem que retornar false.

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return seriaNumber != null && seriaNumber.equals(smartphone.seriaNumber);
    }

    // se x.equals(y) == true, y.hashCode() == x.hashCode()
    // y.hashCode() == x.hashCode() não necessariamente o equals de y.equals(x) tem que ser true
    // x.equals(y) == false
    // y.hashCode() != x.hashCode() x.equals(y) deverá ser false.

    @Override
    public int hashCode() {
        return seriaNumber == null ? 0 : this.seriaNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "seriaNumber='" + seriaNumber + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public String getSeriaNumber() {
        return seriaNumber;
    }

    public void setSeriaNumber(String seriaNumber) {
        this.seriaNumber = seriaNumber;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
