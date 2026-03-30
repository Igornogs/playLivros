package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.enums.VersaoEnum;
import br.com.etechoracio.playlivros.model.Livro;

import java.time.LocalTime;

public class CarrinhoCompras {
    static void main() {
        Livro primeiroLivro = new Livro();
        primeiroLivro.titulo = "Um Estudo em Vermelho";
        primeiroLivro.autor = "Árthur Conan Doyle";
        primeiroLivro.narrador = "Patrícia Casagrande";
        primeiroLivro.editora =  "Ward, Lock & Co";
        primeiroLivro.duracao = LocalTime.of(4, 40);
        primeiroLivro.versao = VersaoEnum.INTEGRAL;
        primeiroLivro.preco = 58.25;
        primeiroLivro.resumo = "Um estudo em vermelho marca o início da trajetória de sucesso do maior detetive da literatura mundial: Sherlock Holmes.";
    }
}
