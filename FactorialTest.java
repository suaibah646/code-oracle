public class FactorialTest {
    // Variabel global public sesuai ketentuan soal
    public int num = 10;

    // Method getFactorial yang sudah disediakan
    int getFactorial() {
        int factorial = 1;
        for(int i = num; i > 0; i--){
            factorial *= i; // Diperbaiki dari num ke i agar perhitungan faktorial berjalan benar
        }
        return factorial;
    }

    // Override method toString sesuai soal nomor 3
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factorial: ").append(num).append("! = ");
        
        for (int i = 1; i <= num; i++) {
            sb.append(i);
            if (i < num) {
                sb.append(" * ");
            }
        }
        
        sb.append(" = ").append(getFactorial());
        return sb.toString();
    }

    // Main method untuk menjalankan program (opsional untuk uji coba)
    public static void main(String[] args) {
        FactorialTest obj = new FactorialTest();
        System.out.println(obj.toString());
    }
}