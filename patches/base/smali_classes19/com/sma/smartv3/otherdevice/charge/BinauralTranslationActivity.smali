.class public final Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;
.super Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBinauralTranslationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinauralTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,738:1\n87#2,7:739\n94#2,3:747\n70#2,7:750\n97#2:757\n173#2,7:764\n180#2,3:772\n143#2,7:775\n183#2:782\n173#2,7:783\n180#2,3:791\n143#2,7:794\n183#2:801\n87#2,7:808\n94#2,3:816\n70#2,7:819\n97#2:826\n1#3:746\n1#3:771\n1#3:790\n1#3:815\n85#4,3:758\n85#4,3:761\n85#4,3:802\n85#4,3:805\n*S KotlinDebug\n*F\n+ 1 BinauralTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity\n*L\n483#1:739,7\n483#1:747,3\n483#1:750,7\n483#1:757\n648#1:764,7\n648#1:772,3\n648#1:775,7\n648#1:782\n653#1:783,7\n653#1:791,3\n653#1:794,7\n653#1:801\n713#1:808,7\n713#1:816,3\n713#1:819,7\n713#1:826\n483#1:746\n648#1:771\n653#1:790\n713#1:815\n522#1:758,3\n523#1:761,3\n668#1:802,3\n683#1:805,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBinauralTranslationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinauralTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,738:1\n87#2,7:739\n94#2,3:747\n70#2,7:750\n97#2:757\n173#2,7:764\n180#2,3:772\n143#2,7:775\n183#2:782\n173#2,7:783\n180#2,3:791\n143#2,7:794\n183#2:801\n87#2,7:808\n94#2,3:816\n70#2,7:819\n97#2:826\n1#3:746\n1#3:771\n1#3:790\n1#3:815\n85#4,3:758\n85#4,3:761\n85#4,3:802\n85#4,3:805\n*S KotlinDebug\n*F\n+ 1 BinauralTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity\n*L\n483#1:739,7\n483#1:747,3\n483#1:750,7\n483#1:757\n648#1:764,7\n648#1:772,3\n648#1:775,7\n648#1:782\n653#1:783,7\n653#1:791,3\n653#1:794,7\n653#1:801\n713#1:808,7\n713#1:816,3\n713#1:819,7\n713#1:826\n483#1:746\n648#1:771\n653#1:790\n713#1:815\n522#1:758,3\n523#1:761,3\n668#1:802,3\n683#1:805,3\n*E\n"
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

.field private final img_change_big$delegate:Lkotlin/Lazy;
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

.field private final ll_left_language$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final ll_right_language$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final ll_top_select_language$delegate:Lkotlin/Lazy;
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
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

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

.field private final tv_left_select_language$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tv_right_select_language$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tv_time$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tv_tip$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;-><init>()V

    const-string v0, "BinauralTranslationActivity"

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0OOX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0OOX;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IiiXI0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IiiXI0;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->tv_time$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IIO00O11;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IIO00O11;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->img_recording_status$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X1iOXOI10;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X1iOXOI10;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->img_play$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Iii01OiXi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Iii01OiXi;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->tv_tip$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0iiXiXO1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0iiXiXO1;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->record_line$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O10OiiiI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O10OiiiI;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->ll_top_select_language$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I10IXiI0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I10IXiI0;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->img_change_big$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IO11OiOO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IO11OiOO;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->ll_left_language$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iIiXO0iXI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iIiXO0iXI;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->ll_right_language$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXiOX0O;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iXiOX0O;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->tv_left_select_language$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OXIII1i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OXIII1i;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->tv_right_select_language$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1i1O01II;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1i1O01II;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->rv$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->aiSpeechList:Ljava/util/ArrayList;

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setMAIRecordsType(I)V

    new-instance v0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity$OXO1;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->binauralMicrosoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;

    const/4 v0, -0x1

    iput v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->mVoiceType:I

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->tv_time_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->endVoice$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    return-void
.end method

.method public static synthetic IXXOO(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;III)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->addVoiceListener$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;III)Z

    move-result p0

    return p0
.end method

.method public static synthetic Ii1iii0(Lcom/sma/smartv3/model/AISpeech;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->startVoice$lambda$0$0(Lcom/sma/smartv3/model/AISpeech;)Z

    move-result p0

    return p0
.end method

.method public static synthetic O001I(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->initView$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O1O(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->initRecord$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OO(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->ll_left_language_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX110i(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->binauralSendTranslationResultInput$lambda$0$0$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    return-void
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->tv_left_select_language_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0i1O(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->initView$lambda$2(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    return-void
.end method

.method public static synthetic X100O(Landroid/view/animation/RotateAnimation;Landroid/view/animation/RotateAnimation;Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->startRotateAnimation$lambda$0(Landroid/view/animation/RotateAnimation;Landroid/view/animation/RotateAnimation;Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    return-void
.end method

.method public static synthetic X11I(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->initView$lambda$3(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X11iII1O1(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->rv_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1IX(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->initView$lambda$1(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XOX0O0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->tv_right_select_language_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX1Oi(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->ll_top_select_language_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXIIO1i11(Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->showTranslationTipPopup$lambda$0$0(Landroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static synthetic XXO(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->binauralSendTranslationResultInput$lambda$0$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    return-void
.end method

.method public static synthetic XXX11i(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->permission$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$binauralSendTranslationResultInput(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;Lcom/sma/smartv3/model/AISpeech;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->binauralSendTranslationResultInput(Lcom/sma/smartv3/model/AISpeech;I)V

    return-void
.end method

.method public static final synthetic access$getAiSpeechList$p(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->aiSpeechList:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static final synthetic access$getMAdapter$p(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    return-object p0
.end method

.method public static final synthetic access$getRv(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getRv()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method private static final addVoiceListener$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;III)Z
    .locals 0

    if-eqz p2, :cond_2

    const/4 p1, 0x2

    if-eq p2, p1, :cond_1

    const/4 p1, 0x3

    if-eq p2, p1, :cond_0

    goto :goto_0

    :cond_0
    iget p1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->mVoiceType:I

    if-nez p1, :cond_3

    iput p2, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->mVoiceType:I

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->endVoice()V

    sget-object p0, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {p0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object p0

    invoke-virtual {p0}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->I0i0()V

    goto :goto_0

    :cond_1
    iget p1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->mVoiceType:I

    if-nez p1, :cond_3

    iput p2, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->mVoiceType:I

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->endVoice()V

    goto :goto_0

    :cond_2
    iget p1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->mVoiceType:I

    if-eqz p1, :cond_3

    iput p2, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->mVoiceType:I

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getArsLanguage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getTtsVoiceName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setLanguageType(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->startVoice()V

    :cond_3
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private final binauralSendTranslationResultInput(Lcom/sma/smartv3/model/AISpeech;I)V
    .locals 4

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setStartAnalysis(Z)V

    const/4 p2, 0x1

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setMRecyclerViewAutoRefresh(Z)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AISpeech;->getText()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-lez p2, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AISpeech;->getText()Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f141196

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->TAG:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AISpeech;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AISpeech;->getTargetLang()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " binauralSendTranslationResultInput ===> str = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " , targetLang = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p2, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {p2}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->IXI()V

    invoke-virtual {p2}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object p2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AISpeech;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AISpeech;->getTargetLang()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/iiIOX110O;

    invoke-direct {v2, p1, p0}, Lcom/android/mltcode/paycertificationapi/iiIOX110O;-><init>(Lcom/sma/smartv3/model/AISpeech;Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    invoke-virtual {p2, v0, v1, v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->OI(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method

.method private static final binauralSendTranslationResultInput$lambda$0(Lcom/sma/smartv3/model/AISpeech;Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;Ljava/lang/String;)Lkotlin/Unit;
    .locals 7

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/model/AISpeech;->setDst(Ljava/lang/String;)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p1, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->TAG:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AISpeech;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AISpeech;->getDst()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " binauralSendTranslationResultInput ===> str = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMHandler()Landroid/os/Handler;

    move-result-object p2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XOX1Xi;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/XOX1Xi;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-object p1, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AISpeech;->getDst()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AISpeech;->getTtsVoiceName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AISpeech;->getLanguageModel()I

    move-result p0

    if-nez p0, :cond_0

    sget-object p0, Lcom/sma/smartv3/model/LeftAndRightPlayControl;->RIGHT:Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    :goto_0
    move-object v3, p0

    goto :goto_1

    :cond_0
    sget-object p0, Lcom/sma/smartv3/model/LeftAndRightPlayControl;->LEFT:Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    goto :goto_0

    :goto_1
    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->X11iII1O1(Lcom/sma/smartv3/util/MicrosoftSDKManage;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/LeftAndRightPlayControl;IILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final binauralSendTranslationResultInput$lambda$0$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    if-nez v0, :cond_0

    const-string v0, "mAdapter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMHandler()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iOI010;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/iOI010;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private static final binauralSendTranslationResultInput$lambda$0$0$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->aiSpeechList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getRv()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    iget-object p0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->aiSpeechList:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    :cond_0
    return-void
.end method

.method private final clickDownRecording()V
    .locals 1

    const-string v0, "MICROPHONE"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->isGranted([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->startRecordingBinaural()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->permission()V

    return-void
.end method

.method private static final endVoice$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V
    .locals 1

    const v0, 0x7f141030

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private final getImg_change_big()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->img_change_big$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getImg_play()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->img_play$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getImg_recording_status()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->img_recording_status$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getLl_left_language()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->ll_left_language$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getLl_right_language()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->ll_right_language$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getLl_top_select_language()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->ll_top_select_language$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getRecord_line()Lcom/sma/smartv3/view/WaveformView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->record_line$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/WaveformView;

    return-object v0
.end method

.method private final getRv()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->rv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method private final getTv_left_select_language()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->tv_left_select_language$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTv_right_select_language()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->tv_right_select_language$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTv_time()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->tv_time$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTv_tip()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->tv_tip$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic i010I(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iI(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->img_change_big_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iIXi1iiXI(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->startVoice$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    return-void
.end method

.method public static synthetic iOO1ii1(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->showTranslationTipPopup$lambda$0$1(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/model/AISpeech;Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->binauralSendTranslationResultInput$lambda$0(Lcom/sma/smartv3/model/AISpeech;Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iX(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->ll_right_language_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iX1O1(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->tv_tip_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iXiX011(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->img_play_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iXiiiO(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->img_recording_status_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iiiO(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Lcom/sma/smartv3/view/WaveformView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->record_line_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Lcom/sma/smartv3/view/WaveformView;

    move-result-object p0

    return-object p0
.end method

.method private static final img_change_big_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0462

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final img_play_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0467

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final img_recording_status_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a046d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final initRecord$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;Landroid/view/View;)V
    .locals 0

    sget-object p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->isRecording()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->endVoice()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->startVoice()V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->startRotateAnimation()V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->showTranslationTipPopup()V

    return-void
.end method

.method private static final initView$lambda$2(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->showTranslationTipPopup()V

    return-void
.end method

.method private static final initView$lambda$3(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->startRotateAnimation()V

    return-void
.end method

.method private static final ll_left_language_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a06ff

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final ll_right_language_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a0719

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final ll_top_select_language_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a072b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final permission$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/bestmafen/androidbase/extension/PermissionStatus;->GRANTED:Lcom/bestmafen/androidbase/extension/PermissionStatus;

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->startRecordingBinaural()V

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

    const/16 v10, 0xa0

    const/4 v11, 0x0

    const/4 v3, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v1 .. v11}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iiII(Lcom/sma/smartv3/util/MicrosoftSDKManage;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;ZILjava/lang/Object;)V

    return-void
.end method

.method private static final record_line_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Lcom/sma/smartv3/view/WaveformView;
    .locals 1

    const v0, 0x7f0a098c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/WaveformView;

    return-object p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final rv_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    const v0, 0x7f0a09c1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private final showTranslationTipPopup()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->popTip:Lcom/android/mltcode/paycertificationapi/z16;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/z16;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/z16;-><init>(Landroid/app/Activity;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "HIDE_BINAURAL_TIP_STATUS"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/z16;->X1IX(Ljava/lang/Boolean;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/z16;->iX()Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/IiOiOI0;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/IiOiOI0;-><init>()V

    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/z16;->OII()Landroid/widget/Button;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/IOX1X1;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/IOX1X1;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->popTip:Lcom/android/mltcode/paycertificationapi/z16;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->popTip:Lcom/android/mltcode/paycertificationapi/z16;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getRootView()Landroid/view/View;

    move-result-object v1

    const-string v2, "<get-rootView>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/z16;->XiOIO(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method private static final showTranslationTipPopup$lambda$0$0(Landroid/widget/CompoundButton;Z)V
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

    const-string v0, "HIDE_BINAURAL_TIP_STATUS"

    invoke-virtual {p0, v0, p1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    return-void
.end method

.method private static final showTranslationTipPopup$lambda$0$1(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;Landroid/view/View;)V
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

    const-string p1, "&id=1"

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

.method private final startRecordingBinaural()V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->binauralMicrosoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v4, v3, v4}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->i100IXOX(Lcom/sma/smartv3/util/MicrosoftSDKManage;Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v4}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iIi0(Lcom/sma/smartv3/util/MicrosoftSDKManage;ZILjava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->showCountdownPopup(Landroid/view/View;)V

    return-void
.end method

.method private static final startRotateAnimation$lambda$0(Landroid/view/animation/RotateAnimation;Landroid/view/animation/RotateAnimation;Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V
    .locals 0

    invoke-virtual {p0}, Landroid/view/animation/Animation;->cancel()V

    invoke-virtual {p1}, Landroid/view/animation/Animation;->cancel()V

    invoke-virtual {p2}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageImg()Landroid/widget/ImageView;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->clearAnimation()V

    invoke-direct {p2}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getImg_change_big()Landroid/widget/ImageView;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->clearAnimation()V

    const/4 p0, 0x1

    invoke-virtual {p2, p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setSwitchRotateAnimation(Z)V

    return-void
.end method

.method private static final startVoice$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->aiSpeechList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->aiSpeechList:Ljava/util/ArrayList;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i11X;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/i11X;-><init>()V

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/OIXO1IIOO;->iIX0i(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    iget-object p0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

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

.method private static final tv_left_select_language_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0ca4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tv_right_select_language_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cfe

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tv_time_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a188d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tv_tip_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a188f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final addVoiceListener()V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IXOOOIX0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/IXOOOIX0;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setMListener(Lkotlin/jvm/functions/Function3;)V

    return-void
.end method

.method public final binauralStopRecording()V
    .locals 1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

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

    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->isRecording()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p0, v1, v2}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setStartTime(J)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getImg_recording_status()Landroid/widget/ImageView;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getRecord_line()Lcom/sma/smartv3/view/WaveformView;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

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

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getImg_recording_status()Landroid/widget/ImageView;

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

    :cond_0
    return-void
.end method

.method public final endVoice()V
    .locals 4

    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->setRecording(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getImg_play()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f080fd5

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getTv_tip()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f1402e8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getImg_recording_status()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getRecord_line()Lcom/sma/smartv3/view/WaveformView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->binauralStopRecording()V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getRunnable()Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->removeCountdownPopup()V

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setElapsedTime(J)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->updateTimerText()V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->aiSpeechList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->aiSpeechList:Ljava/util/ArrayList;

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

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OI0IIii;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/OI0IIii;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final getBinauralMicrosoftCallBack()Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->binauralMicrosoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;

    return-object v0
.end method

.method public final getMVoiceType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->mVoiceType:I

    return v0
.end method

.method public final getPopTip()Lcom/android/mltcode/paycertificationapi/z16;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->popTip:Lcom/android/mltcode/paycertificationapi/z16;

    return-object v0
.end method

.method public final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final initRecord()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getImg_play()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X1XX01;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/X1XX01;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public initView()V
    .locals 8

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setLangAndVoice()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->preConnect()V

    :cond_0
    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    const-string v3, "IS_NEED_EARPHONE_COMMAND"

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v4}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->aiSpeechList:Ljava/util/ArrayList;

    new-instance v3, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity$initView$1;

    invoke-direct {v3, p0, v2}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity$initView$1;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;Ljava/util/ArrayList;)V

    iput-object v3, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getRv()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v2

    new-instance v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    const/4 v5, 0x0

    invoke-direct {v3, p0, v4, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getRv()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->mAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    const/4 v6, 0x0

    if-nez v3, :cond_1

    const-string v3, "mAdapter"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v6

    :cond_1
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageImg()Landroid/widget/ImageView;

    move-result-object v2

    new-instance v3, Lcom/android/mltcode/paycertificationapi/X101iII;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/X101iII;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageLeftTv()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageRightTv()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getTv_left_select_language()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getTv_right_select_language()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setActivityData(Z)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->binauralMicrosoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;

    const/4 v7, 0x2

    invoke-static {v2, v3, v6, v7, v6}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->i100IXOX(Lcom/sma/smartv3/util/MicrosoftSDKManage;Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v2

    new-instance v3, Lcom/android/mltcode/paycertificationapi/iOXiI;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/iOXiI;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "HIDE_BINAURAL_TIP_STATUS"

    invoke-virtual {v1, v2, v5}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getRootView()Landroid/view/View;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/XOOi1I0I1;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/XOOi1I0I1;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_3
    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getImg_change_big()Landroid/widget/ImageView;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/XX1XXXi;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/XX1XXXi;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->initRecord()V

    invoke-static {v0, v6, v4, v6}, Lcom/android/mltcode/paycertificationapi/q62;->OiO0IOX(Lcom/android/mltcode/paycertificationapi/q62;Lcom/szabh/smable3/entity/BleDeviceInfo;ILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->addVoiceListener()V

    :cond_4
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0036

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 8
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, -0x1

    if-ne p2, v0, :cond_6

    const/4 p2, 0x2

    const-string v0, "LANGUAGE_CHANGE"

    const-class v1, Lcom/sma/smartv3/model/LanguageTranslationData;

    const/16 v2, 0x5f

    const/4 v3, 0x0

    const-string v4, "null cannot be cast to non-null type com.sma.smartv3.model.LanguageTranslationData"

    const-string v5, "language"

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz p1, :cond_3

    if-eq p1, v6, :cond_0

    goto/16 :goto_2

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p3, v5}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v7

    :goto_0
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p3

    invoke-virtual {p3}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {p3, v4}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_2

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setMRightLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageRightTv()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p3

    invoke-virtual {p3}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getTv_right_select_language()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p3

    invoke-virtual {p3}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "AI_TRANSLATION_RIGHT_LANGUAGE"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, p3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, v1, p3, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {v0, v7, p2, v7}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void

    :cond_2
    invoke-virtual {p0, v6}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setSwitchRotateAnimation(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->startRotateAnimation()V

    return-void

    :cond_3
    if-eqz p3, :cond_4

    invoke-virtual {p3, v5}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    goto :goto_1

    :cond_4
    move-object p1, v7

    :goto_1
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {p3, v4}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_5

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setMLeftLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageLeftTv()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p3

    invoke-virtual {p3}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getTv_left_select_language()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p3

    invoke-virtual {p3}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "AI_TRANSLATION_LEFT_LANGUAGE"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, p3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, v1, p3, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {v0, v7, p2, v7}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void

    :cond_5
    invoke-virtual {p0, v6}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setSwitchRotateAnimation(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->startRotateAnimation()V

    :cond_6
    :goto_2
    return-void
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

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->TAG:Ljava/lang/String;

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

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->preConnect()V

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
        0x7f0a06ff -> :sswitch_1
        0x7f0a0719 -> :sswitch_0
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

    new-instance v2, Lcom/android/mltcode/paycertificationapi/XOO10X1;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/XOO10X1;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    invoke-static {v0, v1, v3, v2}, Lcom/android/mltcode/paycertificationapi/ds1;->XIi00iiXO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final setMVoiceType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->mVoiceType:I

    return-void
.end method

.method public final setPopTip(Lcom/android/mltcode/paycertificationapi/z16;)V
    .locals 0
    .param p1    # Lcom/android/mltcode/paycertificationapi/z16;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->popTip:Lcom/android/mltcode/paycertificationapi/z16;

    return-void
.end method

.method public startRotateAnimation()V
    .locals 15

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getSwitchRotateAnimation()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageImg()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getImg_change_big()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageLeftTv()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageRightTv()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    new-instance v2, Landroid/view/animation/RotateAnimation;

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    const/high16 v3, 0x43b40000    # 360.0f

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    invoke-direct/range {v2 .. v8}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    const-wide/16 v3, 0x1f4

    invoke-virtual {v2, v3, v4}, Landroid/view/animation/Animation;->setDuration(J)V

    const/4 v5, -0x1

    invoke-virtual {v2, v5}, Landroid/view/animation/Animation;->setRepeatCount(I)V

    const/4 v6, 0x0

    invoke-virtual {p0, v6}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setSwitchRotateAnimation(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageImg()Landroid/widget/ImageView;

    move-result-object v7

    invoke-virtual {v7, v2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    new-instance v8, Landroid/view/animation/RotateAnimation;

    const/4 v13, 0x1

    const/high16 v14, 0x3f000000    # 0.5f

    const/high16 v9, 0x43b40000    # 360.0f

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/high16 v12, 0x3f000000    # 0.5f

    invoke-direct/range {v8 .. v14}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    invoke-virtual {v8, v3, v4}, Landroid/view/animation/Animation;->setDuration(J)V

    invoke-virtual {v8, v5}, Landroid/view/animation/Animation;->setRepeatCount(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getImg_change_big()Landroid/widget/ImageView;

    move-result-object v5

    invoke-virtual {v5, v8}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageLeftTv()Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMTransformLanguageRightTv()Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getTv_left_select_language()Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getTv_right_select_language()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setMCacheLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setMLeftLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMCacheLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setMRightLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMLeftLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "AI_TRANSLATION_LEFT_LANGUAGE"

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v9, 0x5f

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v10, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-instance v11, Lcom/google/gson/Gson;

    invoke-direct {v11}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v11, v5}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v7, v5, v6}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMRightLanguage()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "AI_TRANSLATION_RIGHT_LANGUAGE"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v7, Lcom/google/gson/Gson;

    invoke-direct {v7}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v7, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v5, v1, v6}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v0, "LANGUAGE_CHANGE"

    const/4 v1, 0x2

    const/4 v5, 0x0

    invoke-static {v0, v5, v1, v5}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMHandler()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iI001;

    invoke-direct {v1, v2, v8, p0}, Lcom/android/mltcode/paycertificationapi/iI001;-><init>(Landroid/view/animation/RotateAnimation;Landroid/view/animation/RotateAnimation;Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    invoke-virtual {v0, v1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public final startVoice()V
    .locals 4

    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->setRecording(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getLl_top_select_language()Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMHandler()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O0OOOOI;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/O0OOOOI;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getImg_play()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f080fd6

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getTv_tip()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f1402e9

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setRecordBluetooth(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setLangAndVoice()V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->clickDownRecording()V

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

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationActivity;->getTv_time()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
