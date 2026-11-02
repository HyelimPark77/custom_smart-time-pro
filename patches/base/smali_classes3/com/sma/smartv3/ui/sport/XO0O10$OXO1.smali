.class public interface abstract Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/sport/XO0O10;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OXO1"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/sport/XO0O10$OXO1$OXO1;
    }
.end annotation


# direct methods
.method public static synthetic I0IIOi(Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;->iO(I)V

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;Lcom/sma/smartv3/db/entity/SportData;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;->IO(Lcom/sma/smartv3/db/entity/SportData;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;Lcom/szabh/smable3/entity/BleAppSportState;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;->XO0O10(Lcom/szabh/smable3/entity/BleAppSportState;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;Lcom/sma/smartv3/db/entity/Location;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;->OIi0(Lcom/sma/smartv3/db/entity/Location;)V

    return-void
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;->O00(Z)V

    return-void
.end method


# virtual methods
.method public IO(Lcom/sma/smartv3/db/entity/SportData;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/db/entity/SportData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "sportData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public O00(Z)V
    .locals 0

    return-void
.end method

.method public OIi0(Lcom/sma/smartv3/db/entity/Location;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/db/entity/Location;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public XO0O10(Lcom/szabh/smable3/entity/BleAppSportState;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleAppSportState;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "sportState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public iO(I)V
    .locals 0

    return-void
.end method
