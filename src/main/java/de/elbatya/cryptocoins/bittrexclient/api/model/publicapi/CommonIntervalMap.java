package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi;

import java.util.EnumMap;

/**
 * Kline/Candlestick intervals.
 * m -> minutes; h -> hours; d -> days; w -> weeks; M -> months
 */
public class CommonIntervalMap {
  public static EnumMap<CommonInterval, Integer> ENUMMAP;

  static {
    EnumMap<CommonInterval, Integer> enumMap = new EnumMap(CommonInterval.class);
    enumMap.put(CommonInterval.ONE_MINUTE,60);
    enumMap.put(CommonInterval.THREE_MINUTES,180);
    enumMap.put(CommonInterval.FIVE_MINUTES,300);
    enumMap.put(CommonInterval.FIFTEEN_MINUTES,900);
    enumMap.put(CommonInterval.HALF_HOURLY,1800);
    enumMap.put(CommonInterval.HOURLY,3600);
    enumMap.put(CommonInterval.TWO_HOURLY,7200);
    enumMap.put(CommonInterval.FOUR_HORLY,14400);
    enumMap.put(CommonInterval.SIX_HOURLY,21600);
    enumMap.put(CommonInterval.EIGHT_HOURLY,28800);
    enumMap.put(CommonInterval.TWELVE_HOURLY,43200);
    enumMap.put(CommonInterval.DAILY,86400);
    enumMap.put(CommonInterval.THREE_DAILY,259200);
    enumMap.put(CommonInterval.WEEKLY,604800);
    enumMap.put(CommonInterval.MONTHLY,2592000);
//    map = Collections.unmodifiableMap(enumMap);
    ENUMMAP = enumMap;
  }
}
