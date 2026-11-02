.class public final Lcom/sma/smartv3/ui/device/guide/AppGuideActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OXO1"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity$OXO1;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1()J
    .locals 2

    invoke-static {}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->access$getOnFinishTime$cp()J

    move-result-wide v0

    return-wide v0
.end method

.method public final XIi00iiXO()Z
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity$OXO1;->OXO1()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1388

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final iO(J)V
    .locals 0

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->access$setOnFinishTime$cp(J)V

    return-void
.end method
