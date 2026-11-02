.class public final Lcom/sma/smartv3/ui/main/BaseMainActivity$iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IO0OI;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/main/BaseMainActivity;->requestWeather()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/main/BaseMainActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/main/BaseMainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/main/BaseMainActivity$iO;->OXO1:Lcom/sma/smartv3/ui/main/BaseMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/location/CustomLocation;)V
    .locals 5

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/BaseMainActivity$iO;->OXO1:Lcom/sma/smartv3/ui/main/BaseMainActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v1

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v3

    invoke-static {v0, v1, v2, v3, v4}, Lcom/sma/smartv3/ui/main/BaseMainActivity;->access$requestWeatherLocation(Lcom/sma/smartv3/ui/main/BaseMainActivity;DD)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/main/BaseMainActivity$iO;->OXO1:Lcom/sma/smartv3/ui/main/BaseMainActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/main/BaseMainActivity;->access$stopLocationClient(Lcom/sma/smartv3/ui/main/BaseMainActivity;)V

    return-void
.end method

.method public onError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestWeather -> CustomLocationCallback onError message="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method
