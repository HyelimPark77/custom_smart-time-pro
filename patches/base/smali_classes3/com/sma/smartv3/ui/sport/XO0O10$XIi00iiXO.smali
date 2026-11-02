.class public final Lcom/sma/smartv3/ui/sport/XO0O10$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/ui/sport/StepsManager$OXO1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/XO0O10;->XX1Oi(Landroid/app/Application;)V
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
.method public OXO1(I)V
    .locals 3

    sget-object v0, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->X0i1O()Lcom/sma/smartv3/db/entity/SportData;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/sma/smartv3/db/entity/SportData;->setMStep(I)V

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->IIX1OXO(Lcom/sma/smartv3/ui/sport/XO0O10;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->X11iII1O1()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->X11iII1O1()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v1, 0x2

    if-ge p1, v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->X0i1O()Lcom/sma/smartv3/db/entity/SportData;

    move-result-object p1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/o65;->OXO1:Lcom/android/mltcode/paycertificationapi/o65;

    invoke-static {}, Lcom/sma/smartv3/ui/sport/XO0O10;->X1ii()Lcom/sma/smartv3/model/AppUser;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getHeight()F

    move-result v2

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->X0i1O()Lcom/sma/smartv3/db/entity/SportData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/SportData;->getMStep()I

    move-result v0

    invoke-virtual {v1, v2, v0}, Lcom/android/mltcode/paycertificationapi/o65;->OIi0(FI)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/db/entity/SportData;->setMDistance(I)V

    return-void
.end method
