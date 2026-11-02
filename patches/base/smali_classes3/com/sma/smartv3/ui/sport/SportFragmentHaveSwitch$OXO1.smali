.class public final Lcom/sma/smartv3/ui/sport/SportFragmentHaveSwitch$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/location/LocationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/SportFragmentHaveSwitch;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/sport/SportFragmentHaveSwitch;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/SportFragmentHaveSwitch;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportFragmentHaveSwitch$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportFragmentHaveSwitch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationChanged(Landroid/location/Location;)V
    .locals 1

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportFragmentHaveSwitch$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/SportFragmentHaveSwitch;

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/SportFragmentHaveSwitch;->access$getProxy$p(Lcom/sma/smartv3/ui/sport/SportFragmentHaveSwitch;)Lcom/android/mltcode/paycertificationapi/III011;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/III011;->OIX0iXi(Landroid/location/Location;)V

    :cond_0
    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 1

    const-string v0, "provider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 1

    const-string v0, "provider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    return-void
.end method
