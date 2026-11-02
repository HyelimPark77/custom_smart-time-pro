.class public final Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private audioFile:Ljava/io/File;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private audioTotalTime:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private contentStr:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private contentTv:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private imgRecordPlay:Landroid/widget/ImageView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private isPlaying:Z

.field private mTranslationDetailPopup:Lcom/android/mltcode/paycertificationapi/r16;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private pcmAudioPlayer:Lcom/android/mltcode/paycertificationapi/tk1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private seekbar:Landroid/widget/SeekBar;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private tvCurrentTime:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private tvTotalTime:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final viewModel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Oi1XOOI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Oi1XOOI;-><init>(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->viewModel$delegate:Lkotlin/Lazy;

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->audioTotalTime:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->contentStr:Ljava/lang/String;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->initListener$lambda$0(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->showDeleteTipPopup$lambda$0$0$0(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Ljava/lang/String;Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;I)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->showDeleteTipPopup$lambda$0$0(Ljava/lang/String;Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->viewModel_delegate$lambda$0(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->initListener$lambda$0$0(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getContentTv$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->contentTv:Landroid/widget/TextView;

    return-object p0
.end method

.method public static final synthetic access$getImgRecordPlay$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->imgRecordPlay:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$getPcmAudioPlayer$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Lcom/android/mltcode/paycertificationapi/tk1;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->pcmAudioPlayer:Lcom/android/mltcode/paycertificationapi/tk1;

    return-object p0
.end method

.method public static final synthetic access$getSeekbar$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Landroid/widget/SeekBar;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->seekbar:Landroid/widget/SeekBar;

    return-object p0
.end method

.method public static final synthetic access$getTvCurrentTime$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->tvCurrentTime:Landroid/widget/TextView;

    return-object p0
.end method

.method public static final synthetic access$getTvTotalTime$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->tvTotalTime:Landroid/widget/TextView;

    return-object p0
.end method

.method public static final synthetic access$playerPause(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->playerPause()V

    return-void
.end method

.method public static final synthetic access$setAudioFile$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->audioFile:Ljava/io/File;

    return-void
.end method

.method public static final synthetic access$setContentStr$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->contentStr:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$setPcmAudioPlayer$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;Lcom/android/mltcode/paycertificationapi/tk1;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->pcmAudioPlayer:Lcom/android/mltcode/paycertificationapi/tk1;

    return-void
.end method

.method public static final synthetic access$setPlaying$p(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->isPlaying:Z

    return-void
.end method

.method private final collectData()V
    .locals 7

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->getViewModel()Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;->getAiNoteFlow()Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object v2

    new-instance v4, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$collectData$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$collectData$1;-><init>(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lcom/sma/smartv3/util/ActivityUtilKt;->XIi00iiXO(Landroidx/lifecycle/LifecycleOwner;Lcom/android/mltcode/paycertificationapi/ii0iIIX0;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method private final getViewModel()Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;

    return-object v0
.end method

.method private final initListener()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->tvCurrentTime:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/sma/smartv3/util/ShareUtil;->OXO1:Lcom/sma/smartv3/util/ShareUtil;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/util/ShareUtil;->OIi0(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->imgRecordPlay:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X0iXiiX;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/X0iXiiX;-><init>(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->seekbar:Landroid/widget/SeekBar;

    if-eqz v0, :cond_2

    new-instance v1, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    :cond_2
    return-void
.end method

.method private static final initListener$lambda$0(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;Landroid/view/View;)V
    .locals 1

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->isPlaying:Z

    if-nez p1, :cond_3

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->isPlaying:Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->imgRecordPlay:Landroid/widget/ImageView;

    if-eqz p1, :cond_0

    const v0, 0x7f081050

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->seekbar:Landroid/widget/SeekBar;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->pcmAudioPlayer:Lcom/android/mltcode/paycertificationapi/tk1;

    if-eqz v0, :cond_1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/tk1;->I0IIOi(I)V

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->pcmAudioPlayer:Lcom/android/mltcode/paycertificationapi/tk1;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/tk1;->IO()V

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->pcmAudioPlayer:Lcom/android/mltcode/paycertificationapi/tk1;

    if-eqz p1, :cond_5

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iOX10O;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iOX10O;-><init>(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/tk1;->OIi0(Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_3
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->isPlaying:Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->imgRecordPlay:Landroid/widget/ImageView;

    if-eqz p1, :cond_4

    const v0, 0x7f08104e

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_4
    iget-object p0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->pcmAudioPlayer:Lcom/android/mltcode/paycertificationapi/tk1;

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/tk1;->O00()V

    :cond_5
    return-void
.end method

.method private static final initListener$lambda$0$0(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;I)Lkotlin/Unit;
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->tvCurrentTime:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/sma/smartv3/util/ShareUtil;->OXO1:Lcom/sma/smartv3/util/ShareUtil;

    invoke-virtual {v1, p1}, Lcom/sma/smartv3/util/ShareUtil;->OIi0(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->seekbar:Landroid/widget/SeekBar;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->pcmAudioPlayer:Lcom/android/mltcode/paycertificationapi/tk1;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/tk1;->XO0O10()I

    move-result v0

    if-ne v0, p1, :cond_4

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->isPlaying:Z

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->imgRecordPlay:Landroid/widget/ImageView;

    if-eqz v0, :cond_2

    const v1, 0x7f08104e

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->tvCurrentTime:Landroid/widget/TextView;

    if-eqz v0, :cond_3

    sget-object v1, Lcom/sma/smartv3/util/ShareUtil;->OXO1:Lcom/sma/smartv3/util/ShareUtil;

    invoke-virtual {v1, p1}, Lcom/sma/smartv3/util/ShareUtil;->OIi0(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    iget-object p0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->seekbar:Landroid/widget/SeekBar;

    if-eqz p0, :cond_4

    invoke-virtual {p0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    :cond_4
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final playerPause()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->isPlaying:Z

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->imgRecordPlay:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    const v1, 0x7f08104e

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->pcmAudioPlayer:Lcom/android/mltcode/paycertificationapi/tk1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/tk1;->O00()V

    :cond_1
    return-void
.end method

.method private static final showDeleteTipPopup$lambda$0$0(Ljava/lang/String;Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;I)Z
    .locals 8

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v1, 0x2

    if-eq p2, v1, :cond_1

    const/4 p0, 0x3

    if-eq p2, p0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/sma/smartv3/util/ShareUtil;->OXO1:Lcom/sma/smartv3/util/ShareUtil;

    new-instance p2, Lcom/android/mltcode/paycertificationapi/I11IO;

    invoke-direct {p2, p1}, Lcom/android/mltcode/paycertificationapi/I11IO;-><init>(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)V

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/ShareUtil;->XO0O10(Landroid/app/Activity;Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    :cond_1
    invoke-direct {p1}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->playerPause()V

    sget-object v1, Lcom/sma/smartv3/util/ShareUtil;->OXO1:Lcom/sma/smartv3/util/ShareUtil;

    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v5

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object v2, p0

    move-object v4, p1

    invoke-static/range {v1 .. v7}, Lcom/sma/smartv3/util/ShareUtil;->I0IIOi(Lcom/sma/smartv3/util/ShareUtil;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lcom/android/mltcode/paycertificationapi/i00OIXiO;ILjava/lang/Object;)V

    goto :goto_0

    :cond_2
    move-object v2, p0

    sget-object p0, Lcom/sma/smartv3/util/ShareUtil;->OXO1:Lcom/sma/smartv3/util/ShareUtil;

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/util/ShareUtil;->iO(Ljava/lang/String;)V

    :goto_0
    return v0
.end method

.method private static final showDeleteTipPopup$lambda$0$0$0(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Lkotlin/Unit;
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->getViewModel()Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;->softDeleteAiNote()Lkotlinx/coroutines/XiOIO;

    const v0, 0x7f1403eb

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final viewModel_delegate$lambda$0(Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;
    .locals 1

    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    invoke-direct {v0, p0}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;)V

    const-class p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;

    return-object p0
.end method


# virtual methods
.method public final getAudioTotalTime()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->audioTotalTime:Ljava/lang/String;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result p1

    if-ltz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->getViewModel()Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;

    move-result-object v0

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailViewModel;->getAiRecordById(J)Lkotlinx/coroutines/XiOIO;

    return-void

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "\u5f53\u524d\u53c2\u6570\u9519\u8bef"

    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public initView()V
    .locals 2

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "\u7b14\u8bb0\u8be6\u60c5"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a0099

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->contentTv:Landroid/widget/TextView;

    const v0, 0x7f0a0a07

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->seekbar:Landroid/widget/SeekBar;

    const v0, 0x7f0a18a4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->tvTotalTime:Landroid/widget/TextView;

    const v0, 0x7f0a0c60

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->tvCurrentTime:Landroid/widget/TextView;

    const v0, 0x7f0a0469

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->imgRecordPlay:Landroid/widget/ImageView;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->initListener()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->collectData()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0029

    return v0
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->pcmAudioPlayer:Lcom/android/mltcode/paycertificationapi/tk1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/tk1;->OIX0iXi()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->pcmAudioPlayer:Lcom/android/mltcode/paycertificationapi/tk1;

    return-void
.end method

.method public onPause()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->playerPause()V

    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final onTitleRightClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->showDeleteTipPopup()V

    return-void
.end method

.method public final setAudioTotalTime(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->audioTotalTime:Ljava/lang/String;

    return-void
.end method

.method public final showDeleteTipPopup()V
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->contentStr:Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->audioFile:Ljava/io/File;

    if-nez v1, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->mTranslationDetailPopup:Lcom/android/mltcode/paycertificationapi/r16;

    if-nez v1, :cond_2

    new-instance v1, Lcom/android/mltcode/paycertificationapi/r16;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/r16;-><init>(Landroid/app/Activity;)V

    const v2, 0x7f140060

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->audioTotalTime:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/r16;->iXiX011(Ljava/lang/String;)V

    const v3, 0x7f140bda

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->audioFile:Ljava/io/File;

    invoke-static {v4}, Lcom/blankj/utilcode/util/FileUtils;->getSize(Ljava/io/File;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/r16;->XXO(Ljava/lang/String;)V

    const v3, 0x7f14104d

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/r16;->Ii1iii0(Ljava/lang/String;)V

    const v3, 0x7f140373

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ""

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/r16;->O001I(Ljava/lang/String;)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/I0IOIXX0;

    invoke-direct {v2, v0, p0}, Lcom/android/mltcode/paycertificationapi/I0IOIXX0;-><init>(Ljava/lang/String;Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;)V

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/r16;->iXiiiO(Lkotlin/jvm/functions/Function1;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->mTranslationDetailPopup:Lcom/android/mltcode/paycertificationapi/r16;

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/ai_note/AiNoteDetailActivity;->mTranslationDetailPopup:Lcom/android/mltcode/paycertificationapi/r16;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_3
    :goto_0
    return-void
.end method
