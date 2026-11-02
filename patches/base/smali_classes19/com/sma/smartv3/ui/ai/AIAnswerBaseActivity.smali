.class public Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;
.super Lcom/sma/smartv3/ui/ai/BaseAIActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAIAnswerBaseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAnswerBaseActivity.kt\ncom/sma/smartv3/ui/ai/AIAnswerBaseActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n87#2,7:182\n94#2,3:190\n70#2,7:193\n97#2:200\n1#3:189\n*S KotlinDebug\n*F\n+ 1 AIAnswerBaseActivity.kt\ncom/sma/smartv3/ui/ai/AIAnswerBaseActivity\n*L\n178#1:182,7\n178#1:190,3\n178#1:193,7\n178#1:200\n178#1:189\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAIAnswerBaseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAnswerBaseActivity.kt\ncom/sma/smartv3/ui/ai/AIAnswerBaseActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n87#2,7:182\n94#2,3:190\n70#2,7:193\n97#2:200\n1#3:189\n*S KotlinDebug\n*F\n+ 1 AIAnswerBaseActivity.kt\ncom/sma/smartv3/ui/ai/AIAnswerBaseActivity\n*L\n178#1:182,7\n178#1:190,3\n178#1:193,7\n178#1:200\n178#1:189\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleOtherRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final aiActivityBg$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnGenerate$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final bytesLimit:I

.field private final centerLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final etContent$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final resultsLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvContent$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvCount$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvDescribe$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvExample$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;-><init>()V

    const-string v0, "AIAnswerActivity"

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O1O;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O1O;-><init>(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->aiActivityBg$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXX11i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XXX11i;-><init>(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X1IX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X1IX;-><init>(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0i1O;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0i1O;-><init>(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->abhTitleOtherRight$delegate:Lkotlin/Lazy;

    const/16 v0, 0x1f4

    iput v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->bytesLimit:I

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iIXi1iiXI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iIXi1iiXI;-><init>(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->etContent$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXiX011;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iXiX011;-><init>(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->tvCount$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O001I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O001I;-><init>(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->tvDescribe$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XXO;-><init>(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->tvExample$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXIIO1i11;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XXIIO1i11;-><init>(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->centerLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iI;-><init>(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->resultsLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iX1O1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iX1O1;-><init>(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->tvContent$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X11iII1O1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X11iII1O1;-><init>(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->btnGenerate$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->abhTitleOtherRight_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/widget/FrameLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->resultsLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/widget/FrameLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/widget/FrameLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->aiActivityBg_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/widget/FrameLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->tvExample_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->centerLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->tvDescribe_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->tvCount_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->tvContent_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->etContent_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleOtherRight_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0025

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$getBytesLimit$p(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->bytesLimit:I

    return p0
.end method

.method public static final synthetic access$getResultsLayout(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/widget/FrameLayout;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->getResultsLayout()Landroid/widget/FrameLayout;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTvContent(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->getTvContent()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTvCount(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->getTvCount()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method private static final aiActivityBg_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/widget/FrameLayout;
    .locals 1

    const v0, 0x7f0a00a4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/FrameLayout;

    return-object p0
.end method

.method private static final btnGenerate_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a01b9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private static final centerLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a00a5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final etContent_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a00a0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private final getAbhTitleOtherRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->abhTitleOtherRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getAiActivityBg()Landroid/widget/FrameLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->aiActivityBg$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    return-object v0
.end method

.method private final getBtnGenerate()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->btnGenerate$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getCenterLayout()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->centerLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getEtContent()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->etContent$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private final getResultsLayout()Landroid/widget/FrameLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->resultsLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    return-object v0
.end method

.method private final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getTvContent()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->tvContent$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getTvCount()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->tvCount$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getTvDescribe()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->tvDescribe$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getTvExample()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->tvExample$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->btnGenerate_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method private final initEditText()V
    .locals 3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->getTvDescribe()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMAIFunction()Lcom/sma/smartv3/model/AIFunction;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AIFunction;->getDetailsDescribe()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->getEtContent()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMAIFunction()Lcom/sma/smartv3/model/AIFunction;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AIFunction;->getDetailsHint()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->getTvExample()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMAIFunction()Lcom/sma/smartv3/model/AIFunction;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AIFunction;->getDetailsExample()Ljava/lang/String;

    move-result-object v2

    :cond_2
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->getEtContent()Landroid/widget/EditText;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private static final resultsLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/widget/FrameLayout;
    .locals 1

    const v0, 0x7f0a0410

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/FrameLayout;

    return-object p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final tvContent_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a00a7

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final tvCount_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a00a2

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final tvDescribe_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a00a3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final tvExample_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a00a6

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method


# virtual methods
.method public final addView(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->getCenterLayout()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public changeAiModel()V
    .locals 2

    const v0, 0x7f140c42

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->setBtnGenText(Ljava/lang/String;)V

    return-void
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->init(Landroid/os/Bundle;)V

    return-void
.end method

.method public initView()V
    .locals 4

    invoke-super {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->initView()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->setPlayResult(Z)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->transparentStatusBar()V

    const v1, 0x7f0a09b5

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/BarUtils;->addMarginTopEqualStatusBarHeight(Landroid/view/View;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v1

    const v2, 0x7f08065d

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v1

    const v2, 0x7f06074b

    invoke-static {p0, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->getAbhTitleOtherRight()Landroid/widget/ImageView;

    move-result-object v1

    sget-object v3, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/q62;->I0O()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->getAbhTitleOtherRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f080661

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->getAbhTitleOtherRight()Landroid/widget/ImageView;

    move-result-object v0

    invoke-static {p0, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMAIFunction()Lcom/sma/smartv3/model/AIFunction;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AIFunction;->getDetailsBg()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->getAiActivityBg()Landroid/widget/FrameLayout;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->initEditText()V

    return-void
.end method

.method public inputContent(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const p1, 0x7f1404f5

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->showLoading(Z)V

    const v0, 0x7f140c47

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->setBtnGenText(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->sendAIQuestion(Ljava/lang/String;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0023

    return v0
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->getEtContent()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    const-string p1, ""

    :cond_1
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->inputContent(Ljava/lang/String;)V

    return-void
.end method

.method public final onClear(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->getEtContent()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-interface {p1}, Landroid/text/Editable;->clear()V

    const p1, 0x7f140c42

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->setBtnGenText(Ljava/lang/String;)V

    return-void
.end method

.method public final onCopy(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->getTvContent()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/ClipboardUtils;->copyText(Ljava/lang/CharSequence;)V

    const p1, 0x7f140363

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void
.end method

.method public final onTitleOtherRightClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->onSetModel()V

    return-void
.end method

.method public final onTitleRightClick(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMAIFunction()Lcom/sma/smartv3/model/AIFunction;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "mArg0"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "mArg2"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v1, "mArg3"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public sendAIQuestion(Ljava/lang/String;)V
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/AIQuestion;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMAIFunction()Lcom/sma/smartv3/model/AIFunction;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AIFunction;->getType()Lcom/sma/smartv3/model/AIFunctionType;

    move-result-object v2

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p1

    invoke-direct/range {v1 .. v9}, Lcom/sma/smartv3/model/AIQuestion;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity$XIi00iiXO;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)V

    const/16 v7, 0x1c

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v1

    move-object v1, p0

    invoke-static/range {v1 .. v8}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->send$default(Lcom/sma/smartv3/ui/ai/BaseAIActivity;Lcom/sma/smartv3/model/AIQuestion;Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1;ZZZILjava/lang/Object;)V

    return-void
.end method

.method public final setBtnGenText(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "str"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->TAG:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getOpenAIDeductionPoints()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " setBtnGenText openAIDeductionPoints = "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->getBtnGenerate()Landroid/widget/Button;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->IIII0iI()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->XOX()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/biz/AIManager;->I0iXXO(Z)I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getOpenAIDeductionPoints()I

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getOpenAIDeductionPoints()I

    move-result v1

    const v2, 0x7f1410f8

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " (-"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public showAIDeductionPoints()V
    .locals 2

    const v0, 0x7f140c42

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->setBtnGenText(Ljava/lang/String;)V

    return-void
.end method
