/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reports;

import Connection.UConnection;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author LAB-USR-HUAN-A0312
 */
public class ReporteJasper {
    public static JasperViewer mostrarReporte(String path, Map params){
        
        JasperViewer jasperViewer = null;
        try {
            Connection con=UConnection.getConnection();

            String fileJasper=System.getProperty("user.dir")+path;
            JasperDesign jasperDesign= JRXmlLoader.load(fileJasper);
            JasperReport jasperReport= JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint= JasperFillManager.fillReport(jasperReport,params,con);
            jasperViewer = new JasperViewer(jasperPrint,false);

        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(null,e.getMessage(),"Aviso",JOptionPane.ERROR_MESSAGE);
        }
        
        return jasperViewer;
    }
}
