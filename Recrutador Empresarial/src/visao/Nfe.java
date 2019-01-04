package visao;  
import java.io.File;
import java.io.FileNotFoundException;  
import java.io.IOException;  
import java.util.HashMap;  
import javax.swing.ImageIcon;  
import net.sf.jasperreports.engine.JRException;  
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;  
import net.sf.jasperreports.engine.JasperPrint;  
import net.sf.jasperreports.engine.data.JRXmlDataSource;  
import net.sf.jasperreports.view.JasperViewer;  
  
public class Nfe {  
    /**  
     * @param args the command line arguments  
     */    
    public static void main(String[] args) throws FileNotFoundException, IOException {    
        try {    
            ImageIcon imagemTituloJanela = new ImageIcon("C:/NFe/nfe.gif");                 
                //Caminho do arquivo .JASPER    
                String relatorio = ("C:/NFe/Danfe.jasper");    
                //Configurando a classe JRXmlDataSource que apontara o caminho do  nosso XML de dados e sua pesquisa XPath geral    
                JRXmlDataSource xml = new JRXmlDataSource("C:/NFe/XML 00018 - 41170124929783000150550010000000181556464581-procNFe.xml", "/nfeProc/NFe/infNFe/det");    
                HashMap mapa = new HashMap();  
              //  mapa.put("Logo","C:/NFe/logo-nfe.png");  
                //Gerando o relatorio (Filling) informando o caminho do relatorio, os parametros (neste caso nenhum paramentro esta sendo passado ao relatorio, por isso o HashMap esta vazio) e o objeto JRXmlDataSource configurado)    
                JasperPrint jp = JasperFillManager.fillReport(relatorio, mapa, xml);     
                //Utilizando o JasperView, uma classe desktop do jasper para visualização dos relatorios    
                JasperViewer jv = new JasperViewer(jp, false);    
                jv.setTitle("VISUALIZADOR DE DOCUMENTO FISCAL ELETRÔNICA");  
                jv.setIconImage(imagemTituloJanela.getImage());  
                jv.setVisible(true);
              //  exportando arquivo para pdf  
              // JasperExportManager.exportReportToPdfFile(jp, "C:/NFe/arquivo.pdf");  
               // Runtime.getRuntime().exec("cmd /c start C:/NFe/arquivo.pdf");  
               // deletando arquivo  
               //File file = new File("C:/NFe/arquivo.pdf");  
               //file.deleteOnExit();  
        } catch (JRException e) {    
            e.printStackTrace();    
        }    
    }    
}  