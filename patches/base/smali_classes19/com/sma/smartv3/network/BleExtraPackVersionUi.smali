.class public final Lcom/sma/smartv3/network/BleExtraPackVersionUi;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final BLE_NAME:Ljava/lang/String; = "bleName"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final FIRMWARE_VERSION:Ljava/lang/String; = "firmwareVersion"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final FLAG:Ljava/lang/String; = "flag"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/BleExtraPackVersionUi;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/ble_extra_pack_version/latest_ui"
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

    new-instance v0, Lcom/sma/smartv3/network/BleExtraPackVersionUi;

    invoke-direct {v0}, Lcom/sma/smartv3/network/BleExtraPackVersionUi;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/BleExtraPackVersionUi;->INSTANCE:Lcom/sma/smartv3/network/BleExtraPackVersionUi;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
