.class public final Lcom/sma/smartv3/network/GetAppConfigInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/network/GetAppConfigInfo;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PROJECT_ID:Ljava/lang/String; = "projectId"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/appConfigInfo/getAppConfigById"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/GetAppConfigInfo;

    invoke-direct {v0}, Lcom/sma/smartv3/network/GetAppConfigInfo;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/GetAppConfigInfo;->INSTANCE:Lcom/sma/smartv3/network/GetAppConfigInfo;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
