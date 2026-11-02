.class public final Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity$OXO1;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity$OXO1;->XIi00iiXO(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V

    return-void
.end method

.method public static final XIi00iiXO(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getRecordingTime()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->setRecordingTime(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getMRecordsAudioSeekBar()Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getRecordingTime()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getRecordingTime()I

    move-result v0

    const/16 v1, 0xd

    if-lt v0, v1, :cond_1

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->access$getTimer$p(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Ljava/util/Timer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->setPlayAudio(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getMRecordsPlayAudioBtn()Landroid/widget/ImageView;

    move-result-object p0

    const v0, 0x7f081347

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    sget-object p0, Lcom/android/mltcode/paycertificationapi/fq1;->OXO1:Lcom/android/mltcode/paycertificationapi/fq1;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/fq1;->OIi0()V

    :cond_1
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/hb;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/hb;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
