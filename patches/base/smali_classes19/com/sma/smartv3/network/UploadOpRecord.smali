.class public final Lcom/sma/smartv3/network/UploadOpRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final BLE_NAME:Ljava/lang/String; = "bleName"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/UploadOpRecord;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final MAC_ADDRESS:Ljava/lang/String; = "mac"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TYPE:Ljava/lang/String; = "type"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/ble_device/mark"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/UploadOpRecord;

    invoke-direct {v0}, Lcom/sma/smartv3/network/UploadOpRecord;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/UploadOpRecord;->INSTANCE:Lcom/sma/smartv3/network/UploadOpRecord;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
