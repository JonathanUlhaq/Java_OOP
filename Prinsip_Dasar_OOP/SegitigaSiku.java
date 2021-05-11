public class SegitigaSiku{
    double alas;
    double tinggi;
    double miring;

    //menentukan
    public SegitigaSiku(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    
    }
    public void setAlas (double alas){
        this.alas = alas;
    }
    public void setTinggi (double tinggi){
        this.tinggi = tinggi;
    }

    public double getAlas (){
        return alas;
    }

    public double getTinggi(){
        return tinggi;
    }

    public double getSimir(){
        return Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi,2));
    }
    public double getLuas(){
        return 0.5*alas*tinggi;
    }

    public double getKeliling(){
        return alas+tinggi+getSimir();
    }
    
}