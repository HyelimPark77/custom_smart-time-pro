.class public final Lcom/sma/smartv3/network/UploadTemperature;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/network/UploadTemperature;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/ble_temperature/upload"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/UploadTemperature;

    invoke-direct {v0}, Lcom/sma/smartv3/network/UploadTemperature;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/UploadTemperature;->INSTANCE:Lcom/sma/smartv3/network/UploadTemperature;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
