.class public final Lcom/sma/smartv3/network/GetDeviceListObject;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/network/GetDeviceListObject;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PROJECT_ID:Ljava/lang/String; = "projectId"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/appConfigInfo/get_device_listObject"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/GetDeviceListObject;

    invoke-direct {v0}, Lcom/sma/smartv3/network/GetDeviceListObject;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/GetDeviceListObject;->INSTANCE:Lcom/sma/smartv3/network/GetDeviceListObject;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
