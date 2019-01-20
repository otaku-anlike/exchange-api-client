package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.gate;

import java.util.EnumMap;

/**
 * Kline/Candlestick intervals.
 * m -> minutes; h -> hours; d -> days; w -> weeks; M -> months
 */
public class GateIntervalMap {
  public static EnumMap<GateInterval, Integer> ENUMMAP;

  static {
    EnumMap<GateInterval, Integer> enumMap = new EnumMap(GateInterval.class);
    enumMap.put(GateInterval.ONE_MINUTE,60);
    enumMap.put(GateInterval.THREE_MINUTES,180);
    enumMap.put(GateInterval.FIVE_MINUTES,300);
    enumMap.put(GateInterval.FIFTEEN_MINUTES,900);
    enumMap.put(GateInterval.HALF_HOURLY,1800);
    enumMap.put(GateInterval.HOURLY,3600);
    enumMap.put(GateInterval.TWO_HOURLY,7200);
    enumMap.put(GateInterval.FOUR_HORLY,14400);
    enumMap.put(GateInterval.SIX_HOURLY,21600);
    enumMap.put(GateInterval.EIGHT_HOURLY,28800);
    enumMap.put(GateInterval.TWELVE_HOURLY,43200);
    enumMap.put(GateInterval.DAILY,86400);
    enumMap.put(GateInterval.THREE_DAILY,259200);
    enumMap.put(GateInterval.WEEKLY,604800);
    enumMap.put(GateInterval.MONTHLY,2592000);
//    map = Collections.unmodifiableMap(enumMap);
    ENUMMAP = enumMap;
  }
}
