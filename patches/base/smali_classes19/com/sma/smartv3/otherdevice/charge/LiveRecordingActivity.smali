.class public final Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;
.super Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLiveRecordingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRecordingActivity.kt\ncom/sma/smartv3/otherdevice/charge/LiveRecordingActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,442:1\n87#2,7:443\n94#2,3:451\n70#2,7:454\n97#2:461\n173#2,7:462\n180#2,3:470\n143#2,7:473\n183#2:480\n173#2,7:481\n180#2,3:489\n143#2,7:492\n183#2:499\n87#2,7:500\n94#2,3:508\n70#2,7:511\n97#2:518\n1#3:450\n1#3:469\n1#3:488\n1#3:507\n*S KotlinDebug\n*F\n+ 1 LiveRecordingActivity.kt\ncom/sma/smartv3/otherdevice/charge/LiveRecordingActivity\n*L\n303#1:443,7\n303#1:451,3\n303#1:454,7\n303#1:461\n334#1:462,7\n334#1:470,3\n334#1:473,7\n334#1:480\n339#1:481,7\n339#1:489,3\n339#1:492,7\n339#1:499\n194#1:500,7\n194#1:508,3\n194#1:511,7\n194#1:518\n303#1:450\n334#1:469\n339#1:488\n194#1:507\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLiveRecordingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRecordingActivity.kt\ncom/sma/smartv3/otherdevice/charge/LiveRecordingActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,442:1\n87#2,7:443\n94#2,3:451\n70#2,7:454\n97#2:461\n173#2,7:462\n180#2,3:470\n143#2,7:473\n183#2:480\n173#2,7:481\n180#2,3:489\n143#2,7:492\n183#2:499\n87#2,7:500\n94#2,3:508\n70#2,7:511\n97#2:518\n1#3:450\n1#3:469\n1#3:488\n1#3:507\n*S KotlinDebug\n*F\n+ 1 LiveRecordingActivity.kt\ncom/sma/smartv3/otherdevice/charge/LiveRecordingActivity\n*L\n303#1:443,7\n303#1:451,3\n303#1:454,7\n303#1:461\n334#1:462,7\n334#1:470,3\n334#1:473,7\n334#1:480\n339#1:481,7\n339#1:489,3\n339#1:492,7\n339#1:499\n194#1:500,7\n194#1:508,3\n194#1:511,7\n194#1:518\n303#1:450\n334#1:469\n339#1:488\n194#1:507\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
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

.field private final binauralMicrosoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final img_play$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final img_recording_status$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter<",
            "Lcom/sma/smartv3/model/AISpeech;",
            ">;"
        }
    .end annotation
.end field

.field private mVoiceType:I

.field private popTip:Lcom/android/mltcode/paycertificationapi/z16;

.field private final record_line$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tv_time$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;-><init>()V

    const-string v0, "LiveRecordingActivity"

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/jq;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/jq;-><init>(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/kq;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/kq;-><init>(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->tv_time$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/lq;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/lq;-><init>(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->img_recording_status$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/mq;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/mq;-><init>(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->img_play$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/nq;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/nq;-><init>(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->record_line$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/oq;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/oq;-><init>(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->rv$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->aiSpeechList:Ljava/util/ArrayList;

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setMAIRecordsType(I)V

    new-instance v0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity$OXO1;-><init>(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->binauralMicrosoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;

    const/4 v0, -0x1

    iput v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->mVoiceType:I

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->initView$lambda$1(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->rv_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IXXOO(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->initView$lambda$0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)V

    return-void
.end method

.method public static synthetic O1O(Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->initView$lambda$0$0$0(Landroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/model/AISpeech;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->startVoice$lambda$0$0(Lcom/sma/smartv3/model/AISpeech;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X0i1O(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->permission$lambda$0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X11iII1O1(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;III)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->addVoiceListener$lambda$0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;III)Z

    move-result p0

    return p0
.end method

.method public static synthetic X1IX(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->initRecord$lambda$0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XXIIO1i11(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->tv_time_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXX11i(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->img_recording_status_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAiSpeechList$p(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->aiSpeechList:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static final synthetic access$getMAdapter$p(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    return-object p0
.end method

.method public static final synthetic access$getRv(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->getRv()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method private static final addVoiceListener$lambda$0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;III)Z
    .locals 0

    if-eqz p2, :cond_2

    const/4 p1, 0x2

    if-eq p2, p1, :cond_1

    const/4 p1, 0x3

    if-eq p2, p1, :cond_0

    goto :goto_0

    :cond_0
    iget p1, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->mVoiceType:I

    if-nez p1, :cond_3

    iput p2, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->mVoiceType:I

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->endVoice()V

    sget-object p0, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {p0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object p0

    invoke-virtual {p0}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->I0i0()V

    goto :goto_0

    :cond_1
    iget p1, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->mVoiceType:I

    if-nez p1, :cond_3

    iput p2, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->mVoiceType:I

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->endVoice()V

    goto :goto_0

    :cond_2
    iget p1, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->mVoiceType:I

    if-eqz p1, :cond_3

    iput p2, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->mVoiceType:I

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getArsLanguage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getTtsVoiceName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setLanguageType(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->startVoice()V

    :cond_3
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private final clickDownRecording()V
    .locals 1

    const-string v0, "MICROPHONE"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->isGranted([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->startRecordingBinaural()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->permission()V

    return-void
.end method

.method private static final endVoice$lambda$0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)V
    .locals 1

    const v0, 0x7f141030

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private final getImg_play()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->img_play$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getImg_recording_status()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->img_recording_status$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getRecord_line()Lcom/sma/smartv3/view/WaveformView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->record_line$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/WaveformView;

    return-object v0
.end method

.method private final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getRv()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->rv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method private final getTv_time()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->tv_time$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic i010I(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->startVoice$lambda$0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)V

    return-void
.end method

.method public static synthetic iI(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->endVoice$lambda$0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)V

    return-void
.end method

.method public static synthetic iOO1ii1(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->img_play_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->initView$lambda$0$0$1(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic iX(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)Lcom/sma/smartv3/view/WaveformView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->record_line_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)Lcom/sma/smartv3/view/WaveformView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iX1O1(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final img_play_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0467

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final img_recording_status_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a046d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final initRecord$lambda$0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;Landroid/view/View;)V
    .locals 0

    sget-object p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->isRecording()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->endVoice()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->startVoice()V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)V
    .locals 6

    new-instance v0, Lcom/android/mltcode/paycertificationapi/z16;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/z16;-><init>(Landroid/app/Activity;)V

    const v1, 0x7f140e22

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/z16;->X11iII1O1(Ljava/lang/String;)V

    const v1, 0x7f140445

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/z16;->XXX11i(Ljava/lang/String;)V

    const v1, 0x7f08102b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/z16;->XXIIO1i11(Ljava/lang/Integer;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    const-string v3, "HIDE_LIVE_RECORD_TIP_STATUS"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/z16;->X1IX(Ljava/lang/Boolean;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/z16;->iX()Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object v2

    new-instance v5, Lcom/android/mltcode/paycertificationapi/hq;

    invoke-direct {v5}, Lcom/android/mltcode/paycertificationapi/hq;-><init>()V

    invoke-virtual {v2, v5}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/z16;->OII()Landroid/widget/Button;

    move-result-object v2

    new-instance v5, Lcom/android/mltcode/paycertificationapi/iq;

    invoke-direct {v5, p0}, Lcom/android/mltcode/paycertificationapi/iq;-><init>(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)V

    invoke-virtual {v2, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->popTip:Lcom/android/mltcode/paycertificationapi/z16;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->popTip:Lcom/android/mltcode/paycertificationapi/z16;

    if-nez v0, :cond_0

    const-string v0, "popTip"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->getRootView()Landroid/view/View;

    move-result-object p0

    const-string v1, "<get-rootView>(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/z16;->XiOIO(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method private static final initView$lambda$0$0$0(Landroid/widget/CompoundButton;Z)V
    .locals 1

    const-string v0, "buttonView"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "isChecked = "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object p0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p0

    const-string v0, "HIDE_LIVE_RECORD_TIP_STATUS"

    invoke-virtual {p0, v0, p1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    return-void
.end method

.method private static final initView$lambda$0$0$1(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;Landroid/view/View;)V
    .locals 4

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, Lcom/android/mltcode/paycertificationapi/q62;->OiO0IOX(Lcom/android/mltcode/paycertificationapi/q62;Lcom/szabh/smable3/entity/BleDeviceInfo;ILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "2"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->X0100I()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "3"

    goto :goto_0

    :cond_1
    const-string p1, "1"

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "https://api.iot-solution.net/videoPlayer/?type="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&id=3"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lcom/sma/smartv3/ui/me/WebViewActivity;->Companion:Lcom/sma/smartv3/ui/me/WebViewActivity$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/me/WebViewActivity$OXO1;->iO()I

    move-result v0

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "mArg0"

    invoke-virtual {v2, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "mArg1"

    invoke-virtual {v2, p1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "mArg2"

    invoke-virtual {v2, p1, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {v2, p1, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/me/WebViewActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->popTip:Lcom/android/mltcode/paycertificationapi/z16;

    if-nez p1, :cond_0

    const-string p1, "popTip"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->getRootView()Landroid/view/View;

    move-result-object p0

    const-string v0, "<get-rootView>(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/z16;->XiOIO(Landroid/view/View;)V

    return-void
.end method

.method private static final permission$lambda$0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/bestmafen/androidbase/extension/PermissionStatus;->GRANTED:Lcom/bestmafen/androidbase/extension/PermissionStatus;

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->startRecordingBinaural()V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final preConnect()V
    .locals 12

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getAsrLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getAsrLanguage()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    sget-object v0, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getArsLanguage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getTtsVoiceName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getTtsTargetLang()Ljava/lang/String;

    move-result-object v5

    const/16 v10, 0x20

    const/4 v11, 0x0

    const/4 v3, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v1 .. v11}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iiII(Lcom/sma/smartv3/util/MicrosoftSDKManage;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;ZILjava/lang/Object;)V

    return-void
.end method

.method private static final record_line_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)Lcom/sma/smartv3/view/WaveformView;
    .locals 1

    const v0, 0x7f0a098c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/WaveformView;

    return-object p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final rv_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    const v0, 0x7f0a09c1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private final startRecordingBinaural()V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->Ii1iii0()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->binauralMicrosoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v4, v3, v4}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->i100IXOX(Lcom/sma/smartv3/util/MicrosoftSDKManage;Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->I0(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->showCountdownPopup(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private static final startVoice$lambda$0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->aiSpeechList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->aiSpeechList:Ljava/util/ArrayList;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/cq;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/cq;-><init>()V

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/OIXO1IIOO;->iIX0i(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    iget-object p0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    if-nez p0, :cond_0

    const-string p0, "mAdapter"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method private static final startVoice$lambda$0$0(Lcom/sma/smartv3/model/AISpeech;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final tv_time_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a188d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final addVoiceListener()V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/dq;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/dq;-><init>(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setMListener(Lkotlin/jvm/functions/Function3;)V

    return-void
.end method

.method public final binauralStopRecording()V
    .locals 1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->Ii1iii0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->closeBluetooth()V

    sget-object v0, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->XOIO11O()V

    return-void

    :cond_0
    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->stopRecording()V

    return-void
.end method

.method public countdownEnd()V
    .locals 4

    invoke-super {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->countdownEnd()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setStartTime(J)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->getImg_recording_status()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->getRecord_line()Lcom/sma/smartv3/view/WaveformView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->setRecording(Z)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroid/app/Activity;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/RequestManager;->asGif()Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    const v1, 0x7f0815c4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestBuilder;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->getImg_recording_status()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setElapsedTime(J)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getRunnable()Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getUpdateInterval()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final endVoice()V
    .locals 4

    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->setRecording(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->getImg_play()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f080fd5

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->getImg_recording_status()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->getRecord_line()Lcom/sma/smartv3/view/WaveformView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->binauralStopRecording()V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getRunnable()Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->removeCountdownPopup()V

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setElapsedTime(J)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->updateTimerText()V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->aiSpeechList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->aiSpeechList:Ljava/util/ArrayList;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "mArg0"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "mArg2"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v2, "mArg3"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMHandler()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/aq;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/aq;-><init>(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final getBinauralMicrosoftCallBack()Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->binauralMicrosoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;

    return-object v0
.end method

.method public final getMVoiceType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->mVoiceType:I

    return v0
.end method

.method public final initAdapter()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->aiSpeechList:Ljava/util/ArrayList;

    new-instance v1, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity$initAdapter$1;

    invoke-direct {v1, p0, v0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity$initAdapter$1;-><init>(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;Ljava/util/ArrayList;)V

    iput-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->getRv()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, p0, v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->getRv()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    if-nez v1, :cond_0

    const-string v1, "mAdapter"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final initRecord()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->getImg_play()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/bq;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/bq;-><init>(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public initView()V
    .locals 6

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setLangAndVoice()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->Ii1iii0()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->preConnect()V

    :cond_0
    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "IS_NEED_EARPHONE_COMMAND"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageLeftTv()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageRightTv()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    sget-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setActivityData(Z)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->Ii1iii0()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    sget-object v1, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v1

    iget-object v4, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->binauralMicrosoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;

    const/4 v5, 0x2

    invoke-static {v1, v4, v2, v5, v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->i100IXOX(Lcom/sma/smartv3/util/MicrosoftSDKManage;Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->getRootView()Landroid/view/View;

    move-result-object v1

    new-instance v4, Lcom/android/mltcode/paycertificationapi/eq;

    invoke-direct {v4, p0}, Lcom/android/mltcode/paycertificationapi/eq;-><init>(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)V

    invoke-virtual {v1, v4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v1

    new-instance v4, Lcom/android/mltcode/paycertificationapi/fq;

    invoke-direct {v4, p0}, Lcom/android/mltcode/paycertificationapi/fq;-><init>(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)V

    invoke-virtual {v1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->initAdapter()V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->initRecord()V

    invoke-static {v0, v2, v3, v2}, Lcom/android/mltcode/paycertificationapi/q62;->OiO0IOX(Lcom/android/mltcode/paycertificationapi/q62;Lcom/szabh/smable3/entity/BleDeviceInfo;ILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->addVoiceListener()V

    :cond_2
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00bf

    return v0
.end method

.method public onDestroy()V
    .locals 3

    invoke-super {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->onDestroy()V

    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->setRecording(Z)V

    const/4 v0, 0x1

    const/4 v2, 0x0

    invoke-static {p0, v1, v0, v2}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->stopRecording$default(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;ZILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getRunnable()Ljava/lang/Runnable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v2, "IS_NEED_EARPHONE_COMMAND"

    invoke-virtual {v0, v2, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    return-void
.end method

.method public final onLanguageChange(Ljava/lang/Object;)V
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "LANGUAGE_CHANGE"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onLanguageChange event = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setLangAndVoice()V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->Ii1iii0()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->preConnect()V

    :cond_0
    return-void
.end method

.method public onTranslationLanguage(Landroid/view/View;)V
    .locals 7
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->isRecording()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const p1, 0x7f141172

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const-class v0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;

    const-string v2, "mArg3"

    const-string v3, "mArg2"

    const-string v4, "mArg0"

    const/4 v5, 0x0

    sparse-switch p1, :sswitch_data_0

    return-void

    :sswitch_0
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p1

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v3, v5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    :sswitch_1
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p1

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v6, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v3, v5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v6, v2, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v6}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f0a030d -> :sswitch_1
        0x7f0a030e -> :sswitch_0
        0x7f0a046e -> :sswitch_1
    .end sparse-switch
.end method

.method public permission()V
    .locals 4

    const-string v0, "MICROPHONE"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v0

    const-string v1, "permission(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f140f4b

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x7f140f4a

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/zp;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/zp;-><init>(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)V

    invoke-static {v0, v1, v3, v2}, Lcom/android/mltcode/paycertificationapi/ds1;->XIi00iiXO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final setMVoiceType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->mVoiceType:I

    return-void
.end method

.method public final startVoice()V
    .locals 4

    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->setRecording(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMHandler()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/gq;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/gq;-><init>(Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->getImg_play()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f080fd6

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setRecordBluetooth(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setLangAndVoice()V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->clickDownRecording()V

    return-void
.end method

.method public updateTimerText()V
    .locals 6

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getElapsedTime()J

    move-result-wide v0

    const v2, 0x36ee80

    int-to-long v2, v2

    div-long/2addr v0, v2

    long-to-int v0, v0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getElapsedTime()J

    move-result-wide v4

    rem-long/2addr v4, v2

    const v1, 0xea60

    int-to-long v1, v1

    div-long/2addr v4, v1

    long-to-int v3, v4

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getElapsedTime()J

    move-result-wide v4

    rem-long/2addr v4, v1

    const/16 v1, 0x3e8

    int-to-long v1, v1

    div-long/2addr v4, v1

    long-to-int v1, v4

    sget-object v2, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v2, v1}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%02d:%02d:%02d"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "format(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/LiveRecordingActivity;->getTv_time()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
