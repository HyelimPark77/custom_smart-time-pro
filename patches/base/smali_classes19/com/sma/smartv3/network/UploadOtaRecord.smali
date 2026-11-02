.class public final Lcom/sma/smartv3/network/UploadOtaRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CURRENT_VERSION:Ljava/lang/String; = "currentVersion"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final FLAG_FAILED:Ljava/lang/String; = "-1"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final FLAG_SUCCESS:Ljava/lang/String; = "0"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/UploadOtaRecord;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final OTA_TYPE:Ljava/lang/String; = "otaType"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final REMARK:Ljava/lang/String; = "remark"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final SUCCESS_FLAG:Ljava/lang/String; = "successFlag"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TARGET_VERSION:Ljava/lang/String; = "trargetVersion"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TYPE_FIRMWARE:Ljava/lang/String; = "1"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TYPE_OTHER:Ljava/lang/String; = "2"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/ble_device/addOtaRecord"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/UploadOtaRecord;

    invoke-direct {v0}, Lcom/sma/smartv3/network/UploadOtaRecord;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/UploadOtaRecord;->INSTANCE:Lcom/sma/smartv3/network/UploadOtaRecord;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
