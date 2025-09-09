package cl.skillnest.mokito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

class UsuarioServiceTest {

	@Test
	void testGuardarUsuario() {
	 	// 1. Crear mock del repositorio
        UsuarioRepositorio mockRepo = mock(UsuarioRepositorio.class);

        // 2. Inyectar el mock en el servicio
        UsuarioService service = new UsuarioService(mockRepo);
        
        // 3. Crear usuario de prueba
        Usuario u = new Usuario("Ana");
        
        // 4. Ejecutar acción GUARDAR
        service.guardar(u);
        
        verify(mockRepo).guardar(u); // Verifica que se llamó el método guardar
    }
}
