.class public final Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->initListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$OXO1;->XIi00iiXO(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final XIi00iiXO(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;I)Lkotlin/Unit;
    .locals 2

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->access$getTvCurrentTime$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/sma/smartv3/util/ShareUtil;->OXO1:Lcom/sma/smartv3/util/ShareUtil;

    invoke-virtual {v1, p1}, Lcom/sma/smartv3/util/ShareUtil;->OIi0(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->access$getSeekbar$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Landroid/widget/SeekBar;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    :cond_1
    invoke-static {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->access$getPcmAudioPlayer$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Lcom/android/mltcode/paycertificationapi/tk1;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/tk1;->XO0O10()I

    move-result v0

    if-ne v0, p1, :cond_4

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->access$setPlaying$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;Z)V

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->access$getImgRecordPlay$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_2

    const v1, 0x7f08104e

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_2
    invoke-static {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->access$getTvCurrentTime$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_3

    sget-object v1, Lcom/sma/smartv3/util/ShareUtil;->OXO1:Lcom/sma/smartv3/util/ShareUtil;

    invoke-virtual {v1, p1}, Lcom/sma/smartv3/util/ShareUtil;->OIi0(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    invoke-static {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->access$getSeekbar$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Landroid/widget/SeekBar;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-virtual {p0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    :cond_4
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 0

    if-eqz p3, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->access$getTvCurrentTime$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object p3, Lcom/sma/smartv3/util/ShareUtil;->OXO1:Lcom/sma/smartv3/util/ShareUtil;

    invoke-virtual {p3, p2}, Lcom/sma/smartv3/util/ShareUtil;->OIi0(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->access$playerPause(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)V

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->access$setPlaying$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->access$getImgRecordPlay$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Landroid/widget/ImageView;

    move-result-object p1

    if-eqz p1, :cond_0

    const v0, 0x7f081050

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->access$getPcmAudioPlayer$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Lcom/android/mltcode/paycertificationapi/tk1;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OIi11;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/OIi11;-><init>(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)V

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/tk1;->OIi0(Lkotlin/jvm/functions/Function1;)V

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->access$getSeekbar$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Landroid/widget/SeekBar;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->access$getPcmAudioPlayer$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Lcom/android/mltcode/paycertificationapi/tk1;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->access$getSeekbar$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Landroid/widget/SeekBar;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/tk1;->I0IIOi(I)V

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->access$getPcmAudioPlayer$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Lcom/android/mltcode/paycertificationapi/tk1;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/tk1;->IO()V

    :cond_3
    return-void
.end method
