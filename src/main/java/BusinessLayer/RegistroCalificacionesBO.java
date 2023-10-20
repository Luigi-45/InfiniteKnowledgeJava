/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessLayer;

import DataAccessLayer.RegistroCalificacionesDAO;
import DataTransferObject.RegistroCalificaciones;
import java.util.ArrayList;

/**
 *
 * @author LAB-USR-HUAN-A0312
 */
public class RegistroCalificacionesBO {
    
    public void insertar(RegistroCalificaciones registro)throws Exception{
        
        try {
            RegistroCalificacionesDAO registroDAO=new RegistroCalificacionesDAO();
            registroDAO.insertar(registro);
        } catch (Exception e) {
            throw e;
        }    
    }
    
    public void insertarCompleto(int docenteId, int estudianteId, int cursoId, String salonClases)throws Exception{
        
        try {
            RegistroCalificacionesDAO registroDAO=new RegistroCalificacionesDAO();
            registroDAO.insertarCompleto(docenteId,estudianteId,cursoId,salonClases);
        } catch (Exception e) {
            throw e;
        }    
    }
    
    public void actualizar(RegistroCalificaciones registro, String bimestre)throws Exception{
        
        try {
            RegistroCalificacionesDAO registroDAO=new RegistroCalificacionesDAO();
            registroDAO.actualizar(registro,bimestre);
        } catch (Exception e) {
            throw e;
        }    
    }
    
    public void actualizarCompleto(int docenteId, int estudianteId, int cursoId, String salonClases)throws Exception{
        
        try {
            RegistroCalificacionesDAO registroDAO=new RegistroCalificacionesDAO();
            registroDAO.actualizarCompleto(docenteId,estudianteId,cursoId,salonClases);
        } catch (Exception e) {
            throw e;
        }    
    }
    
    public void actualizarCompleto2(ArrayList<RegistroCalificaciones> registros)throws Exception{
        
        try {
            RegistroCalificacionesDAO registroDAO=new RegistroCalificacionesDAO();
            registroDAO.actualizarCompleto2(registros);
        } catch (Exception e) {
            throw e;
        }    
    }
    
    public ArrayList<RegistroCalificaciones> buscarPorIdEstudiante(int idEstudiante)throws Exception{
        
        try {
            ArrayList<RegistroCalificaciones> registros=new ArrayList<>();
            RegistroCalificacionesDAO registroDAO=new RegistroCalificacionesDAO();
            registros=registroDAO.buscarPorIdEstudiante(idEstudiante);
            return registros;
        } catch (Exception e) {
            throw e;
        }    
    }
    
    public ArrayList<RegistroCalificaciones> buscarPorDNIEstudiante2(String dni, int cursoId, String bimestre)throws Exception{
        
        try {
            ArrayList<RegistroCalificaciones> registros=new ArrayList<>();
            RegistroCalificacionesDAO registroDAO=new RegistroCalificacionesDAO();
            registros=registroDAO.buscarPorDNIEstudiante2(dni,cursoId, bimestre);
            return registros;
        } catch (Exception e) {
            throw e;
        }    
    }
    
    public ArrayList<RegistroCalificaciones> buscarParaDocente(String dni, int cursoId, String salonClases, String bimestre)throws Exception{
        
        try {
            ArrayList<RegistroCalificaciones> registros=new ArrayList<>();
            RegistroCalificacionesDAO registroDAO=new RegistroCalificacionesDAO();
            registros=registroDAO.buscarParaDocente(dni,cursoId,salonClases,bimestre);
            return registros;
        } catch (Exception e) {
            throw e;
        }    
    }
    
    public RegistroCalificaciones buscarRegistroEspecifico(int estudianteId, int docenteId, int cursoId, String bimestre) throws Exception{
        
        try {
            RegistroCalificaciones registro=new RegistroCalificaciones();
            RegistroCalificacionesDAO registroDAO=new RegistroCalificacionesDAO();
            registro=registroDAO.buscarRegistroEspecífico(estudianteId,docenteId,cursoId,bimestre);
            return registro;
        } catch (Exception e) {
            throw e;
        } 
    }
    
    public void eliminar(RegistroCalificaciones registro)throws Exception{
        
        try {
            RegistroCalificacionesDAO registroDAO=new RegistroCalificacionesDAO();
            registroDAO.eliminar(registro);
        } catch (Exception e) {
            throw e;
        }    
    }
    
    public void eliminarCompleto(int docenteId, int estudianteId, int cursoId)throws Exception{
        
        try {
            RegistroCalificacionesDAO registroDAO=new RegistroCalificacionesDAO();
            registroDAO.eliminarCompleto(docenteId, estudianteId, cursoId);
        } catch (Exception e) {
            throw e;
        }    
    }
    
}
