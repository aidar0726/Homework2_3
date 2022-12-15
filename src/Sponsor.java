public class Sponsor {
    public String sponsorName;
    public Integer sum;

    public Sponsor(String sponsorName, Integer sum) {
        this.sponsorName = sponsorName;
        this.sum = sum;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public Integer getSum() {
        return sum;
    }

    public void sponsorsTheRase () {
        System.out.println(getSponsorName() + " Спонсирует заезд");
    }

    @Override
    public String toString() {
        return "Имя спонсора " + getSponsorName();
    }
}
