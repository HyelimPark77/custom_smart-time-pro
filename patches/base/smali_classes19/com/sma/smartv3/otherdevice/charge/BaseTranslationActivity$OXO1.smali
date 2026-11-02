.class public final Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-static {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$getDelayTime$p(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)J

    move-result-wide v1

    iget-object v3, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {v3}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getUpdateInterval()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-static {v0, v1, v2}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$setDelayTime$p(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;J)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-static {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$getDelayTime$p(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/16 v1, 0x3e8

    if-gtz v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-static {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$getPopCountdownPopup$p(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Lcom/android/mltcode/paycertificationapi/O110O1III;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    const-wide/16 v2, 0xbb8

    invoke-static {v0, v2, v3}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$setDelayTime$p(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;J)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-static {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$getPopCountdownPopup$p(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Lcom/android/mltcode/paycertificationapi/O110O1III;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-static {v2}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$getDelayTime$p(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)J

    move-result-wide v2

    int-to-long v4, v1

    div-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/O110O1III;->XiOIii1(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->countdownEnd()V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-static {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$getPopCountdownPopup$p(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Lcom/android/mltcode/paycertificationapi/O110O1III;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-static {v2}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$getDelayTime$p(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)J

    move-result-wide v2

    int-to-long v4, v1

    div-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/O110O1III;->XiOIii1(Ljava/lang/String;)V

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getUpdateInterval()J

    move-result-wide v1

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
