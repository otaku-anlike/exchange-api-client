package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.tct;

/**
 * @author contact@elbatya.de
 */
public class SummaryEntry {

    private String tickerId;
    private String tickerSymbol;
    private String tickerNameEn;
    private String tickerNameCh;
    private long time;
    private double price;
    private double volume;
    private double marketcap;
    private double change1h;
    private double change24h;
    private double change7d;
    private double availableSupply;
    private String dataType;
    private String rank;
    private String chartUrl;
    private String hasNews;
    private String explorer;
    private String hasTrendLine;
    private String hasBlock;

    public String getTickerId() {
        return tickerId;
    }

    public void setTickerId(String tickerId) {
        this.tickerId = tickerId;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public String getTickerNameEn() {
        return tickerNameEn;
    }

    public void setTickerNameEn(String tickerNameEn) {
        this.tickerNameEn = tickerNameEn;
    }

    public String getTickerNameCh() {
        return tickerNameCh;
    }

    public void setTickerNameCh(String tickerNameCh) {
        this.tickerNameCh = tickerNameCh;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMarketcap() {
        return marketcap;
    }

    public void setMarketcap(double marketcap) {
        this.marketcap = marketcap;
    }

    public double getChange1h() {
        return change1h;
    }

    public void setChange1h(double change1h) {
        this.change1h = change1h;
    }

    public double getChange24h() {
        return change24h;
    }

    public void setChange24h(double change24h) {
        this.change24h = change24h;
    }

    public double getChange7d() {
        return change7d;
    }

    public void setChange7d(double change7d) {
        this.change7d = change7d;
    }

    public double getAvailableSupply() {
        return availableSupply;
    }

    public void setAvailableSupply(double availableSupply) {
        this.availableSupply = availableSupply;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getChartUrl() {
        return chartUrl;
    }

    public void setChartUrl(String chartUrl) {
        this.chartUrl = chartUrl;
    }

    public String getHasNews() {
        return hasNews;
    }

    public void setHasNews(String hasNews) {
        this.hasNews = hasNews;
    }

    public String getExplorer() {
        return explorer;
    }

    public void setExplorer(String explorer) {
        this.explorer = explorer;
    }

    public String getHasTrendLine() {
        return hasTrendLine;
    }

    public void setHasTrendLine(String hasTrendLine) {
        this.hasTrendLine = hasTrendLine;
    }

    public String getHasBlock() {
        return hasBlock;
    }

    public void setHasBlock(String hasBlock) {
        this.hasBlock = hasBlock;
    }
}