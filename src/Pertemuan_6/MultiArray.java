package Pertemuan_6;

public class MultiArray {
    public static void main(String[] args) {
        String[][][] Mahasiswa = {
            {
                { "Putra" }, { "Naban" }, { "Reggi" }, { "Dwi" },
                { "Zaim" }, { "Robby" }, { "Revan" }, { "Aby" }
            },
            {
                { "Naufal" }, { "Gidzane" }, { "Hamudi" }, { "Ibnu" },
                { "Deni" }, { "Ilham" }, { "Ade" }, { "Fahrul" }
            },
            {
                { "test" }, { "sda" }, { "sad" }, { "dwa" },
                { "dawsd" }, { "Ildawdham" }, { "dawd" }, { "sdawdahrul" }
            },
            {
                { "Naufdadaal" }, { "sdidzane" }, { "Hdawdamudi" }, { "Ibdawdnu" },
                { "Ddaweni" }, { "Ilhdwaam" }, { "Adesd" }, { "Fahrsdsul" }
            },
        };

        for (int i = 0; i < Mahasiswa.length; i++) {
            System.out.println("Baris: " + (i + 1));
            for (int j = 0; j < Mahasiswa[i].length; j++) {
                System.out.println("Kelompok: " + (j + 1));
                for (int j2 = 0; j2 < Mahasiswa[i][j].length; j2++) {
                    System.out.print(Mahasiswa[i][j][j2] + " ");
                }
                System.out.println();
            }
        }
    }
}
