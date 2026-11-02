.class public Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$XO0O10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->setStartBluetooth()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "111111111111111111   SCO Audio  \u5f00\u59cb  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->OIX0iXi(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)Landroid/media/AudioManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/AudioManager;->isBluetoothScoOn()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SparkChain"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    iget-object v0, v0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->chatOutputText:Landroid/widget/TextView;

    const-string v1, "SCO Audio State:   \u5f00\u59cb --> \u8fde\u63a5"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->OIX0iXi(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)Landroid/media/AudioManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioManager;->startBluetoothSco()V

    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    const-string v1, "HUAWEI"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/blankj/utilcode/util/RomUtils;->isOppo()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->OIX0iXi(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)Landroid/media/AudioManager;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->setMode(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->OIX0iXi(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)Landroid/media/AudioManager;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->setMicrophoneMute(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->OIX0iXi(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)Landroid/media/AudioManager;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->setSpeakerphoneOn(Z)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->OIX0iXi(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)Landroid/media/AudioManager;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->setMode(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->OIX0iXi(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)Landroid/media/AudioManager;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->setMicrophoneMute(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->OIX0iXi(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)Landroid/media/AudioManager;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->setSpeakerphoneOn(Z)V

    :goto_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$XO0O10;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->I1XOi1(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)V

    return-void
.end method
