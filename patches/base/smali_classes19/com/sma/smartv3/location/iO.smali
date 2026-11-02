.class public final Lcom/sma/smartv3/location/iO;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final OXO1:Lcom/sma/smartv3/location/iO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final XIi00iiXO:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final XO0O10:F

.field public static iO:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/location/iO;

    invoke-direct {v0}, Lcom/sma/smartv3/location/iO;-><init>()V

    sput-object v0, Lcom/sma/smartv3/location/iO;->OXO1:Lcom/sma/smartv3/location/iO;

    const-string v0, "SpeedFromGPSHelp"

    sput-object v0, Lcom/sma/smartv3/location/iO;->XIi00iiXO:Ljava/lang/String;

    const v0, 0x3f7d70a4    # 0.99f

    sput v0, Lcom/sma/smartv3/location/iO;->XO0O10:F

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic iO(Lcom/sma/smartv3/location/iO;Lcom/sma/smartv3/location/CustomLocation;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/location/iO;->XIi00iiXO(Lcom/sma/smartv3/location/CustomLocation;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public final OXO1()F
    .locals 1

    sget v0, Lcom/sma/smartv3/location/iO;->iO:F

    return v0
.end method

.method public final XIi00iiXO(Lcom/sma/smartv3/location/CustomLocation;Lkotlin/jvm/functions/Function1;)V
    .locals 8
    .param p1    # Lcom/sma/smartv3/location/CustomLocation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/location/CustomLocation;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "newLocation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->O00()Lcom/sma/smartv3/location/CustomLocation$TYPE;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/location/CustomLocation$TYPE;->NORMAL:Lcom/sma/smartv3/location/CustomLocation$TYPE;

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->XOO0ii0()I

    move-result v0

    const-wide v1, 0x400ccccccccccccdL    # 3.6

    const/4 v3, 0x0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->I0IIOi()F

    move-result v0

    sget v4, Lcom/sma/smartv3/location/iO;->XO0O10:F

    cmpg-float v0, v0, v4

    if-gez v0, :cond_1

    :goto_0
    move v0, v3

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->I0IIOi()F

    move-result v0

    float-to-double v4, v0

    mul-double/2addr v4, v1

    double-to-float v0, v4

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->I0IIOi()F

    move-result v0

    float-to-double v4, v0

    sget v0, Lcom/sma/smartv3/location/iO;->XO0O10:F

    float-to-double v6, v0

    mul-double/2addr v6, v1

    cmpg-double v0, v4, v6

    if-gez v0, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->I0IIOi()F

    move-result v0

    :goto_1
    invoke-static {v0, v3}, Ljava/lang/Math;->max(FF)F

    move-result v0

    sput v0, Lcom/sma/smartv3/location/iO;->iO:F

    if-eqz p2, :cond_4

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v0, Lcom/sma/smartv3/location/iO;->XIi00iiXO:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->I0IIOi()F

    move-result p1

    sget v1, Lcom/sma/smartv3/location/iO;->iO:F

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " originalGpsSpeed = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p1, " m/s , Speed = "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p1, " km/h"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public final XO0O10(F)V
    .locals 0

    sput p1, Lcom/sma/smartv3/location/iO;->iO:F

    return-void
.end method
