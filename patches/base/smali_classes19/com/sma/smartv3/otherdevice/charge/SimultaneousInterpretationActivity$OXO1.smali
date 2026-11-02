.class public final Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity$OXO1;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->startAudioRecording()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity$OXO1;->XIi00iiXO(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)V

    return-void
.end method

.method public static final XIi00iiXO(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)V
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->getRecordingTime()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->setRecordingTime(I)V

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->access$getMAudioPlayTime(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->getRecordingTime()I

    move-result p0

    invoke-static {p0}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OX110i(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/yi4;

    invoke-direct {v2, v1}, Lcom/android/mltcode/paycertificationapi/yi4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
