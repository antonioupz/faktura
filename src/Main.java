import pl.edu.akademiazamojska.entity.Faktura;
import pl.edu.akademiazamojska.service.NabywcaService;

public class Main {
    private static Faktura faktura;
    public static void main(String[] args) {
        System.out.println("Hello world!");
        NabywcaService nabywcaService=new NabywcaService();
        faktura=new Faktura();
        faktura.setNabywca(nabywcaService.findNabywcaByNip(2));
        System.out.println(faktura.getNabywca().getNazwa());
    }
}