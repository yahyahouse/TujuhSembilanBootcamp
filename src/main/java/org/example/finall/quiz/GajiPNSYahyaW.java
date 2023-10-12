package org.example.finall.quiz;

/*
 * Created By : Yahya Wijaya
 * Created At : 21.00 Rabu, 11 Oktober 2023
 */
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GajiPNSYahyaW {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            //nama pegawai
            System.out.print("nama pegawai : ");
            String namaPegawai = scanner.nextLine();
            //golongan pangkat
            System.out.print("golongan pangkat : ");
            int golonganPangkat = scanner.nextInt();
            scanner.nextLine();
            //ruang kerja
            System.out.print("tipe golongan : ");
            String ruangKerja = scanner.next();
            scanner.nextLine();
            //masa kerja
            System.out.print("masa kerja : ");
            int masaKerja = scanner.nextInt();
            scanner.nextLine();
            //status pernikahan
            System.out.print("status pernikahan : ");
            String statusPernikahan = scanner.nextLine();
            //jumlah anak
            System.out.print("jumlah anak : ");
            int jumlahAnak = scanner.nextInt();

            //kumpulan exception
            exceptionMessage(namaPegawai, golonganPangkat, masaKerja, statusPernikahan, jumlahAnak, ruangKerja);

            //inisialisai
            int gajiPokok = kalkulasiGajiPokok(masaKerja, ruangKerja, golonganPangkat);
            int tunjanganKeluarga = kalkulasiTunjanganKeluarga(statusPernikahan, gajiPokok);
            int tunjanganAnak = kalkulasiTunjanganAnak(jumlahAnak, gajiPokok);
            int tunjanganBeras = kalkulasiTunjanganBeras(statusPernikahan, jumlahAnak);
            int tunjanganUmumJabatab = kalkulasiTunjanganUmumJabatan(golonganPangkat);
            int gajiKotor = kalkulasiGajiKotor(gajiPokok, tunjanganAnak, tunjanganKeluarga, tunjanganUmumJabatab, tunjanganBeras);
            int potonganPPh = kalkulasiPotonganPPH(gajiPokok, statusPernikahan, gajiKotor, jumlahAnak, tunjanganKeluarga, tunjanganAnak);
            int potonganIWP = kalkulasiPotonganIWP(gajiPokok, tunjanganAnak, tunjanganKeluarga);
            int potonganTaperum = kalkulasiPotonganTaperum(golonganPangkat);
            int gajiBersih = kalkulasiGajiBersih(gajiKotor, potonganPPh, potonganIWP, potonganTaperum);

            //menampilkan output
            displayOutput(namaPegawai, gajiPokok, tunjanganKeluarga, tunjanganAnak, tunjanganBeras, tunjanganUmumJabatab, gajiKotor, potonganPPh, potonganIWP, potonganTaperum, gajiBersih);

            scanner.close();
        } catch (Exception e) {
            //error message
            System.err.println(Arrays.toString(e.getStackTrace()));
            System.err.println(e.getMessage());
        }
    }

    public static void displayOutput(String nama, int gajiPokok,
                                     int tunjanganKeluarga, int tunjanganAnak,
                                     int tunjanganBeras, int tunjanganUmumJabatan,
                                     int gajiKotor, int potonganPPH, int potonganIWP,
                                     int potonganTaperum, int gajiBersih) {

        String[] displayTampilan = {
                "Gaji Pokok",
                "Tunjangan keluarga",
                "Tunjangan anak",
                "Tunjangan beras",
                "Tunjangan umum jabatan",
                "Gaji Bruto",
                "Pph",
                "Potongan IWP",
                "Potongan taperum",
                "Gaji Take Home Pay"
        };
        int[] displayValues = {
                gajiPokok,
                tunjanganKeluarga,
                tunjanganAnak,
                tunjanganBeras,
                tunjanganUmumJabatan,
                gajiKotor,
                potonganPPH,
                potonganIWP,
                potonganTaperum,
                gajiBersih
        };
        System.out.println("+-------------------------+----------------+");
        System.out.printf("| %-23s | %-14s |\n", "Category", "Value");
        System.out.println("+-------------------------+----------------+");
        System.out.printf("| %-23s | %-14s |\n", "Nama", nama);

        for (int i = 0; i < displayTampilan.length; i++) {
            String category = displayTampilan[i];
            int value = displayValues[i];
            System.out.printf("| %-23s | %-14s |\n", category, formatCurrency(value));
        }
        System.out.println("+-------------------------+----------------+");


    }

    public static int kalkulasiGajiPokok(int masaKerja, String ruangKerja, int golonganPangkat) {
        Map<String, Integer> ruangKerjaNew = new LinkedHashMap<>();
        ruangKerjaNew.put("A", 0);
        ruangKerjaNew.put("B", 1);
        ruangKerjaNew.put("C", 2);
        ruangKerjaNew.put("D", 3);
        ruangKerjaNew.put("E", 4);
        int ruangKerjaInteger = 0;
        for (Map.Entry<String, Integer> entry : ruangKerjaNew.entrySet()) {
            if (ruangKerja.equals(entry.getKey())) {
                ruangKerjaInteger = entry.getValue();
            }
        }

        if (masaKerja > 27 && golonganPangkat == 1) {
            masaKerja = 27;
        } else if (masaKerja > 33 && golonganPangkat == 2) {
            masaKerja = 33;
        } else if (masaKerja > 32 && golonganPangkat == 3) {
            masaKerja = 32;
        } else if (masaKerja > 32 && golonganPangkat == 4) {
            masaKerja = 32;
        }

        int[][][] gajiPNS = {
                {
                        {1_560_800, 1_560_800, 1_560_800, 1_560_800},
                        {1_560_800, 1_560_800, 1_560_800, 1_560_800},
                        {1_610_000, 1_610_000, 1_610_000, 1_610_000},
                        {1_610_000, 1_704_500, 1_776_600, 1_851_800},
                        {1_660_700, 1_704_500, 1_776_600, 1_851_800},
                        {1_660_700, 1_758_200, 1_832_600, 1_910_100},
                        {1_713_000, 1_758_200, 1_832_600, 1_910_100},
                        {1_713_000, 1_813_600, 1_890_300, 1_970_200},
                        {1_766_900, 1_813_600, 1_890_300, 1_970_200},
                        {1_766_900, 1_870_700, 1_949_800, 2_032_300},
                        {1_822_600, 1_870_700, 1_949_800, 2_032_300},
                        {1_822_600, 1_929_600, 2_011_200, 2_096_300},
                        {1_880_000, 1_929_600, 2_011_200, 2_096_300},
                        {1_880_000, 1_990_400, 2_074_600, 2_162_300},
                        {1_939_200, 1_990_400, 2_074_600, 2_162_300},
                        {1_939_200, 2_053_100, 2_139_900, 2_230_400},
                        {2_000_300, 2_053_100, 2_139_900, 2_230_400},
                        {2_000_300, 2_117_700, 2_207_300, 2_300_700},
                        {2_063_300, 2_117_700, 2_207_300, 2_300_700},
                        {2_063_300, 2_184_400, 2_276_800, 2_373_100},
                        {2_128_300, 2_184_400, 2_276_800, 2_373_100},
                        {2_128_300, 2_253_200, 2_348_500, 2_447_900},
                        {2_195_300, 2_253_200, 2_348_500, 2_447_900},
                        {2_195_300, 2_324_200, 2_422_500, 2_525_000},
                        {2_264_400, 2_324_200, 2_422_500, 2_525_000},
                        {2_264_400, 2_397_400, 2_498_800, 2_604_500},
                        {2_335_800, 2_397_400, 2_498_800, 2_604_500},
                        {2_335_800, 2_472_900, 2_557_500, 2_686_500}
                },
                {
                        {2_022_200, 2_022_200, 2_022_200, 2_022_200},
                        {2_054_100, 2_054_100, 2_054_100, 2_054_100},
                        {2_054_100, 2_054_100, 2_054_100, 2_054_100},
                        {2_118_800, 2_208_400, 2_301_800, 2_399_200},
                        {2_118_800, 2_208_400, 2_301_800, 2_399_200},
                        {2_185_500, 2_277_900, 2_374_300, 2_474_700},
                        {2_185_500, 2_277_900, 2_374_300, 2_474_700},
                        {2_254_300, 2_349_700, 2_449_100, 2_552_700},
                        {2_254_300, 2_349_700, 2_449_100, 2_552_700},
                        {2_325_300, 2_423_700, 2_526_200, 2_633_100},
                        {2_325_300, 2_423_700, 2_526_200, 2_633_100},
                        {2_398_600, 2_500_000, 2_605_800, 2_716_000},
                        {2_398_600, 2_500_000, 2_605_800, 2_716_000},
                        {2_474_100, 2_578_800, 2_687_800, 2_801_500},
                        {2_474_100, 2_578_800, 2_687_800, 2_801_500},
                        {2_552_000, 2_660_000, 2_772_500, 2_889_800},
                        {2_552_000, 2_660_000, 2_772_500, 2_889_800},
                        {2_632_400, 2_743_800, 2_859_800, 2_980_800},
                        {2_632_400, 2_743_800, 2_859_800, 2_980_800},
                        {2_715_300, 2_830_200, 2_949_900, 3_074_700},
                        {2_715_300, 2_830_200, 2_949_900, 3_074_700},
                        {2_800_800, 2_919_300, 3_042_800, 3_171_500},
                        {2_800_800, 2_919_300, 3_042_800, 3_171_500},
                        {2_889_100, 3_011_200, 3_138_600, 3_271_400},
                        {2_889_100, 3_011_200, 3_138_600, 3_271_400},
                        {2_980_000, 3_106_100, 3_237_500, 3_374_400},
                        {2_980_000, 3_106_100, 3_237_500, 3_374_400},
                        {3_073_900, 3_203_900, 3_339_400, 3_480_700},
                        {3_073_900, 3_203_900, 3_339_400, 3_480_700},
                        {3_170_700, 3_304_800, 3_444_600, 3_590_300},
                        {3_170_700, 3_304_800, 3_444_600, 3_590_300},
                        {3_270_600, 3_408_900, 3_553_100, 3_703_400},
                        {3_270_600, 3_408_900, 3_553_100, 3_703_400},
                        {3_373_600, 3_516_300, 3_665_000, 3_820_000}
                },
                {
                        {2_579_400, 2_688_500, 2_802_300, 2_920_800},
                        {2_579_400, 2_688_500, 2_802_300, 2_920_800},
                        {2_660_700, 2_773_200, 2_890_500, 3_012_800},
                        {2_660_700, 2_773_200, 2_890_500, 3_012_800},
                        {2_744_500, 2_860_500, 2_981_500, 3_107_700},
                        {2_744_500, 2_860_500, 2_981_500, 3_107_700},
                        {2_830_900, 2_950_600, 3_075_500, 3_205_500},
                        {2_830_900, 2_950_600, 3_075_500, 3_205_500},
                        {2_920_100, 3_043_600, 3_172_300, 3_306_500},
                        {2_920_100, 3_043_600, 3_172_300, 3_306_500},
                        {3_012_000, 3_139_400, 3_272_200, 3_410_600},
                        {3_012_000, 3_139_400, 3_272_200, 3_410_600},
                        {3_106_900, 3_238_300, 3_375_300, 3_518_100},
                        {3_106_900, 3_238_300, 3_375_300, 3_518_100},
                        {3_204_700, 3_340_300, 3_481_600, 3_628_900},
                        {3_204_700, 3_340_300, 3_481_600, 3_628_900},
                        {3_305_700, 3_445_500, 3_591_200, 3_743_100},
                        {3_305_700, 3_445_500, 3_591_200, 3_743_100},
                        {3_409_800, 3_554_000, 3_704_300, 3_861_000},
                        {3_409_800, 3_554_000, 3_704_300, 3_861_000},
                        {3_517_200, 3_665_900, 3_821_000, 3_982_600},
                        {3_517_200, 3_665_900, 3_821_000, 3_982_600},
                        {3_627_900, 3_781_400, 3_941_400, 4_108_100},
                        {3_627_900, 3_781_400, 3_941_400, 4_108_100},
                        {3_742_200, 3_900_500, 4_065_500, 4_237_500},
                        {3_742_200, 3_900_500, 4_065_500, 4_237_500},
                        {3_860_100, 4_023_300, 4_193_500, 4_370_900},
                        {3_860_100, 4_023_300, 4_193_500, 4_370_900},
                        {3_981_600, 4_150_100, 4_325_600, 4_508_600},
                        {3_981_600, 4_150_100, 4_325_600, 4_508_600},
                        {4_107_000, 4_280_800, 4_461_800, 4_650_600},
                        {4_107_000, 4_280_800, 4_461_800, 4_650_600},
                        {4_236_400, 4_415_600, 4_602_400, 4_797_000}
                },
                {
                        {3_044_300, 3_173_100, 3_307_300, 3_447_200, 3_593_100},
                        {3_044_300, 3_173_100, 3_307_300, 3_447_200, 3_593_100},
                        {3_140_200, 3_272_100, 3_411_500, 3_555_800, 3_706_200},
                        {3_140_200, 3_272_100, 3_411_500, 3_555_800, 3_706_200},
                        {3_239_100, 3_376_100, 3_518_900, 3_667_800, 3_822_900},
                        {3_239_100, 3_376_100, 3_518_900, 3_667_800, 3_822_900},
                        {3_341_100, 3_482_500, 3_629_800, 3_783_300, 3_943_300},
                        {3_341_100, 3_482_500, 3_629_800, 3_783_300, 3_943_300},
                        {3_446_400, 3_592_100, 3_744_100, 3_902_500, 4_067_500},
                        {3_446_400, 3_592_100, 3_744_100, 3_902_500, 4_067_500},
                        {3_554_900, 3_705_300, 3_862_000, 4_025_400, 4_195_700},
                        {3_554_900, 3_705_300, 3_862_000, 4_025_400, 4_195_700},
                        {3_666_900, 3_822_000, 3_983_600, 4_152_200, 4_327_800},
                        {3_666_900, 3_822_000, 3_983_600, 4_152_200, 4_327_800},
                        {3_782_400, 3_942_400, 4_109_100, 4_282_900, 4_462_100},
                        {3_782_400, 3_942_400, 4_109_100, 4_282_900, 4_462_100},
                        {3_901_500, 4_066_500, 4_238_500, 4_417_800, 4_604_700},
                        {3_901_500, 4_066_500, 4_238_500, 4_417_800, 4_604_700},
                        {4_024_400, 4_194_600, 4_372_000, 4_557_000, 4_749_700},
                        {4_024_400, 4_194_600, 4_372_000, 4_557_000, 4_749_700},
                        {4_151_100, 4_326_700, 4_509_700, 4_700_500, 4_899_300},
                        {4_151_100, 4_326_700, 4_509_700, 4_700_500, 4_899_300},
                        {4_281_800, 4_463_000, 4_651_300, 4_848_700, 5_053_100},
                        {4_281_800, 4_463_000, 4_651_300, 4_848_700, 5_053_100},
                        {4_416_400, 4_600_800, 4_797_700, 5_001_100, 5_211_400},
                        {4_416_400, 4_600_800, 4_797_700, 5_001_100, 5_211_400},
                        {4_555_800, 4_748_500, 4_949_400, 5_158_700, 5_377_000},
                        {4_555_800, 4_748_500, 4_949_400, 5_158_700, 5_377_000},
                        {4_699_300, 4_898_100, 5_105_300, 5_321_200, 5_546_300},
                        {4_699_300, 4_898_100, 5_105_300, 5_321_200, 5_546_300},
                        {4_847_300, 5_052_300, 5_266_100, 5_488_800, 5_721_000},
                        {4_847_300, 5_052_300, 5_266_100, 5_488_800, 5_721_000},
                        {5_000_000, 5_211_500, 5_431_900, 5_661_700, 5_901_200}
                }
        };
        return gajiPNS[golonganPangkat - 1][masaKerja][ruangKerjaInteger];
    }

    public static int kalkulasiTunjanganKeluarga(String statusPernikahan, int gajiPokok) {
        int tunjanganKeluarga = 0;
        double besarTunjanganKeluarga = 0.1;
        if (statusPernikahan.equals("Kawin")) {
            tunjanganKeluarga = (int) (gajiPokok * besarTunjanganKeluarga);
        }
        return tunjanganKeluarga;
    }

    public static int kalkulasiTunjanganAnak(int jumlahAnak, int gajiPokok) {
        double tunjanganPerAnak = 0.02;
        int tunjanganAnak = (int) (gajiPokok * tunjanganPerAnak * jumlahAnak);
        if (jumlahAnak > 2) {
            tunjanganAnak = (int) (gajiPokok * tunjanganPerAnak * 2);
        }
        return tunjanganAnak;
    }

    public static int kalkulasiTunjanganBeras(String statusPernikahan, int jumlahAnak) {
        int tunjanganBerasPerAnggotaKeluarga = 10;
        int hargaBeras = 15000;
        int jumlahAnggotaKeluarga;
        int tunjanganBeras = tunjanganBerasPerAnggotaKeluarga * hargaBeras;
        if (jumlahAnak > 2) {
            jumlahAnak = 2;
        }
        if (statusPernikahan.equals("Kawin")) {
            jumlahAnggotaKeluarga = 2 + jumlahAnak;
            tunjanganBeras = jumlahAnggotaKeluarga * hargaBeras * tunjanganBerasPerAnggotaKeluarga;
        } else if (statusPernikahan.equals("Cerai")) {
            jumlahAnggotaKeluarga = 1 + jumlahAnak;
            tunjanganBeras = jumlahAnggotaKeluarga * hargaBeras * tunjanganBerasPerAnggotaKeluarga;
        }
        return tunjanganBeras;
    }

    public static int kalkulasiTunjanganUmumJabatan(int golonganPangkat) {
        int[] arrTunjanganUmumJabatan = {175_000, 180_000, 185_000, 190_000};
        return arrTunjanganUmumJabatan[golonganPangkat - 1];
    }


    public static int kalkulasiPotonganIWP(int gajiPokok, int tunjanganAnak, int tunjanganKeluarga) {
        double IWP = 0.1;
        return (int) ((gajiPokok + tunjanganAnak + tunjanganKeluarga) * IWP);
    }

    public static int kalkulasiPotonganTaperum(int golonganPangkat) {
        int[] arrPotonganTaperum = {3000, 5000, 7000, 10_000};
        return arrPotonganTaperum[golonganPangkat - 1];
    }

    public static int kalkulasiPotonganBiayaJabatan(int gajiKotor) {
        double biayaJabatan = 0.05;
        return (int) (gajiKotor * biayaJabatan);
    }

    public static int kalkulasiPotonganIuranPensiun(int gajiPokok, int tunjanganKeluarga, int tunjanganAnak) {
        double iuranPensiun = 4.75 / 100;
        return (int) ((gajiPokok + tunjanganAnak + tunjanganKeluarga) * iuranPensiun);
    }

    public static int kalkulasiPotonganPPH(int gajiPokok, String statusPernikahan,
                                           int gajiKotor, int jumlahAnak, int tunjanganKeluarga,
                                           int tunjanganAnak) {
        if (gajiKotor <= 4500000) {
            return 0;
        }

        int potonganBiayaJabatan = kalkulasiPotonganBiayaJabatan(gajiKotor);
        int potonganIuranPensiun = kalkulasiPotonganIuranPensiun(gajiPokok, tunjanganKeluarga, tunjanganAnak);

        int penghasilanNetto = gajiKotor - potonganBiayaJabatan - potonganIuranPensiun;
        int penghasilanNettoPerTahun = penghasilanNetto * 12;
        int WPSendiri = 36_000_000;
        int WPPasangan = 3_000_000;
        int WPAnak = 3_000_000;
        int totalWPAnak = 0;
        if (!statusPernikahan.equals("Kawin")) {
            WPPasangan = 0;
        }
        if (jumlahAnak > 3) {
            jumlahAnak = 3;
            totalWPAnak = WPAnak * jumlahAnak;
        } else {
            totalWPAnak = jumlahAnak * 3_000_000;
        }

        int jumlahPTKP = WPSendiri + WPPasangan + totalWPAnak;

        int PKP = penghasilanNettoPerTahun - jumlahPTKP;
        double PPh = 0.05;
        int PPh21Setahun = (int) (PKP * PPh);
        int PPh21Sebulan = PPh21Setahun / 12;


        return PPh21Sebulan;
    }

    public static int kalkulasiGajiKotor(int gajiPokok, int tunjanganAnak,
                                         int tunjanganKeluarga, int tunjanganUmumJabatan,
                                         int tunjanganBeras) {
        return gajiPokok + tunjanganAnak + tunjanganKeluarga + tunjanganUmumJabatan + tunjanganBeras;
    }


    public static int kalkulasiGajiBersih(int gajiKotor, int potonganPPH, int potonganIWP, int potonganTaperum) {

        return gajiKotor - potonganPPH - potonganIWP - potonganTaperum;
    }

    public static String formatCurrency(int angka) {
        if (angka == 0) {
            return "0.00";
        } else {
            DecimalFormat convert = new DecimalFormat("###,###,###,###.00");
            return convert.format(angka);
        }
    }

    public static boolean isHurufDanSpasi(String input) {
        String regex = "^[a-zA-Z\\s]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static void exceptionMessage(String namaPegawai, int golonganPangkat,
                                        int masaKerja, String statusPernikahan, int jumlahAnak, String ruangKerja) {
        String[] arrStatusPernikahan = {"Kawin", "Belum Kawin", "Cerai"};
        String[] arrRuangKerja = {"A", "B", "C", "D", "E"};
        boolean isPernikahan = false;
        boolean isRuangkerja = false;

        //exception nama
        if (!isHurufDanSpasi(namaPegawai)) {
            throw new IllegalArgumentException("Input nama hanya menggunakan huruf dan spasi");
        }
        //exception Golongan Pangkat
        if (!(golonganPangkat >= 1 && golonganPangkat <= 4)) {
            throw new IllegalArgumentException("Input Golongan Pangkat hanya dari 1 s.d 4 saja");
        }

        //exception ruang kerja
        for (String data : arrRuangKerja) {
            if (ruangKerja.equals(data)) {
                isRuangkerja = true;
                break;
            }
        }
        if (!isRuangkerja) {
            throw new IllegalArgumentException("golongan ruang kerja hanya 'A','B','C','D','E' ");
        }
        if (golonganPangkat < 4 && ruangKerja.equals("E")) {
            throw new IndexOutOfBoundsException("tidak ada ruang kerja E pada golongan 1,2 dan 3 karena hanya sampai 'D'");
        }

        //exception masa kerja
        if (!(masaKerja >= 0 && masaKerja <= 50)) {
            throw new IllegalArgumentException("Input masa kerja tidak kurang dari 0 dan tidak lebih dari 50");
        }

        //exception status pernikahan
        for (String data : arrStatusPernikahan) {
            if (statusPernikahan.equals(data)) {
                isPernikahan = true;
                break;
            }

        }
        if (!isPernikahan) {
            throw new IllegalArgumentException("Input status pernikahan hanya boleh diisi dengan 'Kawin', 'Belum Kawin' dan 'Cerai'.");
        }
        //exception status pernikahan
        if (jumlahAnak < 0) {
            throw new IllegalArgumentException("Input jumlah anak tidak boleh kurang dari 0 dan harus Angka");
        }
    }
}
