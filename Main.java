public class Main {
    public static void main(String[] args) {
        // Crear usuario y cliente
        Usuario usuario = new Usuario("juan123", "clave123");
        Cliente cliente = new Cliente("Juan Pérez", "123456789", usuario);

        // Crear productos
        Producto p1 = new Producto("Laptop", 800.50);
        Producto p2 = new Producto("Mouse", 25.75);

        // Crear carrito y agregar productos
        Carrito carrito = new Carrito();
        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);

        // Crear banco y pago
        Banco banco = new Banco("Banco Nacional");
        Pago pago = new Pago(carrito.calcularTotal(), banco);

        // Crear bitácora
        Bitacora bitacora = new Bitacora();
        bitacora.registrar("Cliente " + cliente.getNombre() + " inició compra.");
        bitacora.registrar("Total a pagar: $" + carrito.calcularTotal());

        // Procesar pago
        if (pago.realizarPago()) {
            bitacora.registrar("Pago realizado con éxito en " + banco.getNombre());
        } else {
            bitacora.registrar("Error en el pago.");
        }

        // Mostrar bitácora
        bitacora.mostrarRegistros();
    }
}