.class public Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$O00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/iflytek/sparkchain/core/rtasr/RTASRCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->initSDK()I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;


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

    iput-object p1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$O00;->OXO1:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBeginOfSpeech()V
    .locals 0

    return-void
.end method

.method public onEndOfSpeech()V
    .locals 0

    return-void
.end method

.method public onError(Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrError;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "error",
            "usrTag"
        }
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$O00;->OXO1:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    const/4 p2, 0x0

    iput-boolean p2, p1, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->isrun:Z

    return-void
.end method

.method public onResult(Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "result",
            "usrTag"
        }
    .end annotation

    iget-object p2, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$O00;->OXO1:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    new-instance v0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$O00$OXO1;

    invoke-direct {v0, p0, p1}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$O00$OXO1;-><init>(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$O00;Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;)V

    invoke-virtual {p2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getStatus()I

    move-result p1

    const/4 p2, 0x3

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$O00;->OXO1:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    const/4 p2, 0x0

    iput-boolean p2, p1, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->isrun:Z

    :cond_0
    return-void
.end method
