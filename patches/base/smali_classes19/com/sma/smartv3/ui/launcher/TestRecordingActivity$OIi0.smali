.class public Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$OIi0;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "OIi0"
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010
        }
        names = {
            "this$0"
        }
    .end annotation

    .line 2
    iput-object p1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$OIi0;->OXO1:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;Lcom/android/mltcode/paycertificationapi/vo5;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$OIi0;-><init>(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "context",
            "intent"
        }
    .end annotation

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.media.ACTION_SCO_AUDIO_STATE_UPDATED"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "android.media.extra.SCO_AUDIO_STATE"

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    const/4 p2, -0x1

    const-string v0, "SparkChain"

    if-eq p1, p2, :cond_3

    if-eqz p1, :cond_2

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "111111111111111111 SCO Audio State: CONNECTING   \u8fde\u63a5\u4e2d\u72b6\u6001  "

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$OIi0;->OXO1:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    iget-object p1, p1, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->chatOutputText:Landroid/widget/TextView;

    const-string p2, "SCO Audio State: CONNECTING   \u8fde\u63a5\u4e2d\u72b6\u6001--> \u8fde\u63a5\u4e2d-->"

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$OIi0;->OXO1:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->OIX0iXi(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)Landroid/media/AudioManager;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/media/AudioManager;->setBluetoothScoOn(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$OIi0;->OXO1:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    iget-object p1, p1, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->chatOutputText:Landroid/widget/TextView;

    const-string p2, "SCO Audio State: CONNECTED   \u5904\u7406\u8fde\u63a5\u540e\u72b6\u6001 -->  \u6b63\u5e38\u53ef\u4ee5\u7528\u4e86---->  \u6253\u5f00!!!"

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string p1, "111111111111111111 SCO Audio State: CONNECTED  \u5904\u7406\u8fde\u63a5\u540e\u72b6\u6001"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2
    const-string p1, "111111111111111111 SCO Audio State: DISCONNECTED   \u65ad\u5f00 "

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$OIi0;->OXO1:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    iget-object p1, p1, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->chatOutputText:Landroid/widget/TextView;

    const-string p2, "SCO Audio State: DISCONNECTED   \u65ad\u5f00"

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_3
    iget-object p1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$OIi0;->OXO1:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    iget-object p1, p1, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->chatOutputText:Landroid/widget/TextView;

    const-string p2, "SCO Audio State: ERROR  \u9519\u8bef"

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string p1, "111111111111111111 SCO Audio State: ERROR  \u9519\u8bef"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    :goto_0
    return-void
.end method
