.class public final Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBinauralTranslationRecordActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinauralTranslationRecordActivity.kt\ncom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,281:1\n1563#2:282\n1634#2,3:283\n*S KotlinDebug\n*F\n+ 1 BinauralTranslationRecordActivity.kt\ncom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity\n*L\n199#1:282\n199#1:283,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBinauralTranslationRecordActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinauralTranslationRecordActivity.kt\ncom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,281:1\n1563#2:282\n1634#2,3:283\n*S KotlinDebug\n*F\n+ 1 BinauralTranslationRecordActivity.kt\ncom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity\n*L\n199#1:282\n199#1:283,3\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private aiSpeechList:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/AISpeech;",
            ">;"
        }
    .end annotation
.end field

.field private audioTotalTime:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final img_record_play$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isPlaying:Z

.field private mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter<",
            "Lcom/sma/smartv3/model/AISpeech;",
            ">;"
        }
    .end annotation
.end field

.field private mHandler:Landroid/os/Handler;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mTranslationDetailPopup:Lcom/android/mltcode/paycertificationapi/r16;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final pcmAudioPlayer$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final seekbar$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tv_currentTime$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tv_totalTime$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    const-string v0, "BinauralTranslationRecordActivity"

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I1iX011;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I1iX011;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XIO1100;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XIO1100;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I01OII;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I01OII;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->rv$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i110OIi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i110OIi;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->img_record_play$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0i1Xi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I0i1Xi;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->tv_currentTime$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i11OO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i11OO;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->seekbar$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IiO11IOO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IiO11IOO;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->tv_totalTime$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->aiSpeechList:Ljava/util/ArrayList;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->mHandler:Landroid/os/Handler;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXIi;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/XXIi;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->pcmAudioPlayer$delegate:Lkotlin/Lazy;

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->audioTotalTime:Ljava/lang/String;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->initView$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Landroid/widget/SeekBar;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->seekbar_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Landroid/widget/SeekBar;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;Ljava/io/File;I)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->showDeleteTipPopup$lambda$1$0(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;Ljava/io/File;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->tv_totalTime_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII()Lcom/android/mltcode/paycertificationapi/tk1;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->pcmAudioPlayer_delegate$lambda$0()Lcom/android/mltcode/paycertificationapi/tk1;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic OIX0iXi(Ljava/io/File;Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->showDeleteTipPopup$lambda$1$0$1$1(Ljava/io/File;Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->showDeleteTipPopup$lambda$1$0$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->img_record_play_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->rv_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->tv_currentTime_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->initView$lambda$0$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$getPcmAudioPlayer(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Lcom/android/mltcode/paycertificationapi/tk1;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getPcmAudioPlayer()Lcom/android/mltcode/paycertificationapi/tk1;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setPlaying$p(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->isPlaying:Z

    return-void
.end method

.method public static final synthetic access$updatePlayTime(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;I)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->updatePlayTime(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updateTimerText(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;J)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->updateTimerText(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final getPcmAudioPlayer()Lcom/android/mltcode/paycertificationapi/tk1;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->pcmAudioPlayer$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/tk1;

    return-object v0
.end method

.method public static synthetic iIiiO()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->showDeleteTipPopup$lambda$1$0$1$0()Z

    move-result v0

    return v0
.end method

.method private static final img_record_play_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0469

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;Landroid/view/View;)V
    .locals 1

    iget-boolean p1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->isPlaying:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->isPlaying:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getImg_record_play()Landroid/widget/ImageView;

    move-result-object p1

    const v0, 0x7f081050

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getPcmAudioPlayer()Lcom/android/mltcode/paycertificationapi/tk1;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getSeekbar()Landroid/widget/SeekBar;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/tk1;->I0IIOi(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getPcmAudioPlayer()Lcom/android/mltcode/paycertificationapi/tk1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/tk1;->IO()V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getPcmAudioPlayer()Lcom/android/mltcode/paycertificationapi/tk1;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXIO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IXIO;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/tk1;->OIi0(Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_0
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->isPlaying:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getImg_record_play()Landroid/widget/ImageView;

    move-result-object p1

    const v0, 0x7f08104e

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getPcmAudioPlayer()Lcom/android/mltcode/paycertificationapi/tk1;

    move-result-object p0

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/tk1;->O00()V

    return-void
.end method

.method private static final initView$lambda$0$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;I)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getTv_currentTime()Landroid/widget/TextView;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->updatePlayTime(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getSeekbar()Landroid/widget/SeekBar;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getPcmAudioPlayer()Lcom/android/mltcode/paycertificationapi/tk1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/tk1;->XO0O10()I

    move-result v0

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->isPlaying:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getImg_record_play()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f08104e

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getTv_currentTime()Landroid/widget/TextView;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->updatePlayTime(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getSeekbar()Landroid/widget/SeekBar;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final pcmAudioPlayer_delegate$lambda$0()Lcom/android/mltcode/paycertificationapi/tk1;
    .locals 7

    new-instance v0, Lcom/android/mltcode/paycertificationapi/tk1;

    sget-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->getMPcmFile()Ljava/io/File;

    move-result-object v1

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/android/mltcode/paycertificationapi/tk1;-><init>(Ljava/io/File;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final rv_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    const v0, 0x7f0a09c1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private static final seekbar_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Landroid/widget/SeekBar;
    .locals 1

    const v0, 0x7f0a0a07

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/SeekBar;

    return-object p0
.end method

.method private static final showDeleteTipPopup$lambda$1$0(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;Ljava/io/File;I)Z
    .locals 9

    const/4 v0, 0x1

    if-eq p3, v0, :cond_2

    const/4 v1, 0x2

    if-eq p3, v1, :cond_1

    const/4 p0, 0x3

    if-eq p3, p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p3

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, p3, v2, v1, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const p3, 0x7f1414d7

    invoke-virtual {p0, p3}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const p3, 0x7f14027f

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I0O1i0i;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/I0O1i0i;-><init>()V

    invoke-virtual {p0, p3, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance p3, Lcom/android/mltcode/paycertificationapi/IiII1O;

    invoke-direct {p3, p2, p1}, Lcom/android/mltcode/paycertificationapi/IiII1O;-><init>(Ljava/io/File;Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)V

    const p1, 0x7f1403db

    invoke-virtual {p0, p1, p3}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    goto :goto_0

    :cond_1
    new-instance v6, Lcom/android/mltcode/paycertificationapi/O0iO1X00;

    invoke-direct {v6, p1, p0}, Lcom/android/mltcode/paycertificationapi/O0iO1X00;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Lkotlin/concurrent/ThreadsKt;->iO(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;

    goto :goto_0

    :cond_2
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Ljava/lang/CharSequence;

    invoke-static {p0}, Lcom/blankj/utilcode/util/ClipboardUtils;->copyText(Ljava/lang/CharSequence;)V

    const p0, 0x7f140363

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :goto_0
    return v0
.end method

.method private static final showDeleteTipPopup$lambda$1$0$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/Unit;
    .locals 0

    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->exportTextToFile(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showDeleteTipPopup$lambda$1$0$1$0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static final showDeleteTipPopup$lambda$1$0$1$1(Ljava/io/File;Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Z
    .locals 2

    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    const/4 p0, 0x0

    const/4 v0, 0x2

    const-string v1, "REFRESH_INTERPRETATION_RECORDS"

    invoke-static {v1, p0, v0, p0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    const p0, 0x7f1403eb

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    const/4 p0, 0x1

    return p0
.end method

.method private static final tv_currentTime_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c60

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tv_totalTime_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a18a4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private final updatePlayTime(I)Ljava/lang/String;
    .locals 2

    rem-int/lit16 v0, p1, 0xe10

    div-int/lit8 v0, v0, 0x3c

    rem-int/lit8 p1, p1, 0x3c

    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x2

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "%02d:%02d"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "format(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final updateTimerText(J)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iX1O1()Ljava/text/SimpleDateFormat;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    return-object p1
.end method


# virtual methods
.method public final exportTextToFile(Ljava/lang/String;)V
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "Share txt"

    const-string v1, "textToExport"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    sget-object v2, Lcom/bestmafen/androidbase/io/Location;->EXTERNAL:Lcom/bestmafen/androidbase/io/Location;

    sget-object v3, Lcom/android/mltcode/paycertificationapi/hn1;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/hn1$OXO1;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/hn1$OXO1;->O00()Lcom/android/mltcode/paycertificationapi/hn1;

    move-result-object v3

    const-string v4, "share"

    invoke-virtual {v3, v4}, Lcom/android/mltcode/paycertificationapi/hn1;->XIi00iiXO(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/hn1;

    move-result-object v3

    const-string v4, "record_text.txt"

    invoke-virtual {v1, v2, v3, v4}, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1(Lcom/bestmafen/androidbase/io/Location;Lcom/android/mltcode/paycertificationapi/hn1;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {v2}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsFile(Ljava/io/File;)Z

    new-instance v3, Ljava/io/FileWriter;

    invoke-direct {v3, v2}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    invoke-virtual {v3, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/Writer;->close()V

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/sz0;->XO0O10(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.SEND"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "android.intent.extra.TEXT"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "android.intent.extra.STREAM"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p1, "*/*"

    invoke-virtual {v1, p1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const/high16 p1, 0x10000000

    invoke-virtual {v1, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-static {v1, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public final getAbhTitleCenter()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getAudioTotalTime()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->audioTotalTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getImg_record_play()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->img_record_play$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getRv()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->rv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method public final getSeekbar()Landroid/widget/SeekBar;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->seekbar$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    return-object v0
.end method

.method public final getTv_currentTime()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->tv_currentTime$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTv_totalTime()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->tv_totalTime$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg3()Ljava/io/Serializable;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type java.util.ArrayList<com.sma.smartv3.model.AISpeech>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/ArrayList;

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->aiSpeechList:Ljava/util/ArrayList;

    return-void
.end method

.method public initView()V
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object v0

    const v2, 0x7f14116e

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getTv_currentTime()Landroid/widget/TextView;

    move-result-object v0

    invoke-direct {p0, v1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->updatePlayTime(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getPcmAudioPlayer()Lcom/android/mltcode/paycertificationapi/tk1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/tk1;->XO0O10()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->updatePlayTime(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->audioTotalTime:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getTv_totalTime()Landroid/widget/TextView;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->audioTotalTime:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getSeekbar()Landroid/widget/SeekBar;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getPcmAudioPlayer()Lcom/android/mltcode/paycertificationapi/tk1;

    move-result-object v2

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/tk1;->XO0O10()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setMax(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v2, 0x7f080630

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v2, 0x7f06074b

    invoke-static {p0, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->aiSpeechList:Ljava/util/ArrayList;

    new-instance v2, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$initView$1;

    invoke-direct {v2, p0, v0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$initView$1;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;Ljava/util/ArrayList;)V

    iput-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getRv()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getRv()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    if-nez v1, :cond_0

    const-string v1, "mAdapter"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getImg_record_play()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OI1XOX;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/OI1XOX;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getSeekbar()Landroid/widget/SeekBar;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$OXO1;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0037

    return v0
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->getPcmAudioPlayer()Lcom/android/mltcode/paycertificationapi/tk1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/tk1;->OIX0iXi()V

    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

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

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->showDeleteTipPopup()V

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

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->audioTotalTime:Ljava/lang/String;

    return-void
.end method

.method public final showDeleteTipPopup()V
    .locals 8

    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    const-string v1, ""

    iput-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XO0O10()Ljava/text/SimpleDateFormat;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->aiSpeechList:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/AISpeech;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AISpeech;->getStartTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->aiSpeechList:Ljava/util/ArrayList;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/model/AISpeech;

    iget-object v5, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AISpeech;->getText()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AISpeech;->getDst()Ljava/lang/String;

    move-result-object v4

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\n"

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->mTranslationDetailPopup:Lcom/android/mltcode/paycertificationapi/r16;

    if-nez v2, :cond_1

    sget-object v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->getMPcmFile()Ljava/io/File;

    move-result-object v2

    new-instance v3, Lcom/android/mltcode/paycertificationapi/r16;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/android/mltcode/paycertificationapi/r16;-><init>(Landroid/app/Activity;)V

    const v4, 0x7f140060

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->audioTotalTime:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ": "

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/android/mltcode/paycertificationapi/r16;->iXiX011(Ljava/lang/String;)V

    const v5, 0x7f140bda

    invoke-virtual {p0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2}, Lcom/blankj/utilcode/util/FileUtils;->getSize(Ljava/io/File;)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/android/mltcode/paycertificationapi/r16;->XXO(Ljava/lang/String;)V

    const v5, 0x7f14104d

    invoke-virtual {p0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    iget-object v6, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/android/mltcode/paycertificationapi/r16;->Ii1iii0(Ljava/lang/String;)V

    const v5, 0x7f140373

    invoke-virtual {p0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/android/mltcode/paycertificationapi/r16;->O001I(Ljava/lang/String;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X00XI00;

    invoke-direct {v1, v0, p0, v2}, Lcom/android/mltcode/paycertificationapi/X00XI00;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;Ljava/io/File;)V

    invoke-virtual {v3, v1}, Lcom/android/mltcode/paycertificationapi/r16;->iXiiiO(Lkotlin/jvm/functions/Function1;)V

    iput-object v3, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->mTranslationDetailPopup:Lcom/android/mltcode/paycertificationapi/r16;

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->mTranslationDetailPopup:Lcom/android/mltcode/paycertificationapi/r16;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    return-void
.end method
