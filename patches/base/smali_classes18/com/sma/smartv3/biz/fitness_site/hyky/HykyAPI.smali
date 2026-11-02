.class public final Lcom/sma/smartv3/biz/fitness_site/hyky/HykyAPI;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final BASE_URL_HYKY:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final DeviceType:I = 0x908ac

.field public static final INSTANCE:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyAPI;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyAPI;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyAPI;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyAPI;->INSTANCE:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyAPI;

    sget-object v0, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v0}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "/kotlinweb"

    const-string v3, "/ky-api"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyAPI;->BASE_URL_HYKY:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getBASE_URL_HYKY()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyAPI;->BASE_URL_HYKY:Ljava/lang/String;

    return-object v0
.end method
