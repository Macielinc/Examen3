package uia.com.apirest.patronesDisenno.fachada;

import uia.com.apirest.compras.GestorCompras;
import uia.com.apirest.compras.InfoComprasUIA;
import uia.com.apirest.modelo.ItemComprasUIAModelo;
import uia.com.apirest.modelo.ItemSolicitudOCModelo;

import java.util.ArrayList;
import java.util.List;

public class FachadaReportes extends FachadaModel {

    public FachadaReportes(GestorCompras gestorCompras) {
        super(gestorCompras);
    }

    @Override
    public List<InfoComprasUIA> itemsReporte(int id) {
        return this.itemsReporte(id);
    }

    @Override
    public ArrayList<ItemComprasUIAModelo> getItems(int id) {
        return null;
    }

    @Override
    public ArrayList<ItemSolicitudOCModelo> getSolicitudesOC(int id) {
        return null;
    }
}
