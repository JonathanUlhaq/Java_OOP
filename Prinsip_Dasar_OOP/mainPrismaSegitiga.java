public class mainPrismaSegitiga {
    public static void main(String[]args){
        prismaSegitiga prisma = new prismaSegitiga(3,4,7);

        System.out.println("Prisma Segitiga");
        System.out.println("Sisi Alas      : "+prisma.getAlas()+" cm");
        System.out.println("Sisi Tinggi    : "+prisma.getTinggi()+" cm");
        System.out.println("Tinggi         : "+prisma.getS1()+" cm");
        System.out.println("Sisi Miring    : "+prisma.getSimir()+" cm");
        System.out.println("-----------------------");
        System.out.println("Luas Alas      : " +prisma.getLuasAlas()+" cm kuadrat");
        System.out.println("Luas Permukaan : " +prisma.getLuasPermukaan()+" cm kuadrat");
        System.out.println("Volume         : " +prisma.getVolume()+" cm kubik");
    }

    
}
