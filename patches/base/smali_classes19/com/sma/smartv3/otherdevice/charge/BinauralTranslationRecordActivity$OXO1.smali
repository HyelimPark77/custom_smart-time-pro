.class public final Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$OXO1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$OXO1;->XIi00iiXO(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final XIi00iiXO(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;I)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getTv_currentTime()Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->access$updatePlayTime(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getSeekbar()Landroid/widget/SeekBar;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->access$getPcmAudioPlayer(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Lcom/android/mltcode/paycertificationapi/tk1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/tk1;->XO0O10()I

    move-result v0

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->access$setPlaying$p(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getImg_record_play()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f08104e

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getTv_currentTime()Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->access$updatePlayTime(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getSeekbar()Landroid/widget/SeekBar;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 0

    if-eqz p3, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$OXO1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getTv_currentTime()Landroid/widget/TextView;

    move-result-object p1

    iget-object p3, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$OXO1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;

    invoke-static {p3, p2}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->access$updatePlayTime(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 1

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$OXO1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->access$setPlaying$p(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$OXO1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getImg_record_play()Landroid/widget/ImageView;

    move-result-object p1

    const v0, 0x7f08104e

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$OXO1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->access$getPcmAudioPlayer(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Lcom/android/mltcode/paycertificationapi/tk1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/tk1;->O00()V

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$OXO1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->access$setPlaying$p(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$OXO1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getImg_record_play()Landroid/widget/ImageView;

    move-result-object p1

    const v0, 0x7f081050

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$OXO1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->access$getPcmAudioPlayer(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Lcom/android/mltcode/paycertificationapi/tk1;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$OXO1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getSeekbar()Landroid/widget/SeekBar;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/tk1;->I0IIOi(I)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$OXO1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->access$getPcmAudioPlayer(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Lcom/android/mltcode/paycertificationapi/tk1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/tk1;->IO()V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$OXO1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->access$getPcmAudioPlayer(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Lcom/android/mltcode/paycertificationapi/tk1;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$OXO1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IiiO1Xii;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/IiiO1Xii;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)V

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/tk1;->OIi0(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
