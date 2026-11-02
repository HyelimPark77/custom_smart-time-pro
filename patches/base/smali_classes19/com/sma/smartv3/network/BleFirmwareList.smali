.class public final Lcom/sma/smartv3/network/BleFirmwareList;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final FILTER:Ljava/lang/String; = "filter"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/BleFirmwareList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final LIMIT:Ljava/lang/String; = "limit"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PAGE:Ljava/lang/String; = "page"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/ble_firmware/list_no_verify"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/BleFirmwareList;

    invoke-direct {v0}, Lcom/sma/smartv3/network/BleFirmwareList;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/BleFirmwareList;->INSTANCE:Lcom/sma/smartv3/network/BleFirmwareList;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
