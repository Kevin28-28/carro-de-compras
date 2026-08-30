using System;
using System.Collections generic;
namespace carrito.logic
public class carrito{
    public list {datalle} ist detalle {get; set;}
    //constructor
    public carrito()
    this ist datalle = new list (deatelle);
}

public boll aregar producto (int intCantidad, producto obj producto)
{
    //validaciones
    if (obj producto.verificarStock (intCantidad)){
        console.writelime ("no hay stock");
        return false;
    }
    //De lo contrario
ist detalle.add (new deatalle (intCantida, obj producto));
}
public lorid mostrarCarrito(){
    if (ist detalle.count == 0 )
}
//Error
return;
foreach (var item in ist detalle)
{
item.mostrarDetalle();
}