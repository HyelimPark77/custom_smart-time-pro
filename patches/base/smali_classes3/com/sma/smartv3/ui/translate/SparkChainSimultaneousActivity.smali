.class public final Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSparkChainSimultaneousActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainSimultaneousActivity.kt\ncom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n87#2,7:233\n94#2,3:241\n70#2,7:244\n97#2:251\n173#2,7:252\n180#2,3:260\n143#2,7:263\n183#2:270\n173#2,7:271\n180#2,3:279\n143#2,7:282\n183#2:289\n1#3:240\n1#3:259\n1#3:278\n*S KotlinDebug\n*F\n+ 1 SparkChainSimultaneousActivity.kt\ncom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity\n*L\n116#1:233,7\n116#1:241,3\n116#1:244,7\n116#1:251\n143#1:252,7\n143#1:260,3\n143#1:263,7\n143#1:270\n158#1:271,7\n158#1:279,3\n158#1:282,7\n158#1:289\n116#1:240\n143#1:259\n158#1:278\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSparkChainSimultaneousActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainSimultaneousActivity.kt\ncom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n87#2,7:233\n94#2,3:241\n70#2,7:244\n97#2:251\n173#2,7:252\n180#2,3:260\n143#2,7:263\n183#2:270\n173#2,7:271\n180#2,3:279\n143#2,7:282\n183#2:289\n1#3:240\n1#3:259\n1#3:278\n*S KotlinDebug\n*F\n+ 1 SparkChainSimultaneousActivity.kt\ncom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity\n*L\n116#1:233,7\n116#1:241,3\n116#1:244,7\n116#1:251\n143#1:252,7\n143#1:260,3\n143#1:263,7\n143#1:270\n158#1:271,7\n158#1:279,3\n158#1:282,7\n158#1:289\n116#1:240\n143#1:259\n158#1:278\n*E\n"
    }
.end annotation


# instance fields
.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final dialogueTranslationLeftTv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final dialogueTranslationRightTv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final factory$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private loadingJob:Lkotlinx/coroutines/XiOIO;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final originTextTv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final recordIv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private rotateAnimationSwitching:Z

.field private final transformLanguageImg$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final translateTv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/yq4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/yq4;-><init>(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->originTextTv$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zq4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/zq4;-><init>(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->translateTv$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ar4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ar4;-><init>(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->recordIv$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/br4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/br4;-><init>(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/oq4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/oq4;-><init>(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->transformLanguageImg$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/pq4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/pq4;-><init>(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->dialogueTranslationLeftTv$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/qq4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/qq4;-><init>(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->dialogueTranslationRightTv$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/rq4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/rq4;-><init>(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->factory$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/sq4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/sq4;-><init>(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->viewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->transformLanguageImg_delegate$lambda$0(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->viewModel_delegate$lambda$0(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->initListener$lambda$1$0(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->translateTv_delegate$lambda$0(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->initListener$lambda$3(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->recordIv_delegate$lambda$0(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->initListener$lambda$0(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->initListener$lambda$4(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->originTextTv_delegate$lambda$0(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->dialogueTranslationLeftTv_delegate$lambda$0(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->initListener$lambda$1(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTranslateViewModelFactory;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->factory_delegate$lambda$0(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTranslateViewModelFactory;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->initListener$lambda$2(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;Landroid/view/View;)V

    return-void
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$getDialogueTranslationLeftTv(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getDialogueTranslationLeftTv()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getDialogueTranslationRightTv(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getDialogueTranslationRightTv()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getOriginTextTv(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getOriginTextTv()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getRecordIv(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getRecordIv()Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTransformLanguageImg(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getTransformLanguageImg()Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTranslateTv(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getTranslateTv()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setRotateAnimationSwitching$p(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->rotateAnimationSwitching:Z

    return-void
.end method

.method private final collectData()V
    .locals 13

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getViewModel()Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->getPageLeftLanguageFlow()Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object v2

    new-instance v4, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity$collectData$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity$collectData$1;-><init>(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lcom/sma/smartv3/util/ActivityUtilKt;->XIi00iiXO(Landroidx/lifecycle/LifecycleOwner;Lcom/android/mltcode/paycertificationapi/ii0iIIX0;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    move-object v7, v1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getViewModel()Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->getPageRightLanguageFlow()Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object v8

    new-instance v10, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity$collectData$2;

    invoke-direct {v10, p0, v0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity$collectData$2;-><init>(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Lcom/sma/smartv3/util/ActivityUtilKt;->XIi00iiXO(Landroidx/lifecycle/LifecycleOwner;Lcom/android/mltcode/paycertificationapi/ii0iIIX0;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getViewModel()Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->getDisplayFlow()Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object v8

    new-instance v10, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity$collectData$3;

    invoke-direct {v10, p0, v0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity$collectData$3;-><init>(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;Lkotlin/coroutines/Continuation;)V

    invoke-static/range {v7 .. v12}, Lcom/sma/smartv3/util/ActivityUtilKt;->XIi00iiXO(Landroidx/lifecycle/LifecycleOwner;Lcom/android/mltcode/paycertificationapi/ii0iIIX0;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getViewModel()Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->getRecordingAndTranslatingFlow()Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object v8

    new-instance v10, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity$collectData$4;

    invoke-direct {v10, p0, v0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity$collectData$4;-><init>(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;Lkotlin/coroutines/Continuation;)V

    invoke-static/range {v7 .. v12}, Lcom/sma/smartv3/util/ActivityUtilKt;->XIi00iiXO(Landroidx/lifecycle/LifecycleOwner;Lcom/android/mltcode/paycertificationapi/ii0iIIX0;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method private static final dialogueTranslationLeftTv_delegate$lambda$0(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a030d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final dialogueTranslationRightTv_delegate$lambda$0(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a030e

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final factory_delegate$lambda$0(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTranslateViewModelFactory;
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTranslateViewModelFactory;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/zv6;->OXO1:Lcom/android/mltcode/paycertificationapi/zv6;

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/android/mltcode/paycertificationapi/zv6;->X1ii(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTranslateViewModelFactory;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;)V

    return-object v0
.end method

.method private final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getDialogueTranslationLeftTv()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->dialogueTranslationLeftTv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getDialogueTranslationRightTv()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->dialogueTranslationRightTv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getFactory()Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTranslateViewModelFactory;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->factory$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTranslateViewModelFactory;

    return-object v0
.end method

.method private final getOriginTextTv()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->originTextTv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getRecordIv()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->recordIv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getTransformLanguageImg()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->transformLanguageImg$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getTranslateTv()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->translateTv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getViewModel()Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->dialogueTranslationRightTv_delegate$lambda$0(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private final initListener()V
    .locals 8

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lcom/android/mltcode/paycertificationapi/q62;->OiO0IOX(Lcom/android/mltcode/paycertificationapi/q62;Lcom/szabh/smable3/entity/BleDeviceInfo;ILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X0100I()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/tq4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/tq4;-><init>(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getRecordIv()Landroid/widget/ImageView;

    move-result-object v2

    const-string v0, "<get-recordIv>(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lcom/android/mltcode/paycertificationapi/uq4;

    invoke-direct {v5, p0}, Lcom/android/mltcode/paycertificationapi/uq4;-><init>(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    const-wide/16 v3, 0x0

    invoke-static/range {v2 .. v7}, Lcom/android/mltcode/paycertificationapi/oh6;->XO0O10(Landroid/view/View;JLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getTransformLanguageImg()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/vq4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/vq4;-><init>(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getDialogueTranslationLeftTv()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/wq4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/wq4;-><init>(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getDialogueTranslationRightTv()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/xq4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/xq4;-><init>(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final initListener$lambda$0(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;Landroid/view/View;)V
    .locals 3

    sget-object p1, Lcom/sma/smartv3/model/AIFunctionType;->SIMULTANEOUS_INTERPRETATION:Lcom/sma/smartv3/model/AIFunctionType;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AIFunctionType;->getType()I

    move-result p1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "mArg0"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "mArg1"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "mArg2"

    invoke-virtual {v0, p1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {v0, p1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/ai_note/AiNoteActivity;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final initListener$lambda$1(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/bs1;->OXO1:Lcom/android/mltcode/paycertificationapi/bs1;

    const-string v0, "android.permission.RECORD_AUDIO"

    const-string v1, "android.permission.MODIFY_AUDIO_SETTINGS"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/nq4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/nq4;-><init>(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)V

    invoke-virtual {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/bs1;->XIi00iiXO([Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initListener$lambda$1$0(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Lkotlin/Unit;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getViewModel()Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->changeRecordStatus()Lkotlinx/coroutines/XiOIO;

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initListener$lambda$2(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getViewModel()Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->getRecordingAndTranslatingFlow()Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object p1

    invoke-interface {p1}, Lcom/android/mltcode/paycertificationapi/k85;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x7f141172

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->startRotateAnimation()V

    return-void
.end method

.method private static final initListener$lambda$3(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;Landroid/view/View;)V
    .locals 4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getViewModel()Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->getRecordingAndTranslatingFlow()Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object p1

    invoke-interface {p1}, Lcom/android/mltcode/paycertificationapi/k85;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x7f141172

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getViewModel()Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->getPageLeftLanguageFlow()Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object p1

    invoke-interface {p1}, Lcom/android/mltcode/paycertificationapi/k85;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/Serializable;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "mArg0"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "mArg1"

    const/4 v3, 0x3

    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "mArg2"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v1, "mArg3"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method private static final initListener$lambda$4(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;Landroid/view/View;)V
    .locals 4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getViewModel()Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->getRecordingAndTranslatingFlow()Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object p1

    invoke-interface {p1}, Lcom/android/mltcode/paycertificationapi/k85;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x7f141172

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getViewModel()Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->getPageRightLanguageFlow()Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object p1

    invoke-interface {p1}, Lcom/android/mltcode/paycertificationapi/k85;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/Serializable;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "mArg0"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "mArg1"

    const/4 v3, 0x3

    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "mArg2"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v1, "mArg3"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method private static final originTextTv_delegate$lambda$0(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0a6e

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final recordIv_delegate$lambda$0(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0a6f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private final sendAudioTextToDevice(Lcom/szabh/smable3/entity/BleVoice;)V
    .locals 9

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->I0OX()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->AUDIO_TEXT:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v4, p1

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method private static final transformLanguageImg_delegate$lambda$0(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0bdd

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final translateTv_delegate$lambda$0(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0a70

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final viewModel_delegate$lambda$0(Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;)Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;
    .locals 2

    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getFactory()Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTranslateViewModelFactory;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V

    const-class p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->initListener()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->collectData()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d010f

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 p2, 0x0

    const-string v0, "language"

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq p1, v1, :cond_2

    if-eq p1, v3, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v2

    :cond_1
    check-cast v2, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getViewModel()Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    move-result-object p1

    invoke-virtual {p1, v2, v3}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->pageLanguageSideUpdate(Lcom/sma/smartv3/model/LanguageTranslationData;I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getViewModel()Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    move-result-object p1

    invoke-virtual {p1, v2, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->isEqualOtherLanguage(Lcom/sma/smartv3/model/LanguageTranslationData;Z)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->startRotateAnimation()V

    return-void

    :cond_2
    if-eqz p3, :cond_3

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    goto :goto_0

    :cond_3
    move-object p1, v2

    :goto_0
    check-cast p1, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getViewModel()Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    move-result-object p3

    invoke-virtual {p3, p1, v1}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->pageLanguageSideUpdate(Lcom/sma/smartv3/model/LanguageTranslationData;I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getViewModel()Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    move-result-object p3

    invoke-static {p3, p1, p2, v3, v2}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->isEqualOtherLanguage$default(Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;Lcom/sma/smartv3/model/LanguageTranslationData;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->startRotateAnimation()V

    :cond_4
    :goto_1
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

.method public final sendMsgToDevice(Ljava/lang/String;Ljava/lang/String;)V
    .locals 18
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    move-object/from16 v0, p0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sget-object v1, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->SIMULTANEOUS:Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleVoice$BleVoiceMode;->getFlag()I

    move-result v4

    new-instance v8, Lcom/szabh/smable3/entity/BleVoice;

    const/16 v9, 0x2a

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v1, v8

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/szabh/smable3/entity/BleVoice;-><init>(IIILcom/szabh/smable3/entity/BleVoice$BleDeviceEmotion;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-eqz p1, :cond_0

    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    move-object v8, v1

    goto :goto_0

    :cond_1
    const/16 v16, 0x1f

    const/16 v17, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    move-object/from16 v15, p1

    move-object v8, v1

    invoke-static/range {v8 .. v17}, Lcom/szabh/smable3/entity/BleVoice;->copy$default(Lcom/szabh/smable3/entity/BleVoice;IIILcom/szabh/smable3/entity/BleVoice$BleDeviceEmotion;JLjava/lang/String;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleVoice;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->sendAudioTextToDevice(Lcom/szabh/smable3/entity/BleVoice;)V

    :goto_0
    if-eqz p2, :cond_3

    invoke-interface/range {p2 .. p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    const/16 v16, 0x1e

    const/16 v17, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    move-object/from16 v15, p2

    invoke-static/range {v8 .. v17}, Lcom/szabh/smable3/entity/BleVoice;->copy$default(Lcom/szabh/smable3/entity/BleVoice;IIILcom/szabh/smable3/entity/BleVoice$BleDeviceEmotion;JLjava/lang/String;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleVoice;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->sendAudioTextToDevice(Lcom/szabh/smable3/entity/BleVoice;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final startRotateAnimation()V
    .locals 8

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->rotateAnimationSwitching:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getViewModel()Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel;->pageExchangeLeftAndRightLanguage()Lkotlinx/coroutines/XiOIO;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getTransformLanguageImg()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    new-instance v1, Landroid/view/animation/RotateAnimation;

    const/4 v6, 0x1

    const/high16 v7, 0x3f000000    # 0.5f

    const/high16 v2, 0x43b40000    # 360.0f

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-direct/range {v1 .. v7}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v1, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    const/4 v0, -0x1

    invoke-virtual {v1, v0}, Landroid/view/animation/Animation;->setRepeatCount(I)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->rotateAnimationSwitching:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;->getTransformLanguageImg()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v2

    new-instance v5, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity$startRotateAnimation$1;

    const/4 v0, 0x0

    invoke-direct {v5, v1, p0, v0}, Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity$startRotateAnimation$1;-><init>(Landroid/view/animation/RotateAnimation;Lcom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method
