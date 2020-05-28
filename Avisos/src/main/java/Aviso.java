
public class Aviso {
    
    int numero=0;
    String titulo="";
    String texto="";
    String resumen="";
    String fecha="";
    String alta="";
    String baja="";
    String tipo="";
    String status="";
    String nombre="";
    @Override
   public String toString(){
 return "Aviso "+"\nAviso No."+numero+"\nTitulo: "+titulo+"\nPublico: "+nombre+"\nTexto del aviso: "+texto+"\n\nResumen: "+resumen+"\nFecha de publicacion: "+fecha+"\nFecha de alta: "+alta+"\nFecha de baja: "+baja+"Status: "+status;
}
}

