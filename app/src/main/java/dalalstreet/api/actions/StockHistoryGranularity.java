// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: actions/GetCompanyProfile.proto

package dalalstreet.api.actions;

/**
 * Protobuf enum {@code proto.StockHistoryGranularity}
 */
public enum StockHistoryGranularity
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <pre>
   * Granularity will be per-minute
   * </pre>
   *
   * <code>OneDay = 0;</code>
   */
  OneDay(0),
  /**
   * <pre>
   * Granularity will be per-5-minutes
   * </pre>
   *
   * <code>ThreeDays = 1;</code>
   */
  ThreeDays(1),
  /**
   * <pre>
   * Granularity will be per-hour
   * </pre>
   *
   * <code>OneWeek = 2;</code>
   */
  OneWeek(2),
  /**
   * <pre>
   * Granularity will be per-day
   * </pre>
   *
   * <code>OneMonth = 3;</code>
   */
  OneMonth(3),
  /**
   * <pre>
   * Granularity will be per-day
   * </pre>
   *
   * <code>ThreeMonths = 4;</code>
   */
  ThreeMonths(4),
  /**
   * <pre>
   * Granularity will be per-15-days
   * </pre>
   *
   * <code>SixMonths = 5;</code>
   */
  SixMonths(5),
  /**
   * <pre>
   * Granularity will be per-month
   * </pre>
   *
   * <code>OneYear = 6;</code>
   */
  OneYear(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Granularity will be per-minute
   * </pre>
   *
   * <code>OneDay = 0;</code>
   */
  public static final int OneDay_VALUE = 0;
  /**
   * <pre>
   * Granularity will be per-5-minutes
   * </pre>
   *
   * <code>ThreeDays = 1;</code>
   */
  public static final int ThreeDays_VALUE = 1;
  /**
   * <pre>
   * Granularity will be per-hour
   * </pre>
   *
   * <code>OneWeek = 2;</code>
   */
  public static final int OneWeek_VALUE = 2;
  /**
   * <pre>
   * Granularity will be per-day
   * </pre>
   *
   * <code>OneMonth = 3;</code>
   */
  public static final int OneMonth_VALUE = 3;
  /**
   * <pre>
   * Granularity will be per-day
   * </pre>
   *
   * <code>ThreeMonths = 4;</code>
   */
  public static final int ThreeMonths_VALUE = 4;
  /**
   * <pre>
   * Granularity will be per-15-days
   * </pre>
   *
   * <code>SixMonths = 5;</code>
   */
  public static final int SixMonths_VALUE = 5;
  /**
   * <pre>
   * Granularity will be per-month
   * </pre>
   *
   * <code>OneYear = 6;</code>
   */
  public static final int OneYear_VALUE = 6;


  public final int getNumber() {
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static StockHistoryGranularity valueOf(int value) {
    return forNumber(value);
  }

  public static StockHistoryGranularity forNumber(int value) {
    switch (value) {
      case 0: return OneDay;
      case 1: return ThreeDays;
      case 2: return OneWeek;
      case 3: return OneMonth;
      case 4: return ThreeMonths;
      case 5: return SixMonths;
      case 6: return OneYear;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<StockHistoryGranularity>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
          StockHistoryGranularity> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<StockHistoryGranularity>() {
          public StockHistoryGranularity findValueByNumber(int number) {
            return StockHistoryGranularity.forNumber(number);
          }
        };

  private final int value;

  private StockHistoryGranularity(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:proto.StockHistoryGranularity)
}
