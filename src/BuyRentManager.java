public class BuyRentManager implements BuyRentService{
    @Override
    public void Buy(Gamer gamer,Game game) {
        System.out.println("Oyun başarıyla satın alındı : " + game.getGameName() + "---> Yine Bekleriz : " + gamer.getFirstName());
    }

    @Override
    public void Rent(Gamer gamer,Game game) {
        System.out.println("Oyun başarıyla kiralandı : " + game.getGameName()+ "---> Yine Bekleriz : " + gamer.getFirstName());
    }
}
