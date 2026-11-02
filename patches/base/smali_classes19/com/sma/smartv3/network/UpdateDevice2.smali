.class public final Lcom/sma/smartv3/network/UpdateDevice2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final BLE_NAME:Ljava/lang/String; = "bleName"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final FIRMWARE_FLAG:Ljava/lang/String; = "flag"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final FIRMWARE_VERSION:Ljava/lang/String; = "firmwareVersion"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final FONT_VERSION:Ljava/lang/String; = "fontVersion"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final IDENTITY:Ljava/lang/String; = "identity"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/UpdateDevice2;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final MAC_ADDRESS:Ljava/lang/String; = "macAddress"
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

.field public static final PROTOTYPE:Ljava/lang/String; = "devicePrototype"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final UI_VERSION:Ljava/lang/String; = "uiVersion"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/ble_device/update2"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/UpdateDevice2;

    invoke-direct {v0}, Lcom/sma/smartv3/network/UpdateDevice2;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/UpdateDevice2;->INSTANCE:Lcom/sma/smartv3/network/UpdateDevice2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
