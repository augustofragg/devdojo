package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class RepositorioTest01 {
    public static void main(String[] args) {

        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();

        repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

        repositorio = new RepositorioMemoria();
        repositorio.salvar();

        //Exemplo com uma colecao

        List<String> list = new ArrayList<>();
        list.add("Augusto");
        list.add("Luna");
        list.add("Jully");

        System.out.println(list);

        list = new LinkedList<>();
        list.add("Augusto");
        list.add("Luna");
        list.add("Jully");

        System.out.println(list);


    }
}
