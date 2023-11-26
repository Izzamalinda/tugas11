public class Transaksi implements Pembayaran{
    private int noFaktur;
    private String namaPelanggan;
    private String namaBarang;

    public Transaksi (int noFaktur, String namaPelanggan, String namaBarang){
        this.noFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
        this.namaBarang = namaBarang;
    }

    public long hitungTotalBayar(long harga, int jumlah){
        return harga * jumlah;
    }

    public int getNoFaktur(){
        return noFaktur;
    } 

    public String getNamaPelanggan(){
        return namaPelanggan;
    }

    public String getNamaBarang(){
        return namaBarang;
    }
}
