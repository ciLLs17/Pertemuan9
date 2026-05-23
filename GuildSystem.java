// File: GuildSystem.java

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GuildSystem {

    public static void main(String[] args) {

        // =========================
        // Implementasi Set
        // =========================
        HashSet<String> registeredID = new HashSet<>();

        registeredID.add("A01");
        registeredID.add("A02");
        registeredID.add("A01"); // Data dobel, tidak akan ditambahkan lagi

        // =========================
        // Implementasi List
        // =========================
        ArrayList<String> loginHistory = new ArrayList<>();

        loginHistory.add("A01 logged in");
        loginHistory.add("A02 logged in");

        // =========================
        // Implementasi Map
        // =========================
        HashMap<String, String> memberJob = new HashMap<>();

        memberJob.put("A01", "Sniper");
        memberJob.put("A02", "Healer");

        // =========================
        // Output
        // =========================

        // Print ukuran Set
        System.out.println("Jumlah ID terdaftar: " + registeredID.size());

        // Looping isi loginHistory
        System.out.println("\nLogin History:");
        for (String history : loginHistory) {
            System.out.println(history);
        }

        // Ambil Job berdasarkan ID
        System.out.println("\nJob dari A02: " + memberJob.get("A02"));
    }
}