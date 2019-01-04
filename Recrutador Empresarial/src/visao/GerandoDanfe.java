/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.io.ByteArrayInputStream;  
import java.io.FileNotFoundException;  
import java.io.IOException;  
import java.io.InputStream;  
import java.util.HashMap;  
  
import javax.swing.ImageIcon;  
  
import net.sf.jasperreports.engine.JRException;  
import net.sf.jasperreports.engine.JasperFillManager;  
import net.sf.jasperreports.engine.JasperPrint;  
import net.sf.jasperreports.engine.data.JRXmlDataSource;  
import net.sf.jasperreports.view.JasperViewer;  
  
public class GerandoDanfe {  
    /**  
     * @param args the command line arguments  
     */    
    public static void main(String[] args) throws FileNotFoundException, IOException {    
        String stringComEstruturaDoXML="<nfeProc versao=\"3.10\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><NFe xmlns=\"http://www.portalfiscal.inf.br/nfe\"><infNFe Id=\"NFe41170124929783000150550010000000181556464581\" versao=\"3.10\"><ide><cUF>41</cUF><cNF>55646458</cNF><natOp>Venda</natOp><indPag>0</indPag><mod>55</mod><serie>1</serie><nNF>18</nNF><dhEmi>2017-01-11T15:46:51-02:00</dhEmi><dhSaiEnt>2017-01-11T15:47:00-02:00</dhSaiEnt><tpNF>1</tpNF><idDest>2</idDest><cMunFG>4106902</cMunFG><tpImp>1</tpImp><tpEmis>1</tpEmis><cDV>1</cDV><tpAmb>1</tpAmb><finNFe>1</finNFe><indFinal>1</indFinal><indPres>9</indPres><procEmi>0</procEmi><verProc>0</verProc></ide><emit><CNPJ>24929783000150</CNPJ><xNome>E-GUARDIAN SOLUCOES TECNOLOGICAS</xNome><xFant>E-GUARDIAN SOLUCOES TECNOLOGICAS</xFant><enderEmit><xLgr>EST. Das Olarias</xLgr><nro>550</nro><xCpl>UN.64</xCpl><xBairro>Atuba</xBairro><cMun>4106902</cMun><xMun>Curitiba</xMun><UF>PR</UF><CEP>82630160</CEP><cPais>1058</cPais><xPais>BRASIL</xPais><fone>4184059749</fone></enderEmit><IE>9072316409</IE><IM>0</IM><CNAE>6209100</CNAE><CRT>1</CRT></emit><dest><CNPJ>49483225000135</CNPJ><xNome>ASSCONT ASSESSORIA CONTABIL E AUDITORIA S/S</xNome><enderDest><xLgr>RUA BOA VISTA</xLgr><nro>254</nro><xCpl>10 ANDAR CONJ 1001</xCpl><xBairro>SAO PAULO</xBairro><cMun>3550308</cMun><xMun>Sao Paulo</xMun><UF>SP</UF><CEP>01014907</CEP><cPais>1058</cPais><xPais>BRASIL</xPais></enderDest><indIEDest>9</indIEDest></dest><autXML><CNPJ>24929783000150</CNPJ></autXML><det nItem=\"1\"><prod><cProd>MLI-CLOUD001</cProd><cEAN/><xProd>Licenca de Uso - HSC MailInspector - Antispam, Antimalware, AntiPhishing e AntiVirus - Nuvem Compartilhada</xProd><NCM>00000000</NCM><CFOP>6102</CFOP><uCom>un</uCom><qCom>50.0000</qCom><vUnCom>38.15000</vUnCom><vProd>1907.50</vProd><cEANTrib/><uTrib>un</uTrib><qTrib>50.0000</qTrib><vUnTrib>38.15000</vUnTrib><indTot>1</indTot></prod><imposto><vTotTrib>0.00</vTotTrib><ICMS><ICMSSN102><orig>0</orig><CSOSN>102</CSOSN></ICMSSN102></ICMS><PIS><PISNT><CST>07</CST></PISNT></PIS><COFINS><COFINSNT><CST>07</CST></COFINSNT></COFINS></imposto></det><total><ICMSTot><vBC>0.00</vBC><vICMS>0.00</vICMS><vICMSDeson>0.00</vICMSDeson><vBCST>0.00</vBCST><vST>0.00</vST><vProd>1907.50</vProd><vFrete>0.00</vFrete><vSeg>0.00</vSeg><vDesc>0.00</vDesc><vII>0.00</vII><vIPI>0.00</vIPI><vPIS>0.00</vPIS><vCOFINS>0.00</vCOFINS><vOutro>0.00</vOutro><vNF>1907.50</vNF><vTotTrib>0.00</vTotTrib></ICMSTot></total><transp><modFrete>9</modFrete><vol/></transp><infAdic><infCpl>SOFTWARE ISENTO DE ICMS CONFORME ARTIGO 5 DA LEI COMPLEMENTAR 13214 DE 29/06/2001. Venc.: 25/01/2017 - Valor: 1.907,50|Valor aproximado dos tributos: 68,86</infCpl></infAdic></infNFe><Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><SignedInfo><CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/><SignatureMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#rsa-sha1\"/><Reference URI=\"#NFe41170124929783000150550010000000181556464581\"><Transforms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"/><Transform Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/></Transforms><DigestMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#sha1\"/><DigestValue>0tDywsT0fec/76lk/jC+Qe8/Ub8=</DigestValue></Reference></SignedInfo><SignatureValue>EbAkf05sV7sMYbAmUxuXn9JjDRyADjQA+iyI4WJ6MaM04cMrrcHZ5YVNZ6zC3OhPIEx66NO95aEzwdCPHfvMmDs/aQH2tPCG3a03cgvzLIwgw1HXC/Zqf8+DW6dw+YmS0MsKYSwV6AKDPz7dZKIv2BMLyT9NLU/q78sIRpBLfSgOLMJ+67dIdT1pJMP+h3AF05VF2xWQszKyTMaAj9N3Ek99AyD6OF7BDSkorIzh7Bb/IHRbD67LgVPhsPbkWW3Dzk2enIZav5aJbuyJzECF/ekkjUkXfGFTqToSgUkQcGXOn6Q61IFZUDmVXIjPiwzkvKMou+hIAbnQqKqCogVmGg==</SignatureValue><KeyInfo><X509Data><X509Certificate>MIIIXjCCBkagAwIBAgIQRuKcbBzgNGPuBO+AoGPvgDANBgkqhkiG9w0BAQsFADB4MQswCQYDVQQGEwJCUjETMBEGA1UEChMKSUNQLUJyYXNpbDE2MDQGA1UECxMtU2VjcmV0YXJpYSBkYSBSZWNlaXRhIEZlZGVyYWwgZG8gQnJhc2lsIC0gUkZCMRwwGgYDVQQDExNBQyBDZXJ0aXNpZ24gUkZCIEc0MB4XDTE2MDcyMTAwMDAwMFoXDTE5MDcyMDIzNTk1OVowgfsxCzAJBgNVBAYTAkJSMRMwEQYDVQQKFApJQ1AtQnJhc2lsMQswCQYDVQQIEwJQUjERMA8GA1UEBxQIQ1VSSVRJQkExNjA0BgNVBAsULVNlY3JldGFyaWEgZGEgUmVjZWl0YSBGZWRlcmFsIGRvIEJyYXNpbCAtIFJGQjEWMBQGA1UECxQNUkZCIGUtQ05QSiBBMzElMCMGA1UECxQcQXV0ZW50aWNhZG8gcG9yIEFSIFRyYWRlbWFyeDFAMD4GA1UEAxM3RSBHVUFSRElBTiBTT0xVQ09FUyBURUNOT0xPR0lDQVMgTFREQSBNRToyNDkyOTc4MzAwMDE1MDCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAMFEaCvYDcFv0/ucvDbDkCA6nGEJgz0EkVvBH1wS9MHNYkmz9UjiLPjdNi+ykDeDCoMYniJ7wORUGie/QEztRlb9Euo70YLXJ5BRCtipjDL0GGsRCXKX1dXBYiljIyCla0btLob4U7SVfTJi5+YQNLIghPv0uwdyX8s2gUIKgSMhla+eTb1hpk01nzy1niJsoaBpc/x04a50iiXeiXWa/erQngWLNo02m0qpcHANDqQBe/A80ZWuBjL+NMVzf8ZZfrzMmoY6p5e7k89ZYOtG+m+DpD2rqkD5SevjeLIv/X0TRn3ggoPUoir5yNkk66JOb3FXl/7Go899ystdboh/A78CAwEAAaOCA14wggNaMIHDBgNVHREEgbswgbigPgYFYEwBAwSgNQQzMjYwMTE5NzY4NzgwNDg2Nzk3MjAwMDAwMDAwMDAwMDAwMDAwMDU3Mjc1NTg4U0VTUFBSoCUGBWBMAQMCoBwEGkNMRVZFUlNPTiBBVVJFTElPIE1BUlFVRVRJoBkGBWBMAQMDoBAEDjI0OTI5NzgzMDAwMTUwoBcGBWBMAQMHoA4EDDAwMDAwMDAwMDAwMIEbY2xldmVyc29uQGUtZ3VhcmRpYW4uY29tLmJyMAkGA1UdEwQCMAAwHwYDVR0jBBgwFoAULpHq1m3lslmC3DiFKXY0FlY80D4wDgYDVR0PAQH/BAQDAgXgMH8GA1UdIAR4MHYwdAYGYEwBAgMGMGowaAYIKwYBBQUHAgEWXGh0dHA6Ly9pY3AtYnJhc2lsLmNlcnRpc2lnbi5jb20uYnIvcmVwb3NpdG9yaW8vZHBjL0FDX0NlcnRpc2lnbl9SRkIvRFBDX0FDX0NlcnRpc2lnbl9SRkIucGRmMIIBFgYDVR0fBIIBDTCCAQkwV6BVoFOGUWh0dHA6Ly9pY3AtYnJhc2lsLmNlcnRpc2lnbi5jb20uYnIvcmVwb3NpdG9yaW8vbGNyL0FDQ2VydGlzaWduUkZCRzQvTGF0ZXN0Q1JMLmNybDBWoFSgUoZQaHR0cDovL2ljcC1icmFzaWwub3V0cmFsY3IuY29tLmJyL3JlcG9zaXRvcmlvL2xjci9BQ0NlcnRpc2lnblJGQkc0L0xhdGVzdENSTC5jcmwwVqBUoFKGUGh0dHA6Ly9yZXBvc2l0b3Jpby5pY3BicmFzaWwuZ292LmJyL2xjci9DZXJ0aXNpZ24vQUNDZXJ0aXNpZ25SRkJHNC9MYXRlc3RDUkwuY3JsMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDBDCBmwYIKwYBBQUHAQEEgY4wgYswXwYIKwYBBQUHMAKGU2h0dHA6Ly9pY3AtYnJhc2lsLmNlcnRpc2lnbi5jb20uYnIvcmVwb3NpdG9yaW8vY2VydGlmaWNhZG9zL0FDX0NlcnRpc2lnbl9SRkJfRzQucDdjMCgGCCsGAQUFBzABhhxodHRwOi8vb2NzcC5jZXJ0aXNpZ24uY29tLmJyMA0GCSqGSIb3DQEBCwUAA4ICAQCLZ1ypiVzDXUaO0Dv2wFgaFW404Ip8OWlg2i6nHFm3jfPPMxOEZUisT8G9ii2/fpnth9I1NFhwmCVAWYdYytN7cGvPca7gx4bSUzk+js7Pz5SI7kQrwSav7nxaZEJCJHSVyigopgzEs3AyrkjJK0lw7Wz1wh+HL2EWRTop65xe9tRv3dbmA/xQ4aBTm9E/xVGjnSTJ5M+NsvsNZAnK71MgoS7bmlGg9YtWmzIMzkxB8oKUclMtr60rjw7F+fdttMzRiH0qPKSueuYBkSum6iDR32sS3Gqf2ICbRjE5rfTRZ2OctvJKXtmJHDb1DgsEfujJViwtJ/aR/bB1WUVkwqGQUNdz283N2TRLSAfaoqF3tWlre8k7iuxdnz3l89wv8mvPmx06bRSY+GxF1i2/vC4pCwZMlhPmgIO7E0YWuRO8aNfX1VLShIOrUfFQgVKK4+6YPhDkVm014bA/MZMb4GRFdZ/8MG033NbJd+Zxv+/J1J/2KqEMKBM0aVJGzhyVllHCq8sNL+NNjYVmavIjt8B5yaxLn5duqrw58+rL7yoASDQ1c706OUPbv6uWRctxMfnWmUQzQKm9zubYYFUWCsurAsgfUeLUdCz3ws/6X5+Rbe+MY77yN6eYYQ5uOPAoQ7ha8kIcFCgD83zxtzLVgyxchiIOrxoxOk7rkJynarytNg==</X509Certificate></X509Data></KeyInfo></Signature></NFe><protNFe versao=\"3.10\"><infProt><tpAmb>1</tpAmb><verAplic>PR-v3_7_5</verAplic><chNFe>41170124929783000150550010000000181556464581</chNFe><dhRecbto>2017-01-11T15:46:56-02:00</dhRecbto><nProt>141170005022641</nProt><digVal>0tDywsT0fec/76lk/jC+Qe8/Ub8=</digVal><cStat>100</cStat><xMotivo>Autorizado o uso da NF-e</xMotivo></infProt></protNFe></nfeProc>";  
        try {    
              
            InputStream stream = new ByteArrayInputStream(stringComEstruturaDoXML.getBytes("utf-8"));    
            //JRXmlDataSource xml = new JRXmlDataSource(stream, "/nfeProc/NFe/infNFe/det");      
  
            ImageIcon imagemTituloJanela = new ImageIcon("C:/NFe/nfe.gif");                 
                //Caminho do arquivo .JASPER    
                String relatorio = ("C:/NFe/danfe.jasper");    
                //Configurando a classe JRXmlDataSource que apontara o caminho do  nosso XML de dados e sua pesquisa XPath geral    
                JRXmlDataSource xml = new JRXmlDataSource(stream, "/nfeProc/NFe/infNFe/det");    
                HashMap mapa = new HashMap();  
                mapa.put("Logo","C:/NFe/logo-nfe.png");  
                //Gerando o relatorio (Filling) informando o caminho do relatorio, os parametros (neste caso nenhum paramentro esta sendo passado ao relatorio, por isso o HashMap esta vazio) e o objeto JRXmlDataSource configurado)    
                JasperPrint jp = JasperFillManager.fillReport(relatorio, mapa, xml);     
                //Utilizando o JasperView, uma classe desktop do jasper para visualização dos relatorios    
                JasperViewer jv = new JasperViewer(jp, false);    
                jv.setTitle("VISUALIZADOR DE DOCUMENTO FISCAL ELETRÔNICA");  
                jv.setIconImage(imagemTituloJanela.getImage());  
                jv.setVisible(true);   
                //exportando arquivo para pdf  
                //JasperExportManager.exportReportToPdfFile(jp, "C:/NFe/arquivo.pdf");  
               // Runtime.getRuntime().exec("cmd /c start C:/NFe/arquivo.pdf");  
                //deletando arquivo  
               //File file = new File("C:/NFe/arquivo.pdf");  
               //file.deleteOnExit();  
        } catch (JRException e) {    
            e.printStackTrace();    
        }    
    }    
}  