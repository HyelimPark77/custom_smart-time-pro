.class public Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$I0IIOi$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$I0IIOi;->onResult(Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic I1:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$I0IIOi;

.field public final synthetic IO:Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$I0IIOi;Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010
        }
        names = {
            "this$1",
            "val$result"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$I0IIOi$OXO1;->I1:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$I0IIOi;

    iput-object p2, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$I0IIOi$OXO1;->IO:Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$I0IIOi$OXO1;->I1:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$I0IIOi;

    iget-object v1, v1, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$I0IIOi;->OXO1:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    iget-object v1, v1, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->chatOutputText:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "data:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$I0IIOi$OXO1;->IO:Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;

    invoke-virtual {v1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nstatus:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$I0IIOi$OXO1;->IO:Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;

    invoke-virtual {v1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getStatus()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\nsrc:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$I0IIOi$OXO1;->IO:Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;

    invoke-virtual {v1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getTransResult()Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;

    move-result-object v1

    invoke-virtual {v1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;->getSrc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\ndst:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$I0IIOi$OXO1;->IO:Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;

    invoke-virtual {v1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getTransResult()Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;

    move-result-object v1

    invoke-virtual {v1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;->getDst()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\ntransstatus:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$I0IIOi$OXO1;->IO:Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;

    invoke-virtual {v1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getTransResult()Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;

    move-result-object v1

    invoke-virtual {v1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;->getStatus()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$I0IIOi$OXO1;->I1:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$I0IIOi;

    iget-object v1, v1, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$I0IIOi;->OXO1:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    iget-object v1, v1, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->chatOutputText:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
