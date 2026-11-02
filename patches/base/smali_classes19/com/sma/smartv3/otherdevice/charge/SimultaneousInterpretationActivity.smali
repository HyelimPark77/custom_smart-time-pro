.class public final Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;
.super Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSimultaneousInterpretationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimultaneousInterpretationActivity.kt\ncom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,278:1\n69#2,3:279\n72#2,5:283\n1#3:282\n*S KotlinDebug\n*F\n+ 1 SimultaneousInterpretationActivity.kt\ncom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity\n*L\n126#1:279,3\n126#1:283,5\n126#1:282\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSimultaneousInterpretationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimultaneousInterpretationActivity.kt\ncom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,278:1\n69#2,3:279\n72#2,5:283\n1#3:282\n*S KotlinDebug\n*F\n+ 1 SimultaneousInterpretationActivity.kt\ncom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity\n*L\n126#1:279,3\n126#1:283,5\n126#1:282\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isFirstIdentifySuccess:Z

.field private isFirstTranslateSuccess:Z

.field private isFirstTranslation:Z

.field private mAnimationDrawable:Landroid/graphics/drawable/AnimationDrawable;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mAudioPlayImg$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mAudioPlayTime$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBtnTv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mLoadPopup:Lcom/android/mltcode/paycertificationapi/uq;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mPlayAudioBtn$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTopLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTopTv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mTranslationSavePopup:Lcom/android/mltcode/paycertificationapi/w16;
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
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;-><init>()V

    const-string v0, "SimultaneousInterpretationActivity"

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ri4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ri4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mTopLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/si4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/si4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mTopTv$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ti4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ti4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mBtnTv$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ui4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ui4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mAudioPlayImg$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/vi4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/vi4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mAudioPlayTime$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/wi4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/wi4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mPlayAudioBtn$delegate:Lkotlin/Lazy;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->isFirstTranslation:Z

    iput-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->isFirstIdentifySuccess:Z

    iput-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->isFirstTranslateSuccess:Z

    sget-object v1, Lcom/sma/smartv3/model/AIFunctionType;->SIMULTANEOUS_INTERPRETATION:Lcom/sma/smartv3/model/AIFunctionType;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AIFunctionType;->getType()I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setMAIFunctionType(I)V

    const/4 v1, 0x2

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setMAIRecordsType(I)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setSteam(Z)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setAppSend(Z)V

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mAudioPlayTime_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mAudioPlayImg_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IXXOO(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mBtnTv_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O1O(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->showSaveDialog$lambda$0$0(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mTopLayout_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXIIO1i11(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->endRecording$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)V

    return-void
.end method

.method public static final synthetic access$getMAudioPlayTime(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->getMAudioPlayTime()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private final clickDownRecording()V
    .locals 1

    const-string v0, "MICROPHONE"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->isGranted([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setLangAndVoice()V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->startRecording()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->permission()V

    return-void
.end method

.method private final endRecording(Z)V
    .locals 3

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->getMPlayAudioBtn()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f08173b

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->getMAudioPlayTime()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OX110i(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mAnimationDrawable:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->timer:Ljava/util/Timer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    :cond_1
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->stopRecording(Z)V

    if-nez p1, :cond_2

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->showLoadPopup()V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMHandler()Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/oi4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/oi4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)V

    const-wide/16 v1, 0xbb8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    return-void
.end method

.method public static synthetic endRecording$default(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->endRecording(Z)V

    return-void
.end method

.method private static final endRecording$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mLoadPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->showSaveDialog()V

    return-void
.end method

.method private final getMAudioPlayImg()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mAudioPlayImg$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getMAudioPlayTime()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mAudioPlayTime$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMBtnTv()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mBtnTv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMPlayAudioBtn()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mPlayAudioBtn$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getMTopLayout()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mTopLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMTopTv()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mTopTv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic i010I(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->initView$lambda$1(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic iI(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mPlayAudioBtn_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOO1ii1(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->initView$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->showSaveDialog$lambda$0$0$0(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)V

    return-void
.end method

.method public static synthetic iX(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mTopTv_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;Landroid/view/View;)V
    .locals 0

    sget-object p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->isRecording()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->endRecording(Z)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->clickDownRecording()V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;Landroid/view/View;)V
    .locals 0

    iget-boolean p1, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->isFirstTranslation:Z

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->clickDownRecording()V

    :cond_0
    return-void
.end method

.method private static final mAudioPlayImg_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0a3f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mAudioPlayTime_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0a40

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mBtnTv_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0a41

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mPlayAudioBtn_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0a42

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mTopLayout_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0a43

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mTopTv_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0a44

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private final setViewLayoutParams(Landroid/widget/TextView;I)V
    .locals 6

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v5, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    instance-of v1, v1, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    iput p2, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    :cond_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1
    return-void
.end method

.method private final showLoadPopup()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mLoadPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mLoadPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez v0, :cond_1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mLoadPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mLoadPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    return-void
.end method

.method private final showSaveDialog()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->getMTopTv()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->getMBtnTv()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->sendTranslationResult(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mTranslationSavePopup:Lcom/android/mltcode/paycertificationapi/w16;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mTranslationSavePopup:Lcom/android/mltcode/paycertificationapi/w16;

    if-nez v0, :cond_1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/w16;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/w16;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/w16;->iI(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/w16;->XXX11i(Ljava/lang/String;)V

    iget v1, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->recordingTime:I

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OX110i(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/w16;->X11iII1O1(Ljava/lang/String;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/xi4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/xi4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/w16;->iX1O1(Lkotlin/jvm/functions/Function2;)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mTranslationSavePopup:Lcom/android/mltcode/paycertificationapi/w16;

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mTranslationSavePopup:Lcom/android/mltcode/paycertificationapi/w16;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    return-void
.end method

.method private static final showSaveDialog$lambda$0$0(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "title"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "location"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget v3, v0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->recordingTime:I

    const v4, 0x7f140baf

    const/4 v5, 0x0

    const-string v6, " "

    const v7, 0x7f1411c4

    if-lez v3, :cond_a

    invoke-direct {v0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->showLoadPopup()V

    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v3

    if-nez v3, :cond_0

    new-instance v8, Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIFunctionType()I

    move-result v13

    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecordsType()I

    move-result v14

    const v27, 0x1ffc7

    const/16 v28, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-string v15, ""

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v8 .. v28}, Lcom/sma/smartv3/db/entity/AIRecords;-><init>(IJLjava/lang/String;IILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v8}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setMAIRecords(Lcom/sma/smartv3/db/entity/AIRecords;)V

    :cond_0
    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3, v1}, Lcom/sma/smartv3/db/entity/AIRecords;->setMAITitle(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/db/entity/AIRecords;->setMTranslateLanguage(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/db/entity/AIRecords;->setMTranslateToLanguage(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/db/entity/AIRecords;->setMLocation(Ljava/lang/String;)V

    :cond_4
    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v1

    if-eqz v1, :cond_5

    iget v2, v0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->recordingTime:I

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/db/entity/AIRecords;->setMAudioDuration(I)V

    :cond_5
    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-direct {v0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->getMTopTv()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/db/entity/AIRecords;->setMContent(Ljava/lang/String;)V

    :cond_6
    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-direct {v0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->getMBtnTv()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/db/entity/AIRecords;->setMExtraInfo(Ljava/lang/String;)V

    :cond_7
    new-instance v1, Ljava/io/File;

    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/files/"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "_record.pcm"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->getMPcmFile()Ljava/io/File;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/blankj/utilcode/util/FileUtils;->copy(Ljava/io/File;Ljava/io/File;)Z

    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const-string v3, "getAbsolutePath(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Lcom/sma/smartv3/db/entity/AIRecords;->setMAudioPath(Ljava/lang/String;)V

    :cond_8
    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->saveDBRecord()V

    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->addSendRecord(Lcom/sma/smartv3/db/entity/AIRecords;)J

    move-result-wide v1

    const-wide/16 v8, 0x0

    cmp-long v1, v1, v8

    if-lez v1, :cond_9

    invoke-virtual {v0, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f1412e1

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_9
    invoke-virtual {v0, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMHandler()Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/qi4;

    invoke-direct {v2, v0}, Lcom/android/mltcode/paycertificationapi/qi4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)V

    const-wide/16 v3, 0x5dc

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1

    :cond_a
    invoke-virtual {v0, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f141173

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " , "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v5, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v0
.end method

.method private static final showSaveDialog$lambda$0$0$0(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->TAG:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " mAIRecords = "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mLoadPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    iget-object p0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mTranslationSavePopup:Lcom/android/mltcode/paycertificationapi/w16;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_1
    return-void
.end method

.method private final startAudioRecording()V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DiscouragedApi"
        }
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->getMTopTv()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140d0f

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->getMPlayAudioBtn()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f08173a

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mAnimationDrawable:Landroid/graphics/drawable/AnimationDrawable;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080713

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mAnimationDrawable:Landroid/graphics/drawable/AnimationDrawable;

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->getMAudioPlayImg()Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mAnimationDrawable:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mAnimationDrawable:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->recordingTime:I

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->timer:Ljava/util/Timer;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    :cond_2
    new-instance v1, Ljava/util/Timer;

    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    iput-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->timer:Ljava/util/Timer;

    new-instance v2, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity$OXO1;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity$OXO1;-><init>(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)V

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x3e8

    invoke-virtual/range {v1 .. v6}, Ljava/util/Timer;->scheduleAtFixedRate(Ljava/util/TimerTask;JJ)V

    return-void
.end method


# virtual methods
.method public disRecordingPopup()V
    .locals 3

    invoke-super {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->disRecordingPopup()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->endRecording$default(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;ZILjava/lang/Object;)V

    return-void
.end method

.method public final getMAnimationDrawable()Landroid/graphics/drawable/AnimationDrawable;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mAnimationDrawable:Landroid/graphics/drawable/AnimationDrawable;

    return-object v0
.end method

.method public final getRecordingTime()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->recordingTime:I

    return v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->init(Landroid/os/Bundle;)V

    return-void
.end method

.method public initView()V
    .locals 2

    invoke-super {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->initView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f141253

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f08135c

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f06074b

    invoke-static {p0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->getMPlayAudioBtn()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ni4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ni4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->getMTopLayout()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/pi4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/pi4;-><init>(Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0102

    return v0
.end method

.method public notifyViewData()V
    .locals 4

    invoke-super {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->notifyViewData()V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x3

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->isFirstIdentifySuccess:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->getMTopTv()Landroid/widget/TextView;

    move-result-object v0

    const-string v3, "<get-mTopTv>(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, v2}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->setViewLayoutParams(Landroid/widget/TextView;I)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->getMTopTv()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setGravity(I)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->getMTopTv()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v1

    :goto_0
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/AIRecords;->getMExtraInfo()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_5

    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->isFirstTranslateSuccess:Z

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->getMBtnTv()Landroid/widget/TextView;

    move-result-object v0

    const-string v3, "<get-mBtnTv>(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, v2}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->setViewLayoutParams(Landroid/widget/TextView;I)V

    :cond_3
    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->getMBtnTv()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMExtraInfo()Ljava/lang/String;

    move-result-object v1

    :cond_4
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    return-void
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->isFirstTranslation:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->getMTopTv()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_0
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

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final setMAnimationDrawable(Landroid/graphics/drawable/AnimationDrawable;)V
    .locals 0
    .param p1    # Landroid/graphics/drawable/AnimationDrawable;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->mAnimationDrawable:Landroid/graphics/drawable/AnimationDrawable;

    return-void
.end method

.method public final setRecordingTime(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->recordingTime:I

    return-void
.end method

.method public startRecording()V
    .locals 2

    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->isFirstTranslation:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->isFirstTranslation:Z

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->getMTopTv()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/SimultaneousInterpretationActivity;->startAudioRecording()V

    invoke-super {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->startRecording()V

    return-void
.end method
