
package Clases;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JOptionPane;

public class Plantilla {
    
    String NombreCliente;
    String fecha;
    String rutaImagen;
    List<RegistroVentas> RegistroVentas;
    
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;
    
    public Plantilla(String nombrecliente,String fecha,String rutaimagen,List<RegistroVentas> registroventas ){
        this.NombreCliente = nombrecliente;
        this.fecha = fecha;
        this.rutaImagen = rutaimagen;
        this.RegistroVentas = registroventas;
        
        documento = new Document();
        titulo = new Paragraph("Registro de ventas");
    }
    
    public void CrearPlantilla(){
        try{
            
            archivo = new FileOutputStream(NombreCliente + ".pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            titulo.setAlignment(1);
            
            Image image = null;
            
            try {
                image =  Image.getInstance(rutaImagen);//carga imagen
                image.scaleAbsolute(150, 100);//cambia tamaño
                image.setAbsolutePosition(415, 750);//coloca imagen en la posicion
                
            } 
            catch (Exception e) {
            }
            
            documento.add(image);//agrega la imagen al documento
            
            documento.add(titulo);
            
            documento.add(new Paragraph("Cliente: " + NombreCliente));
            
            documento.add(Chunk.NEWLINE);
            
            Paragraph texto = new Paragraph("En nombre de la empresa TUFARMA S.A.C queremos agredecerle inmensamente por la confianza en  " 
                    + " nuestros productos! Esperamos que estés súper contento con tu compra, tal como lo estamos nosotros. ¡No solo eso, esperamos "
                    + " que hagas un buen uso de tu producto y que el mismo supere todas tus expectativas! ,Lo recomendamos especialmente para que puede ayudarte "
                    + " y aliviarte con todas los problemas que necesitas para que sean resueltos, Si puedes, comparte comentarios sobre el producto, nos será de gran "
                    + " ayuda para entender cómo lo estás disfrutando mejor y, si hay algún punto de mejora que podamos aprovechar para mejorar aún más. "
                    + " Y, por supuesto, si necesitas ayuda, ¡siempre estamos disponibles!");
         
            texto.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(texto);
            
            documento.add(Chunk.NEWLINE);
            
            PdfPTable tabla = new PdfPTable(4);
            tabla.setWidthPercentage(100);
            PdfPCell ID = new PdfPCell(new Phrase("ID"));
            ID.setBackgroundColor(BaseColor.BLUE);
            PdfPCell ClienteName = new PdfPCell(new Phrase("Cliente"));
            ClienteName.setBackgroundColor(BaseColor.BLUE);
            PdfPCell VendedorName = new PdfPCell(new Phrase("Vendedor"));
            VendedorName.setBackgroundColor(BaseColor.BLUE);
            PdfPCell TotalMonto =  new PdfPCell(new Phrase("Total"));
            TotalMonto.setBackgroundColor(BaseColor.BLUE);
            
            tabla.addCell(ID);
            tabla.addCell(ClienteName);
            tabla.addCell(VendedorName);
            tabla.addCell(TotalMonto);
            
            for(RegistroVentas persona: this.RegistroVentas){
                tabla.addCell(persona.getCodigo());                
                tabla.addCell(persona.getCliente());
                tabla.addCell(persona.getVendedor());
                tabla.addCell(persona.getTotal()+"");                
            }
            
            documento.add(tabla);          
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha: " + fecha));
            
            documento.close();
            JOptionPane.showMessageDialog(null, "El archivo PDF se a creado correctamente!");
        }
        catch(FileNotFoundException e){
            System.err.println(e.getMessage());
        }
        catch(DocumentException e){
            System.err.println(e.getMessage());
        }
    }
}
