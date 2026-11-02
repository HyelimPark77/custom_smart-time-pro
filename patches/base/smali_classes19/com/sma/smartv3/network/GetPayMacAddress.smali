.class public final Lcom/sma/smartv3/network/GetPayMacAddress;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final APP_VERSION:Ljava/lang/String; = "androidVersion"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final BLE_NAME:Ljava/lang/String; = "bleName"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final FLAG:Ljava/lang/String; = "flag"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/GetPayMacAddress;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final OLD_MAC_ADDRESS:Ljava/lang/String; = "oldMacAddress"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/pay/getPayMacAddress"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final VERSION:Ljava/lang/String; = "version"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/GetPayMacAddress;

    invoke-direct {v0}, Lcom/sma/smartv3/network/GetPayMacAddress;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/GetPayMacAddress;->INSTANCE:Lcom/sma/smartv3/network/GetPayMacAddress;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
