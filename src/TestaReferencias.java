public class TestaReferencias {
}

void main() {
    Livro harryPotter = new Livro ();
    harryPotter.titulo = "Meu livro do Harry Potter";
    System.out.println(harryPotter.titulo);

    Livro harry = harryPotter;
    harry.titulo = "Meu livro Harry";
    System.out.println(harry.titulo);

    System.out.println(harryPotter.titulo);

    """ sout """
}
