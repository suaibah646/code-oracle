// 1. Abstract Class (tidak pakai 'public' karena berada dalam satu file yang sama)
abstract class Hewan {
    // Abstract method (wajib diisi ulang oleh class turunannya)
    abstract void suara();
    
    // Concrete method (method biasa yang sudah ada isinya)
    void tidur() {
        System.out.println("Hewan ini sedang tidur.");
    }
}

// 2. Interface (tidak pakai 'public')
interface BisaTerbang {
    void terbang();
}

// 3. Subclass Kucing mewarisi Abstract Class Hewan
class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Meow! Meow!");
    }
}

// 4. Subclass Burung mewarisi Hewan sekaligus mengimplementasikan Interface BisaTerbang
class Burung extends Hewan implements BisaTerbang {
    @Override
    void suara() {
        System.out.println("Cuit! Cuit!");
    }
    
    @Override
    public void terbang() {
        System.out.println("Burung sedang terbang di angkasa.");
    }
}

// 5. Public Class utama (Nama file wajib sama dengan nama class ini)
public class MainAbstractInterface {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.suara();
        k.tidur();
        
        System.out.println("-------------------");
        
        Burung b = new Burung();
        b.suara();
        b.terbang();
    }
}