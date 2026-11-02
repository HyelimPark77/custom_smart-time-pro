.class public final Lcom/sma/smartv3/initializer/AGPSInitializer$init$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/initializer/AGPSInitializer;->OXO1(Landroid/app/Application;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public OXO1:J

.field public XIi00iiXO:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    new-instance v0, Lkotlin/ranges/IntRange;

    const/16 v1, 0xf

    const/16 v2, 0x78

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    sget-object v1, Lkotlin/random/Random;->Default:Lkotlin/random/Random$Default;

    invoke-static {v0, v1}, Lkotlin/ranges/iO;->IOIi00(Lkotlin/ranges/IntRange;Lkotlin/random/Random;)I

    move-result v0

    const v1, 0xea60

    mul-int/2addr v0, v1

    iput v0, p0, Lcom/sma/smartv3/initializer/AGPSInitializer$init$1;->XIi00iiXO:I

    return-void
.end method


# virtual methods
.method public final OXO1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/initializer/AGPSInitializer$init$1;->XIi00iiXO:I

    return v0
.end method

.method public final XIi00iiXO()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/initializer/AGPSInitializer$init$1;->OXO1:J

    return-wide v0
.end method

.method public final XO0O10(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/initializer/AGPSInitializer$init$1;->OXO1:J

    return-void
.end method

.method public final iO(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/initializer/AGPSInitializer$init$1;->XIi00iiXO:I

    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "intent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, -0x5a2f0b56

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "android.intent.action.TIME_TICK"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iget-wide v0, p0, Lcom/sma/smartv3/initializer/AGPSInitializer$init$1;->OXO1:J

    sub-long/2addr p1, v0

    iget v0, p0, Lcom/sma/smartv3/initializer/AGPSInitializer$init$1;->XIi00iiXO:I

    int-to-long v1, v0

    cmp-long p1, p1, v1

    if-lez p1, :cond_1

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AGPS onReceive ACTION_TIME_TICK -> syncAGPS() "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/initializer/AGPSInitializer;->IO:Lcom/sma/smartv3/initializer/AGPSInitializer;

    const/4 p2, 0x0

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-static {p1, p2, v1, v0, v1}, Lcom/sma/smartv3/initializer/AGPSInitializer;->I1(Lcom/sma/smartv3/initializer/AGPSInitializer;ZLcom/android/mltcode/paycertificationapi/c72;ILjava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/sma/smartv3/initializer/AGPSInitializer$init$1;->OXO1:J

    :cond_1
    :goto_0
    return-void
.end method
