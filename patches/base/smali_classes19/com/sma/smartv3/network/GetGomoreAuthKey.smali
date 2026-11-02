.class public final Lcom/sma/smartv3/network/GetGomoreAuthKey;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final BLE_NAME:Ljava/lang/String; = "bleName"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final CLIENT_ID:Ljava/lang/String; = "clientId"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final DEVICE_ID:Ljava/lang/String; = "deviceId"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final FLAG:Ljava/lang/String; = "flag"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/GetGomoreAuthKey;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final MAC:Ljava/lang/String; = "mac"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PLATFORM:Ljava/lang/String; = "platform"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TYPE:Ljava/lang/String; = "goMoreType"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/gomore/getAuthKey"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/GetGomoreAuthKey;

    invoke-direct {v0}, Lcom/sma/smartv3/network/GetGomoreAuthKey;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/GetGomoreAuthKey;->INSTANCE:Lcom/sma/smartv3/network/GetGomoreAuthKey;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
