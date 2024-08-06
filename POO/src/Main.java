//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro Fusca = new Carro();
        Fusca.modelo = "fusca";
        Fusca.cor = "Preto";
        Fusca.marca = "Wolksvagen";
        Fusca.anoCarro = 1988;
        Fusca.vendido = true;

        System.out.println(Fusca.vendido);
    }
}