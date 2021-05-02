public class GamerManager implements GamerService {

    public GamerManager(VerificationService verificationService) {
        this.verificationService = verificationService;
    }

    private VerificationService verificationService;
    @Override
    public void add(Gamer gamer) {
        if (verificationService.Verification(gamer) ==true){
        System.out.println(gamer.getFirstName() +" " + gamer.getLastName() + " adlı kullanıcı eklendi.");
        }else{
            System.out.println("Kullanıcı Eklenemedi");
        }

    }

    @Override
    public void delete(Gamer gamer) {

        if (verificationService.Verification(gamer) ==true){
            System.out.println(gamer.getFirstName() +" " + gamer.getLastName() + " adlı kullanıcı silindi.");
        }else{
            System.out.println("Kullanıcı Silinemedi");
        }


    }

    @Override
    public void update(Gamer gamer) {
        if (verificationService.Verification(gamer) ==true){
            System.out.println(gamer.getFirstName() +" " + gamer.getLastName() + " adlı kullanıcı güncellendi.");
        }else{
            System.out.println("Kullanıcı Güncellemedi");
        }

    }
}
