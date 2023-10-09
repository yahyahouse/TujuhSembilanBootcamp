package org.example.ArutalaCodingQuiz.quiz2;

import java.util.*;

public class MenghitungGajiKaryawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kotaCabang = scanner.next();
        String posisiJabatan = scanner.next();
        int lamaBekerja = scanner.nextInt();
        boolean statusPernikahan = scanner.nextBoolean();

        int gajiPokok = hitungGajiPokok(kotaCabang, posisiJabatan, lamaBekerja);
        int tunjanganKeluarga = hitungTunjanganKeluarga(statusPernikahan, gajiPokok);
        int tunjanganJabatan = hitungTunjanganJabatan(lamaBekerja, gajiPokok);
        int tunjanganPegawai = hitungTunjanganPegawai(posisiJabatan);
        int gajiKotor = hitungGajiKotor(gajiPokok, tunjanganKeluarga, tunjanganJabatan, tunjanganPegawai);
        int pensiunan = hitungPensiunan(gajiKotor);
        int bpjs = hitungBPJS(gajiKotor);
        int pph = hitungPotonganPPH(gajiKotor);
        int gajiBersih = hitungGajiBersih(gajiKotor, bpjs, pph, pensiunan);

        System.out.println(gajiPokok);
        System.out.println(tunjanganKeluarga);
        System.out.println(tunjanganJabatan);
        System.out.println(tunjanganPegawai);
        System.out.println(gajiKotor);
        System.out.println(pensiunan);
        System.out.println(bpjs);
        System.out.println(pph);
        System.out.print(gajiBersih);


    }

    public static int hitungGajiBersih(int gajiKotor, int bpjs, int pph, int pensiunan) {
        return gajiKotor - bpjs - pensiunan - pph;
    }

    public static int hitungPotonganPPH(int gajiKotor) {
        return (int) (gajiKotor * 0.05);
    }

    public static int hitungBPJS(int gajiKotor) {
        return (int) (gajiKotor * 0.02);
    }

    public static int hitungPensiunan(int gajiKotor) {
        return (int) (gajiKotor * 0.02);
    }

    public static int hitungGajiKotor(int gajiPokok, int tunjanganKeluarga, int tunjanganJabatan, int tunjanganPegawai) {
        return gajiPokok + tunjanganJabatan + tunjanganKeluarga + tunjanganPegawai;
    }

    public static int hitungTunjanganPegawai(String posisiJabatan) {
        int tunjanganPegawai = 0;
        if (posisiJabatan.equals("Admin") || posisiJabatan.equals("Sprinter") || posisiJabatan.equals("Officer")) {
            tunjanganPegawai = 200000;
        } else if (posisiJabatan.equals("Coordinator")) {
            tunjanganPegawai = 500000;
        } else if (posisiJabatan.equals("SPV")) {
            tunjanganPegawai = 700000;
        } else if (posisiJabatan.equals("Manager")) {
            tunjanganPegawai = 1000000;
        }
        return tunjanganPegawai;
    }

    public static int hitungTunjanganJabatan(int lamaJabatan, int gajiPokok) {
        int tunjanganJabatan = 0;
        if (lamaJabatan > 4) {
            tunjanganJabatan = (int) (gajiPokok * 0.05);
        }
        return tunjanganJabatan;
    }

    public static int hitungTunjanganKeluarga(boolean statusPernikahan, int gajiPokok) {
        int tunjanganKeluarga = 0;
        if (statusPernikahan) {
            tunjanganKeluarga = (int) (gajiPokok * 0.10);
        }
        return tunjanganKeluarga;
    }

    public static int hitungGajiPokok(String kotaCabang, String posisiJabatan, int lamaBekerja) {
        Map<String, Integer> umk = new HashMap<>();
        umk.put("Garut", 1961085);
        umk.put("Bandung", 3742276);
        umk.put("Jakarta", 4453935);
        umk.put("Bekasi", 4453935);
        umk.put("Bogor", 4330249);
        umk.put("Palembang", 3289409);
        int gajiPegawaiUMK = umk.getOrDefault(kotaCabang, 0);
        double persentasePeningkatan = 0;

        switch (posisiJabatan) {
            case "Admin":
                persentasePeningkatan = (lamaBekerja < 2) ? 0 : 0.2;
                break;
            case "Coordinator":
                persentasePeningkatan = (lamaBekerja < 3) ? 0.1 : 0.3;
                break;
            case "SPV":
                if (lamaBekerja < 2) {
                    persentasePeningkatan = 0.25;
                } else if (lamaBekerja < 5) {
                    persentasePeningkatan = 0.4;
                } else {
                    persentasePeningkatan = 0.5;
                }
                break;
            case "Sprinter":
                persentasePeningkatan = -0.1;
                break;
            case "Officer":
                persentasePeningkatan = 0;
                break;
            case "Manager":
                persentasePeningkatan = (lamaBekerja < 3) ? 0.5 : 1.0;
        }

        return (int) (gajiPegawaiUMK + (gajiPegawaiUMK * persentasePeningkatan));
    }
}
