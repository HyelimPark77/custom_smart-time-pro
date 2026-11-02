.class public final Lcom/sma/smartv3/initializer/AGPSInitializer$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IO0OI;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/initializer/AGPSInitializer;->iIiiO(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/location/CustomLocation;)V
    .locals 7

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v1

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "AGPS location onLocationChange "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/initializer/AGPSInitializer;->IO:Lcom/sma/smartv3/initializer/AGPSInitializer;

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v1

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v3

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "user=206459476@qq.com;pwd=smartwatch;cmd=full;lat="

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ";lon="

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ";alt=0;"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/sma/smartv3/initializer/AGPSInitializer;->OIi0(Lcom/sma/smartv3/initializer/AGPSInitializer;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/sma/smartv3/initializer/AGPSInitializer;->X1ii(Lcom/sma/smartv3/initializer/AGPSInitializer;)V

    return-void
.end method

.method public onError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "AGPS location onError "

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/initializer/AGPSInitializer;->IO:Lcom/sma/smartv3/initializer/AGPSInitializer;

    const-string v0, "user=206459476@qq.com;pwd=smartwatch;cmd=full;"

    invoke-static {p1, v0}, Lcom/sma/smartv3/initializer/AGPSInitializer;->OIi0(Lcom/sma/smartv3/initializer/AGPSInitializer;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/sma/smartv3/initializer/AGPSInitializer;->X1ii(Lcom/sma/smartv3/initializer/AGPSInitializer;)V

    return-void
.end method
