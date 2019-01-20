package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author contact@elbatya.de
 */
public class Candle {

    private BigDecimal O;
    private BigDecimal H;
    private BigDecimal L;
    private BigDecimal C;
    private BigDecimal V;
    private LocalDateTime T;
    private BigDecimal BV;

    public BigDecimal getO() {
        return O;
    }

    public void setO(BigDecimal o) {
        O = o;
    }

    public BigDecimal getH() {
        return H;
    }

    public void setH(BigDecimal h) {
        H = h;
    }

    public BigDecimal getL() {
        return L;
    }

    public void setL(BigDecimal l) {
        L = l;
    }

    public BigDecimal getC() {
        return C;
    }

    public void setC(BigDecimal c) {
        C = c;
    }

    public BigDecimal getV() {
        return V;
    }

    public void setV(BigDecimal v) {
        V = v;
    }

    public LocalDateTime getT() {
        return T;
    }

    public void setT(LocalDateTime t) {
        T = t;
    }

    public BigDecimal getBV() {
        return BV;
    }

    public void setBV(BigDecimal BV) {
        this.BV = BV;
    }
}
