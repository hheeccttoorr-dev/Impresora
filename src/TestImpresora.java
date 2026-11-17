public class TestImpresora {
    public static void main() {
        Impresora impresora = new Impresora();

        impresora.imprimir(7);
        impresora.imprimir(5.9);
        impresora.imprimir("Hola Mundo");
        impresora.imprimir("Hola Mundo", 3);
    }
}
