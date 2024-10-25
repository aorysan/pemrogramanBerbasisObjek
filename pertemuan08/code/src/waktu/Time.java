package waktu;

public class Time {
    Weather cuaca = new Weather();

    private static int day = 1; // 1 menit = 1 hari
    private static int month = 1; // 3 hari dalam satu musim
    private static int season = 4; // 4 musim

    private int airing = 0; // Musim saat ini

    public void displayDay() {
        System.out.print(getCurrentSeason() + ", Day : " + day + ", month : " + month + ", ");
        cuaca.getCuaca(day);
    }

    public void nextDay() {
        day++;

        if(season <= 3) {
            if(month <= 3) {
                if(day <= 3) {
                    displayDay();
                    day++;
                } else {
                    day = 1;
                    month++;
                    displayDay();
                }
            } else {
                month = 1;
                season++;
                displayDay();
            }
        } else {
            season = 0;
            displayDay();
        }
    }

    public String getCurrentSeason() {
        switch (airing) {
            case 0: return "Musim Semi";
            case 1: return "Musim Panas";
            case 2: return "Musim Gugur";
            case 3: return "Musim Dingin";
            default: return "Musim Tidak Dikenal";
        }
    }
}