public class CampaignManager implements CampaignService{
    @Override
    public void login(Game game) {
        System.out.println("Kampanyaya girişiniz yapıldı : " + game.getGameName()+ " : "+game.getGamePrice() / 5 +" TL");

    }

    @Override
    public void delete(Game game) {
        System.out.println("Kampanyaya girişiniz silindi ve giriş silindiği için indirim artık geçersiz : " + game.getGameName()+" : "+game.getGamePrice()+"" +" TL");

    }

    @Override
    public void update(Game game) {
        System.out.println("Kampanya güncellendi : " + game.getGameName()+ " : "+game.getGamePrice() / 3 +" TL");
    }
}
