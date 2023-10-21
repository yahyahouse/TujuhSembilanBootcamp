package org.example.arutala.sallary.karyawan.model;

public enum Placement {
    GARUT(1961085),
    BANDUNG(3742276),
    JAKARTA(4453935),
    BEKASI(4782935),
    BOGOR(4330249);

    private final double umk;

    Placement(double umk) {
        this.umk = umk;
    }

    public double getUmk() {
        return umk;
    }
}
