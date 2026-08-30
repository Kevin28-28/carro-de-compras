namespace carrito.logica
public class detalle{
    public producto obj {get; set;}
    public int intCantidad {get; set;}
    //contructor
    public detalle (producto obj producto, int intCantidad){
        this.objproducto = obj producto;
        this.intCantidad = intCantidad;
        public double calcular subtotal(){
            if (objproducto = null) return 0.0;
            return objproducto.dbiprecio * intCantidad;}
            public voidMostrar detalle (){
                double dbi subtotal = calculat subtotal();
                console.wrireline ($ "{objProducto.nombre}{dbi subtotal}")
            }
    }
}