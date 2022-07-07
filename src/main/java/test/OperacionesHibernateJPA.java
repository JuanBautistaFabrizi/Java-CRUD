package test;

import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;

public class OperacionesHibernateJPA {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        personaDao.listar();
        
        Persona persona = new Persona();
        persona.setIdPersona(2);
        
        persona = personaDao.buscarPersonaPorId(persona);
        System.out.println("persona encontrada = " + persona);
        
        personaDao.eliminar(persona);
        personaDao.listar();
        
    }
}
