package com.CONVERTICSHOP.demo.services.TypeDocumentServices;

import com.CONVERTICSHOP.demo.modelo.TipoDocumento;
import com.CONVERTICSHOP.demo.modelo.Usuario;

import java.util.List;

public interface TypeDocumentServices {

    List<TipoDocumento> obtenerTodos() throws Exception;

    TipoDocumento crearTipoDocumento(TipoDocumento tipoDocumento) throws Exception;

    TipoDocumento actualizarTipoDocumento(Integer idTipoDocumento) throws Exception;


    String borrarTipoDocumento (Integer idTipoDocumento) throws Exception;

    TipoDocumento obtenerTipoDocumentoPorId(int idTipoDocumento);
}
