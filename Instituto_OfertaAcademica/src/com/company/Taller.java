package com.company;

public class Taller extends OfertaAcademica{

    private Double precioTp;
    private Integer cantidadTps;

    public Taller() {
        super();
        precioTp=precioTp;
        cantidadTps=cantidadTps;
    }

    @Override
    public Double calcularPrecio() {
        Double precioTotal=precioTp * cantidadTps;

        return precioTotal;
    }

    public Double getPrecioTp() {
        return precioTp;
    }

    public void setPrecioTp(Double precioTp) {
        this.precioTp = precioTp;
    }

    public Integer getCantidadTps() {
        return cantidadTps;
    }

    public void setCantidadTps(Integer cantidadTps) {
        this.cantidadTps = cantidadTps;
    }
}
