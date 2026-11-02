.class public final Lcom/sma/smartv3/network/GetWeatherRealtime;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final BLE_NAME:Ljava/lang/String; = "bleName"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final FLAG:Ljava/lang/String; = "flag"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/GetWeatherRealtime;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final LAT:Ljava/lang/String; = "lat"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final LON:Ljava/lang/String; = "lon"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PROJECT_ID:Ljava/lang/String; = "projectId"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/weather_info/realtime"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL_V2:Ljava/lang/String; = "/weather_info/realtime/v2"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/GetWeatherRealtime;

    invoke-direct {v0}, Lcom/sma/smartv3/network/GetWeatherRealtime;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/GetWeatherRealtime;->INSTANCE:Lcom/sma/smartv3/network/GetWeatherRealtime;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
