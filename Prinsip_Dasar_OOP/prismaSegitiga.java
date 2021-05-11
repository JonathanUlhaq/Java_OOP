public class prismaSegitiga extends SegitigaSiku{
    double s1;

    public prismaSegitiga(double alas, double tinggi,double s1){
        super(alas,tinggi);
        this.s1 = s1;
        
    }

    public void setS1(double s1){
        this.s1 = s1;
    }

   
    public double getS1(){
        return s1;
    }

    public double getLuasAlas(){
        double lulas;
        lulas = 0.5*getAlas()*getTinggi();
        return lulas;
    }

    public double getLuasPermukaan(){
        double luper = getS1() * (getSimir()+getAlas()+getTinggi()) +(2*getLuasAlas());
        return luper;
    }

    public double getVolume(){
        return getLuasAlas()*getS1();
    }

}