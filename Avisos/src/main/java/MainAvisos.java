
public class MainAvisos {

    public static void main(String[] args) {
        Aviso aviso1 = new Aviso();
        aviso1.numero = 1;
        aviso1.titulo = "Insumos y bienes muebles de laboratorio disponibles";
        aviso1.nombre = "Eduardo Flores Díaz";
        aviso1.texto = "La Coordinación de Control Técnico de Insumos (COCTI) de la Dirección de Prestaciones Médicas, pone a " + "\ndisposición del personal que realiza investigación el inventario adjunto.";
        aviso1.resumen = "Insumos y bienes muebles de laboratorio disponibles por la Coordinación de Control Técnico de Insumos (COCTI)";
        aviso1.fecha = "02/02/2020";
        aviso1.alta = "02/02/2020";
        aviso1.baja = "02/02/2021";
        aviso1.status = "Vigente";
        aviso1.tipo = "General";
        System.out.println(aviso1.toString());
        System.out.println("\n\n\n");

        Aviso aviso2 = new Aviso();
        aviso2.numero = 2;
        aviso2.titulo = "CONFERENCIA DR. COSSARIZZA";
        aviso2.nombre = "Kevin Meza Gonzalez";
        aviso2.texto = "El Dr. Andrea Cossarizza, ofreció a la comunidad IMSS su conferencia “Clinical Applications of Advanced Cytometry” y aprovechó "
                + "\nla presencia de investigadores y estudiantes del IMSS para compartir sus últimos resultados de investigación, aún no publicados, sobre VIH y"
                + "\n el uso de citometría de flujo.Además, invitó a nuestra comunidad a agregarse a la sociedad internacional sobre citometría:"
                + "\n ISAC(International Society for the Advancement of Cytometry) y aprovechar los recursos que tienen como:\n\n"
                + "Programa de Liderazgo MARYLOU INGRAM SCHOLARS PROGRAM, de 5 años para formación de citomteristas\n"
                + "Iniciativa de innovación CYTO-Innovation apoya a las propuestas innovadoras que contemplan la conversión de ideas en productos comerciales de alto"
                + "\n impacto para ayudar a nuevos empresarios a aprovechar la tecnología de citometría\n\n"
                + "Además en la ISAC tienen disponibles una serie de manuales e información de punta sobre la citometría para uso libre. El Dr. Cossarizza reiteró la "
                + "\ninvitación al personal IMSS a vincularse con la Universidad de Módena y su laboratorio aprovechando el prestigio que tiene el Laboratorio de "
                + "\nCitometría de Flujo del Centro de Instrumentos del Centro Médico Nacional Siglo XXI.";
        aviso2.resumen = "Conferencia de Dr. Andrea Cossarizza del tema ''Clinical Applications of Advanced Cytometry''";
        aviso2.fecha = "02/03/2020";
        aviso2.alta = "15/02/2020";
        aviso2.baja = "31/03/2020";
        aviso2.status = "No Vigente";
        aviso2.tipo = "Conferencia";
        System.out.println(aviso2.toString());
    }
}
