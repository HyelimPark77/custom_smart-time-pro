.class public final Lcom/sma/smartv3/network/ExtraPackVersionLatest;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final FIRMWARE_VERSION:Ljava/lang/String; = "firmwareVersion"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final GPS_PACK_VERSION:Ljava/lang/String; = "gpsPackVersion"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/ExtraPackVersionLatest;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final LANGUAGE_CODE:Ljava/lang/String; = "languageCode"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final LANGUAGE_PACK_VERSION:Ljava/lang/String; = "languagePackVersion"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final NETWORK_PACK_VERSION:Ljava/lang/String; = "networkPackVersion"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final UI_PACK_VERSION:Ljava/lang/String; = "uiPackVersion"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/ble_extra_pack_version/latest"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final VALID:Ljava/lang/String; = "valid"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/ExtraPackVersionLatest;

    invoke-direct {v0}, Lcom/sma/smartv3/network/ExtraPackVersionLatest;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/ExtraPackVersionLatest;->INSTANCE:Lcom/sma/smartv3/network/ExtraPackVersionLatest;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
