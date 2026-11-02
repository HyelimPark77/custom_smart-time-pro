.class public final Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$OIi0;
.super Landroid/os/CountDownTimer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->startCountDown()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V
    .locals 4

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$OIi0;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    const-wide/16 v0, 0xfa0

    const-wide/16 v2, 0x3e8

    invoke-direct {p0, v0, v1, v2, v3}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 2

    const-wide/16 v0, 0xc8

    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/VibrateUtils;->vibrate(J)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$OIi0;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->startSport()V

    return-void
.end method

.method public onTick(J)V
    .locals 9

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$OIi0;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getCountdownTv()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x3e8

    int-to-long v0, v0

    div-long/2addr p1, v0

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$OIi0;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {v0, p1, p2}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportStartVoice(J)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$OIi0;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getCountdownTv()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    const-wide/16 v1, 0x0

    cmp-long v1, p1, v1

    if-lez v1, :cond_0

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$OIi0;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v2

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$OIi0;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getGoals()[I

    move-result-object p1

    const/4 p2, 0x0

    aget v4, p1, p2

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$OIi0;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getGoals()[I

    move-result-object p1

    const/4 p2, 0x1

    aget v5, p1, p2

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$OIi0;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getGoals()[I

    move-result-object p1

    const/4 p2, 0x2

    aget v6, p1, p2

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v8}, Lcom/sma/smartv3/ui/sport/XO0O10;->i100IXOX(Lcom/sma/smartv3/ui/sport/XO0O10;IZIIIILjava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$OIi0;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    const p2, 0x7f140002

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method
