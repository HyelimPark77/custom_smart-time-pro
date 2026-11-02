.class public final Lcom/sma/smartv3/network/UploadSleep;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/network/UploadSleep;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/ble_sleep/upload"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/UploadSleep;

    invoke-direct {v0}, Lcom/sma/smartv3/network/UploadSleep;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/UploadSleep;->INSTANCE:Lcom/sma/smartv3/network/UploadSleep;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
