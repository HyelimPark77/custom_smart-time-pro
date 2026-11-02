.class public final Lcom/sma/smartv3/network/UpdateDevice;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ADDRESS:Ljava/lang/String; = "address"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final AGPS_TYPE:Ljava/lang/String; = "agpsType"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final EXTRA_INFO:Ljava/lang/String; = "extraInfo"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final FIRMWARE_FLAG:Ljava/lang/String; = "firmwareFlag"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final IDENTITY:Ljava/lang/String; = "identity"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/UpdateDevice;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final NAME:Ljava/lang/String; = "name"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PLATFORM:Ljava/lang/String; = "platform"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PROJECT_ID:Ljava/lang/String; = "projectId"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PROTOTYPE:Ljava/lang/String; = "prototype"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final SETTINGS:Ljava/lang/String; = "settings"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/ble_device/update"
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

    new-instance v0, Lcom/sma/smartv3/network/UpdateDevice;

    invoke-direct {v0}, Lcom/sma/smartv3/network/UpdateDevice;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/UpdateDevice;->INSTANCE:Lcom/sma/smartv3/network/UpdateDevice;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
