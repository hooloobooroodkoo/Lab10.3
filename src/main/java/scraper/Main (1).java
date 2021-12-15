package scraper;

class Main {
    public static void main(String[] args) {
        String url = "https://www.newhomesource.com/specdetail/17-hummingbird-lane-phoenixville-pa-19460/2072852";
//        String url = "localhost";
        DefaultScraper defaultScraper = new DefaultScraper();
//        defaultScraper.scrape(url);
        Home home = defaultScraper.scrape(url);
        System.out.println(home);
    }
}
