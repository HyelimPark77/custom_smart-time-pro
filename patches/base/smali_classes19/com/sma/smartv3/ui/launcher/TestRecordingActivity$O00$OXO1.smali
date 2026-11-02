.class public Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$O00$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$O00;->onResult(Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic I1:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$O00;

.field public final synthetic IO:Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$O00;Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;)V
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

    iput-object p1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$O00$OXO1;->I1:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$O00;

    iput-object p2, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$O00$OXO1;->IO:Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$O00$OXO1;->I1:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$O00;

    iget-object v0, v0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$O00;->OXO1:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    iget-object v0, v0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->chatOutputText:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$O00$OXO1;->IO:Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;

    invoke-virtual {v1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
