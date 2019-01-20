package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi;

/**
 * Kline/Candlestick intervals.
 * m -> minutes; h -> hours; d -> days; w -> weeks; M -> months
 */
public enum BittrexInterval {
  ONE_MINUTE("oneMin"),
  THREE_MINUTES("3m"),
  FIVE_MINUTES("fiveMin"),
  FIFTEEN_MINUTES("15m"),
  HALF_HOURLY("thirtyMin"),
  HOURLY("hour"),
  TWO_HOURLY("2h"),
  FOUR_HORLY("4h"),
  SIX_HOURLY("6h"),
  EIGHT_HOURLY("8h"),
  TWELVE_HOURLY("12h"),
  DAILY("day"),
  THREE_DAILY("3d"),
  WEEKLY("1w"),
  MONTHLY("1M");

  private final String intervalId;

  BittrexInterval(String intervalId) {
    this.intervalId = intervalId;
  }

  public String getIntervalId() {
    return intervalId;
  }
}
