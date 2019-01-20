package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.rate;

/**
 * Kline/Candlestick intervals.
 * m -> minutes; h -> hours; d -> days; w -> weeks; M -> months
 */
public enum CoinwSymbol {
  HSR(5,"HSR"),
  ETH(14,"ETH"),
  COINS(31,"Coins"),
  SDA(30,"SDA"),
  BDG(32,"BDG"),
  CHAT(33,"Chat"),
  SNT(24,"snt"),
  STORJ(23,"Storj"),
  RCT(36,"Rct"),
  WICC(28,"WICC"),
  EOS(29,"EOS"),
  DOGE(25,"Doge"),
  DEW(20,"Dew"),
  MAG(21,"MAG"),
  RNT(19,"Rnt"),
  DAT(18,"Dat"),
  AE(15,"AE"),
  HPY(17,"hpy"),
  DATA(16,"Data"),
  OMG(11,"OMG"),
  KNC(12,"KNC"),
  MANA(10,"MANA"),
  ZRX(7,"0X"),
  TNT(9,"TNT"),
  STX(6,"STX"),
  CDT(8,"CDT"),
  BC(2,"BC");

  //自定义数据域
  private final int key;
  private final String symbol;

  //private的构造函数
  private CoinwSymbol(int key,String symbol){
    this.key = key;
    this.symbol = symbol;
  }

  public int getKey() {
    return key;
  }
  public String getSymbol() {
    return symbol;
  }
}
