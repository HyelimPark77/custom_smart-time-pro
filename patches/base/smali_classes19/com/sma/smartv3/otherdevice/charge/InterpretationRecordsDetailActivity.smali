.class public final Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nInterpretationRecordsDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterpretationRecordsDetailActivity.kt\ncom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,292:1\n1#2:293\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nInterpretationRecordsDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterpretationRecordsDetailActivity.kt\ncom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,292:1\n1#2:293\n*E\n"
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

.field private audioManager:Landroid/media/AudioManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private isOpenVolume:Z

.field private isPlayAudio:Z

.field private mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mEditPop:Lcom/android/mltcode/paycertificationapi/iii1ii;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mRecordsAudioDuration$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRecordsAudioSeekBar$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRecordsContent$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRecordsExtraInfo$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRecordsLanguage$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRecordsLocation$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRecordsPlayAudioBtn$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRecordsPlayVolumeBtn$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRecordsTime$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRecordsTitle$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRecordsTitleEditImg$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRecordsToLanguage$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mTranslationDetailPopup:Lcom/android/mltcode/paycertificationapi/r16;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private recordingTime:I

.field private timer:Ljava/util/Timer;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->aiRecordsDao()Lcom/sma/smartv3/db/dao/AIRecordsDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/cb;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/cb;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ma;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ma;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    const-string v0, "InterpretationRecordsDetailActivity"

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/na;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/na;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsTitle$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/oa;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/oa;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsTitleEditImg$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/pa;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/pa;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsLanguage$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/qa;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/qa;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsToLanguage$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ra;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ra;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsLocation$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/sa;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/sa;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsTime$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ta;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ta;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsContent$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ua;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ua;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsExtraInfo$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/db;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/db;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsAudioSeekBar$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/eb;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/eb;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsAudioDuration$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/fb;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/fb;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsPlayAudioBtn$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/gb;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/gb;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsPlayVolumeBtn$delegate:Lkotlin/Lazy;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->isOpenVolume:Z

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsTitle_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsToLanguage_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->showDeleteTipPopup$lambda$0$0$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsLocation_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IXXOO(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsExtraInfo_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->showDeleteTipPopup$lambda$0$0$1$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->initView$lambda$3(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsContent_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->showEditPopup$lambda$0$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsTitleEditImg_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;I)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->showDeleteTipPopup$lambda$0$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->initView$lambda$2(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Landroid/widget/ProgressBar;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsAudioSeekBar_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Landroid/widget/ProgressBar;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsPlayAudioBtn_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsPlayVolumeBtn_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsAudioDuration_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$getTimer$p(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Ljava/util/Timer;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->timer:Ljava/util/Timer;

    return-object p0
.end method

.method public static synthetic i010I(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->initView$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsTime_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->showDeleteTipPopup$lambda$0$0$1$1(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic iX(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsLanguage_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->showEditPopup()V

    return-void
.end method

.method private static final initView$lambda$2(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;Landroid/view/View;)V
    .locals 7

    iget-boolean p1, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->isPlayAudio:Z

    xor-int/lit8 v0, p1, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->isPlayAudio:Z

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getMRecordsPlayAudioBtn()Landroid/widget/ImageView;

    move-result-object p1

    const v0, 0x7f081344

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    const/4 p1, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    if-eqz v0, :cond_2

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/AIRecords;->getMAudioPath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/fq1;->OXO1:Lcom/android/mltcode/paycertificationapi/fq1;

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/AIRecords;->getMAudioPath()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, p1, v2, v3}, Lcom/android/mltcode/paycertificationapi/fq1;->O00(Lcom/android/mltcode/paycertificationapi/fq1;Ljava/lang/String;IILjava/lang/Object;)V

    iput p1, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->recordingTime:I

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->timer:Ljava/util/Timer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    new-instance v1, Ljava/util/Timer;

    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    iput-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->timer:Ljava/util/Timer;

    new-instance v2, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity$OXO1;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity$OXO1;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x3e8

    invoke-virtual/range {v1 .. v6}, Ljava/util/Timer;->scheduleAtFixedRate(Ljava/util/TimerTask;JJ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :goto_1
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object p0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " play e = "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const-string p0, "\u97f3\u9891\u6587\u4ef6\u5df2\u635f\u574f"

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    return-void

    :cond_3
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getMRecordsPlayAudioBtn()Landroid/widget/ImageView;

    move-result-object p0

    const p1, 0x7f081347

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    sget-object p0, Lcom/android/mltcode/paycertificationapi/fq1;->OXO1:Lcom/android/mltcode/paycertificationapi/fq1;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/fq1;->OIi0()V

    return-void
.end method

.method private static final initView$lambda$3(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;Landroid/view/View;)V
    .locals 2

    iget-boolean p1, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->isOpenVolume:Z

    xor-int/lit8 v0, p1, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->isOpenVolume:Z

    if-nez p1, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/fq1;->OXO1:Lcom/android/mltcode/paycertificationapi/fq1;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/fq1;->XOO0ii0()V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getMRecordsPlayVolumeBtn()Landroid/widget/ImageView;

    move-result-object p0

    const p1, 0x7f08173c

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void

    :cond_0
    const-string p1, "audio"

    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.media.AudioManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/media/AudioManager;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v1

    invoke-virtual {p1, v0}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result p1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/fq1;->OXO1:Lcom/android/mltcode/paycertificationapi/fq1;

    int-to-float v1, v1

    int-to-float p1, p1

    div-float/2addr v1, p1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/fq1;->OXO1(F)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/fq1;->IO()V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getMRecordsPlayVolumeBtn()Landroid/widget/ImageView;

    move-result-object p0

    const p1, 0x7f081739

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method private static final mRecordsAudioDuration_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0547

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mRecordsAudioSeekBar_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Landroid/widget/ProgressBar;
    .locals 1

    const v0, 0x7f0a0548

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ProgressBar;

    return-object p0
.end method

.method private static final mRecordsContent_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0549

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mRecordsExtraInfo_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a054b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mRecordsLanguage_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a054c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mRecordsLocation_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a054e

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mRecordsPlayAudioBtn_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0a45

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mRecordsPlayVolumeBtn_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0a46

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mRecordsTime_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a054f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mRecordsTitleEditImg_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0bde

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mRecordsTitle_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0550

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mRecordsToLanguage_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0551

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final showDeleteTipPopup$lambda$0$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;I)Z
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    const/4 v2, 0x2

    if-eq p1, v2, :cond_1

    const/4 v3, 0x3

    if-eq p1, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {p1, v3, v4, v2, v0}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v0, 0x7f1414d7

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v0, 0x7f14027f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v2, Lcom/android/mltcode/paycertificationapi/xa;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/xa;-><init>()V

    invoke-virtual {p1, v0, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ya;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ya;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V

    const p0, 0x7f1403db

    invoke-virtual {p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_4

    new-instance v7, Lcom/android/mltcode/paycertificationapi/va;

    invoke-direct {v7, p0}, Lcom/android/mltcode/paycertificationapi/va;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v9}, Lkotlin/concurrent/ThreadsKt;->iO(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;

    goto :goto_0

    :cond_2
    iget-object p0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object v0

    :cond_3
    invoke-static {v0}, Lcom/blankj/utilcode/util/ClipboardUtils;->copyText(Ljava/lang/CharSequence;)V

    const p0, 0x7f140363

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :cond_4
    :goto_0
    return v1
.end method

.method private static final showDeleteTipPopup$lambda$0$0$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Lkotlin/Unit;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->exportTextToFile(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showDeleteTipPopup$lambda$0$0$1$0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static final showDeleteTipPopup$lambda$0$0$1$1(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)Z
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/AIRecords;->setMIsSync(I)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/AIRecords;->setMIsDelete(I)V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Lcom/sma/smartv3/db/dao/AIRecordsDao;->update(Lcom/sma/smartv3/db/entity/AIRecords;)I

    const-string v0, "REFRESH_INTERPRETATION_RECORDS"

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v3}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return v1
.end method

.method private final showEditPopup()V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mEditPop:Lcom/android/mltcode/paycertificationapi/iii1ii;

    if-nez v0, :cond_2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iii1ii;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/iii1ii;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/iii1ii;->X01IiOiIi()Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f06024d

    invoke-static {v2, v3}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const v1, 0x7f14134a

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/iii1ii;->XXX11i(I)V

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/AIRecords;->getMAITitle()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    const-string v1, ""

    :cond_1
    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/iii1ii;->iI(Ljava/lang/String;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/bb;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/bb;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/iii1ii;->X11iII1O1(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mEditPop:Lcom/android/mltcode/paycertificationapi/iii1ii;

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mEditPop:Lcom/android/mltcode/paycertificationapi/iii1ii;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_3
    return-void
.end method

.method private static final showEditPopup$lambda$0$0(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getMRecordsTitle()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/db/entity/AIRecords;->setMAITitle(Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    if-eqz p1, :cond_1

    iget-object p0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lcom/sma/smartv3/db/dao/AIRecordsDao;->update(Lcom/sma/smartv3/db/entity/AIRecords;)I

    move-result p0

    if-lez p0, :cond_1

    const-string p0, "REFRESH_INTERPRETATION_RECORDS"

    const/4 p1, 0x2

    const/4 v0, 0x0

    invoke-static {p0, v0, p1, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    :cond_1
    const/4 p0, 0x1

    return p0
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

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getMRecordsAudioDuration()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsAudioDuration$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getMRecordsAudioSeekBar()Landroid/widget/ProgressBar;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsAudioSeekBar$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    return-object v0
.end method

.method public final getMRecordsContent()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsContent$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getMRecordsExtraInfo()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsExtraInfo$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getMRecordsLanguage()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsLanguage$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getMRecordsLocation()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsLocation$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getMRecordsPlayAudioBtn()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsPlayAudioBtn$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getMRecordsPlayVolumeBtn()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsPlayVolumeBtn$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getMRecordsTime()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsTime$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getMRecordsTitle()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsTitle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getMRecordsTitleEditImg()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsTitleEditImg$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getMRecordsToLanguage()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mRecordsToLanguage$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getRecordingTime()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->recordingTime:I

    return v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg3()Ljava/io/Serializable;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AIRecords"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/db/entity/AIRecords;

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    return-void
.end method

.method public initView()V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DiscouragedApi"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140d2a

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v2, 0x7f080630

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v2, 0x7f06074b

    invoke-static {p0, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getMRecordsTitle()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMAITitle()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getMRecordsTitleEditImg()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v2, Lcom/android/mltcode/paycertificationapi/la;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/la;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getMRecordsLanguage()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMTranslateLanguage()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v3

    :goto_1
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getMRecordsToLanguage()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMTranslateToLanguage()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_2
    move-object v2, v3

    :goto_2
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getMRecordsLocation()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMLocation()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_4

    const-string v2, "-"

    goto :goto_3

    :cond_3
    move-object v2, v3

    :cond_4
    :goto_3
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getMRecordsTime()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMLocalTime()Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :cond_5
    move-object v2, v3

    :goto_4
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getMRecordsContent()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object v2

    goto :goto_5

    :cond_6
    move-object v2, v3

    :goto_5
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getMRecordsExtraInfo()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMExtraInfo()Ljava/lang/String;

    move-result-object v2

    goto :goto_6

    :cond_7
    move-object v2, v3

    :goto_6
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getMRecordsAudioSeekBar()Landroid/widget/ProgressBar;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMAudioDuration()I

    move-result v1

    :cond_8
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getMRecordsAudioDuration()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/AIRecords;->getMAudioDuration()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OX110i(I)Ljava/lang/String;

    move-result-object v3

    :cond_9
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getMRecordsPlayAudioBtn()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/wa;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/wa;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->getMRecordsPlayVolumeBtn()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/za;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/za;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final isOpenVolume()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->isOpenVolume:Z

    return v0
.end method

.method public final isPlayAudio()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->isPlayAudio:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00b9

    return v0
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

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->showDeleteTipPopup()V

    return-void
.end method

.method public final setOpenVolume(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->isOpenVolume:Z

    return-void
.end method

.method public final setPlayAudio(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->isPlayAudio:Z

    return-void
.end method

.method public final setRecordingTime(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->recordingTime:I

    return-void
.end method

.method public final showDeleteTipPopup()V
    .locals 7

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mTranslationDetailPopup:Lcom/android/mltcode/paycertificationapi/r16;

    if-nez v0, :cond_4

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/AIRecords;->getMAudioPath()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/r16;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v3

    invoke-direct {v1, v3}, Lcom/android/mltcode/paycertificationapi/r16;-><init>(Landroid/app/Activity;)V

    const v3, 0x7f140060

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/AIRecords;->getMAudioDuration()I

    move-result v4

    goto :goto_1

    :cond_1
    move v4, v5

    :goto_1
    invoke-static {v4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OX110i(I)Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/android/mltcode/paycertificationapi/r16;->iXiX011(Ljava/lang/String;)V

    const v4, 0x7f140bda

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->getSize(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/r16;->XXO(Ljava/lang/String;)V

    const v0, 0x7f14104d

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/r16;->Ii1iii0(Ljava/lang/String;)V

    const v0, 0x7f140373

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mAIRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/AIRecords;->getMLocalTime()Ljava/lang/String;

    move-result-object v2

    :cond_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/r16;->O001I(Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ab;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ab;-><init>(Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;)V

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/r16;->iXiiiO(Lkotlin/jvm/functions/Function1;)V

    iput-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mTranslationDetailPopup:Lcom/android/mltcode/paycertificationapi/r16;

    :cond_4
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity;->mTranslationDetailPopup:Lcom/android/mltcode/paycertificationapi/r16;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_5
    return-void
.end method
